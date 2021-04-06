package br.ucb.controleVacinacao.models;

import java.time.LocalDate;

public class Medico extends Pessoa{
	//Declarção de variaveis da classe
	private String crm;
	
	//Construtores
	public Medico(String nome, LocalDate dataNascimento, String cpf, String telefone, String crm) {
		super(nome, dataNascimento, cpf, telefone);
		setCrm(crm);
	}
	
	//Gets and Sets
	public String getCrm() {
		return this.crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	//Metodos
}
