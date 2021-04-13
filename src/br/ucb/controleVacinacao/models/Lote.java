package br.ucb.controleVacinacao.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Lote {
	//Atributos
	private int idLote;
	private ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
	private LocalDate dataDeChegada;
	private int qtdeDeVacinasFechadas;
	
	//Construtores 
	public Lote(int id, LocalDate dataCheg, int qtdeVacinas) {
		setIdLote(id);
		setVacinas(vacinas);
		setDataDeChegada(dataCheg);
		setQtdeDeVacinasFechadas(qtdeVacinas);
		for(int i=1; i<=qtdeVacinas; i++) {
			System.out.println("\nAdicionando Vacina - id: "+i+" Tipo: CORONA-VAC"+" Fabricacao: "+LocalDate.now());
			getVacinas().add(new Vacina(i,"CORONA-VAC", LocalDate.now()));
		}
	}
	
	
	//gets and sets
	
	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}

	public int getQtdeDeVacinasFechadas() {
		return qtdeDeVacinasFechadas;
	}


	private void setQtdeDeVacinasFechadas(int qtdeDeVacinasFechadas) {
		this.qtdeDeVacinasFechadas = qtdeDeVacinasFechadas;
	}


	public LocalDate getDataDeChegada() {
		return dataDeChegada;
	}


	private void setDataDeChegada(LocalDate dataDeChegada) {
		this.dataDeChegada = dataDeChegada;
	}


	private void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}

	public int getIdLote() {
		return idLote;
	}

	private void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	
	//Metodos
	public void removeVacinaFechada() {
		setQtdeDeVacinasFechadas(getQtdeDeVacinasFechadas()-1);
	}
	
	public int retornaQuantidadeDeVacinasFechadas() {
		int i=0;
		for(Vacina vacina: getVacinas()) {
			if(vacina.getAberto()==null) {
				i++;
			}
		}
		return i;
	}
	
	public boolean loteValido() {
		return (getDataDeChegada().equals(LocalDate.now()) || getDataDeChegada().equals(LocalDateTime.now().minusDays(1)));
	}

	
}
