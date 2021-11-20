/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.CinacDao;

import cinac.Entidade.Filme;
import cinac.Entidade.Ingresso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruno.bittencourt
 */
public class IngressoDao {
    protected Connection conexao;
    protected PreparedStatement preparando;
    protected ResultSet resultSet;
    
    public void salvar(Ingresso ingresso) throws SQLException{
        String sql = "INSERT INTO Ingresso (filmeID, entradaInteira, valorTotal, salaTipo, assento) VALUES (?,?,?,?,?)";
        
        try {
            conexao = FabricaConexao.abrirConexao();
            preparando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparando.setInt(1, ingresso.getFilmeID());
            preparando.setBoolean(2, ingresso.isEntradaInteira());
            preparando.setFloat(3, ingresso.getValorTotal());
            preparando.setString(4, ingresso.getSala_tipo());
            preparando.setString(5, ingresso.getAssento());
            preparando.executeUpdate();
            resultSet = preparando.getGeneratedKeys();
            resultSet.next();
            
           
        } catch (Exception e) {
            System.err.println("Ocorreu um erro ao salvar o ingresso: " + e.getMessage());
        }finally {
            FabricaConexao.fecharConexao(conexao, preparando, resultSet);
        }
    }
}
