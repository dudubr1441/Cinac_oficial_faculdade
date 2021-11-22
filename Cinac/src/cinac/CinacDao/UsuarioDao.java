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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luiz_eduardo
 */
public class UsuarioDao {
    protected Connection conexao;
    protected PreparedStatement preparando;
    protected ResultSet resultSet;
    public void salvarusuario(usuario us){
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
    
        public static boolean compararnome_usuario(usuario tt){
    String sqll = "SELECT Nome_usuario from usuario where Nome_usuario = ?;";
    Connection conexao2 = FabricaConexao.abrirConexao();
         PreparedStatement preparando2 = conexao2.prepareStatement(sql);
         ResultSet resultado2 ;
        try {
         preparando2.setString(1, tt.getNome_usuario());
         resultado2 = preparando2.executeQuery();
            if (!resultado2.getString("Nome_usuario").equals(tt.getNome_usuario())) {
                return false;
            }else{
            return true;
            }
            
            
        } catch (SQLException e) {
        }
        finally{try {
            FabricaConexao.fecharConexao(conexao2, preparando2, resultado2);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        
        public static boolean compararsenha_usuario(usuario tt) {
    String sql = "SELECT Nome_usuario,Senha_usuario from usuario where Nome_usuario = ? and Senha_usuario = ?;";
    Connection conexao3 = FabricaConexao.abrirConexao();
    PreparedStatement preparando3 = conexao3.prepareStatement(sql);
    ResultSet resultado3;
        try {
         preparando3.setString(1, tt.getNome_usuario());
         preparando3.setString(2, tt.getSenha_usuario());
         ResultSet resultado3 = preparando3.executeQuery();
            if (!resultado3.getString("Senha_usuario").equals(tt.getSenha_usuario())&&!resultado3.getString("Nome_usuario").equals(tt.getNome_usuario())) {
                return false;
            }else{
            return true;
            }
            
            
        } catch (SQLException e) {}
        finally{FabricaConexao.fecharConexao(conexao3, preparando3, resultado3);            
        }
        


    
