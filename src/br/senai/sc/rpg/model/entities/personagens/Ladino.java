package br.senai.sc.rpg.model.entities.personagens;

import br.senai.sc.rpg.model.entities.armas.Adaga;

public class Ladino extends Personagem {

	private Adaga adaga;

	@Override
	public String toString() {
		return "\nClasse: Ladino" + super.toString() + "\nAdaga: " + this.getAdaga().toString();
	}

	public Adaga getAdaga() {
		return adaga;
	}

	public void setAdaga(Adaga adaga) {
		this.adaga = adaga;
	}

	public Ladino() {
		super();
	}

	public Ladino(String nome, double vida, double dano, double mana, int sabedoria, int inteligencia, int destreza, int forca,
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
