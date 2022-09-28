package br.senai.sc.rpg.model.entities.usuarios;

import br.senai.sc.rpg.model.entities.personagens.Personagem;

import java.util.ArrayList;

public class Pessoa {

	private Integer codigo;
	private String nome, senha;
	private ArrayList<Personagem> personagens;

	public Pessoa(Integer codigo, String nome, String senha) {
		this.codigo = codigo;
		this.nome = nome;
		this.senha = senha;
	}

	public Pessoa validaLogin(String senha) {
		if(this.getSenha().equals(senha)) {
			return this;
		}
		throw new RuntimeException("Senha Incorreta!");
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ArrayList<Personagem> getPersonagens() {
		return personagens;
	}
	public void setPersonagens(ArrayList<Personagem> personagens) {
		this.personagens = personagens;
	}
	
}
