package br.senai.sc.rpg.view;

import br.senai.sc.rpg.model.entities.usuarios.Pessoa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JPanel painelMenu;
    private JButton personagensButton;
    private JButton armasButton;
    private JButton campanhasButton;
    private JButton irParaJogadorButton;
    private JButton sairButton;
    private JLabel tituloMenu;
    private static Pessoa pessoaAtual;
    private static Integer modoView;

    public static Pessoa getPessoa() {
        return pessoaAtual;
    }

    public Menu(Pessoa pessoa) {
        pessoaAtual = pessoa;
        modoView = 1;
        criarComponentes();
        personagensButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ListaItens listaItens = new ListaItens(1);
                listaItens.setVisible(true);
            }
        });
        armasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        campanhasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        irParaJogadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(modoView == 1) {
                    modoView = 2;
                } else {
                    modoView = 1;
                }
                atualizarComponentes();
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pessoaAtual = null;
                dispose();
                Login login = new Login();
                login.run();
            }
        });
    }

    public void criarComponentes() {
        setContentPane(painelMenu);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
        atualizarComponentes();
    }

    public void atualizarComponentes() {
        if(modoView == 2) {
            irParaJogadorButton.setText("Ir para mestre");
            tituloMenu.setText("Menu do Jogador");
            armasButton.setVisible(false);
        } else {
            irParaJogadorButton.setText("Ir para jogador");
            tituloMenu.setText("Menu do Mestre");
            armasButton.setVisible(true);
        }
    }

}
