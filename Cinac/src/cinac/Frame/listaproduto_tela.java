/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.Frame;

import cinac.Entidade.Modelo_tabela;
import cinac.Entidade.Produto;
import cinac.CinacDao.ProdutoDao;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author luiz.carvalho1
 */
public class listaproduto_tela {
   private JFrame  jFrame_telaprincipal;
   private JPanel  jPanel_paineltitulo;
   private JPanel  jPanel_paineltabela;
   private JTable  jTable_tabelaproduto;
   private JLabel  jLabel_titulo;
   private JButton jButton_adicionar;
   private JButton jButton_deletar;
   private JPanel  jPanel_botoes;
   private JButton jButton_atualizar;
   private JPanel  jPanel_escricao;
   private JTextField jTextField_nomeproduto;
   private JTextField jTextField_valorproduto;
   private JTextField JtextField_quantidade_produto;
   private JLabel jLabel_nomeproduto;
   private JLabel jLabel_valorproduto;
   private JLabel jLabel_quantidadeproduto;
   private JLabel jLabel_titulotabela;
   private JComboBox jComboBox_categoria;
   private JLabel jLabel_categoria;
   private JLabel jLabel_diaproduto;
   private JLabel jLabel_mesproduto;
   private JLabel jLabel_anoproduto;
   private JLabel jLabel_validadeproduto;
   private JComboBox jComboBox_diaproduto;
   private JComboBox jComboBox_mesproduto;
   private JComboBox jComboBox_anoproduto;
   
public void exibir_tela() throws NullPointerException,ParseException   {
    try {
        
    String[] Categoria = {" ","refrigerante","laticinio"}; 
    jFrame_telaprincipal = new JFrame("lista produto");
    jPanel_paineltitulo = new JPanel();
    jPanel_paineltabela = new JPanel();
    jTable_tabelaproduto = new JTable();
    jLabel_titulo = new JLabel();
    jButton_adicionar = new JButton();
    jButton_deletar = new JButton();
    jTable_tabelaproduto = new JTable();
    jPanel_botoes = new JPanel();
    jButton_atualizar = new JButton();
    jPanel_escricao = new JPanel();
    jTextField_nomeproduto = new JTextField();
    jTextField_valorproduto = new JTextField();
    JtextField_quantidade_produto = new JTextField();
    jLabel_nomeproduto = new JLabel("Nome: ");
    jLabel_valorproduto = new JLabel(" Valor: ");
    jLabel_quantidadeproduto = new JLabel("Quantidade: ");
    jLabel_titulotabela = new JLabel("Tabela");
    jLabel_categoria = new JLabel("Categoria: ");
    jLabel_diaproduto = new JLabel("Dia:");
    jLabel_mesproduto = new JLabel("Mês:");
    jLabel_anoproduto = new JLabel("Ano:");
    jLabel_validadeproduto = new JLabel("Validade");
    
    jComboBox_categoria = new JComboBox(Categoria);
    
    //ImageIcon = new ImageIcon;
    
    //set painel e textfield
            
    jPanel_escricao.setBounds(0,0, 500, 300);
    jPanel_escricao.setBackground(Color.DARK_GRAY);
    jPanel_escricao.setLayout(null);
    
    jLabel_nomeproduto.setBounds(5, 100, 80, 20);
    jLabel_nomeproduto.setForeground(Color.WHITE);
    jLabel_nomeproduto.setFont(new Font("franklin gothic", Font.BOLD,20));
    
    jTextField_nomeproduto.setBounds(70,100,420,20);

    jLabel_valorproduto.setBounds(3, 210, 80, 20);
    jLabel_valorproduto.setForeground(Color.WHITE);
    jLabel_valorproduto.setFont(new Font("franklin gothic", Font.BOLD,20));
    
    jTextField_valorproduto.setBounds(67,210,100,20);
    jTextField_valorproduto.setDocument(new Filtro_valor());
    
    jLabel_quantidadeproduto.setBounds(280, 210, 140, 20);
    jLabel_quantidadeproduto.setForeground(Color.WHITE);
    jLabel_quantidadeproduto.setFont(new Font("franklin gothic", Font.BOLD,20));
 
    JtextField_quantidade_produto.setBounds(400,210,70,20);
    JtextField_quantidade_produto.setDocument(new Filtro_valor2());
    
    jLabel_categoria.setBounds(2, 155, 120, 24);
    jLabel_categoria.setForeground(Color.WHITE);
    jLabel_categoria.setFont(new Font("franklin gothic", Font.BOLD,17));
    jComboBox_categoria.setBounds(85, 155, 85, 25);
    jComboBox_categoria.setFont(new Font("franklin gothic", Font.BOLD,15));
    jComboBox_categoria.setForeground(Color.DARK_GRAY);
    jComboBox_categoria.setFocusable(false);
    
    jLabel_validadeproduto.setBounds(320, 130, 100, 20);
    jLabel_validadeproduto.setForeground(Color.WHITE);
    jLabel_validadeproduto.setFont(new Font("franklin gothic", Font.BOLD,15));
    
    String[] dia = {" ","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    
    String[] mes = {" ","01","02","03","04","05","06","07","08","09","10","11","12"};
    
    String[] ano = {" ","2021","2022","2023","2024","2025"};
    
    jComboBox_anoproduto = new JComboBox(ano);
    jComboBox_anoproduto.setBounds(425, 160, 60, 20);
    jComboBox_anoproduto.setFocusable(false);
    
    jComboBox_mesproduto = new JComboBox(mes);
   // jComboBox_mesproduto.removeItemAt(0);
    jComboBox_mesproduto.setBounds(345, 160, 40, 20);
    jComboBox_mesproduto.setFocusable(false);
    
    jComboBox_diaproduto = new JComboBox(dia);
   // jComboBox_diaproduto.removeItemAt(0);
    jComboBox_diaproduto.setBounds(260, 160, 40, 20);
    jComboBox_diaproduto.setFocusable(false);
    
    jLabel_diaproduto.setBounds(230, 160, 50, 20);
    jLabel_mesproduto.setBounds(310, 160, 50, 20);
    jLabel_anoproduto.setBounds(390, 160, 50, 20);
    
    jLabel_diaproduto.setForeground(Color.WHITE);
    jLabel_mesproduto.setForeground(Color.WHITE);
    jLabel_anoproduto.setForeground(Color.WHITE);
    
    jLabel_diaproduto.setFont(new Font("franklin gothic", Font.BOLD,15));
    jLabel_mesproduto.setFont(new Font("franklin gothic", Font.BOLD,15));
    jLabel_anoproduto.setFont(new Font("franklin gothic", Font.BOLD,15));
    
    jPanel_escricao.add(jTextField_nomeproduto);
    jPanel_escricao.add(jTextField_valorproduto);
    jPanel_escricao.add(jLabel_nomeproduto);
    jPanel_escricao.add(jLabel_valorproduto);
    jPanel_escricao.add(jLabel_quantidadeproduto);
    jPanel_escricao.add(JtextField_quantidade_produto);
    jPanel_escricao.add(jLabel_categoria);
    jPanel_escricao.add(jComboBox_categoria);
    jPanel_escricao.add(jLabel_validadeproduto);
    jPanel_escricao.add(jLabel_diaproduto);
    jPanel_escricao.add(jLabel_mesproduto);
    jPanel_escricao.add(jLabel_anoproduto);  
    jPanel_escricao.add(jComboBox_diaproduto);
    jPanel_escricao.add(jComboBox_mesproduto);
    jPanel_escricao.add(jComboBox_anoproduto);
    
    //jPanel_escricao.add(jFormattedTextField_valorproduto);
    
    //set JFrame
    jFrame_telaprincipal.setLayout(null);
    jFrame_telaprincipal.setSize(505,595);
    jFrame_telaprincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    jFrame_telaprincipal.setLocationRelativeTo(null);
    jFrame_telaprincipal.setResizable(false);
   
    
    //set Jpanels
    jPanel_paineltabela.setBounds(0,285,500,280);
    jPanel_paineltabela.setLayout(new BorderLayout());
    jPanel_paineltitulo.setLayout(null);
    Color vermelho_escuro = new Color(130, 33, 25);
    jPanel_paineltitulo.setBackground(vermelho_escuro);
    
    
    
    //set Jlabels
    jLabel_titulo.setText("Cinac");
    jLabel_titulo.setFont(new Font("ravie", Font.BOLD,40));
    jLabel_titulo.setBounds(183, 0, 200, 100);
    jLabel_titulo.setForeground(Color.WHITE);
    
    //set da tabela
        Modelo_tabela tabela_Modelo = new Modelo_tabela();
        JTable jTable_tabelaproduto = new JTable(tabela_Modelo);
        jTable_tabelaproduto.setLocale(null);
        //jTable_tabelaproduto.setBounds(0,0, 500, 200);
        jTable_tabelaproduto.getTableHeader().setReorderingAllowed (false);
        tabela_Modelo.addColumn("Id");
        tabela_Modelo.addColumn("Nome");
        tabela_Modelo.addColumn("Categoria");
        tabela_Modelo.addColumn("Valor");
        tabela_Modelo.addColumn("Estoque");
        tabela_Modelo.addColumn("Estado");
        tabela_Modelo.addColumn("validade");
        
        jTable_tabelaproduto.setEnabled(true);
        jTable_tabelaproduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable_tabelaproduto.getColumnModel().getColumn(0).setPreferredWidth(40); 
        jTable_tabelaproduto.getColumnModel().getColumn(1).setPreferredWidth(100); 
        jTable_tabelaproduto.getColumnModel().getColumn(2).setPreferredWidth(100); 
        jTable_tabelaproduto.getColumnModel().getColumn(3).setPreferredWidth(100); 
        jTable_tabelaproduto.getColumnModel().getColumn(4).setPreferredWidth(80); 
        jTable_tabelaproduto.getColumnModel().getColumn(5).setPreferredWidth(82); 
        Listaproduto(tabela_Modelo);
        
    //ligação dos componentes com o Jpanel titulo
    jPanel_escricao.add(jLabel_titulo);   
    
    //ligação dos componentes com o Jpanel tabela
    jPanel_paineltabela.add(jTable_tabelaproduto);
    jPanel_paineltabela.add(new JScrollPane(jTable_tabelaproduto));
    
    //set Jpanel_botoes
    //jPanel_botoes.setBounds(0, 35, 500, 100);
    jPanel_botoes.setLayout(null);
    jPanel_botoes.setBackground(Color.DARK_GRAY);
    
    jButton_adicionar.setText("Adicionar");
    jButton_adicionar.setBounds(30, 250, 100, 30);
    jButton_adicionar.setFocusPainted(false);
   // jButton_adicionar.setBackground(Color.yellow);
    jButton_adicionar.setFont(new Font("franklin gothic", Font.BOLD,15));
    jButton_adicionar.setForeground(Color.RED);
    jButton_adicionar.setBorder(new LineBorder(Color.BLACK, 2, true));
    jButton_adicionar.setBackground(Color.LIGHT_GRAY);
    //jButton_adicionar.setModel(new );
    jPanel_escricao.add(jButton_adicionar);
    
    
    jButton_atualizar.setText("Atualizar");
    jButton_atualizar.setBounds(200,250, 100, 30);
    jButton_atualizar.setVisible(true);
    jButton_atualizar.setFocusPainted(false);
    jButton_atualizar.setFont(new Font("franklin gothic", Font.BOLD,15));
    jButton_atualizar.setForeground(Color.BLUE);
    jButton_atualizar.setBorder(new LineBorder(Color.BLACK, 2, true));
    jButton_atualizar.setBackground(Color.LIGHT_GRAY);
    jPanel_escricao.add(jButton_atualizar);
    
    jButton_deletar.setText("excluir");
    jButton_deletar.setBounds(370, 250, 100, 30);
    jButton_deletar.setVisible(true);
    jButton_deletar.setFocusPainted(false);
    jButton_deletar.setFont(new Font("franklin gothic", Font.BOLD,15));
    jButton_deletar.setForeground(Color.RED);
    jButton_deletar.setBorder(new LineBorder(Color.BLACK, 2, true));
    jButton_deletar.setBackground(Color.LIGHT_GRAY);
    jPanel_escricao.add(jButton_deletar);
    
    
    jPanel_escricao.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {
            jTable_tabelaproduto.setSelectionMode(0);
            
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }
    });
    jButton_adicionar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {try {
                
            if (!jTextField_nomeproduto.getText().isEmpty()&& !jTextField_valorproduto.getText().isEmpty() && !JtextField_quantidade_produto.getText().isEmpty()
                && " " != String.valueOf(jComboBox_categoria.getSelectedItem())&& " " != String.valueOf(jComboBox_anoproduto.getSelectedItem())&& " " 
                != String.valueOf(jComboBox_mesproduto.getSelectedItem())&& " " != String.valueOf(jComboBox_anoproduto.getSelectedItem())) {
                String senha = JOptionPane.showInputDialog(null, "digite a senha:");
                if (senha.equals("Cinac2021")) {
                
                Produto pro = new Produto();
                pro.setNome_produto(jTextField_nomeproduto.getText());
                pro.setCategoria_produto((String)jComboBox_categoria.getSelectedItem());
                pro.setValor_produto(Double.parseDouble(jTextField_valorproduto.getText()));
                pro.setQuantidade_produto(Integer.valueOf(JtextField_quantidade_produto.getText()));
                pro.setValidade_produto(Date.valueOf(String.valueOf(jComboBox_anoproduto.getSelectedItem())+"-"
                +String.valueOf(jComboBox_mesproduto.getSelectedItem()+"-"+String.valueOf(jComboBox_diaproduto.getSelectedItem()))));
                pro.setEstado_produto(Boolean.TRUE);
                ProdutoDao tt = new ProdutoDao();
                tt.salvarproduto(pro);
               Listaproduto(tabela_Modelo);
               JOptionPane.showMessageDialog(null, "Adicionado com sucesso");
               jTextField_nomeproduto.setText("");jTextField_valorproduto.setText("");JtextField_quantidade_produto.setText("");
               jComboBox_categoria.setSelectedIndex(0);jComboBox_anoproduto.setSelectedIndex(0);jComboBox_mesproduto.setSelectedIndex(0);jComboBox_diaproduto.setSelectedIndex(0);
               } else {JOptionPane.showMessageDialog(null, "Senha Incorreta");
               jTextField_nomeproduto.setText("");jTextField_valorproduto.setText("");JtextField_quantidade_produto.setText("");
               jComboBox_categoria.setSelectedIndex(0);jComboBox_anoproduto.setSelectedIndex(0);jComboBox_mesproduto.setSelectedIndex(0);jComboBox_diaproduto.setSelectedIndex(0);
                }
            } else {
                JOptionPane.showMessageDialog(jFrame_telaprincipal,"       um ou mais campos\n         não preenchidos");
            }
            
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "erro ao adicionar\n"+e);
            }
        }
    });
    jButton_atualizar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {Listaproduto(tabela_Modelo);
        
        }
    });
    jButton_deletar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (jTable_tabelaproduto.getSelectedRowCount()>1) {
                JOptionPane.showMessageDialog(null,"muitas linhas selecionadas");
            }
            if (jTable_tabelaproduto.getSelectedRowCount()==1) {    
            Integer deletar_produto;
            //jTable_tabelaproduto.getValueAt(jTable_tabelaproduto.getSelectedRowCount(),1);
            ProdutoDao tt = new ProdutoDao();          
                try {
                    tt.excluirproduto((Integer) jTable_tabelaproduto.getValueAt(jTable_tabelaproduto.getSelectedRow(),0));
                    Listaproduto(tabela_Modelo);
                    Integer deletarInteger = null;
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                    
                } catch (SQLException ex ) {
                    JOptionPane.showMessageDialog(null, "Erro ao acessar o banco:\n" + ex);
                }
                if (jTable_tabelaproduto.getSelectedRow()==-1) {
                    JOptionPane.showMessageDialog(null,"selecione uma linha");
                } 
            }                
            
        }
    });
     //ligação com o jframe
    jFrame_telaprincipal.getContentPane().add(jPanel_paineltabela);
    jFrame_telaprincipal.getContentPane().add(jPanel_paineltitulo);
    jFrame_telaprincipal.getContentPane().add(jPanel_botoes);
    jFrame_telaprincipal.getContentPane().add(jPanel_escricao);
    jFrame_telaprincipal.setVisible(true);
     //jTable_tabelaproduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro ao carregar: \n" + e);
    }
}

    protected static void Listaproduto(DefaultTableModel tabelaModelo){
    try {
        tabelaModelo.getDataVector().clear();// limpa a tabela
        List<Produto> lista_clientes = new ArrayList();// lista dos objetos

        ProdutoDao cdao = new ProdutoDao();
        
        lista_clientes = cdao.listaCliente();//  pesquisa que popula meu list    

        if (!lista_clientes.isEmpty()) {// verifica se a list nao esta vazia
            for (Produto p : lista_clientes) {// ele percorre a list
                String estado_produto = null;
                if (p.getEstado_produto()==true) {estado_produto = "          Ativo";}if (p.getEstado_produto()==false) {estado_produto = "estado_produtodesativado";}
                tabelaModelo.addRow(new Object[]{p.getId_produto(),p.getNome_produto(),
                p.getCategoria_produto(),p.getValor_produto(),p.getQuantidade_produto(),estado_produto,p.getValidade_produto()});
                // adiciona no jtable
            }
        }
        } catch (Exception e) {
            System.out.println("Erro ao atualizar tabela\n" + e.getMessage());
        }
    }
}
