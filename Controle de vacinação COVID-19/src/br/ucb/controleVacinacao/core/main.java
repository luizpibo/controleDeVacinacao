package br.ucb.controleVacinacao.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		LocalDateTime newDateTime = LocalDateTime.now();
		System.out.println("DATA COMPLETA - "+newDateTime.toString());
		System.out.println("DIA DO MES - "+newDateTime.getDayOfMonth());
		System.out.println("MES DO ANO -"+newDateTime.getMonthValue());
		System.out.println("DIA DA SEMANA -"+newDateTime.getDayOfWeek());
		System.out.println("DATA MENOS 5 DIAS - "+newDateTime.minusDays(5));
		System.out.println("DATA MAIS 20 DIAS - "+newDateTime.plusDays(20));
		System.out.println("DATA APOS AS COMPARACOES - "+newDateTime.toString());
	}

}
