package software.infinity.Entities.View;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

public class LoginView {

    private BorderPane borderPane;
    private Button esquerdaBtn;
    private Button direitaBtn;

    public LoginView() {
        buildUI();
    }

    private void buildUI() {
        borderPane = new BorderPane();

        GridPane gridPane = new GridPane();

        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setPercentHeight(100);
        gridPane.getRowConstraints().add(rowConstraints);

        ColumnConstraints col1 = new ColumnConstraints();
        ColumnConstraints col2 = new ColumnConstraints();
        col1.setPercentWidth(40);
        col2.setPercentWidth(60);
        gridPane.getColumnConstraints().addAll(col1, col2);

        VBox painelEsquerdo = new VBox(
                new Label("Login"),
                esquerdaBtn = new Button("Entrar")
        );
        esquerdaBtn.setPrefWidth(150);
        esquerdaBtn.setPrefHeight(40);
        painelEsquerdo.setStyle("-fx-background-color: white;");
        painelEsquerdo.setFillWidth(true);

        VBox painelDireito = new VBox(
                new Label("Direita"),
                direitaBtn = new Button("Direita")
        );
        painelDireito.setStyle("-fx-background-color: #e69b17;");
        painelDireito.setFillWidth(true);

        gridPane.add(painelEsquerdo, 0, 0);
        gridPane.add(painelDireito, 1, 0);

        GridPane.setHgrow(painelEsquerdo, Priority.ALWAYS);
        GridPane.setVgrow(painelEsquerdo, Priority.ALWAYS);

        GridPane.setHgrow(painelDireito, Priority.ALWAYS);
        GridPane.setVgrow(painelDireito, Priority.ALWAYS);

        borderPane.setCenter(gridPane);
        BorderPane.setAlignment(gridPane, Pos.CENTER);
    }

    public Parent getView() {
        return borderPane;
    }

    public Button getEsquerdaBtn() {
        return esquerdaBtn;
    }

    public Button getDireitaBtn() {
        return direitaBtn;
    }
}
