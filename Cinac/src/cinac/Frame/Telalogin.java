/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Frame;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author maste
 */
public class Telalogin {
    JFrame jFrame_telalogin;
    
    JPanel jPanel_titulo;
    JLabel jLabel_titulo;
    
    JPanel jPanel_cadastrocliente;
    JLabel jLabel_titulocadastro;
    JLabel jLabel_usuario_cadastrocliente;
    JTextField jTextField_usuario_cadastrocliente;
    JLabel jlabel_senha_cadastrocliente;
    JTextField jTextField_senha_cadastrocliente;
    JLabel jlabel_confirmarsenha_cadastrocliente;
    JTextField jTextField_confirmarsenha_cadastrocliente;
    JButton jButton_login;
    
    JPanel jPanel_logincliente;
    JLabel jLabel_titulologin;
    JLabel jlabel_usuario_logincliente;
    JTextField jTextField_usuario_logincliente;
    JLabel jlabel_senha_logincliente;
    JTextField jTextField_senha_logincliente;

    public Telalogin() {
        jFrame_telalogin = new JFrame();
        
        jPanel_cadastrocliente = new JPanel();
        jLabel_usuario_cadastrocliente = new JLabel();
        jTextField_usuario_cadastrocliente = new JTextField();
        jlabel_senha_cadastrocliente = new JLabel();
        jTextField_senha_cadastrocliente = new JTextField();
        jlabel_confirmarsenha_cadastrocliente = new JLabel();
        jTextField_confirmarsenha_cadastrocliente = new JTextField();
        
        jPanel_logincliente = new JPanel();
        jlabel_usuario_logincliente = new JLabel();
        jTextField_usuario_logincliente = new JTextField();
        jlabel_senha_logincliente = new JLabel();
        jTextField_senha_logincliente = new JTextField();
        
        jPanel_titulo = new JPanel();
        jLabel_titulo = new JLabel();        
        Color color_VERMELHO = new Color(130,33,25);
        jPanel_titulo.setBackground(color_VERMELHO);
        jPanel_titulo.setBounds(0,0,800,100);
        jPanel_titulo.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        
        jPanel_cadastrocliente.setBounds(0, 100, 400, 400);
        jPanel_cadastrocliente.setBackground(color_VERMELHO);
        jPanel_cadastrocliente.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        
        jPanel_logincliente.setBounds(400, 100, 400, 400);
        jPanel_logincliente.setBackground(color_VERMELHO);
        BorderFactory.createLineBorder(Color.BLACK);
        jPanel_logincliente.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        
        
        
        
        
        
        jPanel_cadastrocliente.add(jLabel_usuario_cadastrocliente);
        jPanel_cadastrocliente.add(jTextField_usuario_cadastrocliente);
        jPanel_cadastrocliente.add(jlabel_senha_cadastrocliente);
        jPanel_cadastrocliente.add(jTextField_senha_cadastrocliente);
        jPanel_cadastrocliente.add(jlabel_confirmarsenha_cadastrocliente);
        jPanel_cadastrocliente.add(jTextField_confirmarsenha_cadastrocliente);
        
        jPanel_logincliente.add(jlabel_usuario_logincliente);
        jPanel_logincliente.add(jTextField_usuario_logincliente);
        jPanel_logincliente.add(jlabel_senha_logincliente);
        jPanel_logincliente.add(jTextField_senha_logincliente);
        
        jPanel_titulo.add(jLabel_titulo);
        
        jFrame_telalogin.setSize(800,500);
        jFrame_telalogin.setVisible(true);
        jFrame_telalogin.setResizable(false);
        jFrame_telalogin.setLayout(null);
        jFrame_telalogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE ); 
        jFrame_telalogin.setLocationRelativeTo(null);
        jFrame_telalogin.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLACK));
        jFrame_telalogin.getContentPane().add(jPanel_titulo);
        jFrame_telalogin.getContentPane().add(jPanel_cadastrocliente);
        jFrame_telalogin.getContentPane().add(jPanel_logincliente);
        
    }
    
    
}
