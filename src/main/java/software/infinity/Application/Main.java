package software.infinity.Application;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Configurações do Stage
        primaryStage.setTitle("Planeta Literário");
        primaryStage.getIcons().add(
                new Image(getClass().getResourceAsStream("/Imagens/miniAstronauta.png"))
        );

        // Inicializa a aplicação e passa o Stage
        AppInitializer.init(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}