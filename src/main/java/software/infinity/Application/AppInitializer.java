package software.infinity.Application;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import software.infinity.Entities.Model.DAO.ConexaoDAO;
import software.infinity.Entities.Utils.GerenciadorDePaginas;
import software.infinity.Entities.Utils.GerenciadorDeTelas;


public class AppInitializer {

    public static void init(Stage stage) throws Exception {
        // Inicia o banco de dados
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        conexaoDAO.inicializarTabelas();

        // Inicia o gerenciador de telas
        GerenciadorDeTelas.setStage(stage);

        // Abre a primeira janela
        GerenciadorDeTelas.trocarTela("LOGIN");

    }
}
