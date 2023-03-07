package com.faraway.payment.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ErrorData {

	private int codigo;
	private String mensagem;
	private Campo[] campos;

	public ErrorData() {
		// TODO Auto-generated constructor stub
	}

	public ErrorData(int codigo, String mensagem) {
		super();
		this.codigo = codigo;
		this.mensagem = mensagem;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Campo[] getCampos() {
		return campos;
	}

	public void setCampos(Campo[] campos) {
		this.campos = campos;
	}

	@JsonInclude(Include.NON_NULL)
	public static class Campo {
		private String campo, mensagem, valor;

		public Campo() {
			// TODO Auto-generated constructor stub
		}

		public Campo(String campo, String mensagem, String valor) {
			super();
			this.campo = campo;
			this.mensagem = mensagem;
			this.valor = valor;
		}

		public String getCampo() {
			return campo;
		}

		public void setCampo(String campo) {
			this.campo = campo;
		}

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

		public String getValor() {
			return valor;
		}

		public void setValor(String valor) {
			this.valor = valor;
		}

	}
}
