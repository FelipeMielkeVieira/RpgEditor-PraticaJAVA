package br.senai.sc.rpg.model.dao;

import br.senai.sc.rpg.model.entities.armas.Arma;
import br.senai.sc.rpg.model.entities.personagens.Personagem;
import br.senai.sc.rpg.model.factory.ArmaFactory;
import br.senai.sc.rpg.model.factory.ConexaoFactory;
import br.senai.sc.rpg.model.factory.PersonagemFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class ArmaDAO {

    Connection conn;

    public ArmaDAO() {
        conn = new ConexaoFactory().conectaDB();
    }

    public Collection<Arma> buscarListaArmas() {
        String sql = "select * from arma";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            try (ResultSet resultSet = stmt.executeQuery()) {
                Collection<Arma> armas = new ArrayList<>();
                while (resultSet.next()) {

                }
                return armas;
            } catch (Exception e) {
                throw new RuntimeException("Erro na execução do comando SQL!");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro na preparação do comando SQL!");
        }
    }

    private Arma extrairObjeto(ResultSet resultSet) {
        try {
//            return new ArmaFactory().getArma(resultSet.getDouble("danoMinimo"), resultSet.getDouble("danoMaximo"),
//                    resultSet.getDouble("valor"), resultSet.getString("nome"), resultSet.getInt("codigo"),
//                    resultSet.);
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao extrair objeto!");
        }
    }
}
