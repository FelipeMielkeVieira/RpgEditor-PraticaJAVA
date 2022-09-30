package br.senai.sc.rpg.view;

import br.senai.sc.rpg.controller.PersonagemController;
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
                if (nomeInput.getText().isEmpty() || vidaInput.getText().isEmpty() || forcaInput.getText().isEmpty() ||
                        destrezaInput.getText().isEmpty() || constituicaoInput.getText().isEmpty() || inteligenciaInput.getText().isEmpty()
                        || sabedoriaInput.getText().isEmpty() || carismaInput.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                } else {
                    PersonagemController controller = new PersonagemController();
                    try {
                        controller.cadastrarPersonagem(nomeInput.getText(), Double.valueOf(vidaInput.getText()),
                                Integer.valueOf(sabedoriaInput.getText()), Integer.valueOf(inteligenciaInput.getText()),
                                Integer.valueOf(destrezaInput.getText()), Integer.valueOf(forcaInput.getText()),
                                Integer.valueOf(constituicaoInput.getText()), Integer.valueOf(carismaInput.getText()),
                                classeInput.getSelectedItem());
                        dispose();
                        JOptionPane.showMessageDialog(null, "Personagem cadastrado com sucesso!");
                        ListaItens listaItens = new ListaItens(1);
                        listaItens.setVisible(true);
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, exception.getMessage());
                    }
                }
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
