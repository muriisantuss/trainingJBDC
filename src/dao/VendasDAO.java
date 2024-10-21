package dao;

import beans.Vendas;
import beans.Vendedores;
import beans.Clientes;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class VendasDAO {

    private Conexao conexao;
    private Connection conn;

    public VendasDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Vendas vendas, Vendedores vendedores, Clientes clientes) {
        String sql = "INSERT INTO vendas(vendas) (?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(2, vendedores.getVendedorId());
            stmt.setInt(3, clientes.getClienteID());
            stmt.setString(4, vendas.getData());
            stmt.setInt(5, vendas.getTotal());
            stmt.execute();

        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir venda: " + e.getMessage());
        }
    }
}
