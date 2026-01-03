package software.infinity.Entities.Model.BO;

import javafx.scene.image.Image;
import software.infinity.Entities.Model.DAO.LivroDAO;
import software.infinity.Entities.Model.VO.LivroVO;

import java.util.List;
import java.io.InputStream;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LivroBO {
    private LivroDAO livroDAO = new LivroDAO();

    public void salvar(LivroVO livroVO) throws Exception {
        // Regras de Negocios / Validações (OBS: Colocar todos os atributos como obrigatorios)

        // Validação do Nome
        if (livroVO.getTitulo() == null || livroVO.getTitulo().trim().isEmpty()) {
            throw new Exception("Nome é obrigatório.");
        }
        // Validação do Nome
        // Validação do contato
        // Validação do funcao
        // Validação do ativo

        // Supondo que passou em tudo, ele cria o user
        livroDAO.create(livroVO);
    }

    public LivroVO buscarPorId(int id) throws Exception {
        return livroDAO.readerById(id);
    }

    public LivroVO buscarPorTitulo(String titulo) throws Exception {
        return livroDAO.readerByTitulo(titulo);
    }

    public List<LivroVO> buscarPorAutor(String autor) throws Exception {
        return livroDAO.readerByAutor(autor);
    }

    public List<LivroVO> buscarPorTema(String tema) throws Exception {
        return livroDAO.readerByTema(tema);
    }

    public List<LivroVO> buscarTodos() throws Exception {
        return livroDAO.readerAll();
    }


    public void atualizar(LivroVO livroVO) throws Exception {
        if (livroVO.getId() <= 0) {
            throw new Exception("ID inválido.");
        }
        livroDAO.update(livroVO);
    }

    public void excluir(int id) throws Exception {
        livroDAO.delete(id);
    }


    public ImageView carregarImagemRedimensionada(int id) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Imagens/livro (" + id + ").jpg");

        if (inputStream == null) {
            inputStream = getClass().getClassLoader().getResourceAsStream("Imagens/livro_default.jpg");
        }
        Image image = new Image(inputStream);
        ImageView imageView = new ImageView(image);

        imageView.setFitWidth(140);
        imageView.setFitHeight(180);
        imageView.setPreserveRatio(true);

        return imageView;
    }




}
