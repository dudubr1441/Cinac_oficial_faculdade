/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Frame;


import cinac.CinacDao.FabricaConexao;
import cinac.CinacDao.FilmeDao;
import cinac.CinacDao.IngressoDao;
import cinac.Entidade.Filme;
import cinac.Entidade.Ingresso;
import java.awt.Color; 
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author bruno.bittencourt
 */
public class TelaCatalogo extends JFrame{
    
    private static class TelaIngresso {

        public TelaIngresso() { 
        JFrame TelaIngresso = new JFrame("Gerar Ingresso");
        TelaIngresso.setLayout(null);
        TelaIngresso.setSize(400, 400);
        TelaIngresso.setResizable(false);
        TelaIngresso.setLocationRelativeTo(null);
        TelaIngresso.setTitle("Gerar Ingresso");
        TelaIngresso.setBackground(Color.LIGHT_GRAY);
        TelaIngresso.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        TelaIngresso.getContentPane().setBackground(new Color(130,33,25));
        
        JPanel painelTitulo = new JPanel();
        painelTitulo.setBackground(new Color(130,33,25));
        painelTitulo.setBounds(0, 0, 400, 50);
        JLabel label_titulo = new JLabel("Gerar Ingresso");
        label_titulo.setForeground(Color.LIGHT_GRAY);
        label_titulo.setFont(new Font("Stencil", Font.BOLD, 24));
        label_titulo.setForeground(Color.WHITE);
        painelTitulo.add(label_titulo);
        TelaIngresso.add(painelTitulo);
         
        JPanel painelDados = new JPanel();
        painelDados.setBackground(new Color(130,33,25));
        painelDados.setBounds(0, 60, 400, 340);
        painelDados.setLayout(null);
        JLabel titulo = new JLabel("Filme:");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Stencil", Font.PLAIN, 14));
        titulo.setBounds(30, 30, 100, 30);
        JLabel descricao = new JLabel("Descrição:");
        descricao.setForeground(Color.WHITE);
        descricao.setFont(new Font("Stencil", Font.PLAIN, 14));
        descricao.setBounds(30, 65, 100, 30);
        JLabel label_ator = new JLabel("Ator Principal:");
        label_ator.setForeground(Color.WHITE);
        label_ator.setFont(new Font("Stencil", Font.PLAIN, 14));
        label_ator.setBounds(30, 150, 120, 30);
        JLabel label_sala = new JLabel("Tipo de Sala:");
        label_sala.setForeground(Color.WHITE);
        label_sala.setFont(new Font("Stencil", Font.PLAIN, 14));
        JLabel label_assento = new JLabel("Assento:");
        label_assento.setForeground(Color.WHITE);
        label_assento.setFont(new Font("Stencil", Font.PLAIN, 14));
        label_sala.setBounds(30, 180, 100, 30);
        label_assento.setBounds(260, 180, 100, 30);
        JLabel meia_entrada = new JLabel("Meia Entrada");
        meia_entrada.setForeground(Color.WHITE);
        meia_entrada.setFont(new Font("Stencil", Font.PLAIN, 14));
        meia_entrada.setBounds(30, 220, 120, 30);
        JCheckBox check_meia = new JCheckBox();
        check_meia.setBackground(new Color(130,33,25));
        check_meia.setBounds(135, 220, 50, 30);
        JButton calcular_valor = new JButton("Calcular Valor");
        calcular_valor.setBackground(Color.LIGHT_GRAY);
        calcular_valor.setFont(new Font("franklin gothic", Font.BOLD, 12));
        calcular_valor.setBounds(120, 260, 150, 30);
        calcular_valor.addActionListener(
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                JOptionPane.showMessageDialog(null, "Valor Total:");
            }
        }
        );
        
        painelDados.add(titulo);
        painelDados.add(descricao);
        painelDados.add(label_ator);
        painelDados.add(label_sala);
        painelDados.add(label_assento);
        painelDados.add(meia_entrada);
        painelDados.add(check_meia);
        painelDados.add(calcular_valor);
   
        TelaIngresso.add(painelDados);
        TelaIngresso.setVisible(true);
        }
    }
    
    private static class TelaSala {
        
        public TelaSala() {
        JFrame TelaSala = new JFrame("Selecionar Sala para Exibição");
        TelaSala.setLayout(null);
        TelaSala.setSize(400, 400);
        TelaSala.setResizable(false);
        TelaSala.setLocationRelativeTo(null);
        TelaSala.setVisible(true);
        TelaSala.setTitle("Selecionar Sala para Exibição");
        TelaSala.getContentPane().setBackground(new Color(130,33,25));
       
        JPanel painelTitulo = new JPanel();
        painelTitulo.setBackground(new Color(130,33,25));
        painelTitulo.setBounds(0, 0, 400, 50);
        JLabel label_titulo = new JLabel("Selecionar Sala para Exibição");
        label_titulo.setFont(new Font("Stencil", Font.BOLD, 20));
        label_titulo.setForeground(Color.WHITE);
        painelTitulo.add(label_titulo);
        TelaSala.add(painelTitulo);
            
        JPanel painelDados = new JPanel();
        painelDados.setBackground(new Color(130,33,25));
        painelDados.setBounds(0, 60, 400, 340);
        painelDados.setLayout(null);
        JLabel sala_tipo = new JLabel("Tipo de Sala:");
        sala_tipo.setForeground(Color.WHITE);
        sala_tipo.setFont(new Font("Stencil", Font.PLAIN, 14));
        String[] sala = {"3D", "2D", "VIP"};
        JComboBox comboSala = new JComboBox(sala);
        comboSala.setForeground(Color.LIGHT_GRAY);
        sala_tipo.setBounds(110, 75, 150, 30);
        comboSala.setBounds(210, 80, 50, 20);
        JLabel sala_assento = new JLabel("Digite o assento:");
        sala_assento.setForeground(Color.WHITE);
        sala_assento.setFont(new Font("Stencil", Font.PLAIN, 14));
        JTextField input_assento = new JTextField();
        input_assento.setForeground(Color.LIGHT_GRAY);
        sala_assento.setBounds(95, 115, 140, 30);
        input_assento.setBounds(225, 120, 50, 20);
        painelDados.add(sala_tipo);
        painelDados.add(comboSala);
        painelDados.add(sala_assento);
        painelDados.add(input_assento);
        
        JButton btGerar = new JButton("Gerar Ingresso");
        btGerar.setBounds(130, 270, 120, 20);
        painelDados.add(btGerar);
        TelaSala.setVisible(true);
        btGerar.addActionListener(
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
               new TelaIngresso();
            }
        }
        );
   
        TelaSala.add(painelDados);
        }
    }
    
    private static class TelaAddFilme {

        public TelaAddFilme() {
        JFrame TelaAddFilme = new JFrame("Adicionar Filme");
        TelaAddFilme.setLayout(null);
        TelaAddFilme.setSize(400, 400);
        TelaAddFilme.setResizable(false);
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
        btAdd.addActionListener(
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
               TelaAddFilme.setVisible(false);
            }
        }
        );
        painelDados.add(titulo);
        painelDados.add(inputTitulo);
        painelDados.add(descricao);
        painelDados.add(inputDesc);
        painelDados.add(label_ator);
        painelDados.add(input_ator);
        painelDados.add(label_idade);
        painelDados.add(input_idade);
        painelDados.add(btAdd);
        TelaAddFilme.setVisible(true);
   
        TelaAddFilme.add(painelDados);
        }
    }
    
    private static class TelaSelecao {

        public TelaSelecao() {
        JFrame TelaSelecao = new JFrame("Selecionar Filme");
        TelaSelecao.setLayout(null);
        TelaSelecao.setSize(400, 400);
        TelaSelecao.setResizable(false);
        TelaSelecao.setLocationRelativeTo(null);
        
        TelaSelecao.setTitle("Selecionar Filme");
        TelaSelecao.getContentPane().setBackground(new Color(130,33,25));
        
        JPanel painelTitulo = new JPanel();
        painelTitulo.setBackground(new Color(130,33,25));
        painelTitulo.setBounds(0, 0, 400, 50);
        JLabel label_titulo = new JLabel("Selecionar Filme");
        label_titulo.setFont(new Font("Stencil", Font.BOLD, 24));
        label_titulo.setForeground(Color.WHITE);
        painelTitulo.add(label_titulo);
        TelaSelecao.add(painelTitulo);
            
        JPanel painelDados = new JPanel();
        painelDados.setBackground(new Color(130,33,25));
        painelDados.setBounds(0, 60, 400, 340);
        painelDados.setLayout(null);
        JLabel titulo = new JLabel("Título:");
        titulo.setFont(new Font("Stencil", Font.PLAIN, 14));
        titulo.setForeground(Color.WHITE);
//        JTextField inputTitulo = new JTextField();
        titulo.setBounds(30, 50, 100, 30);
//        inputTitulo.setBounds(90, 55, 250, 20);
        JLabel descricao = new JLabel("Descrição:");
        descricao.setFont(new Font("Stencil", Font.PLAIN, 14));
        descricao.setForeground(Color.WHITE);
//        JTextArea inputDesc = new JTextArea();
        descricao.setBounds(15, 85, 100, 30);
//        inputDesc.setBounds(90, 90, 250, 100);
        JLabel label_ator = new JLabel("Ator Principal:");
        label_ator.setFont(new Font("Stencil", Font.PLAIN, 14));
        label_ator.setForeground(Color.WHITE);
//        JTextField input_ator = new JTextField();
        JLabel label_idade = new JLabel("Idade:");
        label_idade.setFont(new Font("Stencil", Font.PLAIN, 14));
        label_idade.setForeground(Color.WHITE);
//        JTextField input_idade = new JTextField();
        label_ator.setBounds(10, 235, 120, 30);
//        input_ator.setBounds(100, 240, 150, 20);
        label_idade.setBounds(260, 235, 100, 30);
//        input_idade.setBounds(300, 240, 50, 20);
        painelDados.add(titulo);
//        painelDados.add(inputTitulo);
        painelDados.add(descricao);
//        painelDados.add(inputDesc);
        painelDados.add(label_ator);
//        painelDados.add(input_ator);
        painelDados.add(label_idade);
//        painelDados.add(input_idade);
        JButton btAvancar = new JButton("Avançar");
        btAvancar.setBackground(Color.LIGHT_GRAY);
        btAvancar.setFont(new Font("franklin gothic", Font.BOLD, 12));
        btAvancar.setBounds(130, 270, 120, 20);
        painelDados.add(btAvancar);
        TelaSelecao.setVisible(true);
        btAvancar.addActionListener(
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
               new TelaSala();
            }
        }
        );
        TelaSelecao.add(painelDados);
        }
    }
    
    public TelaCatalogo(){
        ImageIcon logo = new ImageIcon(getClass().getResource("logo.png"));
        Image image = logo.getImage();  
        Image newimg = image.getScaledInstance(190, 190, Image.SCALE_SMOOTH);  
        logo = new ImageIcon(newimg);  

        JLabel label_imagem = new JLabel(logo);
        label_imagem.setBounds(140, 5, 100, 150);
        add(label_imagem);
        
        
        getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLACK));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(400, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Catálogo de Filmes");
        getContentPane().setBackground(new Color(130,33,25));
        // FUNDO COR RGB: 130, 33, 25
        
        JPanel painelTitulo = new JPanel();
        painelTitulo.setBackground(new Color(130,33,25));
        painelTitulo.setBounds(0, 0, 400, 50);
        JLabel label_titulo = new JLabel("Catálogo de Filmes");
        label_titulo.setFont(new Font("Stencil", Font.BOLD, 24));
        label_titulo.setForeground(Color.WHITE);
        painelTitulo.add(label_titulo);
        add(painelTitulo);
        
        

        JPanel painelFilmes = new JPanel();
        painelFilmes.setBackground(new Color(130,33,25));
        painelFilmes.setBounds(0, 60, 400, 340);
        painelFilmes.setLayout(null);
        JLabel label_filme = new JLabel("Selecione o Filme:");
        label_filme.setFont(new Font("Stencil", Font.PLAIN, 14));
        label_filme.setForeground(Color.WHITE);
        String[] filmes = {"Filme 1", "Filme 2", "Filme 3"};
        JComboBox listaFilmes = new JComboBox(filmes);
        listaFilmes.setFont(new Font("franklin gothic", Font.BOLD, 13));
        listaFilmes.setBackground(Color.LIGHT_GRAY);
        JButton btSelecionar = new JButton("Selecionar");
        btSelecionar.setFont(new Font("franklin gothic", Font.BOLD, 12));
        btSelecionar.setBackground(Color.LIGHT_GRAY);
        label_filme.setBounds(30, 100, 180, 20);
        listaFilmes.setBounds(170, 100, 150, 20);
        btSelecionar.setBounds(150, 140, 95, 20);
        btSelecionar.addActionListener(
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                new TelaSelecao();
            }
        });
        
        painelFilmes.add(label_filme);
        painelFilmes.add(listaFilmes);
        painelFilmes.add(btSelecionar);
        add(painelFilmes);
        
        JButton btAddFilme = new JButton("Adicionar Filme");
        btAddFilme.setBackground(Color.LIGHT_GRAY);
        btAddFilme.setFont(new Font("franklin gothic", Font.BOLD, 12));
        //franklin gothic
        btAddFilme.setBounds(120, 200, 150, 20);
        btAddFilme.addActionListener(  
        new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent evento){  
                new TelaAddFilme();
            }  
        }  
    ); 
        painelFilmes.add(btAddFilme);

    }
      

    

    
    
}
