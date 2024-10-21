package dao;

import beans.Clientes;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClientesDAO {
    private Conexao conexao;
    private Connection conn;

    public ClientesDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Clientes clientes) {
        String sql = "INSERT INTO clientes(clientes) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, clientes.getCliente());
            stmt.setString(2, clientes.getEstado());
            stmt.setString(3, clientes.getSexo().name());
            stmt.setString(4, clientes.getStatus());
            stmt.execute();
        } catch (java.sql.SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        }
    }

    
}