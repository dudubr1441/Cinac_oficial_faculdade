/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.CinacDao;

import cinac.Entidade.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz_eduardo
 */
public class UsuarioDao {
    protected Connection conexao;
    protected PreparedStatement preparando;
    protected ResultSet resultSet;
    public void cadastro_usuario(usuario us) throws SQLException{
        String sql = "insert into usuario(Nome_usuario,Senha_usuario) values (?,?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparando = conexao.prepareStatement(sql);
            preparando.setString(1,us.getNome_usuario());
            preparando.setString(2,us.getSenha_usuario() );
            preparando.executeUpdate();
            conexao.close();
            //ResultSet resultSet = preparando.getGeneratedKeys();
            //resultSet.next();
            //pessoa.setId(resultSet.getInt(1));
        } catch (SQLException e) {
            System.err.println("Ocorreu um erro ao salvar:" + e.getMessage());
        }       
        finally{FabricaConexao.fecharConexao(conexao, preparando);}        
    }
    public boolean login_usuario(usuario tt) throws SQLException{ 
        
    String sql="SELECT Nome_usuario,Senha_usuario from usuario where Nome_usuario =? and Senha_usuario =?";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparando = conexao.prepareStatement(sql);
            preparando.setString(1,tt.getNome_usuario());
            preparando.setString(2,tt.getSenha_usuario());
            resultSet = preparando.executeQuery();
            if (resultSet.next()==true) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
        }
        finally{FabricaConexao.fecharConexao(conexao, preparando);}
        return login_usuario(tt);
    }
    
    
}

    



    
  

    
