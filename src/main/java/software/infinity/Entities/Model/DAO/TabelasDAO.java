package software.infinity.Entities.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// O sistema vai criar as tabelas no banco de dados automaticamente se por
// algum motivo ela não existir ou for a primeira vez usando o sistema
public class TabelasDAO {

    private final Connection conexao = ConexaoDAO.getConnection();


    private final String tabelaUsuario =
            "CREATE TABLE IF NOT EXISTS USUARIO (" +
                    "ID SERIAL PRIMARY KEY, " +
                    "USUARIO VARCHAR(100) NOT NULL, " +
                    "NOME VARCHAR(100) NOT NULL, " +
                    "SOBRENOME VARCHAR(100) NOT NULL, " +
                    "SENHA VARCHAR(255) NOT NULL" +
                    ")";

    private final String tabelaLivro =
            "CREATE TABLE IF NOT EXISTS LIVRO (" +
                    "ID SERIAL PRIMARY KEY, " +
                    "NOME VARCHAR(100) NOT NULL, " +
                    "AUTOR VARCHAR(100) NOT NULL, " +
                    "TEMA VARCHAR(100) NOT NULL, " +
                    "PAGINAS INT NOT NULL, " +
                    "SINOPSE VARCHAR(400) NOT NULL" +
                    ")";

    public TabelasDAO() throws SQLException {
        if (conexao != null) {
            criarTabela(tabelaUsuario);
            criarTabela(tabelaLivro);
            System.out.println("[DAO] Banco Online");
        }
    }

    public void criarTabela(String sql) {
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }
}
