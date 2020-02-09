package homework4.NetChat;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Controller<event> {

    @FXML
    public Button button;
    @FXML
    private TextArea textArea;
    @FXML
    private TextField text;


    public void SendMessage(ActionEvent actionEvent) {
        if (text.getText().isEmpty()) {
            text.requestFocus();
        } else
            textArea.appendText("User "
                    + new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime())
                    + " : " + text.getText() + "\n");
        text.clear();
        text.requestFocus();
    }

    public void PressEnter(KeyEvent keyEvent) {
        if (text.getText().isEmpty()) {
            text.requestFocus();
        } else {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                textArea.appendText("User "
                        + new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime())
                        + " : " + text.getText() + "\n");
                text.clear();
                text.requestFocus();
            }
        }
    }
}

