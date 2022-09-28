package br.senai.sc.rpg.model.entities.armas;

public class Cajado extends Arma {

    @Override
    public String toString() {
        return "\nTipo: Cajado \nCódigo: " + this.getCodigo() + "\nDano Mínimo: " + this.getDanoMinimo() + "\nDano Máximo: "
                + this.getDanoMaximo() + "\n";
    }

    public Cajado(Double danoMinimo, Double danoMaximo, Double valor, String nome, Integer codigo) {
        super(danoMinimo, danoMaximo, valor, nome, codigo);
    }
}
