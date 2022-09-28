package br.senai.sc.rpg.view;

import br.senai.sc.rpg.controller.PessoaController;
import br.senai.sc.rpg.model.entities.usuarios.Pessoa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements Runnable {
    private JPanel painelLogin;
    private JTextField nomeInput;
    private JTextField senhaInput;
    private JButton entrarButton;

    public Login() {
        criarComponentes();
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PessoaController controller = new PessoaController();
                try {
                    Pessoa pessoa = controller.validaLogin(nomeInput.getText(), senhaInput.getText());
                    dispose();
                    Menu menu = new Menu(pessoa);
                    menu.setVisible(true);
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });
    }

    @Override
    public void run() {
        if (!isVisible()) {
            setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "A janela já está aberta!");
        }
    }

    private void criarComponentes() {
        setContentPane(painelLogin);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        Login programa = new Login();
        programa.run();
    }
}
