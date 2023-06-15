package com.example.gpudb;
/**  GPU class db */
/**  @author Kuvykin Nikita */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.load();

        Parent root = fxmlLoader.getRoot();
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(root));
        stage1.show();
    }

    public static void main(String[] args) {
        launch();
    }
}