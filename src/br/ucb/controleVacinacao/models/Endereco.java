package br.ucb.controleVacinacao.models;

public class Endereco {
	//Atributos
	private String estado;
	private String cidade;
	private String cep;
	private int numero;
	private String complemento;
	
	//Construtores
	public Endereco(String estado, String cidade, String cep, int numero, String complemento) {
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
	
	@Override
	public String toString() {
		return ("\nENDERECO\n"
				+"\nESTADO: "+getEstado()
				+"\nCIDADE: "+getCidade()
				+"\nCEP: "+getCep()
				+"\nNUMERO: "+getNumero()
				+"\nCOMPLEMENTO: "+getComplemento());
	}
	
	//Gets and Sets
	public String getEstado() {
		return estado;
	}
	private void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	private void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	private void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	private void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	private void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
