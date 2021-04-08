package br.ucb.controleVacinacao.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PontoVacinacao {
	//Atributos
	private ArrayList<Lote> lotesVacinas = new ArrayList<Lote>();
	private Medico medicoResponsavel;
	private Endereco endereco;
	private int quantidadeDosesAplicadas;
	private ArrayList<Aplicacao> aplicacoes = new ArrayList<Aplicacao>();
	
	//Construtores
	public PontoVacinacao(Medico medicoResponsavel, Endereco endereco) {
		setMedicoResponsavel(medicoResponsavel);
		setEndereco(endereco);
		setQuantidadeDosesAplicadas(0); 
	}
	
	//Gets and Sets
	
	public ArrayList<Lote> getVacinas() {
		return lotesVacinas;
	}
	public ArrayList<Lote> getLotesVacinas() {
		return lotesVacinas;
	}

	public void setLotesVacinas(ArrayList<Lote> lotesVacinas) {
		this.lotesVacinas = lotesVacinas;
	}

	public void setVacinas(ArrayList<Lote> vacinas) {
		this.lotesVacinas = vacinas;
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
	void aplicarVacina(Pessoa pessoa) {
		for(Lote lote: getLotesVacinas()) {
			if(lote.getDataDeChegada().equals(LocalDateTime.now())) {
				for(Vacina vac: lote.getVacinas()) {
					if(vac.getAberto()!=null) {
						vac.abrirVacina();
						getAplicacoes().add(new Aplicacao(vac,pessoa));
						this.quantidadeDosesAplicadas++;
						return;
					}
					
				}
			}
		}
	}
	
	void adicionarLote() {
		ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
		for(int i=0; i<1000; i++) {
			vacinas.add(new Vacina(i,"CORONA-VAC", LocalDateTime.now().minusDays(7)));
		}
		getLotesVacinas().add(new Lote(getLotesVacinas().size(),vacinas, LocalDateTime.now()));
	}

}
