package lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    public VBox vbox;
    @FXML
    private TextArea textArea;
    @FXML
    private Label label;

    Stage stage1;

    public void btn1Click() {
        System.out.println("btn1Clicked");
        textArea.appendText("Hello\n");
        label.setText("" + System.currentTimeMillis());

    }

    public void btn2MouseClick(MouseEvent mouseEvent) {
        textArea.appendText("Bye\n");

    }

    public void btn1ClickAddBtn(ActionEvent actionEvent) {
        Button btn = new Button("" + System.currentTimeMillis());
        vbox.getChildren().add(btn);
        btn.setOnAction(event -> {
            System.out.println("qwe");
        });
    }

    public void createNewWindow(ActionEvent actionEvent) {
        System.out.println("rtwert");

        try {
            if(this.stage1!=null){
                stage1.show();
                return;
            }
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample1.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            this.stage1 = stage;
            stage.initModality(Modality.APPLICATION_MODAL);

            stage.setTitle("new Window");
            stage.setScene(new Scene(root,300,300));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
