package br.senai.sc.rpg.model.entities.personagens;

import br.senai.sc.rpg.model.entities.armas.Espada;

/**
 * JAVA DOC
 *
 * @author Eu
 */
public class Guerreiro extends Personagem {

    private Espada espada;

    @Override
    public String toString() {
        return "\nClasse: Guerreiro" + super.toString() + "\nEspada: " + this.getEspada().toString();
    }

    public Espada getEspada() {
        return espada;
    }

    public void setEspada(Espada espada) {
        this.espada = espada;
    }

    public Guerreiro() {
        super();
    }

    public Guerreiro(String nome, double vida, int sabedoria, int inteligencia, int destreza, int forca,
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

    public String listarArmas() {
        return null;
    }

    public void atribuirArma(int codigo) {

    }
}
