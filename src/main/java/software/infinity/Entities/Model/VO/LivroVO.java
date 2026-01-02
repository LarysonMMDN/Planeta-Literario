package software.infinity.Entities.Model.VO;

public class LivroVO {
    public static int id;
    public static String nome;
    public static String autor;
    public static String tema;
    public static int paginas;
    public static String sinopse;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        LivroVO.id = id;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        LivroVO.nome = nome;
    }

    public static String getAutor() {
        return autor;
    }

    public static void setAutor(String autor) {
        LivroVO.autor = autor;
    }

    public static String getTema() {
        return tema;
    }

    public static void setTema(String tema) {
        LivroVO.tema = tema;
    }

    public static int getPaginas() {
        return paginas;
    }

    public static void setPaginas(int paginas) {
        LivroVO.paginas = paginas;
    }

    public static String getSinopse() {
        return sinopse;
    }

    public static void setSinopse(String sinopse) {
        LivroVO.sinopse = sinopse;
    }
}
