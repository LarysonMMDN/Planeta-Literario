package software.infinity.Application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import software.infinity.Entities.View.View;

public class Main extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setTitle("Planeta Literário");

        Scene cena = View.load("Login.fxml");
        stage.setResizable(false);
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    public static void trocarTela(String fxmlNome) throws Exception {
        boolean redimencionamento = false;
        switch (fxmlNome.toLowerCase()) {
            case "login":
                fxmlNome = "Login.fxml";
                break;
            case "cadastro":
                fxmlNome = "Cadastro.fxml";
                break;
            case "inicial":
                fxmlNome = "PaginaInicial.fxml";
                redimencionamento = true;
                break;
            case "pesquisa avançada":
                fxmlNome = "em desenvolvimento";
                redimencionamento = true;
                break;
            case "leitura offline":
                fxmlNome = "em desenvolvimento";
                redimencionamento = true;
                break;
            case "configurações":
                fxmlNome = "em desenvolvimento";
                redimencionamento = true;
                break;
            case "sobre":
                fxmlNome = "em desenvolvimento";
                redimencionamento = true;
                break;
            default:
                fxmlNome = "PaginaNaoEncontrada.fxml";
                redimencionamento = true;
                break;
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