/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Frame;

import cinac.Cinac;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Luiz Eduardo
 */
public class TelaAdmin {
    JFrame jFrame_janela_inicial;
    Color color_VERMELHO;
    JPanel jPanel_painel;
    JButton jButton_filme;
    JButton jButton_produtos;
    ImageIcon imageIcon_llogo;
    JLabel Label_titulo;
    public TelaAdmin(){
    try {
            
        
            JFrame jFrame_janela_inicial = new JFrame();
            jFrame_janela_inicial.setVisible(true);
            jFrame_janela_inicial.setResizable(false);
            jFrame_janela_inicial.setLayout(null);
            jFrame_janela_inicial.setSize(400, 400);
            jFrame_janela_inicial.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE ); 
            jFrame_janela_inicial.setLocationRelativeTo(null);
            jFrame_janela_inicial.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLACK));
        
            Color color_VERMELHO = new Color(130,33,25);
        
        
            JPanel jPanel_painel = new JPanel();
            jPanel_painel.setBounds(0, 0, 400, 400);
            jPanel_painel.setLayout(null);
            JButton jButton_filme = new JButton("FILMES");
            JButton jButton_produtos = new JButton("PRODUTOS");
            //JButton button_3 = new JButton("botao3");
            
            jButton_filme.setFont(new Font("Stencil", Font.BOLD, 15));
            jButton_produtos.setFont(new Font("Stencil", Font.BOLD, 15));
            
            //button_1.setBounds(2, 250, 120, 40);
            jButton_filme.setBounds(50, 250, 120, 40);
            //button_2.setBounds(127, 250, 120, 40);
            jButton_produtos.setBounds(204, 250, 120, 40);
            //button_3.setBounds(252, 250, 120, 40);
              
            
            jButton_filme.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    TelaCadastrofilme tt = new TelaCadastrofilme();
                }
            });
            
            jButton_produtos.addActionListener(new ActionListener() {

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
            
            
            ImageIcon imageIcon_llogo = new ImageIcon("logo2.png");
            Image image = imageIcon_llogo.getImage();  
            Image newimg = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);  
            imageIcon_llogo = new ImageIcon(newimg);  
            
            JLabel label_imagem = new JLabel(imageIcon_llogo);
            label_imagem.setBounds(140, 5, 100, 150);
            
            
            
            
            
            JLabel label_titulo = new JLabel("MENU");
            label_titulo.setFont(new Font("Stencil", Font.BOLD, 24));
            label_titulo.setForeground(Color.BLACK);
            label_titulo.setBounds(153, 0, 400, 50);
            
            
            
            
            jPanel_painel.setBackground(color_VERMELHO);
        
            jPanel_painel.add(label_titulo);
            jPanel_painel.add(jButton_filme);
            jPanel_painel.add(jButton_produtos);
            //painel.add(button_3);
            jPanel_painel.add(label_imagem);
            
            jFrame_janela_inicial.getContentPane().add(jPanel_painel);
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar");
        }
}
}