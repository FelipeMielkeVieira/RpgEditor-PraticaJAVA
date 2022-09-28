package br.senai.sc.rpg.view;

import br.senai.sc.rpg.model.entities.personagens.Guerreiro;
import br.senai.sc.rpg.model.entities.personagens.Ladino;
import br.senai.sc.rpg.model.entities.personagens.Mago;
import br.senai.sc.rpg.model.entities.personagens.Personagem;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DefaultTableModelPersonagens extends AbstractTableModel {

    List<Personagem> dados;
    String[] colunas;

    public DefaultTableModelPersonagens(Collection<Personagem> lista) {
        this.dados = new ArrayList<>(lista);
        this.colunas = new String[]{"Nome", "Classe", "Vida", "Mana", "Nível", "Sabedoria", "Inteligência", "Destreza", "Força", "Constituição", "Carisma"};
    }

    @Override
    public int getRowCount() {
        try {
            return dados.size();
        } catch (Exception exception) {
            return 0;
        }
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Personagem personagem = dados.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return personagem.getNome();
            }
            case 1 -> {
                if (personagem instanceof Guerreiro) {
                    return "Guerreiro";
                } else if (personagem instanceof Ladino) {
                    return "Ladino";
                } else if (personagem instanceof Mago) {
                    return "Mago";
                } else {
                    return "Paladino";
                }
            }
            case 2 -> {
                return personagem.getVida();
            }
            case 3 -> {
                return personagem.getMana();
            }
            case 4 -> {
                return personagem.getNivel();
            }
            case 5 -> {
                return personagem.getSabedoria();
            }
            case 6 -> {
                return personagem.getInteligencia();
            }
            case 7 -> {
                return personagem.getDestreza();
            }
            case 8 -> {
                return personagem.getForca();
            }
            case 9 -> {
                return personagem.getConstituicao();
            }
            case 10 -> {
                return personagem.getCarisma();
            }
            default -> {
                return personagem;
            }
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
}
