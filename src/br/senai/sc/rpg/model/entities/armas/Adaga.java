package br.senai.sc.rpg.model.entities.armas;

public class Adaga extends Arma {

	@Override
	public String toString() {
		return "\nTipo: Adaga \nC�digo: " + this.getCodigo() + "\nDano M�nimo: " + this.getDanoMinimo() + "\nDano M�ximo: "
				+ this.getDanoMaximo() + "\n";
	}

	public Adaga(Double danoMinimo, Double danoMaximo, Double valor, String nome, Integer codigo) {
		super(danoMinimo, danoMaximo, valor, nome, codigo);
	}
}
