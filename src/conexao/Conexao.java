package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    public Connection getConexao() {
        try {
            // Tentar estabelecer conexao
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lojaRoupas", // Linha de conexao
                    "root", // Usuario MySQL
                    "" // Senha do MySQL
            );
            Statement stmt = conn.createStatement();
            return conn;
        } catch (SQLException e) {
            // Tratar o erro
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}