package software.infinity.Entities.Utils;

import javafx.scene.Scene;
import javafx.stage.Stage;
import software.infinity.Entities.View.View;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeTelas {

    private static Stage stage;
    private static final Map<String, String> telas = new HashMap<>();

    static {
        // Telas principais
        telas.put("LOGIN", "TelaLogin.fxml");
        telas.put("CADASTRO", "PaginaCadastro.fxml");
        telas.put("INICIAL", "TelaInicial.fxml");
        telas.put("ERRO", "PaginaNaoEncontrada.fxml");

    }

    public static void setStage(Stage stagePrincipal) {
        stage = stagePrincipal;
    }
    public static void trocarTela(String nomeTela) throws Exception {
        boolean redimencionamento = false;
        String fxml = telas.getOrDefault(nomeTela.toUpperCase(), "PaginaNaoEncontrada.fxml");

        boolean redimensionavel = !(fxml.equals("TelaLogin.fxml"));

        stage.setResizable(redimensionavel);
        Scene cena = View.load(fxml);
        stage.setScene(cena);
        stage.show();
    }
}