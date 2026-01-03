package software.infinity.Entities.Model.DAO;

import software.infinity.Entities.Model.BO.EnvConfig;
import software.infinity.Entities.Model.VO.TabelasVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoDAO {

    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;
    private static final TabelasVO tabelasVO = new TabelasVO();

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

    public static void inicializarTabelas() {
        criarTabela(tabelasVO.getTabelaUsuario());
        criarTabela(tabelasVO.getTabelaLivro());
    }

    private static void criarTabela(String sql) {
        try (Connection conexao = getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.executeUpdate();
            System.out.println("Tabela criada ou já existente.");

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }
}
