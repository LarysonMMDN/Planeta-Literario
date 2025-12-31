package software.infinity.Entities.Controller;

import javafx.scene.Parent;
import software.infinity.Entities.View.LoginView;

public class LoginController {

    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
        configureEvents();
    }

    public LoginController() {
    }

    private void configureEvents() {
        /*view.getEsquerdaBtn().setOnAction(e -> {
            System.out.println("Botão da esquerda clicado");
        });

        view.getDireitaBtn().setOnAction(e -> {
            System.out.println("Botão da direita clicado");
        });*/
    }

}
