package Hellotela;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.Container;

public class HelloSwingTela {
    public void criarTela(){

        //criou um objeto do tipo Jframe (um quadro/tela)
        JFrame Tela = new JFrame("hello Swing tela");

        // criar um meio de fechar a tela criada (Literalmente o X para fechar abas de mavegador,...)
        Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("hello Swing tela");

        Container painelDeConteudo = Tela.getContentPane();
        painelDeConteudo.add(label);
        
        Tela.pack();
        Tela.setVisible(true);


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HelloSwingTela().criarTela();

        });
    }
    
}