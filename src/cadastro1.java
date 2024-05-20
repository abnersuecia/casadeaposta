import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class cadastro1 extends JFrame {
    private JTextField textField1;{
        setSize(200,200);
    }
    private JTextField textField2;
    private JRadioButton euConcordoComOsRadioButton;
    private JButton CriarConta;
    private JButton cancelarButton;
    private JPanel Cadastro;


    public static void main(String[] args) {
        uiprincipal u = new uiprincipal();

    }

    public cadastro1() {
        setSize(400,400);
        setContentPane(Cadastro);
        setVisible(true);
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(cancelarButton);
                frame.dispose(); // fecha a janela

            }
        });
        CriarConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uiprincipal u = new uiprincipal();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(CriarConta);
                frame.dispose(); // fecha a janela

            }
        });
    }

    private void cadastro() {

        String username = textField1.getText(); // pega a usuário
        String password = textField2.getText(); // pega o senha

        try (PrintWriter writer = new PrintWriter(new FileWriter("usuarios.txt", true))) {
            writer.println(username + "," + password);
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
            clearFields();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        textField1.setText("");
        textField2.setText("");
    }


}


