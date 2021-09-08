/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemaeeclassefilha;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author wiliam.patricio
 */
public class Icons {
    public void InserirIcone(JFrame frm) {
        try{
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Icons/Tela-de-Gestao.png"));
            
        }catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
    public void InserirIcone1(JFrame frm) {
        try{
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Icons/Tela-de-Cadastro.png"));
            
        }catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
