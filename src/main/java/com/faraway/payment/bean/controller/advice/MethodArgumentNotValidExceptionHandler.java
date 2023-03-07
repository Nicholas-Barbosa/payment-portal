package com.faraway.payment.bean.controller.advice;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.faraway.payment.dto.ErrorData;
import com.faraway.payment.dto.ErrorData.Campo;
import com.fasterxml.jackson.annotation.JsonProperty;

@ControllerAdvice
public class MethodArgumentNotValidExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		
		Class<? extends Object> classObjectWithError = ex.getTarget().getClass();
		ErrorData errorData = new ErrorData(400, "Erro na validação de Campos.");
		Campo[] campos = ex.getFieldErrors().stream().map(e -> {
			Field field;

			try {
				field = classObjectWithError.getDeclaredField(e.getField());
				String jsonProperty = Arrays.stream(field.getAnnotationsByType(JsonProperty.class))
						.map(JsonProperty::value).reduce("", (ob1, ob2) -> ob1 + ob2);
				return new Campo(Objects.isNull(jsonProperty) ? e.getField() : jsonProperty, e.getDefaultMessage(),
						e.getRejectedValue() != null ? e.getRejectedValue().toString() : null);
			} catch (NoSuchFieldException | SecurityException e1) {
				// TODO Auto-generated catch block
				return new Campo(e.getField(), e.getDefaultMessage(),
						e.getRejectedValue() != null ? e.getRejectedValue().toString() : null);
			}

		}).toArray(Campo[]::new);
		errorData.setCampos(campos);
		return ResponseEntity.status(400).body(errorData);
	}

}
