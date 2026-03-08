package software.infinity.Entities.Utils;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import software.infinity.Entities.View.View;

public class GerenciadorDePaginas {
    public static void trocarPagina(Pane container, String fxmlNome) throws Exception {

        // Carrega o FXML como Parent
        Parent pagina = View.loadParent(fxmlNome);

        // Troca o conteúdo do container
        // Troca o conteúdo do container com segurança
        if (container != null) {
            container.getChildren().clear();
            container.getChildren().add(pagina);
        } else {
            System.err.println(container);
            System.err.println("Container ainda não foi inicializado!");
        }
    }
}
