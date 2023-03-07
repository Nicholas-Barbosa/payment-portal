package com.faraway.payment.dto;

public class InstrucaoCobranca {

	private String codigo;
	private int quantidadeDiasAposVencimento;
	private boolean diaUtil;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getQuantidadeDiasAposVencimento() {
		return quantidadeDiasAposVencimento;
	}
	public void setQuantidadeDiasAposVencimento(int quantidadeDiasAposVencimento) {
		this.quantidadeDiasAposVencimento = quantidadeDiasAposVencimento;
	}
	public boolean isDiaUtil() {
		return diaUtil;
	}
	public void setDiaUtil(boolean diaUtil) {
		this.diaUtil = diaUtil;
	}
	
	
}
