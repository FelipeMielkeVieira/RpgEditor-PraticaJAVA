package br.senai.sc.rpg.model.entities.armas;

public class Ataque {

	private int nivelRequerido, danoAdicional;
	private String nome, descricao;

	@Override
	public String toString() {
		return "Ataque [nivelRequerido=" + nivelRequerido + ", danoAdicional=" + danoAdicional + ", nome=" + nome
				+ ", descricao=" + descricao + "]";
	}

	public int getNivelRequerido() {
		return nivelRequerido;
	}

	public void setNivelRequerido(int nivelRequerido) {
		this.nivelRequerido = nivelRequerido;
	}

	public int getDanoAdicional() {
		return danoAdicional;
	}

	public void setDanoAdicional(int danoAdicional) {
		this.danoAdicional = danoAdicional;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Ataque(int nivelRequerido, int danoAdicional, String nome, String descricao) {
		super();
		this.nivelRequerido = nivelRequerido;
		this.danoAdicional = danoAdicional;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	
}
