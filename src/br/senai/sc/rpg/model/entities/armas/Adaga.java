package br.senai.sc.rpg.model.entities.armas;

import java.util.ArrayList;

public class Adaga extends Arma {

	private ArrayList<Ataque> ataques;

	@Override
	public String toString() {
		return "\nTipo: Adaga \nCódigo: " + this.getCodigo() + "\nDano Mínimo: " + this.getDanoMinimo() + "\nDano Máximo: "
				+ this.getDanoMaximo() + "\nAtaques: " + this.getAtaques() + "\n";
	}

	public ArrayList<Ataque> getAtaques() {
		return ataques;
	}

	public void setAtaques(ArrayList<Ataque> ataques) {
		this.ataques = ataques;
	}

	public Adaga(double danoMinimo, double danoMaximo, double valor, int codigo) {
		super();
		this.setDanoMinimo(danoMinimo);
		this.setDanoMaximo(danoMaximo);
		this.setValor(valor);
		this.setCodigo(codigo);
	}

	public Adaga() {
		super();
	}

}
