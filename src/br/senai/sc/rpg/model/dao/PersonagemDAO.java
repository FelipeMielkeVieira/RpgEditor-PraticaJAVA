package br.senai.sc.rpg.model.dao;

import br.senai.sc.rpg.model.entities.personagens.Personagem;
import br.senai.sc.rpg.model.factory.ConexaoFactory;
import br.senai.sc.rpg.model.factory.PersonagemFactory;
import br.senai.sc.rpg.model.factory.PessoaFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class PersonagemDAO {

    private final Connection conn;

    public PersonagemDAO() {
        this.conn = new ConexaoFactory().conectaDB();
    }

    public Collection<Personagem> buscarListaPersonagens(Integer codigoPessoa) {

        String sql = "select * from personagem where codigo_pessoa = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, codigoPessoa);

            Collection<Personagem> listaPersonagens = new ArrayList<>();
            try (ResultSet resultSet = stmt.executeQuery()) {
                while(resultSet.next()) {
                    Personagem personagem = extrairObjeto(resultSet);
                    listaPersonagens.add(personagem);
                }
                return listaPersonagens;
            } catch (Exception e) {
                throw new RuntimeException("Erro na execução do comando SQL!");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro na preparação do comando SQL!");
        }
    }

    private Personagem extrairObjeto(ResultSet resultSet) {
        try {
            return new PersonagemFactory().getPersonagem(resultSet.getString("nome"),
                    resultSet.getDouble("vida"),
                    resultSet.getDouble("dano"),
                    resultSet.getDouble("mana"),
                    resultSet.getInt("sabedoria"),
                    resultSet.getInt("inteligencia"),
                    resultSet.getInt("destreza"),
                    resultSet.getInt("forca"),
                    resultSet.getInt("constituicao"),
                    resultSet.getInt("carisma"),
                    resultSet.getInt("nivel"),
                    resultSet.getInt("classe"));
        } catch (Exception e) {
            throw new RuntimeException("Erro ao extrair objeto!");
        }
    }
}
