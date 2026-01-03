package software.infinity.Application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import software.infinity.Entities.View.View;
import software.infinity.Entities.Model.DAO.ConexaoDAO;

public class Main extends Application {

    private static Stage stage;
    private static final ConexaoDAO conexaoDAO = new ConexaoDAO();

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setTitle("Planeta Literário");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/Imagens/miniAstronauta.png")));
        conexaoDAO.inicializarTabelas();
        Scene cena = View.load("Login.fxml");
        stage.setResizable(false);
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    public static void trocarTela(String fxmlNome) throws Exception {
        boolean redimencionamento = false;
        switch (fxmlNome.toLowerCase()) {
            case "login" -> fxmlNome = "Login.fxml";
            case "cadastro" -> fxmlNome = "Cadastro.fxml";
            case "inicial" -> {
                fxmlNome = "PaginaInicial.fxml";
                redimencionamento = true;
            }
            case "pesquisa avançada", "leitura offline", "configurações", "sobre" -> {
                // Em desenvolvimento
            }
            default -> {
                fxmlNome = "PaginaNaoEncontrada.fxml";
                redimencionamento = true;

            }
        }

        Scene cena = View.load(fxmlNome);
        stage.setResizable(redimencionamento);
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
