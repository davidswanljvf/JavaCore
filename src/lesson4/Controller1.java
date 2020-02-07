package lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller1 {
    @FXML
    public TextField textField;

    public void clickSetTitle(ActionEvent actionEvent) {
        Stage stage = (Stage) textField.getScene().getWindow();
        stage.setTitle(textField.getText());
    }

    public void clickClose(ActionEvent actionEvent) {
        Stage stage = (Stage) textField.getScene().getWindow();
        stage.close();
    }
}
