package br.senai.sc.rpg.model.dao;

import br.senai.sc.rpg.model.entities.personagens.Guerreiro;
import br.senai.sc.rpg.model.entities.personagens.Ladino;
import br.senai.sc.rpg.model.entities.personagens.Mago;
import br.senai.sc.rpg.model.entities.personagens.Personagem;
import br.senai.sc.rpg.model.factory.ConexaoFactory;
import br.senai.sc.rpg.model.factory.PersonagemFactory;
import br.senai.sc.rpg.model.factory.PessoaFactory;
import br.senai.sc.rpg.view.Menu;

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
                while (resultSet.next()) {
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

    public void cadastrarPersonagem(Personagem personagem) {
        String sql = "insert into personagem (nome, vida, dano, mana, sabedoria, inteligencia, destreza, forca, constituicao, carisma, nivel, classe, codigo_pessoa) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, personagem.getNome());
            stmt.setDouble(2, personagem.getVida());
            stmt.setDouble(3, personagem.getDano());
            stmt.setDouble(4, personagem.getMana());
            stmt.setInt(5, personagem.getSabedoria());
            stmt.setInt(6, personagem.getInteligencia());
            stmt.setInt(7, personagem.getDestreza());
            stmt.setInt(8, personagem.getForca());
            stmt.setInt(9, personagem.getConstituicao());
            stmt.setInt(10, personagem.getCarisma());
            stmt.setInt(11, 1);
            stmt.setString(12, (personagem instanceof Guerreiro) ? "GUERREIRO" :
                    (personagem instanceof Ladino) ? "LADINO" :
                            (personagem instanceof Mago) ? "MAGO" : "PALADINO");
            stmt.setInt(13, Menu.getPessoa().getCodigo());

            try {
             stmt.execute();
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
                    resultSet.getInt("sabedoria"),
                    resultSet.getInt("inteligencia"),
                    resultSet.getInt("destreza"),
                    resultSet.getInt("forca"),
                    resultSet.getInt("constituicao"),
                    resultSet.getInt("carisma"),
                    resultSet.getInt("nivel"),
                    resultSet.getString("classe"));
        } catch (Exception e) {
            throw new RuntimeException("Erro ao extrair objeto!");
        }
    }
}
