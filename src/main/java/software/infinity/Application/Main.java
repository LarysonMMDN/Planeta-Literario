package software.infinity.Application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import software.infinity.Entities.Controller.LoginController;
import software.infinity.Entities.View.LoginView;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        LoginView view = new LoginView();
        LoginController controller = new LoginController(view);

        Scene scene = new Scene(view.getLoginView());
        stage.setScene(scene);
        stage.setTitle("App MVC JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
