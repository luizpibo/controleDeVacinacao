package br.ucb.controleVacinacao.models;

public class Endereco {
	//Declar��o de variaveis da classe
	private String estado;
	private String cidade;
	private String cep;
	int numero;
	private String complemento;
	
	//Construtores
	public Endereco(String estado, String cidade, String cep, int numero, String complemento) {
		super();
		setEstado(estado);
		setCidade(cidade);
		setCep(cep);
		setNumero(numero);
		setComplemento(complemento);
	}
	
	public Endereco(String estado, String cidade, String cep, int numero) {
		super();
		setEstado(estado);
		setCidade(cidade);
		setCep(cep);
		setNumero(numero);
	}
	
	//Gets and Sets
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	//Metodos
	
}
