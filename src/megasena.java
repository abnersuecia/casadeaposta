import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class megasena {
    private JPanel panel1;
    private JButton GERARButton;
    private JButton CANCELARButton;

    public megasena() {

        GERARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int numero, i, j;
                    int[] mega = new int[6];
                    //Faz a instalação da classe Random para gerar números aleatórios
                    Random r = new Random();
                    for (i=0; i<mega.length; i++) {
                        numero = r.nextInt(60) + 1;
                        //Conferir e tirar os números repetidos
                        for(j=0; j<mega.length; j++) {
                            if(numero==mega[j] && j != i) {
                                numero = r.nextInt(60) + 1;
                            } else{
                                mega[i] = numero;
                            }
                        }

                    }
                    //Loop responsável por fazer a ordenação de forma crescente dos números do vetor
                    for(i=0; i<mega.length; i++) {
                        for(j=i+1; j<mega.length; j++) {
                            if( mega[i] > mega[j] ) {
                                numero = mega[i];
                                mega[i] = mega[j];
                                mega[j] = numero;
                            }
                        }
                    }
                    //Apresentar na tela o resultado
                    for(i=0; i<mega.length; i++) {
                        System.out.println(mega[i]+ " ");
                    }
                }
            });

            }
        }


