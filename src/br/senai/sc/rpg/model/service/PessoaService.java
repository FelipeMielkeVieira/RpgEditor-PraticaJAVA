package br.senai.sc.rpg.model.service;

import br.senai.sc.rpg.model.dao.PessoaDAO;
import br.senai.sc.rpg.model.entities.usuarios.Pessoa;

public class PessoaService {

    public Pessoa buscarPessoa(String nome) {
        try {
            return new PessoaDAO().buscarPessoa(nome);
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
