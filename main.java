package br.ucb.controleVacinacao.core;

import java.time.LocalDate;
import java.util.Scanner;

import br.ucb.controleVacinacao.models.Endereco;
import br.ucb.controleVacinacao.models.Medico;
import br.ucb.controleVacinacao.models.Pessoa;
import br.ucb.controleVacinacao.models.PontoVacinacao;
import br.ucb.controleVacinacao.models.Vacina;
import br.ucb.controleVacinacao.utils.Utils;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cadastrando o medico\n\n");
		Pessoa pessoaTeste = Utils.cadastroPessoa();
		System.out.println("Digite o CRM: ");
		String crm = scan.next();
		int op = 0;
		
		Medico medico = new Medico(pessoaTeste.getNome(), pessoaTeste.getDataNascimento(), pessoaTeste.getCpf(), pessoaTeste.getTelefone(), crm);
		Vacina coronaVac = new Vacina(1, "CORONA-VAC", LocalDate.of(2021, 4, 13));
		Endereco endereco = new Endereco("Distrito federal","Taguatinga", "72120-970", 24,"St. C Norte Área Especial 24");
		PontoVacinacao ponto = new PontoVacinacao(medico, endereco);
		
		do {
			System.out.println("\n- MENU DO PONTO DE VACINACAO -\n");
			System.out.println("1 - Aplicar vacina");
			System.out.println("2 - Adicionar lote de vacinas");
			System.out.println("3 - Mostrar aplicações");
			System.out.println("4 - Mostrar dados ponto de vacinação");
			System.out.println("5 - Mostrar Lotes");
			System.out.println("6 - Mostrar quantidade de doses aplicadas");
			System.out.println("7 - Sair");
			op = scan.nextInt();
			switch(op) {
			case 1:
				ponto.aplicarVacina();
				break;
			case 2:
				ponto.adicionarLote();
				break;
			case 3:
				ponto.mostrarAplicacoes();
				break;
			case 4:
				System.out.println(ponto.toString());
				break;
			case 5:
				ponto.mostrarLotes();
				break;
			case 6:
				System.out.println("\n Quantidade de doses aplicadas \n");
				System.out.println("QUANTIDADE - "+ponto.getQuantidadeDosesAplicadas());
				break;
			case 7:
				op = 404;
				break;
			default:
				op = 0;
			}
		}while(op!=404);
	}

}
/*
LocalDate date = LocalDate.now();
LocalDateTime newDateTime = LocalDateTime.now();
System.out.println("DATA COMPLETA - "+newDateTime.toString());
System.out.println("DIA DO MES ->"+newDateTime.getDayOfMonth());
System.out.println("MES DO ANO ->"+newDateTime.getMonthValue());
System.out.println("DIA DA SEMANA ->"+newDateTime.getDayOfWeek());
System.out.println("DATA MENOS 5 DIAS ->"+newDateTime.minusDays(5));
System.out.println("DATA MAIS 365 DIAS ->"+newDateTime.plusDays(1000));
System.out.println("DATA APOS AS COMPARACOES ->"+newDateTime.toString());
System.out.println("DATA MAIS 12 MESES ->"+newDateTime.plusMonths(12));
System.out.println(newDateTime.toString());
*/
