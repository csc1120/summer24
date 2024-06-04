package wk3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.ScrollEvent;

import java.util.Arrays;

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
        if (username.getText().length() < password.getText().length()) {
            status.setText("Success");
        } else {
            status.setText("Denied");
        }
    }
    private void login2(ActionEvent actionEvent) {
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
