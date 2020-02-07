package lesson4.CalcFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
// --module-path ${PATH_TO_FX} --add-modules javafx.controls,javafx.fxml
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 95));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
