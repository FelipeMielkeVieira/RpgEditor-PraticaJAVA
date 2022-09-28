package br.senai.sc.rpg.model.entities.armas;

public class Escudo {

	private double defesa, codigo;

	public Escudo(double defesa, double codigo) {
		super();
		this.defesa = defesa;
		this.codigo = codigo;
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

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}
	
	
}
