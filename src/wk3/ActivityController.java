package wk3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.ScrollEvent;

import java.util.Arrays;
import java.util.Optional;

public class ActivityController {
    @FXML
    private Button loginButton;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label status;

    @FXML
    private void login(ActionEvent actionEvent) {
        char[] usernameCharacters = username.getText().toCharArray();
        char[] passwordCharacters = password.getText().toCharArray();
        Arrays.sort(usernameCharacters);
        Arrays.sort(passwordCharacters);
        if (Arrays.equals(usernameCharacters, passwordCharacters)) {
            status.setText("Success");
        } else {
            status.setText("Denied");
        }
    }

    @FXML
    private void cancel(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR, "Something");
        alert.showAndWait();
        status.setText("-");
        username.setText("");
        password.setText("");
        loginButton.setRotate(0);
    }

    @FXML
    private void spinButton(ScrollEvent scrollEvent) {
        loginButton.setRotate(scrollEvent.getDeltaY() + loginButton.getRotate());
    }
}
