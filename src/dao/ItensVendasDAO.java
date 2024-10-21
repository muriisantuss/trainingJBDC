package dao;

import beans.ItensVendas;
import beans.Produtos;
import beans.Vendas;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ItensVendasDAO {
    private Conexao conexao;
    private Connection conn;

    public ItensVendasDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(ItensVendas itensVendas, Produtos produtos, Vendas vendas) {
        String sql = "INSERT INTO itensvendas(itensVendas) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, produtos.getProdutoID());
            stmt.setInt(2, vendas.getVendasId());
            stmt.setInt(3, itensVendas.getQuantidade());
            stmt.setInt(4, itensVendas.getValorUnitario());
            stmt.setInt(5, itensVendas.getValorTotal());
            stmt.setInt(6, itensVendas.getDesconto());
            stmt.setInt(7, itensVendas.getTotalComDesconto());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir itensVendas: " + e.getMessage());
        }
    }
}
