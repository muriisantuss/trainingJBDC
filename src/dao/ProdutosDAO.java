package dao;

import beans.Produtos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutosDAO {
    private Conexao conexao; 
    private Connection conn;

    public ProdutosDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Produtos produtos){
        String sql = "INSERT INTO produtos(produtos) VALUES (?,?,?,?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(2, produtos.getProduto());
            stmt.setString(3, produtos.getSKU());
            stmt.setInt(4, produtos.getPreco());
            stmt.execute();
        }  catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir produtos: " + e.getMessage());
        }
    }
}
