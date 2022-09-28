package br.senai.sc.rpg.model.entities.armas;

public class Espada extends Arma {

	@Override
	public String toString() {
		return "\nTipo: Espada \nCódigo: " + this.getCodigo() + "\nDano Mínimo: " + this.getDanoMinimo() + "\nDano Máximo: "
				+ this.getDanoMaximo() + "\n";
	}

	public Espada(Double danoMinimo, Double danoMaximo, Double valor, String nome, Integer codigo) {
		super(danoMinimo, danoMaximo, valor, nome, codigo);
	}
}
