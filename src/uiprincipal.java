import javax.swing.*;
import java.awt.event.*;

public class uiprincipal {
    private JLabel login;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton criarContaButton;
    private JButton loginButton;
    private JButton cancelarButton;




    public uiprincipal() {
        criarContaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(cancelarButton);
                frame.dispose(); // fecha a janela
            }
        });
    }}

