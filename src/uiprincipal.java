import javax.swing.*;
import java.awt.event.*;

public class uiprincipal extends JFrame {
    private JLabel login;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton criarContaButton;
    private JButton loginButton;
    private JButton cancelarButton;
    private JPanel painelLogin;

    public static void main(String[] args) {
        uiprincipal u = new uiprincipal();
    }

    public uiprincipal() {
        setSize(400, 300);
        setContentPane(painelLogin);
        setVisible(true);

        criarContaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(criarContaButton);
                frame.dispose(); // fecha a janela
                cadastro1 c = new cadastro1();
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(cancelarButton);
                frame.dispose(); // fecha a janela
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();
                String password = new String(passwordField1.getPassword());
                if (login(username, password)) {
                    JOptionPane.showMessageDialog(uiprincipal.this, "Login bem-sucedido!");
                    // Abra a próxima janela após o login ser bem-sucedido
                    // Exemplo: new ProximaJanela();
                } else {
                    JOptionPane.showMessageDialog(uiprincipal.this, "Nome de usuário ou senha incorretos.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Método de login
    private boolean login(String username, String password) {
        // Implemente sua lógica de autenticação aqui
        // Neste exemplo, o login é bem-sucedido apenas se o nome de usuário for "admin" e a senha for "admin123"
        return username.equals("admin") && password.equals("admin123");
    }

    public static class cadastro1 {
        private JTextField nTextField;
        private JTextField textField1;
        private JButton FECHARButton;
    }
}
