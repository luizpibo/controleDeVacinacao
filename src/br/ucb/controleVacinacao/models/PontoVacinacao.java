package br.ucb.controleVacinacao.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import br.ucb.controleVacinacao.utils.Utils;

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
	
	@Override
	public String toString() {
		return "\nDADOS DO PONTO DE VACINACAO\n"
				+"MEDICO RESPONSAVEL: "+getMedicoResponsavel().toString()
				+"\n"+getEndereco().toString()
				+"\nQUANTIDADE DE DOSES APLICADAS: "+getQuantidadeDosesAplicadas()
				+"\nQUANTIDADE DE LOTES: "+getLotesVacinas().size()+"\n";
	}
	
	//Metodos
	//Aplicando vacina
	public void aplicarVacina() {
		//Para cada lote dentro de lotes
		for(Lote lote: getLotesVacinas()) {
			//Se a data de chegada do lote for 1 dia antes da data atual ou data de hoje e ainda houverem vacinas
			if(lote.loteValido()) {
				aplicacoes.add(lote.usarVacina());
				this.quantidadeDosesAplicadas++;
				return;	
			}
		}
		System.out.println("\n\n-- NAO TEM VACINA --\n\n");
		return;
	}

	//Adicionando um novo lote
	public void adicionarLote() {
		Scanner scan = new Scanner(System.in);
		int qtde;
		do {
			System.out.println("\n Quantidade de vacinas: ");
			 qtde = scan.nextInt();
			 if(qtde>3500) 
				 System.out.println("Quantidade invalida, digite novamente (LIMITE 3500)");
		}while(qtde>3500);
		//Adicionando um novo lote, com id igual a quantidade de lotes no array, 
		//data de chegada de hj e quantidade de vacinas passadas pelo usuario
		getLotesVacinas().add(new Lote(getLotesVacinas().size(), LocalDate.now(), qtde));
	}
	
	public void mostrarAplicacoes() {
		System.out.println("\n APLICACOES \n");
		if(getAplicacoes().size()==0){
			System.out.println("\nSEM APLICACOES POR ENQUANTO !!\n");
		}else{
			for(Aplicacao ap: getAplicacoes()) {
				System.out.println("\n"+ap.toString());
			}
		}
		
		
	}
	
	public void mostrarLotes() {
		System.out.println("\n LOTES \n");
		if(getLotesVacinas().size()==0){
			System.out.println("\nSEM LOTES POR ENQUANTO !!\n");
		}else{
			for(Lote lot: getLotesVacinas()) {
				System.out.println(lot.toString()+"\n");
			}
		}
	}

}
