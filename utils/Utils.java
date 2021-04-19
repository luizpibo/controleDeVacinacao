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
		
		do {
			System.out.println("Digite o nome da pessoa: ");
			nome = scan.next();
			if(nome.isEmpty()) {
				System.out.println("NOME INVALIDO");
			}
		}while(nome.isEmpty());
		
		do {
			System.out.println("Digite a o ano da data de nascimento da pessoa: ");
			year = scan.nextInt();
			System.out.println(year);
			if(year<1920 || year>1995) {
				System.out.println("ANO INVALIDO");
			}
		}while(year<1920 || year>1995);
		
		do {
			System.out.println("Digite o mes da data de nascimento da pessoa: ");
			month = scan.nextInt();
			if(month<1 || month>12) {
				System.out.println("MES INVALIDO");
			}
		}while(month<1 || month>12);
		
		do {
			System.out.println("Digite o dia da data de nascimento da pessoa: ");
			day = scan.nextInt();
			if(day<1 || day>31) {
				System.out.println("DIA INVALIDO");
			}
		}while(day<1 || day>31);
		
		do {
			System.out.println("Digite o CPF da pessoa: ");
			cpf = scan.next();
		}while(cpf.length()!=11);
		
		do {
			System.out.println("Digite o telefone da pessoa: ");
			telefone = scan.next();
		}while(cpf.length()!=11);
		
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
