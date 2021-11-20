/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.CinacDao;

import cinac.Entidade.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno.bittencourt
 */
public class FilmeDao{
    protected Connection conexao;
    protected PreparedStatement preparando;
    protected ResultSet resultSet;
    
    public void salvar (Filme filme) throws SQLException{
        String sql = "INSERT INTO Filme (atorNome, atorIdade, titulo, descricao) VALUES (?,?,?,?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparando.setString(1, filme.getAtorNome());
            preparando.setInt(2, filme.getAtorIdade());
            preparando.setString(3, filme.getTitulo());
            preparando.setString(4, filme.getDescricao());
            preparando.executeUpdate();
        } catch (Exception e) {
            System.err.println("Ocorreu um erro ao salvar o filme: " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(conexao, preparando);
        }
    }
    public List<Filme> listaFilme() throws SQLException {
        Filme filme;
        List<Filme> filmes = new ArrayList<>();
        String consulta = "SELECT * FROM Filme f"
                + " INNER JOIN ator a on f.ator_id = a.AtorID";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparando = conexao.prepareStatement(consulta);
            resultSet = preparando.executeQuery();
            while (resultSet.next()) {
                filme = new Filme();
                filme.setFilmeID(resultSet.getInt("FilmeID"));
                filme.setTitulo(resultSet.getString("titulo"));
                filme.setDescricao(resultSet.getString("descricao"));
                filmes.add(filme);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao selecionar o filme +" + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(conexao, preparando, resultSet);
        }
        return filmes;
    }
//      public void alterar(Filme filme) throws SQLException {
//            super.alterar(filme);
//        String sql = "UPDATE filme SET CPF = ?, EsportePreferido = ?  WHERE PessoaID = ?";
//        try {
//            preparando = conexao.prepareStatement(sql);
//            preparando.setString(1, cliente.getCpf());
//            preparando.setString(2, cliente.getEsportePreferido());
//            preparando.setLong(3, cliente.getPessoaID());
//            preparando.executeUpdate();
//        } catch (SQLException eSQL) {
//            System.err.println("Erro ao alterar cliente " + eSQL.getMessage());
//        } finally {
//            FabricaConexao.fecharConexao(conexao, preparando);
//        }
//    }
//    public void excluir(Integer id) throws SQLException {
//     try {
//         conexao = FabricaConexao.abrirConexao();
//         preparando = conexao.prepareStatement("DELETE FROM Cliente WHERE PessoaID = ?");
//         preparando.setInt(1, id);
//         preparando.executeUpdate();
//     } catch (SQLException e) {
//         System.err.println("Erro ao excluir " + e.getMessage());
//     } finally {
//         super.excluir(id);
//         FabricaConexao.fecharConexao(conexao, preparando);
//     }
//    }
//    
}
