package wk2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.BoxBlur;

public class ClickMeHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        Button button = (Button)actionEvent.getSource();
        if(button.getEffect()==null) {
            button.setEffect(new BoxBlur());
        } else {
            button.setEffect(null);
        }
    }
}
