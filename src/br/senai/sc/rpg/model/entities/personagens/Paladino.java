package br.senai.sc.rpg.model.entities.personagens;

import br.senai.sc.rpg.model.entities.armas.Escudo;
import br.senai.sc.rpg.model.entities.armas.Espada;

public class Paladino extends Personagem {

	private Espada espada;
	private Escudo escudo;

	@Override
	public String toString() {
		return "\nClasse: Paladino" + super.toString() + "\nEspada: " + this.getEspada().toString() + "\nEscudo: "
				+ this.getEscudo().toString();
	}

	public Espada getEspada() {
		return espada;
	}

	public void setEspada(Espada espada) {
		this.espada = espada;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

	public Paladino() {
		super();
	}

	public Paladino(String nome, double vida, double dano, double mana, int sabedoria, int inteligencia, int destreza, int forca,
			int constituicao, int carisma, int nivel) {
		super();
		this.setNome(nome);
		this.setNivel(nivel);
		this.setVida(vida);
		this.setDano(dano);
		this.setMana(mana);
		this.setSabedoria(sabedoria);
		this.setInteligencia(inteligencia);
		this.setDestreza(destreza);
		this.setForca(forca);
		this.setConstituicao(constituicao);
		this.setCarisma(carisma);
	}

	public String listarArmas() {
		return null;
	}

	public void atribuirArma(int codigo) {

	}
}
