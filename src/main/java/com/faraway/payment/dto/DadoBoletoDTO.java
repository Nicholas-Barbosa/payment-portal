package com.faraway.payment.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.faraway.payment.beanvalidation.ValorAbatimentoConstraint;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@ValorAbatimentoConstraint
public class DadoBoletoDTO {

	@JsonProperty("descricao_instrumento_cobranca")
	@NotBlank
	private String descricaoInstrumentoCobranca;
	
	@JsonProperty("tipo_boleto")
	@NotNull
	private TipoBoleto tipoBoleto;
	@JsonProperty("codigo_carteira")
	@NotBlank
	private String codigoCarteira;
	@JsonProperty("valor_total_titulo")
	@NotNull
	private BigDecimal valorTotalTitulo;
	@JsonProperty("codigo_especie")
	@NotBlank
	private String codigoEspecie;
	@JsonProperty("valor_abatimento")
	private BigDecimal valorAbatimento;
	@JsonProperty("data_emissao")
	@JsonFormat(pattern = "yyyy-mm-dd")
	private LocalDate dataEmissao;
	@JsonProperty("pagamento_parcial")
	private boolean pagamentoParcial;
	@JsonProperty("quantidade_maximo_parcial")
	private int maximoParcial;
	@JsonProperty("quantidade_parcelas")
	private int parcelas;
	@NotNull
	private PagadorDTO pagador;
	@JsonProperty("dados_individuais_boleto")
	@NotNull
	private DadosIndividuaisBoleto dadosIndividuaisBoleto;
	@JsonProperty("desconto_expresso")
	private boolean descontoExpresso;
	private Juros juros;
	private Multa multa;
	@JsonProperty("desconto")
	private DescontoDTO desconto;
	@JsonProperty("recebimento_divergente")
	private RecebimentoDivergente recebimentoDivergente;
	private Protesto protesto;
	@JsonProperty("instrucao_cobranca")
	private InstrucaoCobranca[] instrucaoCobrancas;

	public String getDescricaoInstrumentoCobranca() {
		return descricaoInstrumentoCobranca;
	}

	public void setDescricaoInstrumentoCobranca(String descricaoInstrumentoCobranca) {
		this.descricaoInstrumentoCobranca = descricaoInstrumentoCobranca;
	}

	public TipoBoleto getTipoBoleto() {
		return tipoBoleto;
	}

	public void setTipoBoleto(TipoBoleto tipoBoleto) {
		this.tipoBoleto = tipoBoleto;
	}

	public String getCodigoCarteira() {
		return codigoCarteira;
	}

	public void setCodigoCarteira(String codigoCarteira) {
		this.codigoCarteira = codigoCarteira;
	}

	public BigDecimal getValorTotalTitulo() {
		return valorTotalTitulo;
	}

	public void setValorTotalTitulo(BigDecimal valorTotalTitulo) {
		this.valorTotalTitulo = valorTotalTitulo;
	}

	public String getCodigoEspecie() {
		return codigoEspecie;
	}

	public void setCodigoEspecie(String codigoEspecie) {
		this.codigoEspecie = codigoEspecie;
	}

	public BigDecimal getValorAbatimento() {
		return valorAbatimento;
	}

	public void setValorAbatimento(BigDecimal valorAbatimento) {
		this.valorAbatimento = valorAbatimento;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public boolean isPagamentoParcial() {
		return pagamentoParcial;
	}

	public void setPagamentoParcial(boolean pagamentoParcial) {
		this.pagamentoParcial = pagamentoParcial;
	}

	public int getMaximoParcial() {
		return maximoParcial;
	}

	public void setMaximoParcial(int maximoParcial) {
		this.maximoParcial = maximoParcial;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public PagadorDTO getPagador() {
		return pagador;
	}

	public void setPagador(PagadorDTO pagador) {
		this.pagador = pagador;
	}

	public DadosIndividuaisBoleto getDadosIndividuaisBoleto() {
		return dadosIndividuaisBoleto;
	}

	public void setDadosIndividuaisBoleto(DadosIndividuaisBoleto dadosIndividuaisBoleto) {
		this.dadosIndividuaisBoleto = dadosIndividuaisBoleto;
	}

	public boolean isDescontoExpresso() {
		return descontoExpresso;
	}

	public void setDescontoExpresso(boolean descontoExpresso) {
		this.descontoExpresso = descontoExpresso;
	}

	public Juros getJuros() {
		return juros;
	}

	public void setJuros(Juros juros) {
		this.juros = juros;
	}

	public Multa getMulta() {
		return multa;
	}

	public void setMulta(Multa multa) {
		this.multa = multa;
	}

	public DescontoDTO getDesconto() {
		return desconto;
	}

	public void setDesconto(DescontoDTO desconto) {
		this.desconto = desconto;
	}

	public RecebimentoDivergente getRecebimentoDivergente() {
		return recebimentoDivergente;
	}

	public void setRecebimentoDivergente(RecebimentoDivergente recebimentoDivergente) {
		this.recebimentoDivergente = recebimentoDivergente;
	}

	public Protesto getProtesto() {
		return protesto;
	}

	public void setProtesto(Protesto protesto) {
		this.protesto = protesto;
	}

	public InstrucaoCobranca[] getInstrucaoCobrancas() {
		return instrucaoCobrancas;
	}

	public void setInstrucaoCobrancas(InstrucaoCobranca[] instrucaoCobrancas) {
		this.instrucaoCobrancas = instrucaoCobrancas;
	}

}
