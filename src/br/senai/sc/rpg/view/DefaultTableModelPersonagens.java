package br.senai.sc.rpg.view;

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
        this.colunas = new String[]{"Nome", "Vida", "Mana", "Nível", "Sabedoria", "Inteligência", "Destreza", "Força", "Constituição", "Carisma"};
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
                return personagem.getVida();
            }
            case 2 -> {
                return personagem.getMana();
            }
            case 3 -> {
                return personagem.getNivel();
            }
            case 4 -> {
                return personagem.getSabedoria();
            }
            case 5 -> {
                return personagem.getInteligencia();
            }
            case 6 -> {
                return personagem.getDestreza();
            }
            case 7 -> {
                return personagem.getForca();
            }
            case 8 -> {
                return personagem.getConstituicao();
            }
            case 9 -> {
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
