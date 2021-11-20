/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac;

import cinac.Frame.TelaCatalogo;
import cinac.Frame.listaproduto_tela;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author luiz.carvalho1
 */
public class Cinac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NullPointerException, ParseException {
        try {
            
        
            JFrame janela_inicial = new JFrame();
            janela_inicial.setVisible(true);
            janela_inicial.setResizable(false);
            janela_inicial.setLayout(null);
            janela_inicial.setSize(400, 400);
            janela_inicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); 
            janela_inicial.setLocationRelativeTo(null);
            janela_inicial.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLACK));
        
            Color VERMELHO = new Color(130,33,25);
        
        
            JPanel painel = new JPanel();
            painel.setBounds(0, 0, 400, 400);
            painel.setLayout(null);
            JButton button_1 = new JButton("FILMES");
            JButton button_2 = new JButton("PRODUTOS");
            //JButton button_3 = new JButton("botao3");
            
            button_1.setFont(new Font("Stencil", Font.BOLD, 15));
            button_2.setFont(new Font("Stencil", Font.BOLD, 15));
            
            //button_1.setBounds(2, 250, 120, 40);
            button_1.setBounds(50, 250, 120, 40);
            //button_2.setBounds(127, 250, 120, 40);
            button_2.setBounds(204, 250, 120, 40);
            //button_3.setBounds(252, 250, 120, 40);
              
            
            button_1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    TelaCatalogo tt = new TelaCatalogo();
                }
            });
            
            button_2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    listaproduto_tela tt = new listaproduto_tela();
                    try {
                        tt.exibir_tela();
                    } catch (NullPointerException ex) {
                        Logger.getLogger(Cinac.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(Cinac.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            
            ImageIcon llogo = new ImageIcon("logo2.png");
            Image image = llogo.getImage();  
            Image newimg = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);  
            llogo = new ImageIcon(newimg);  
            
            JLabel label_imagem = new JLabel(llogo);
            label_imagem.setBounds(140, 5, 100, 150);
            
            
            
            
            
            JLabel label_titulo = new JLabel("MENU");
            label_titulo.setFont(new Font("Stencil", Font.BOLD, 24));
            label_titulo.setForeground(Color.BLACK);
            label_titulo.setBounds(153, 0, 400, 50);
            
            
            
            
            painel.setBackground(VERMELHO);
        
            painel.add(label_titulo);
            painel.add(button_1);
            painel.add(button_2);
            //painel.add(button_3);
            painel.add(label_imagem);
            
            janela_inicial.getContentPane().add(painel);
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
    

