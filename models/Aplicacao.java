package br.ucb.controleVacinacao.models;

public class Aplicacao {
	//Atributos
	private Vacina vacina;
	private Pessoa cidadao;
	
	protected Aplicacao(Vacina vacina, Pessoa cidadao) {
		this.vacina = vacina;
		this.cidadao = cidadao;
	}
	public Vacina getVacina() {
		return vacina;
	}
	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	public Pessoa getCidadao() {
		return cidadao;
	}
	public void setCidadao(Pessoa cidadao) {
		this.cidadao = cidadao;
	}
	@Override
	public String toString() {
		return ("TIPO DA VACINA - "+getVacina().getTipo()+
				"\n"+ getCidadao().toString());
	}
}
