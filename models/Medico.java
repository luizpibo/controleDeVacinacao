package br.ucb.controleVacinacao.models;

import java.time.LocalDate;

public class Medico extends Pessoa{
	//Atributos
	private String crm;
	
	//Construtores
	public Medico(String nome, LocalDate dataNascimento, String cpf, String telefone, String crm) {
		super(nome, dataNascimento, cpf, telefone);
		setCrm(crm);
	}

	@Override
	public String toString() {
		return super.toString()
			   +"\nCRM: "+getCrm()+"\n";
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
