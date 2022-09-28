package br.senai.sc.rpg.model.entities.armas;

public class Escudo extends Arma {

	private Double defesa;

	public Escudo(Double danoMinimo, Double danoMaximo, Double valor, String nome, Integer codigo, Double defesa) {
		super(danoMinimo, danoMaximo, valor, nome, codigo);
		this.defesa = defesa;
	}

	@Override
	public String toString() {
		return "\nTipo: Escudo" + "\nCódigo: " + this.getCodigo() + "\nDefesa: " + this.getDefesa();
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}
	
}
