package wk2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Button clickMe;
    private Button clickMe2;
    @Override
    public void start(Stage primaryStage) {
        Pane root = new FlowPane();
        clickMe = new Button("Click Me");
        clickMe2 = new Button("Click Me Too");
        root.getChildren().addAll(clickMe, clickMe2);
        clickMe.setOnAction(new ClickMeHandler());
        clickMe2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                handleClickMe2(actionEvent);
            }
        });
        clickMe2.setOnAction(this::handleClickMe2);
        primaryStage.setTitle("Simple GUI");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    private void handleClickMe2(ActionEvent event) {
        if(clickMe2.getEffect()==null) {
            clickMe2.setEffect(new BoxBlur());
        } else {
            clickMe2.setEffect(null);
        }
    }

    private class ClickMeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            if(clickMe.getEffect()==null) {
                clickMe.setEffect(new BoxBlur());
            } else {
                clickMe.setEffect(null);
            }
            handleClickMe2();
        }
    }
}