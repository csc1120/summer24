package wk1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Teenager extends Application {
    private Label response;
    public static final int HEIGHT = 200;
    public static final int WIDTH = 300;

    @Override
    public void start(Stage stage) {
        response = new Label();
        TextField input = new TextField();
        Button clear = new Button("Clear");
        Pane pane1 = new HBox();
        Pane pane2 = new HBox();
        pane1.getChildren().add(new Label("Please enter your age: "));
        pane1.getChildren().add(input);
        pane2.getChildren().add(clear);
        pane2.getChildren().add(response);
        Pane pane3 = new VBox();
        pane3.getChildren().addAll(pane1, pane2);
        input.setOnAction(this::enterPressed);
        clear.setOnAction(this::clearPressed);
        stage.setScene(new Scene(pane3, WIDTH, HEIGHT));
        stage.show();
    }

    private void clearPressed(ActionEvent actionEvent) {
        response.setText("");
    }

    private void enterPressed(ActionEvent actionEvent) {
        String text = ((TextField)actionEvent.getSource()).getText();
        int age = Integer.parseInt(text);
        String not = "";
        if(age<13 || age>19) {
            not = "not ";
        }
        response.setText("You are " + not + "a teenager.");
    }
}