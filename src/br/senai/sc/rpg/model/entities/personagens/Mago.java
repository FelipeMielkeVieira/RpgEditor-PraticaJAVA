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

	public Mago(String nome, double vida, int sabedoria, int inteligencia, int destreza, int forca,
					 int constituicao, int carisma, int nivel) {
		super();
		this.setNome(nome);
		this.setNivel(1);
		this.setVida(vida);
		this.setDano(Math.round(forca * constituicao / vida));
		this.setMana(Math.round(inteligencia * sabedoria / destreza));
		this.setSabedoria(sabedoria);
		this.setInteligencia(inteligencia);
		this.setDestreza(destreza);
		this.setForca(forca);
		this.setConstituicao(constituicao);
		this.setCarisma(carisma);
		this.setNivel(nivel);
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
