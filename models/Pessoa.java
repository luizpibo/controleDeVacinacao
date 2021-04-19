package br.ucb.controleVacinacao.models;

import java.time.LocalDate;

public class Pessoa {
	//Atributos
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	private String telefone;
	
	//Construtores
	public Pessoa(String nome, LocalDate dataNascimento, String cpf, String telefone) {
		setNome(nome);
		setDataNascimento(dataNascimento);
		setCpf(cpf);
		setTelefone(telefone);
	}
	public Pessoa(String nome, LocalDate dataNascimento, String cpf) {
		setNome(nome);
		setDataNascimento(dataNascimento);
		setCpf(cpf);
	}
	
	//Gets and Sets
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("\n- DADOS DA PESSOA -"+getNome()+
				"\nData de nascimento - "+getDataNascimento().toString()+
				"\nCPF - "+getCpf()+
				"\nTelefone - "+getTelefone()+"\n");
	}
}
