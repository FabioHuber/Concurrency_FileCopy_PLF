package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FileCopyController implements Initializable {

    @FXML
    private Button copyBtn;

    @FXML
    private Label copyStatus;

    @FXML
    private TextField fromLbl;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private TextField toLbl;

    public static void show(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(FileCopyController.class.getResource("/view/FileCopy.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("File Copy");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void selectFileFrom(ActionEvent event) {

    }

    @FXML
    void selectFileTo(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
