package br.senai.sc.rpg.model.entities.personagens;

import br.senai.sc.rpg.model.entities.armas.Cajado;

public class Mago extends Personagem {

	private Cajado cajado;

	@Override
	public String toString() {
		return "\nClasse: Mago" + super.toString() + "\nCajado: " + this.getCajado().toString();
	}

	public Cajado getCajado() {
		return cajado;
	}

	public void setCajado(Cajado cajado) {
		this.cajado = cajado;
	}

	public Mago(String nome, double vida, double dano, double mana, int sabedoria, int inteligencia, int destreza, int forca,
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

	public Mago() {
		super();
	}

	public String listarArmas() {
		return null;
	}

	public void atribuirArma(int codigo) {

	}
}
