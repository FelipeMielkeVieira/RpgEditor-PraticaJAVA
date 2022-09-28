package br.senai.sc.rpg.view;

import br.senai.sc.rpg.model.entities.personagens.Classe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroPersonagem extends JFrame {
    private JPanel painelCadastro;
    private JTextField nomeInput;
    private JTextField vidaInput;
    private JTextField forcaInput;
    private JTextField destrezaInput;
    private JTextField constituicaoInput;
    private JTextField inteligenciaInput;
    private JTextField sabedoriaInput;
    private JTextField carismaInput;
    private JComboBox classeInput;
    private JButton voltarButton;
    private JButton cadastrarButton;

    public CadastroPersonagem() {
        criarComponentes();
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ListaItens listaItens = new ListaItens(1);
                listaItens.setVisible(true);
            }
        });
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void criarComponentes() {
        classeInput.setModel(new DefaultComboBoxModel(Classe.values()));
        setContentPane(painelCadastro);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
    }
}
