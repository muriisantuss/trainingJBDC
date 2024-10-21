package dao;

import beans.Vendedores;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class VendedoresDAO {
    private Conexao conexao;
    private Connection conn;

    public VendedoresDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void insert(Vendedores vendedores) {
        String sql = "INSERT INTO vendedores(vendedores) VALUES (?,?)";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(2, vendedores.getVendedor());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir vendedor: " + e.getMessage());
        }
    }

}
