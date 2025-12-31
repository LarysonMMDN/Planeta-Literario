package software.infinity.Entities.View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class View {

    public static Scene load(String fxmlNome) throws Exception {
        FXMLLoader fxml = new FXMLLoader(
                software.infinity.Entities.View.View.class.getResource("/View/" + fxmlNome)
        );

        Parent root = fxml.load();
        return new Scene(root);
    }
}
