/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JOAO EDUARDO
 */
public class TelaCadastrofilme {
        

        public TelaCadastrofilme() {
        JFrame TelaAddFilme = new JFrame("Adicionar Filme");
        TelaAddFilme.setLayout(null);
        TelaAddFilme.setSize(400, 400);
        TelaAddFilme.setResizable(false);
        TelaAddFilme.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        TelaAddFilme.setLocationRelativeTo(null);
        TelaAddFilme.setTitle("Adicionar Filme");
        TelaAddFilme.getContentPane().setBackground(new Color(130,33,25));
        
        JPanel painelTitulo = new JPanel();
        painelTitulo.setBackground(new Color(130,33,25));
        painelTitulo.setBounds(0, 0, 400, 50);
        JLabel label_titulo = new JLabel("Adicionar Filme");
        label_titulo.setFont(new Font("Stencil", Font.BOLD, 24));
        label_titulo.setForeground(Color.WHITE);
        painelTitulo.add(label_titulo);
        TelaAddFilme.add(painelTitulo);
        
        JPanel painelDados = new JPanel();
        painelDados.setBackground(new Color(130,33,25));
        painelDados.setBounds(0, 60, 400, 340);
        painelDados.setLayout(null);
        JLabel titulo = new JLabel("Título:");
        titulo.setFont(new Font("Stencil", Font.PLAIN, 14));
        titulo.setForeground(Color.WHITE);
        JTextField inputTitulo = new JTextField();
        inputTitulo.setForeground(Color.LIGHT_GRAY);
        titulo.setBounds(30, 50, 100, 30);
        inputTitulo.setBounds(90, 55, 250, 20);
        JLabel descricao = new JLabel("Descrição:");
        descricao.setFont(new Font("Stencil", Font.PLAIN, 14));
        descricao.setForeground(Color.WHITE);
        JTextArea inputDesc = new JTextArea();
        inputDesc.setForeground(Color.LIGHT_GRAY);
        descricao.setBounds(15, 85, 100, 30);
        inputDesc.setBounds(100, 90, 250, 100);
        JLabel label_ator = new JLabel("Ator Principal:");
        label_ator.setFont(new Font("Stencil", Font.PLAIN, 14));
        label_ator.setForeground(Color.WHITE);
        JTextField input_ator = new JTextField();
        input_ator.setForeground(Color.LIGHT_GRAY);
        JLabel label_idade = new JLabel("Idade:");
        label_idade.setFont(new Font("Stencil", Font.PLAIN, 14));
        label_idade.setForeground(Color.WHITE);
        JTextField input_idade = new JTextField();
        input_idade.setForeground(Color.LIGHT_GRAY);
        label_ator.setBounds(10, 235, 120, 30);
        input_ator.setBounds(130, 240, 150, 20);
        label_idade.setBounds(290, 235, 100, 30);
        input_idade.setBounds(340, 240, 30, 20);
        JButton btAdd = new JButton("Adicionar Filme");
        btAdd.setBackground(Color.LIGHT_GRAY);
        btAdd.setFont(new Font("franklin gothic", Font.BOLD, 12));
        btAdd.setBounds(135, 275, 130, 20);
        painelDados.add(titulo);
        painelDados.add(inputTitulo);
        painelDados.add(descricao);
        painelDados.add(inputDesc);
        painelDados.add(label_ator);
        painelDados.add(input_ator);
        painelDados.add(label_idade);
        painelDados.add(input_idade);
        painelDados.add(btAdd);
   
        TelaAddFilme.getContentPane().add(painelDados);
        TelaAddFilme.setVisible(true);
        }
    }
    

