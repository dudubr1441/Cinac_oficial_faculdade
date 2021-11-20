/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.CinacDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import cinac.Entidade.Produto;
import cinac.Frame.listaproduto_tela;
import java.util.ArrayList;
import java.util.List;
import cinac.CinacDao.FabricaConexao;

public class ProdutoDao {
    protected Connection conexao;
    protected PreparedStatement preparando;
    protected ResultSet resultSet;
    
    public void salvarproduto(Produto pr) throws SQLException{
        String sql = "insert into produto(nome_produto,categoria_produto,valor_produto,estado_produto,validade_produto,quantidade_produto) values (?,?,?,?,?,?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparando = conexao.prepareStatement(sql);
            preparando.setString(1,pr.getNome_produto());
            preparando.setString(2,pr.getCategoria_produto());
            preparando.setDouble(3,pr.getValor_produto());
            preparando.setBoolean(4,pr.getEstado_produto());
            preparando.setDate(5,pr.getValidade_produto());
            preparando.setInt(6,pr.getQuantidade_produto());
            preparando.executeUpdate();
            conexao.close();
            //ResultSet resultSet = preparando.getGeneratedKeys();
            //resultSet.next();
            //pessoa.setId(resultSet.getInt(1));
        } catch (Exception e) {
            System.err.println("Ocorreu um erro ao salvar:" + e.getMessage());
        }          
        finally{FabricaConexao.fecharConexao(conexao, preparando);}
    }
     public List<Produto> listaCliente() throws SQLException {
         Produto produto;
        List<Produto> produtos = new ArrayList<>();
        String consulta = "SELECT * FROM produto";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparando = conexao.prepareStatement(consulta);
            resultSet = preparando.executeQuery();
            while (resultSet.next()) {
                produto = new Produto();
                produto.setId_produto(resultSet.getInt("id"));
                produto.setNome_produto(resultSet.getString("nome_produto"));
                produto.setCategoria_produto(resultSet.getString("categoria_produto"));
                produto.setValor_produto(resultSet.getDouble("valor_produto"));
                produto.setQuantidade_produto(resultSet.getInt("quantidade_produto"));
                produto.setEstado_produto(resultSet.getBoolean("estado_produto"));     
                produto.setValidade_produto(resultSet.getDate("validade_produto"));
                
                
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar arraylist dos produtos : +" + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(conexao, preparando, resultSet);
        }
        return produtos;      
     }
     public void excluirproduto(Integer id) throws SQLException {
     try {
         conexao = FabricaConexao.abrirConexao();
         preparando = conexao.prepareStatement("DELETE FROM produto WHERE id = ?");
         preparando.setInt(1, id);
         preparando.executeUpdate();
     } catch (SQLException e) {
         System.err.println("Erro ao excluir " + e.getMessage());
     } finally {
         FabricaConexao.fecharConexao(conexao, preparando);
     }     }
          public void alterarproduto(Produto pt) throws SQLException{
              try {    
          conexao = FabricaConexao.abrirConexao();
          preparando = conexao.prepareStatement("UPDATE produto set nome_produto=?,categoria_produto=?,valor_produto=?,estado_produto=? where id=?;");
          preparando.setString(1,pt.getNome_produto());
          preparando.setString(2,pt.getCategoria_produto());
          preparando.setDouble(3,pt.getValor_produto());
          preparando.setBoolean(4,pt.getEstado_produto());
          preparando.executeUpdate();
          } catch (Exception e) {
              }
     }}

