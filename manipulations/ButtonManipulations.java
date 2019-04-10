package epam.bsuir.oop.manipulations;

import epam.bsuir.oop.model.Head;
import epam.bsuir.oop.factory.MyTinyFactory;
import epam.bsuir.oop.start.Constants;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ButtonManipulations {
    private ButtonManipulations() {}

    public static void callMyTinyFactory(Head head) {
        MyTinyFactory.createAHead(head);
    }

    public static void createNewWindow(Stage stage) {
        GridPane gridPane = new GridPane();
        gridPane.add(new Button("BUTTON!"), 1, 1);
        stage.setScene(new Scene(new GridPane()));

        stage.show();
    }

    public static void eating(Head head) {
            if(head.getOrgansAmount() != 0) {
                head.getBrain().controlOfOrgan(head, Constants.CHOICE_1);
            }
            else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle(Constants.EATING_TITLE);
                alert.setHeaderText(Constants.EATING_TXT);
                alert.show();
            }
    }

    public static void speaking(Head head) {
        if(head.getOrgansAmount() != 0) {
            head.getBrain().controlOfOrgan(head, Constants.CHOICE_2);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(Constants.SPEAKING_TITLE);
            alert.setHeaderText(Constants.SPEAKING_TXT);
            alert.show();
        }
    }

    public static void scratching(Head head) {
        if(head.getOrgansAmount() != 0) {
            head.getBrain().controlOfOrgan(head, Constants.CHOICE_3);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(Constants.SCRATCHING_TITLE);
            alert.setHeaderText(Constants.SCRATCHING_TXT);
            alert.show();
        }
    }

    public static void sneezing(Head head) {
        if(head.getOrgansAmount() != 0) {
            head.getBrain().controlOfOrgan(head, Constants.CHOICE_4);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(Constants.SNEEZING_TITLE);
            alert.setHeaderText(Constants.SNEEZING_TXT);
            alert.show();
        }
    }
}
