package com.example.cdblmodul6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginApp extends Application {
    public static Stage primaryStage;
    private Scene loginScene;
    private Scene welcomeScene;

    public LoginApp() {
    }
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Login");
        createLoginScene();
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    private void createLoginScene() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10.0);
        grid.setVgap(10.0);
        grid.setPadding(new Insets(25.0, 25.0, 25.0, 25.0));
        loginScene = new Scene(grid, 300.0, 200.0);
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20.0));
        grid.add(scenetitle, 0, 0, 2, 1);
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10.0);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        Runnable loginAction = () -> {
            if ("Fatimatus".equals(userTextField.getText()) && "123457".equals(pwBox.getText())) {
                actiontarget.setFill(Color.GREEN);
                actiontarget.setText("Login Successful");
                this.showWelcomePage(primaryStage);
            } else {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Username atau Password Salah");
            }

        };
        btn.setOnAction((e) -> {
            loginAction.run();
        });
        pwBox.setOnKeyPressed((event) -> {
            switch (event.getCode()) {
                case ENTER:
                    loginAction.run();
                default:
            }
        });
        userTextField.setOnKeyPressed((event) -> {
            switch (event.getCode()) {
                case ENTER:
                    loginAction.run();
                default:
            }
        });
    }

    private void showWelcomePage(Stage stage) {
        GridPane welcomeGrid = new GridPane();
        welcomeGrid.setAlignment(Pos.CENTER);
        welcomeGrid.setHgap(10.0);
        welcomeGrid.setVgap(10.0);
        welcomeGrid.setPadding(new Insets(25.0, 25.0, 25.0, 25.0));
        welcomeScene = new Scene(welcomeGrid, 300.0, 200.0);
        stage.setScene(welcomeScene);
        Text welcomeText = new Text("Hallo Fatimatus");
        welcomeText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20.0));
        welcomeGrid.add(welcomeText, 0, 0, 2, 1);
        Button logoutButton = new Button("Logout");
        logoutButton.setOnAction((e) -> {
            stage.setScene(loginScene);
        });
        welcomeGrid.add(logoutButton, 0, 1, 2, 1);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}