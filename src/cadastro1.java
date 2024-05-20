import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastro1 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton euConcordoComOsRadioButton;
    private JButton CadastroPanel;
    private JButton cancelarButton;
    private JPanel Cadastro;


    public static void main(String[] args) {
        uiprincipal u = new uiprincipal();

    }

    public cadastro1() {
        setSize(100,100);
        setContentPane(Cadastro);
        setVisible(true);
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(cancelarButton);
                frame.dispose(); // fecha a janela

            }
        });
    }
}
