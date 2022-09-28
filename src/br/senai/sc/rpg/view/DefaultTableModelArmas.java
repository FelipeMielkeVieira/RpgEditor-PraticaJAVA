package br.senai.sc.rpg.view;

import br.senai.sc.rpg.model.entities.armas.Arma;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DefaultTableModelArmas extends AbstractTableModel {

    List<Arma> dados;
    String[] colunas;

    public DefaultTableModelArmas(Collection<Arma> lista) {
        this.dados = new ArrayList<>(lista);
        this.colunas = new String[]{"Nome", "Dano Mínimo", "Dano Máximo", "Valor"};
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
        Arma arma = dados.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return arma.getNome();
            }
            case 1 -> {
                return arma.getDanoMinimo();
            }
            case 2 -> {
                return arma.getDanoMaximo();
            }
            case 3 -> {
                return arma.getValor();
            }
            default -> {
                return arma;
            }
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
}
