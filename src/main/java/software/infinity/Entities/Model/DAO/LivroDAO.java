package software.infinity.Entities.Model.DAO;

import software.infinity.Entities.Model.VO.LivroVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    // SQL para criação da tabela, se necessário
    private final String sqlCriarTabelaLivro =
            "CREATE TABLE IF NOT EXISTS livro (" +
                    "id SERIAL PRIMARY KEY, " +
                    "titulo VARCHAR(100) NOT NULL, " +
                    "autor VARCHAR(100) NOT NULL, " +
                    "tema VARCHAR(100) NOT NULL, " +
                    "paginas INT NOT NULL, " +
                    "sinopse TEXT NOT NULL" +
                    ")";

    public LivroDAO(String init) {
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sqlCriarTabelaLivro)) {
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public LivroDAO() {
    }

    // Método para criar um novo livro
    public void create(LivroVO livroVO) throws Exception {
        String sql = "INSERT INTO livro (titulo, autor, tema, paginas, sinopse) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement comandoSQL = conn.prepareStatement(sql)) {
            comandoSQL.setString(1, livroVO.getTitulo());
            comandoSQL.setString(2, livroVO.getAutor());
            comandoSQL.setString(3, livroVO.getTema());
            comandoSQL.setInt(4, livroVO.getPaginas());
            comandoSQL.setString(5, livroVO.getSinopse());

            comandoSQL.execute();
        }
    }

    // Ler livro por ID
    public LivroVO readerById(int id) throws Exception {
        String sql = "SELECT * FROM livro WHERE id = ?";

        LivroVO livroVO = null;
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement comandoSQL = conn.prepareStatement(sql)) {
            comandoSQL.setInt(1, id);

            try (ResultSet resultadoSQL = comandoSQL.executeQuery()) {
                if (resultadoSQL.next()) {
                    livroVO = new LivroVO();
                    livroVO.setId(resultadoSQL.getInt("id"));
                    livroVO.setTitulo(resultadoSQL.getString("titulo"));
                    livroVO.setAutor(resultadoSQL.getString("autor"));
                    livroVO.setTema(resultadoSQL.getString("tema"));
                    livroVO.setPaginas(resultadoSQL.getInt("paginas"));
                    livroVO.setSinopse(resultadoSQL.getString("sinopse"));
                }
            }
        }
        return livroVO;
    }

    // Ler livro por Titulo
    public LivroVO readerByTitulo(String titulo) throws Exception {
        String sql = "SELECT * FROM livro WHERE titulo = ?";

        LivroVO livroVO = null;
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement comandoSQL = conn.prepareStatement(sql)) {
            comandoSQL.setString(1, titulo.trim());

            try (ResultSet resultadoSQL = comandoSQL.executeQuery()) {
                if (resultadoSQL.next()) {
                    livroVO = new LivroVO();
                    livroVO.setId(resultadoSQL.getInt("id"));
                    livroVO.setTitulo(resultadoSQL.getString("titulo"));
                    livroVO.setAutor(resultadoSQL.getString("autor"));
                    livroVO.setTema(resultadoSQL.getString("tema"));
                    livroVO.setPaginas(resultadoSQL.getInt("paginas"));
                    livroVO.setSinopse(resultadoSQL.getString("sinopse"));
                }
            }
        }
        return livroVO;
    }

    // Ler livros por Autor
    public List<LivroVO> readerByAutor(String autor) throws Exception {
        String sql = "SELECT * FROM livro WHERE autor = ?";

        List<LivroVO> lista = new ArrayList<>();
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement comandoSQL = conn.prepareStatement(sql)) {
            comandoSQL.setString(1, autor.trim());

            try (ResultSet resultadoSQL = comandoSQL.executeQuery()) {
                while (resultadoSQL.next()) {
                    LivroVO livroVO = new LivroVO();
                    livroVO.setId(resultadoSQL.getInt("id"));
                    livroVO.setTitulo(resultadoSQL.getString("titulo"));
                    livroVO.setAutor(resultadoSQL.getString("autor"));
                    livroVO.setTema(resultadoSQL.getString("tema"));
                    livroVO.setPaginas(resultadoSQL.getInt("paginas"));
                    livroVO.setSinopse(resultadoSQL.getString("sinopse"));
                    lista.add(livroVO);
                }
            }
        }
        return lista;
    }

    // Ler livros por Tema
    public List<LivroVO> readerByTema(String tema) throws Exception {
        String sql = "SELECT * FROM livro WHERE tema = ?";

        List<LivroVO> lista = new ArrayList<>();
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement comandoSQL = conn.prepareStatement(sql)) {
            comandoSQL.setString(1, tema.trim());

            try (ResultSet resultadoSQL = comandoSQL.executeQuery()) {
                while (resultadoSQL.next()) {
                    LivroVO livroVO = new LivroVO();
                    livroVO.setId(resultadoSQL.getInt("id"));
                    livroVO.setTitulo(resultadoSQL.getString("titulo"));
                    livroVO.setAutor(resultadoSQL.getString("autor"));
                    livroVO.setTema(resultadoSQL.getString("tema"));
                    livroVO.setPaginas(resultadoSQL.getInt("paginas"));
                    livroVO.setSinopse(resultadoSQL.getString("sinopse"));
                    lista.add(livroVO);
                }
            }
        }
        return lista;
    }

    // Ler todos os livros
    public List<LivroVO> readerAll() throws Exception {
        String sql = "SELECT * FROM livro ORDER BY id ASC";

        List<LivroVO> lista = new ArrayList<>();

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement comandoSQL = conn.prepareStatement(sql);
             ResultSet resultadoSQL = comandoSQL.executeQuery()) {

            while (resultadoSQL.next()) {
                LivroVO livroVO = new LivroVO();
                livroVO.setId(resultadoSQL.getInt("id"));
                livroVO.setTitulo(resultadoSQL.getString("titulo"));
                livroVO.setAutor(resultadoSQL.getString("autor"));
                livroVO.setTema(resultadoSQL.getString("tema"));
                livroVO.setPaginas(resultadoSQL.getInt("paginas"));
                livroVO.setSinopse(resultadoSQL.getString("sinopse"));
                lista.add(livroVO);
            }
        }
        return lista;
    }



    // Atualizar livro
    public void update(LivroVO livroVO) throws Exception {
        String sql = "UPDATE livro SET titulo=?, autor=?, tema=?, paginas=?, sinopse=? WHERE id=?";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement comandoSQL = conn.prepareStatement(sql)) {
            comandoSQL.setString(1, livroVO.getTitulo());
            comandoSQL.setString(2, livroVO.getAutor());
            comandoSQL.setString(3, livroVO.getTema());
            comandoSQL.setInt(4, livroVO.getPaginas());
            comandoSQL.setString(5, livroVO.getSinopse());
            comandoSQL.setInt(6, livroVO.getId());

            comandoSQL.execute();
        }
    }

    // Deletar livro
    public void delete(int id) throws Exception {
        String sql = "DELETE FROM livro WHERE id=?";

        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement comandoSQL = conn.prepareStatement(sql)) {
            comandoSQL.setInt(1, id);

            comandoSQL.execute();
        }
    }

}
