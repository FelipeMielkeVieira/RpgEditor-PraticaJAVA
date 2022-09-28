package br.senai.sc.rpg.model.entities.personagens;

public abstract class Personagem {

    private String nome;
    private double vida, dano, mana;
    private int sabedoria, inteligencia, destreza, forca, constituicao, carisma, nivel;

    public abstract String listarArmas();

    public abstract void atribuirArma(int codigo);

    @Override
    public String toString() {
        return "\nNome: " + this.getNome() + "\nVida: " + this.getVida() + "\nDano: " + this.getDano() + "\nMana: "
                + this.getMana() + "\nSabedoria: " + this.getSabedoria() + "\nInteligência: " + this.getInteligencia()
                + "\nDestreza: " + this.getDestreza() + "\nForça: " + this.getForca() + "\nConstituição: "
                + this.getConstituicao() + "\nCarisma: " + this.getCarisma() + "\nNível: " + this.getNivel();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

}
