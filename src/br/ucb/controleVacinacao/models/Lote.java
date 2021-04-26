package br.ucb.controleVacinacao.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import br.ucb.controleVacinacao.utils.Utils;

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
	
	
	@Override
	public String toString() {
		return ("\nID DO LOTE: "+getIdLote()
				+"\nQUANTIDADE DE VACINAS FECHADAS: "+getQtdeDeVacinasFechadas()
				+"\nQUANTIDADE DE VACINAS: "+getVacinas().size()
				+"\nDATA DE CHEGADA: "+getDataDeChegada().toString());
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
	
	// Subitrai um da quantidade de vacinas
	public void removeVacinaFechada() {
		setQtdeDeVacinasFechadas(getQtdeDeVacinasFechadas()-1);
	}
	
	// Retorna a quantidade de vacinas fechadas
	public int retornaQuantidadeDeVacinasFechadas() {
		return getQtdeDeVacinasFechadas();
	}
	
	//Retorna um boolean que valida o lote de acordo com a data de chegada e quantidade de vacinas
	public boolean loteValido() {
		return ((getDataDeChegada().equals(LocalDate.now()) || getDataDeChegada().equals(LocalDateTime.now().minusDays(1)))&& getQtdeDeVacinasFechadas()!=0);
	}
	
	//Faz a busca de uma vacina que nao foi aberta e depois retorna os dados da aplicacao
	public Aplicacao usarVacina() {
		//Para cada vacina dentro do lote valido
		// Podia fazer o acesso por meio de indexacao
		for(Vacina vac: getVacinas()) {
			//Se a vacina nao possuir data de abertura 
			if(vac.getAberto()!=null) {
				vac.abrirVacina();
				removeVacinaFechada();
				return new Aplicacao(vac,Utils.cadastroPessoa());
			}
		}
		return null;
	}

	
}
