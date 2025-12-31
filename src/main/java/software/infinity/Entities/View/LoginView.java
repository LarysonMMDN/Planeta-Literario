package software.infinity.Entities.View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class LoginView {

    public Parent getLoginView() throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/View/LoginView.fxml")
        );
        return loader.load();
    }
    public Parent getCadastroView() throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/View/CadastroView.fxml")
        );
        return loader.load();
    }
}
