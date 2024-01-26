package com.example.minesweeper;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Game game = new Game();
        game.start(new Stage());
    }

    public static void main(String[] args) {
        launch();
    }
}