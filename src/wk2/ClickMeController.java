package wk2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ClickMeController {
    @FXML
    private Label label;
    @FXML
    private Button button;

    @FXML
    public void handleClick(ActionEvent actionEvent) {
        if (label.getText().equals("")) {
            label.setText("I'm back, and I need to be long enough that you can see me.");
        } else {
            label.setText("");
        }
    }
}
