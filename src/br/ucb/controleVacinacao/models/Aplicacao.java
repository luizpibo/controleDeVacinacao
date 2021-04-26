package br.ucb.controleVacinacao.models;

public class Aplicacao {
	//Atributos
	private Vacina vacina;
	private Pessoa cidadao;
	
	protected Aplicacao(Vacina vacina, Pessoa cidadao) {
		setVacina(vacina);
		setCidadao(cidadao);
	}
	public Vacina getVacina() {
		return vacina;
	}
	private void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	public Pessoa getCidadao() {
		return cidadao;
	}
	private void setCidadao(Pessoa cidadao) {
		this.cidadao = cidadao;
	}

	@Override
	public String toString() {
		return ("\n"+ getCidadao().toString()+
				"\n"+ getVacina().toString());
	}
}
