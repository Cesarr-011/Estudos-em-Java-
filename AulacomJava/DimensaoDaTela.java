package AulacomJava;

import java.awt.Dimension;
import java.awt.Toolkit;

public class DimensaoDaTela {

    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        System.out.println("A largura da tela é: " + tela.width);
        System.out.println("A altura da tela é: " + tela.height);
    }
}