package wk1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello World!");
        label.setFont(new Font(40));
        Scene scene = new Scene(label);
        stage.setTitle("Welcome to JavaFX!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}