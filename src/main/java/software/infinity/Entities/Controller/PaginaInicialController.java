package software.infinity.Entities.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import software.infinity.Application.Main;
import software.infinity.Entities.Controller.LivroController;
import software.infinity.Entities.Model.BO.LivroBO;
import software.infinity.Entities.Model.VO.LivroVO;

import javax.swing.*;
import java.util.List;

public class PaginaInicialController {
    @FXML
    private VBox menuLateral;

    @FXML
    private Button btnMenuLateral;

    @FXML
    private Button bntPaginaInicial;

    @FXML
    private Button bntPesquisaAvancada;

    @FXML
    private Button bntLeituraOffline;

    @FXML
    private Button bntConfiguracoes;

    @FXML
    private Button bntSobre;

    @FXML
    private Button bntSair;

    @FXML
    private FlowPane booksContainer;

    private boolean menuAberto = false;
    LivroBO livroBO = new LivroBO();
    private String TelaAtual = "inicial";

    @FXML
    public void initialize() throws Exception {
        // Verifique se o booksContainer não é nulo
        if (TelaAtual.equals("inicial")) {
            if (booksContainer != null)
                carregarLivros();
            else
                System.out.println("Erro: FlowPane booksContainer não foi inicializado corretamente.");
        } else {
            System.out.println("Tela diferente!");
        }
        System.out.println(TelaAtual);

        btnMenuLateral.setOnAction( e -> Menu());
    }


    private void Menu(){
        if (!menuAberto) {
            abrirMenu();
        } else {
            fecharMenu();
        }
    }

    private void abrirMenu(){
        menuLateral.setVisible(true);
        menuLateral.setManaged(true);

        menuAberto = true;
    }

    private void fecharMenu(){
        menuLateral.setVisible(false);
        menuLateral.setManaged(false);

        menuAberto = false;
    }

    public void carregarLivros() throws Exception {
        List<LivroVO> livros = livroBO.buscarTodos();

         //Verifique se o FlowPane está presente
        if (booksContainer == null) {
            System.out.println("Erro: booksContainer não foi encontrado.");
            return;
        }
        System.out.println("Teoria");

        for (int c = 0; c < livros.size(); c++) {
            LivroVO livro = livros.get(c);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/LivroCard.fxml"));
            VBox card = loader.load();  // Carregue o card do livro
            LivroController controller = loader.getController();
            controller.setLivro(livro);  // Defina o livro para o controller do card

            // Adicione o card ao FlowPane
            booksContainer.getChildren().add(card);
        }
    }


    @FXML
    private void bntOnPaginaInicial() throws Exception {
        Main.trocarTela("inicial");
        TelaAtual = "inicial";
    }

    @FXML
    private void bntPesquisaAvancada() throws Exception {
        TelaAtual = "em desenvolvimento";
        Main.trocarTela("em desenvolvimento");
    }

    @FXML
    private void bntLeituraOffiline() throws Exception {
        TelaAtual = "em desenvolvimento";
        Main.trocarTela("em desenvolvimento");
    }

    @FXML
    private void bntConfiguracao() throws Exception {
        TelaAtual = "em desenvolvimento";
        Main.trocarTela("em desenvolvimento");
    }

    @FXML
    private void bntSobre() throws Exception {
        TelaAtual = "em desenvolvimento";
        Main.trocarTela("em desenvolvimento");
    }

    @FXML
    private void bntSair() throws Exception {
        TelaAtual = "login";
        Main.trocarTela("login");
    }
}
