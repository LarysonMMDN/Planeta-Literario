package software.infinity.Entities.Controller;

import javafx.fxml.FXML;
import software.infinity.Application.Main;

public class CadastroController {
    public void initialize() {
        System.out.println("Tela de cadastro carregada.");
    }
    @FXML
    private void bntCadastro() {
        try {
            Main.trocarTela("Login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
