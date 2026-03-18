package conexaodb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Backup {
    public void fazerBackup() throws SQLException {
        String sql = "EXEC sp_fazerBackup";
        
        try (
            // Criando conexão com o banco
            Connection con = ConexaoDB.getConexao();
            PreparedStatement stmt = con.prepareStatement(sql)
        ) 
        {
            //EXECUTA O COMANDO EXPECIFICADO NA STRING "SQL"
            stmt.executeUpdate();
        }
    }
    
}
