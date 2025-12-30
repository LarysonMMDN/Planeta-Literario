package software.infinity.Application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import software.infinity.Entities.Controller.LoginController;
import software.infinity.Entities.View.LoginView;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        LoginView view = new LoginView();
        LoginController controller = new LoginController(view);

        Scene scene = new Scene(view.getView(), 900, 500);
        stage.setScene(scene);
        stage.setTitle("App MVC JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
