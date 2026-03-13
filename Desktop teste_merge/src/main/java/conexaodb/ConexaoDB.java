package conexaodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    // Dados da conexão
    private static final String URL =
        "jdbc:sqlserver://DESKTOP-NHTT4M9:1433;databaseName=db_freelacademy;encrypt=true;trustServerCertificate=true;";

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

}