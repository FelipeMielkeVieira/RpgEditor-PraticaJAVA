package br.senai.sc.rpg.model.entities.armas;

public abstract class Arma {

	private Double danoMinimo, danoMaximo, valor;
	private String nome;
	private Integer codigo;
	
	@Override
	public String toString() {
		return "Arma [danoMinimo=" + danoMinimo + ", danoMaximo=" + danoMaximo + ", valor=" + valor + "]";
	}

	public double getDanoMinimo() {
		return danoMinimo;
	}

	public void setDanoMinimo(double danoMinimo) {
		this.danoMinimo = danoMinimo;
	}

	public double getDanoMaximo() {
		return danoMaximo;
	}

	public void setDanoMaximo(double danoMaximo) {
		this.danoMaximo = danoMaximo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Arma(Double danoMinimo, Double danoMaximo, Double valor, String nome, Integer codigo) {
		this.danoMinimo = danoMinimo;
		this.danoMaximo = danoMaximo;
		this.valor = valor;
		this.nome = nome;
		this.codigo = codigo;
	}
}
