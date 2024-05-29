package wk2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TextMagnification extends Application {
    private Label text;
    private static int WIDTH = 400;
    private static int HEIGHT = 200;
    private static double SHRINK_FACTOR = 0.8;
    private static double GROW_FACTOR = 1.2;

    @Override
    public void start(Stage stage) {
        Pane root = new VBox();
        Pane buttons = new HBox();
        Button shrink = new Button("Smaller");
        Button grow = new Button("Larger");
        shrink.setOnAction(event -> handleButtons(SHRINK_FACTOR));
        grow.setOnAction(event -> handleButtons(GROW_FACTOR));
        buttons.getChildren().addAll(shrink, grow);
        text = new Label("CSC1120 is fun");
        root.getChildren().addAll(buttons, text);
        stage.setTitle("Class Activity");
        stage.setScene(new Scene(root, WIDTH, HEIGHT));
        stage.show();
    }

    private void handleButtons(double magnification) {
        double fontSize = text.getFont().getSize();
        text.setFont(new Font(fontSize * magnification));
    }
}
