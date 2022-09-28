package br.senai.sc.rpg.view;

import br.senai.sc.rpg.controller.PersonagemController;
import br.senai.sc.rpg.model.entities.personagens.Personagem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class ListaItens extends JFrame {
    private JPanel painelLista;
    private JLabel tituloLista;
    private JTable tabelaLista;
    private JButton voltarButton;
    private JButton editarButton;
    private JButton cadastrarButton;
    private JLabel avisoFalta;
    private static Integer lista;

    public ListaItens(Integer botao) {
        lista = botao;
        criarComponentes();
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu menu = new Menu(Menu.getPessoa());
                menu.setVisible(true);
            }
        });
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void criarComponentes() {
        switch (lista) {
            case 1:
                try {
                    tituloLista.setText("Lista de Personagens");
                    Collection<Personagem> listaItens = new PersonagemController().buscarLista(Menu.getPessoa().getCodigo());
                    tabelaLista.setModel(new DefaultTableModelPersonagens(listaItens));
                    tabelaLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                    avisoFalta.setVisible(false);
                } catch (Exception e) {
                    avisoFalta.setVisible(true);
                    avisoFalta.setText("Você não possui nenhum personagem!");
                }
                break;
            case 2:
                tituloLista.setText("Lista de Campanhas");
                break;
            case 3:
                tituloLista.setText("Lista de Armas");
                break;
        }

        tabelaLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setContentPane(painelLista);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
    }
}