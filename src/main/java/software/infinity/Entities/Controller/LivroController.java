package software.infinity.Entities.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import software.infinity.Entities.Model.BO.LivroBO;
import software.infinity.Entities.Model.VO.LivroVO;

public class LivroController {

    @FXML
    private ImageView bookImage;

    @FXML
    private Label bookTitle;

    private int livroId;
    private LivroBO livroBO = new LivroBO();

    @FXML
    public void initialize() {
        bookImage.setOnMouseClicked(event -> {
            System.out.println("Livro clicado: " + livroId);
            // Futuramente aqui você pode abrir uma tela de detalhes
        });
    }

    public void setLivro(LivroVO livro) {
        this.livroId = livro.getId();
        bookTitle.setText(livro.getTitulo());

        bookImage.setImage(livroBO.carregarImagemRedimensionada(livro.getId()).getImage());

    }
}
