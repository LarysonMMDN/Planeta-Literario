package software.infinity.Entities.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import software.infinity.Application.Main;

public class PaginaInicialController {
    @FXML
    private VBox menuLateral;

    @FXML
    private Button btnMenuLateral;

    @FXML
    private Button bntPesquisaAvancada;

    @FXML
    private Button bntLeituraOffline;

    @FXML
    private Button bntConfiguracoes;

    @FXML
    private Button bntSobre;

    @FXML
    private Button bntSair;

    private boolean menuAberto = false;

    @FXML
    public void initialize(){
        btnMenuLateral.setOnAction( e -> Menu());
    }

    private void Menu(){
        if (!menuAberto) {
            abrirMenu();
        } else {
            fecharMenu();
        }
    }

    private void abrirMenu(){
        menuLateral.setVisible(true);
        menuLateral.setManaged(true);

        menuAberto = true;
    }

    private void fecharMenu(){
        menuLateral.setVisible(false);
        menuLateral.setManaged(false);

        menuAberto = false;
    }

    @FXML
    private void bntPesquisaAvancada() throws Exception {
        Main.trocarTela("em desenvolvimento");
    }

    @FXML
    private void bntLeituraOffiline() throws Exception {
        Main.trocarTela("em desenvolvimento");
    }

    @FXML
    private void bntConfiguracao() throws Exception {
        Main.trocarTela("em desenvolvimento");
    }

    @FXML
    private void bntSobre() throws Exception {
        Main.trocarTela("em desenvolvimento");
    }

    @FXML
    private void bntSair() throws Exception {
        Main.trocarTela("login");
    }
}
