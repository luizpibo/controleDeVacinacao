package br.ucb.controleVacinacao.models;

import java.util.ArrayList;

public class PontoVacinacao {
	//Declarção de variaveis da classe
	private ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
	private Medico medicoResponsavel;
	private Endereco endereco;
	private int quantidadeDosesAplicadas;
	private ArrayList<Aplicacao> aplicacoes = new ArrayList<Aplicacao>();
	
	//Construtores
	public PontoVacinacao(Medico medicoResponsavel, Endereco endereco) {
		setMedicoResponsavel(medicoResponsavel);
		setEndereco(endereco);
	}
	
	//Gets and Sets
	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}
	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
	public Medico getMedicoResponsavel() {
		return medicoResponsavel;
	}
	public void setMedicoResponsavel(Medico medicoResponsavel) {
		this.medicoResponsavel = medicoResponsavel;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getQuantidadeDosesAplicadas() {
		return quantidadeDosesAplicadas;
	}
	public void setQuantidadeDosesAplicadas(int quantidadeDosesAplicadas) {
		this.quantidadeDosesAplicadas = quantidadeDosesAplicadas;
	}
	public ArrayList<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}
	public void setAplicacoes(ArrayList<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}
	
	//Metodos
	

}
