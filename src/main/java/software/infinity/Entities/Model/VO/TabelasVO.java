package software.infinity.Entities.Model.VO;

public class TabelasVO {

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
                    "TITULO VARCHAR(100) NOT NULL, " +
                    "AUTOR VARCHAR(100) NOT NULL, " +
                    "TEMA VARCHAR(100) NOT NULL, " +
                    "PAGINAS INT NOT NULL, " +
                    "SINOPSE VARCHAR(400) NOT NULL" +
                    ")";

    public String getTabelaUsuario() {
        return tabelaUsuario;
    }

    public String getTabelaLivro() {
        return tabelaLivro;
    }
}
