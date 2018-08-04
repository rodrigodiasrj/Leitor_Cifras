/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author prrodi
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Seletor2 janela = new Seletor2();
        janela.setVisible(true);
        janela.show();
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
