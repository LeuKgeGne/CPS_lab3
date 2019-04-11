package epam.bsuir.oop.start;

import epam.bsuir.oop.manipulations.ButtonManipulations;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class BodyApplication extends Application {
    private Initialization init = new Initialization();

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {

        init.createButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.callMyTinyFactory(init.getHead(), init.getBody());
            }
        });

        init.buttonOfEating.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.eating(init.getHead());
            }
        });

        init.buttonOfSpeaking.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.speaking(init.getHead());
            }
        });

        init.buttonOfScratching.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.scratching(init.getHead());
            }
        });

        init.buttonOfSneezing.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                ButtonManipulations.sneezing(init.getHead());
            }
        });

        stage.setTitle(Constants.APP_NAME);
        stage.setScene(new Scene(init.getGridPane(),
                Constants.APPLICATION_HEIGHT, Constants.APPLICATION_WIDTH));
        stage.show();
    }
}
