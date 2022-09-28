package br.senai.sc.rpg.controller;

import br.senai.sc.rpg.model.entities.usuarios.Pessoa;
import br.senai.sc.rpg.model.service.PessoaService;

public class PessoaController {

    public Pessoa validaLogin(String nome, String senha) {
        PessoaService service = new PessoaService();
        try {
            Pessoa pessoa = service.buscarPessoa(nome);
            return pessoa.validaLogin(senha);
        } catch (RuntimeException exception) {
            throw new RuntimeException("Usuário Inválido!");
        }
    }
}
