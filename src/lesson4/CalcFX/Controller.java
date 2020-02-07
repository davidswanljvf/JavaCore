package lesson4.CalcFX;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField text;
    char znak;
    double memory;

    public void clickPlus() {
        znak = '+';
        memory = readFromText();
        text.setText("");
        text.requestFocus();
    }

    public void clickMinus() {
        znak = '-';
        memory = readFromText();
        text.setText("");
        text.requestFocus();
    }

    public void clickCalc() {
        double num = readFromText();
        if (znak == '+') {
            memory += num;
        }
        if (znak == '-') {
            memory -= num;
        }

        text.setText(""+ memory);
    }

    private double readFromText() {
        try {
            return Double.parseDouble(text.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
