package epam.bsuir.oop.start;

import epam.bsuir.oop.manipulations.ButtonManipulations;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class BodyApplication extends Application {
    private Initialization init = new Initialization();
    private Stage subStage = new Stage();
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {

        init.createButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ButtonManipulations.callMyTinyFactory(init.getHead());

                ButtonManipulations.createNewWindow(subStage);
            }
        });

        init.buttonOfEating.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ButtonManipulations.eating(init.getHead());
            }
        });

        init.buttonOfSpeaking.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ButtonManipulations.speaking(init.getHead());
            }
        });

        init.buttonOfScratching.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ButtonManipulations.scratching(init.getHead());
            }
        });

        init.buttonOfSneezing.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ButtonManipulations.sneezing(init.getHead());
            }
        });

//        FXMLLoader loader = new FXMLLoader(StartGraphicsHere.class.getResource("/fxml/ApEditDialog.fxml"));
//        AnchorPane page = (AnchorPane) loader.load();
//        Stage dialogStage = new Stage();
//        dialogStage.setTitle("Edit Profile");
//        dialogStage.initModality(Modality.WINDOW_MODAL);
//        dialogStage.initOwner(stage);
//        Scene scene = new Scene(page);
//        dialogStage.setScene(scene);

        stage.setTitle(Constants.APP_NAME);
        stage.setScene(new Scene(init.getGridPane()));
        stage.show();
    }
}
