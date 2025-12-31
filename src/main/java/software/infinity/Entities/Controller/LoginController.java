package software.infinity.Entities.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import software.infinity.Application.Main;

public class LoginController {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtSenha;

    public void initialize() {
        System.out.println("Tela inicial carregada.");
    }

    @FXML
    private void bntEntrar(){
        if (txtUsuario.getText().equals("admin") && txtSenha.getText().equals("123")){
            System.out.println("Pagina inicial");
        }
        try {
            Main.trocarTela("inicial");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bntCadastro() {
        try {
            Main.trocarTela("cadastro");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
