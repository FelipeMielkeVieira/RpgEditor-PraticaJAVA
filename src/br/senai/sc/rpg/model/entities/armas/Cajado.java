package br.senai.sc.rpg.model.entities.armas;

public class Cajado extends Arma {

    @Override
    public String toString() {
        return "\nTipo: Cajado \nC�digo: " + this.getCodigo() + "\nDano M�nimo: " + this.getDanoMinimo() + "\nDano M�ximo: "
                + this.getDanoMaximo() + "\n";
    }

    public Cajado(Double danoMinimo, Double danoMaximo, Double valor, String nome, Integer codigo) {
        super(danoMinimo, danoMaximo, valor, nome, codigo);
    }
}
