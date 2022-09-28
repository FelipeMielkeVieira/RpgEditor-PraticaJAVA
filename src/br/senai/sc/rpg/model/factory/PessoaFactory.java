package br.senai.sc.rpg.model.factory;

import br.senai.sc.rpg.model.entities.usuarios.Pessoa;

public class PessoaFactory {

    public static Pessoa criarPessoa(Integer codigo, String nome, String senha) {
        return new Pessoa(codigo, nome, senha);
    }
}
