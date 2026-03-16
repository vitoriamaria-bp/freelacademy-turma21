package dao;

import conexaodb.ConexaoDB;
import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserir(Usuario usuario) throws SQLException {

        String sql = "INSERT INTO usuarioCadastra (Nome, Email, Telefone, Senha) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoDB.getConexao();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getTelefone());
            pst.setString(4, usuario.getSenha());

            int linhas = pst.executeUpdate();
            System.out.println("Linhas inseridas: " + linhas);
        }
    }
}