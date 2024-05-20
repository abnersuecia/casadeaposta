import javax.swing.*;
import java.awt.event.*;

public class uiprincipal extends JFrame{
    private JLabel login;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton criarContaButton;
    private JButton loginButton;
    private JButton cancelarButton;
    private JPanel painelLogin;

//   CÓDIGO MAIN AQ EMBAIXO
//   CÓDIGO MAIN AQ EMBAIXO
//   CÓDIGO MAIN AQ EMBAIXO
    public static void main(String[] args) {
        uiprincipal u = new uiprincipal();

    }

    public uiprincipal() {
        setSize(400,300);
        setContentPane(painelLogin);
        setVisible(true);

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
        criarContaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static class cadastro {
        private JTextField nTextField;
        private JTextField textField1;
        private JButton FECHARButton;

        pri
    }
}















