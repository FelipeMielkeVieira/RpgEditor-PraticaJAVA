package br.senai.sc.rpg.model.entities.armas;

import java.util.ArrayList;

public class Espada extends Arma {

	private ArrayList<Ataque> ataques;

	@Override
	public String toString() {
		return "\nTipo: Espada \nC�digo: " + this.getCodigo() + "\nDano M�nimo: " + this.getDanoMinimo() + "\nDano M�ximo: "
				+ this.getDanoMaximo() + "\nAtaques: " + this.getAtaques() + "\n";
	}

	public ArrayList<Ataque> getAtaques() {
		return ataques;
	}

	public void setAtaques(ArrayList<Ataque> ataques) {
		this.ataques = ataques;
	}
	
	public Espada(double danoMinimo, double danoMaximo, double valor, int codigo) {
		super();
		this.setDanoMinimo(danoMinimo);
		this.setDanoMaximo(danoMaximo);
		this.setValor(valor);
		this.setCodigo(codigo);
	}
}
