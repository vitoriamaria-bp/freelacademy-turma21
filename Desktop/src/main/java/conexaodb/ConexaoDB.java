package conexaodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    // Dados da conexão
    private static final String URL =
        "jdbc:sqlserver://TBS0676767W11-1\\SQLEXPRESS:1433;databaseName=db_freelacademy;encrypt=true;trustServerCertificate=true;";

    private static final String USER = "sa";
    private static final String PASSWORD = "marcos";

    // Método para conectar ao banco
    public static Connection getConexao() {

        try {

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão com o banco realizada!");
            return conn;

        } catch (SQLException e) {

            System.out.println("Erro na conexão com o banco:");
            e.printStackTrace();
            return null;

        }

    }

    static Connection getConexão() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}