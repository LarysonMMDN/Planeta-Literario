package software.infinity.Entities.Controller;

import javafx.fxml.FXML;
import software.infinity.Application.Main;
import software.infinity.Entities.Utils.GerenciadorDeTelas;

public class CadastroController {
    public void initialize() {
        System.out.println("Tela de Cadastro carregada.");
    }
    @FXML
    private void bntCadastro() {
        try {
            GerenciadorDeTelas.trocarTela("Login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
