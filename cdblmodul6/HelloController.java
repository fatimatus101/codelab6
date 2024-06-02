package com.example.cdblmodul6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class HelloController {
    @FXML private Text actiontarget;
    @FXML private Button logoutButton;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }

    @FXML protected void handleLogoutButtonAction(ActionEvent event) {
        // Go back to login scene
        LoginApp loginApp = new LoginApp();
        loginApp.start(LoginApp.primaryStage);
//    @FXML
//    private TextField usernameField;
//    @FXML
//    private PasswordField passwordField;
//    @FXML
//    private Label messageLabel;
//    @FXML
//    private VBox root;

//    public void login() {
//        String username = usernameField.getText();
//        String password = passwordField.getText();
//        if (authenticateUser(username, password)) {
//            messageLabel.setText("Welcome, " + username + "!");
//            messageLabel.setStyle("-fx-text-fill: black;");
//        } else {
//            messageLabel.setText("Invalid username or password");
//            messageLabel.setStyle("-fx-text-fill: red;");
//        }
//    }

//    private boolean authenticateUser(String username, String password) {
//        return username.equals("fatimatus") && password.equals("123457");
//    }
//
//    @FXML
//    public void initialize() {
//        root.setAlignment(Pos.BOTTOM_RIGHT);
    }
}