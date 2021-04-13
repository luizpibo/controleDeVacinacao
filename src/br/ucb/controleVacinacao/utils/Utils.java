package br.ucb.controleVacinacao.utils;

import java.time.LocalDate;
import java.util.Scanner;

import br.ucb.controleVacinacao.models.Pessoa;

public class Utils {
	
	static public Pessoa cadastroPessoa() {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		LocalDate data;
		
		int year;
		int month;
		int day;
		
		String cpf;
		String telefone;
		
		System.out.println("Digite o nome da pessoa: ");
		nome = scan.next();
		
		System.out.println("Digite a o ano da data de nascimento da pessoa: ");
		year = scan.nextInt();
		System.out.println("Digite o mes da data de nascimento da pessoa: ");
		month = scan.nextInt();
		System.out.println("Digite o dia da data de nascimento da pessoa: ");
		day = scan.nextInt();
		
		System.out.println("Digite o CPF da pessoa: ");
		cpf = scan.next();
		
		System.out.println("Digite o telefone da pessoa: ");
		telefone = scan.next();
		
		data = LocalDate.of(year, month, day);
		
		System.out.println(
				"PESSOA CRIADA**\n"+
				"NOME: "+nome+
				"\nDATA DE NASCIMENTO: "+data.toString()+
				"\nCPF: "+cpf+
				"\nTELEFONE: "+telefone);
		
		return new Pessoa(nome, data, cpf, telefone);
	}
}
