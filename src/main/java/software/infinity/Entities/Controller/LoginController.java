package software.infinity.Entities.Controller;

import software.infinity.Entities.View.LoginView;

public class LoginController {

    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
        configureEvents();
    }

    private void configureEvents() {
        view.getEsquerdaBtn().setOnAction(e -> {
            System.out.println("Botão da esquerda clicado");
        });

        view.getDireitaBtn().setOnAction(e -> {
            System.out.println("Botão da direita clicado");
        });
    }

    public LoginView getView() {
        return view;
    }
}
