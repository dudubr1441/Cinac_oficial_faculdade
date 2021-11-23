/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Frame;

import cinac.Entidade.usuario;
import cinac.CinacDao.UsuarioDao;
import cinac.Frame.TelaAdmin;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
/**
 *
 * @author Luiz_eduardo
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
    JButton jButton_cadastro;
    JButton jButton_requisitosSenha;
    
    JPanel jPanel_logincliente;
    JLabel jLabel_titulologin;
    JLabel jlabel_usuario_logincliente;
    JTextField jTextField_usuario_logincliente;
    JLabel jlabel_senha_logincliente;
    JTextField jTextField_senha_logincliente;
    JButton jButton_login;

    public Telalogin() throws IOException {
        jFrame_telalogin = new JFrame();
        
        jPanel_cadastrocliente = new JPanel();
        jLabel_titulocadastro = new JLabel("Cadastro");
        jLabel_usuario_cadastrocliente = new JLabel("Usuário:");
        jTextField_usuario_cadastrocliente = new JTextField();
        jlabel_senha_cadastrocliente = new JLabel("Senha:");
        jTextField_senha_cadastrocliente = new JTextField();
        jlabel_confirmarsenha_cadastrocliente = new JLabel("Confirmar senha:");
        jTextField_confirmarsenha_cadastrocliente = new JTextField();
        jButton_cadastro = new JButton();
        jButton_requisitosSenha = new JButton();
        
        jPanel_logincliente = new JPanel();
        jLabel_titulologin = new JLabel("Login");
        jlabel_usuario_logincliente = new JLabel("Usuário:");
        jTextField_usuario_logincliente = new JTextField();
        jlabel_senha_logincliente = new JLabel("Senha:");
        jTextField_senha_logincliente = new JTextField();
        jButton_login = new JButton();
        
        jPanel_titulo = new JPanel();
        jLabel_titulo = new JLabel("Cinac");        
        Color color_VERMELHO = new Color(130,33,25);
        jPanel_titulo.setBackground(color_VERMELHO);
        jPanel_titulo.setBounds(0,0,800,100);
        jPanel_titulo.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        jLabel_titulo.setFont(new Font("ravie", Font.PLAIN, 60));
        jLabel_titulo.setForeground(Color.BLACK);
        
        
        jPanel_cadastrocliente.setBounds(0, 100, 400, 400);
        jPanel_cadastrocliente.setBackground(color_VERMELHO);
        jPanel_cadastrocliente.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        jPanel_cadastrocliente.setLayout(null);
        
        jLabel_titulocadastro.setBounds(145, 40, 150, 30);
        jLabel_titulocadastro.setFont(new Font("franklin gothic", Font.BOLD,30));
        jLabel_titulocadastro.setForeground(Color.BLACK);
        
        jLabel_usuario_cadastrocliente.setBounds(50, 100, 80, 20);
        jLabel_usuario_cadastrocliente.setFont(new Font("franklin gothic", Font.BOLD,20));
        jLabel_usuario_cadastrocliente.setForeground(Color.BLACK);
        
        jlabel_senha_cadastrocliente.setBounds(50, 150, 80, 20);
        jlabel_senha_cadastrocliente.setFont(new Font("franklin gothic", Font.BOLD,20));
        jlabel_senha_cadastrocliente.setForeground(Color.BLACK);
        
        jlabel_confirmarsenha_cadastrocliente.setBounds(50, 200, 200, 20);
        jlabel_confirmarsenha_cadastrocliente.setFont(new Font("franklin gothic", Font.BOLD,20));
        jlabel_confirmarsenha_cadastrocliente.setForeground(Color.BLACK);
        
        jTextField_usuario_cadastrocliente.setBounds(135, 100, 200, 20);
        jTextField_usuario_cadastrocliente.setFont(new Font("franklin gothic", Font.BOLD,15));
        jTextField_usuario_cadastrocliente.setForeground(Color.BLACK);
        
        jTextField_senha_cadastrocliente.setBounds(120, 150, 215, 20);
        jTextField_senha_cadastrocliente.setFont(new Font("franklin gothic", Font.BOLD,15));
        jTextField_senha_cadastrocliente.setForeground(Color.BLACK);
        
        jTextField_confirmarsenha_cadastrocliente.setBounds(215, 200, 120, 20);
        jTextField_confirmarsenha_cadastrocliente.setFont(new Font("franklin gothic", Font.BOLD,15));
        jTextField_confirmarsenha_cadastrocliente.setForeground(Color.BLACK);
        
        jButton_cadastro.setBounds(150, 250, 100, 40);
        jButton_cadastro.setText("Cadastro");
        jButton_cadastro.setBorder(new LineBorder(Color.BLACK, 2, true));
        jButton_cadastro.setFont(new Font("franklin gothic", Font.BOLD,17));
        jButton_cadastro.setBackground(Color.LIGHT_GRAY);
        jButton_cadastro.setForeground(Color.BLACK);
        jButton_cadastro.setRequestFocusEnabled(false);
        jButton_cadastro.setRolloverEnabled(false);
        jButton_cadastro.setMargin(new Insets(2, 1000, 2, 14));
        jButton_cadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                usuario tt = new usuario();
                UsuarioDao sv = new UsuarioDao();
                if (!jTextField_usuario_cadastrocliente.getText().isEmpty()) {  
                if (Analisacaracter.Validacao_senha(jTextField_senha_cadastrocliente.getText())!=false) {
                    if (jTextField_senha_cadastrocliente.getText().equals(jTextField_confirmarsenha_cadastrocliente.getText())) {
                tt.setSenha_usuario(jTextField_senha_cadastrocliente.getText());
                tt.setNome_usuario(jTextField_usuario_cadastrocliente.getText());
                        try {              
                            sv.cadastro_usuario(tt);
                        } catch (SQLException ex) {
                            Logger.getLogger(Telalogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else{JOptionPane.showMessageDialog(null, "Senhas não compativeis");jTextField_senha_cadastrocliente.setText("");jTextField_usuario_cadastrocliente.setText("");jTextField_confirmarsenha_cadastrocliente.setText("");}
                }else{JOptionPane.showMessageDialog(null, "releia os requisitos");jTextField_senha_cadastrocliente.setText("");jTextField_usuario_cadastrocliente.setText("");jTextField_confirmarsenha_cadastrocliente.setText("");}
                
                }
                else{JOptionPane.showMessageDialog(null, "preencha os campos");jTextField_senha_cadastrocliente.setText("");jTextField_usuario_cadastrocliente.setText("");jTextField_confirmarsenha_cadastrocliente.setText("");
                }
            }
            
        });
        Image Simbolo_Exclamacao = ImageIO.read(getClass().getResource("Símbolo_Exclamação.png"));
        jButton_requisitosSenha.setBounds(340, 145, 40, 30);
        jButton_requisitosSenha.setIcon(new ImageIcon(Simbolo_Exclamacao));
        jButton_requisitosSenha.setBackground(color_VERMELHO);
        jButton_requisitosSenha.setBorder(null);
        jButton_requisitosSenha.setOpaque(false);
        jButton_requisitosSenha.setContentAreaFilled(false);
        jButton_requisitosSenha.setBorderPainted(false);
        jButton_requisitosSenha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(jPanel_cadastrocliente,"requisitos\n8 caracteres\num ou mais caracteres especiais\numa ou mais letras maiusculas\n");
            }
        });
        
        
        jPanel_logincliente.setBounds(400, 100, 400, 400);
        jPanel_logincliente.setBackground(color_VERMELHO);
        jPanel_logincliente.setLayout(null);
        BorderFactory.createLineBorder(Color.BLACK);
        jPanel_logincliente.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        
        jLabel_titulologin.setBounds(145, 40, 150, 40);
        jLabel_titulologin.setFont(new Font("franklin gothic", Font.BOLD,30));
        jLabel_titulologin.setForeground(Color.BLACK);
        
        jlabel_usuario_logincliente.setBounds(50, 130, 80, 20);
        jlabel_usuario_logincliente.setFont(new Font("franklin gothic", Font.BOLD,20));
        jlabel_usuario_logincliente.setForeground(Color.BLACK);
        
        jlabel_senha_logincliente.setBounds(50, 180, 80, 20);
        jlabel_senha_logincliente.setFont(new Font("franklin gothic", Font.BOLD,20));
        jlabel_senha_logincliente.setForeground(Color.BLACK);
        
        jTextField_usuario_logincliente.setBounds(135, 130, 200, 20);
        jTextField_senha_logincliente.setBounds(120, 180, 215, 20);
        
        jButton_login.setBounds(150, 250, 100, 40);
        jButton_login.setText("Login");
        jButton_login.setBorder(new LineBorder(Color.BLACK, 2, true));
        jButton_login.setFont(new Font("franklin gothic", Font.BOLD,20));
        jButton_login.setBackground(Color.LIGHT_GRAY);
        jButton_login.setForeground(Color.BLACK);
        jButton_login.setRequestFocusEnabled(false);
        jButton_login.setRolloverEnabled(false);
        jButton_login.setMargin(new Insets(2, 1000, 2, 14));
        jButton_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario tt = new usuario();
                UsuarioDao sv = new UsuarioDao();
                tt.setNome_usuario(jTextField_usuario_logincliente.getText());
                tt.setSenha_usuario(jTextField_senha_logincliente.getText());
                if (!tt.getNome_usuario().isEmpty()&&!tt.getSenha_usuario().isEmpty()) {
                    try {
                        if (sv.login_usuario(tt)==true) {
                            if (tt.getNome_usuario().equals("admin")) {
                            TelaAdmin telaadmin = new TelaAdmin();
                            jFrame_telalogin.dispose();
                            }else{
                            TelaCatalogo Telacatalogo = new TelaCatalogo();
                            jFrame_telalogin.dispose();
                            }
                        } else {
                           JOptionPane.showMessageDialog(jFrame_telalogin,"usuario ou senha invalida");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Telalogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(jFrame_telalogin,"preencha os campos");
                }
            }
        });
        
        
        
        
        jPanel_cadastrocliente.add(jLabel_titulocadastro);
        jPanel_cadastrocliente.add(jLabel_usuario_cadastrocliente);
        jPanel_cadastrocliente.add(jTextField_usuario_cadastrocliente);
        jPanel_cadastrocliente.add(jlabel_senha_cadastrocliente);
        jPanel_cadastrocliente.add(jTextField_senha_cadastrocliente);
        jPanel_cadastrocliente.add(jlabel_confirmarsenha_cadastrocliente);
        jPanel_cadastrocliente.add(jTextField_confirmarsenha_cadastrocliente);
        jPanel_cadastrocliente.add(jButton_cadastro);
        jPanel_cadastrocliente.add(jButton_requisitosSenha);
        
        jPanel_logincliente.add(jLabel_titulologin);
        jPanel_logincliente.add(jlabel_usuario_logincliente);
        jPanel_logincliente.add(jTextField_usuario_logincliente);
        jPanel_logincliente.add(jlabel_senha_logincliente);
        jPanel_logincliente.add(jTextField_senha_logincliente);
        jPanel_logincliente.add(jButton_login);
        
        jPanel_titulo.add(jLabel_titulo);
        
        jFrame_telalogin.setSize(800,500);
        jFrame_telalogin.setVisible(true);
        jFrame_telalogin.setResizable(false);
        jFrame_telalogin.setLayout(null);
        jFrame_telalogin.setTitle("Cinac");
        jFrame_telalogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE ); 
        jFrame_telalogin.setLocationRelativeTo(null);
        jFrame_telalogin.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLACK));
        jFrame_telalogin.getContentPane().add(jPanel_titulo);
        jFrame_telalogin.getContentPane().add(jPanel_cadastrocliente);
        jFrame_telalogin.getContentPane().add(jPanel_logincliente);
        
    }
    
    
}
