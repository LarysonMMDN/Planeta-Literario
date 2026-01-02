package software.infinity.Entities.Model.DAO;

import software.infinity.Entities.Model.BO.EnvConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    private static String URL;
    private static String USER;
    private static String PASSWORD;

    static {
        URL = EnvConfig.get("DB_URL");
        USER = EnvConfig.get("DB_USER");
        PASSWORD = EnvConfig.get("DB_PASSWORD");
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao conectar ao banco: " + e.getMessage());
        }
    }

}
