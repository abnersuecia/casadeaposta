import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MegaSena {
    private JPanel panel1;
    private JButton gerar;
    private JButton cancelar;
    private JLabel numerosLabel;

    public MegaSena() {
        gerar = new JButton("Gerar Números");
        gerar.setSize(400,30);
        gerar.setFont(new Font("Arial Rounded MT", Font.BOLD, 30));
        gerar.setLocation(300,30);
        gerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortearNumeros();
            }
        });

        cancelar = new JButton("Cancelar");
        cancelar.setSize(400,30);
        cancelar.setFont(new Font("Arial Rounded MT", Font.BOLD, 30));
        cancelar.setLocation(300,30);
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numerosLabel.setText(""); // Limpa o texto do JLabel
                numerosLabel.setSize(400,30);
                numerosLabel.setFont(new Font("Arial Rounded MT", Font.BOLD, 30));
                numerosLabel.setLocation(300,30);

            }
        });

        numerosLabel = new JLabel(); // Inicializa o JLabel

        // Layout do painel
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.add(gerar, BorderLayout.NORTH);
        panel1.add(numerosLabel, BorderLayout.CENTER);
        panel1.add(cancelar, BorderLayout.SOUTH);
    }

    private void sortearNumeros() {
        StringBuilder numerosSorteados = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int numero = random.nextInt(60) + 1; // Sorteia um número de 1 a 60
            numerosSorteados.append(numero);
            if (i < 5) {
                numerosSorteados.append(", ");
            }
        }
        numerosLabel.setText(numerosSorteados.toString()); // Define o texto do JLabel com os números sorteados
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Mega Sena");
                MegaSena megaSena = new MegaSena();
                frame.setContentPane(megaSena.panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}


