package br.ucb.controleVacinacao.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Lote {
	//Atributos
	private ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
	private int idLote;
	private LocalDateTime dataDeChegada;
	
	//Construtores 
	public Lote(int id, ArrayList<Vacina> vacinas, LocalDateTime dataCheg) {
		setIdLote(id);
		setVacinas(vacinas);
		setDataDeChegada(dataCheg);
	}
	
	
	//gets and sets
	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}

	public LocalDateTime getDataDeChegada() {
		return dataDeChegada;
	}


	public void setDataDeChegada(LocalDateTime dataDeChegada) {
		this.dataDeChegada = dataDeChegada;
	}


	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}

	public int getIdLote() {
		return idLote;
	}

	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	
	//Metodos
	public void adicionarVacina(String tipo, LocalDateTime validade) {
		getVacinas().add(new Vacina(getVacinas().size(),tipo, validade));
	}
	
	
}
