package br.senai.sc.rpg.model.dao;

import br.senai.sc.rpg.model.entities.usuarios.Pessoa;
import br.senai.sc.rpg.model.factory.ConexaoFactory;
import br.senai.sc.rpg.model.factory.PessoaFactory;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PessoaDAO {

    private final Connection conn;

    public PessoaDAO() {
        this.conn = new ConexaoFactory().conectaDB();
    }

    public Pessoa buscarPessoa(String nome) {
        String sql = "select * from pessoa where nome = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);

            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet != null && resultSet.next()) {
                    return extrairObjeto(resultSet);
                }
            } catch (Exception exception) {
                throw new RuntimeException("Erro na execução do comando SQL!");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro na preparação do comando SQL!");
        }
        throw new RuntimeException("Usuário não encontrado!");
    }

    private Pessoa extrairObjeto(ResultSet resultSet) {
        try {
            return new PessoaFactory().criarPessoa(resultSet.getInt("codigo"),
                    resultSet.getString("nome"), resultSet.getString("senha"));
        } catch (Exception exception) {
            throw new RuntimeException("Erro ao extrair objeto!");
        }
    }
}
