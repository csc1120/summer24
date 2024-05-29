package wk2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ClassActivity extends Application {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    private Label text;

    @Override
    public void start(Stage stage) throws Exception {
        Button smaller = new Button("Smaller");
        smaller.setOnAction(event -> handleSmaller());
        Button bigger = new Button("Bigger");
        bigger.setOnAction(event -> handleBigger());
        Pane buttons = new HBox(5);
        buttons.getChildren().addAll(smaller, bigger);
        Pane contents = new VBox();
        text = new Label("CSC1120 is fun");
        contents.getChildren().addAll(buttons, text);
        stage.setScene(new Scene(contents, WIDTH, HEIGHT));
        stage.show();
    }

    private void handleSmaller() {
        double fontSize = text.getFont().getSize();
        text.setFont(new Font(fontSize * 0.8));
    }

    private void handleBigger() {
        double fontSize = text.getFont().getSize();
        text.setFont(new Font(fontSize * 1.2));
    }
}
