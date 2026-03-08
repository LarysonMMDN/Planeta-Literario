package software.infinity.Entities.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import software.infinity.Application.Main;
import software.infinity.Entities.Utils.GerenciadorDePaginas;
import software.infinity.Entities.Utils.GerenciadorDeTelas;




public class LoginController {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtSenha;
    @FXML private Pane telaInicial;

    public void initialize() {
        try {
            GerenciadorDePaginas.trocarPagina(telaInicial, "PaginaLogin.fxml");
            System.out.println("Tela inicial carregada.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bntEntrar(){
        if (txtUsuario.getText().equals("admin") && txtSenha.getText().equals("123")){
            System.out.println("Pagina inicial");
        }
        try {
            GerenciadorDeTelas.trocarTela("INICIAL");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bntCadastro() {
        try {
            GerenciadorDePaginas.trocarPagina(telaInicial, "PaginaCadastro.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
