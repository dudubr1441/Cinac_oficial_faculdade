/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinac.CinacDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luiz_eduardo
 */
public class FabricaConexao {
    public static Connection abrirConexao() throws SQLException{
        Connection driver = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            driver = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cinac"
            +"?useTimezone=true&serverTimezone=America/Sao_Paulo&zeroDateTimeBehavior=convertToNull",
                    "root","10092003");
        } catch (Exception e) {
            System.err.println("erro na conexão com o banco: "+ e.getMessage());
        }
        return driver;
    }
  public static void fecharConexao(Connection conn, Statement psmt, ResultSet rs) throws SQLException {
        rs.close();
        conn.close();
        psmt.close();
    }

    public static void fecharConexao(Connection conn, Statement psmt) throws SQLException {
        conn.close();
        psmt.close();
    }   
}


