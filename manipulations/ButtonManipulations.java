package epam.bsuir.oop.manipulations;

import epam.bsuir.oop.model.Body;
import epam.bsuir.oop.model.Head;
import epam.bsuir.oop.factory.MyTinyFactory;
import epam.bsuir.oop.start.Constants;
import javafx.scene.control.Alert;

public class ButtonManipulations {
    private ButtonManipulations() {}

    public static void callMyTinyFactory(Head head, Body body) {
            MyTinyFactory.createAHead(head);
            MyTinyFactory.createABody(body);
    }

    public static void eating(Head head) {
            if(head != null && head.getOrgansAmount() != 0) {
                head.getBrain().controlOfOrgan(head, Constants.CHOICE_1);
            }
            else {
                alertsMenu(Constants.EATING_CASE);
            }
    }

    public static void speaking(Head head) {
        if(head != null && head.getOrgansAmount() != 0) {
            head.getBrain().controlOfOrgan(head, Constants.CHOICE_2);
        }
        else {
            alertsMenu(Constants.SPEAKING_CASE);
        }
    }

    public static void scratching(Head head) {
        if(head != null && head.getOrgansAmount() != 0) {
            head.getBrain().controlOfOrgan(head, Constants.CHOICE_3);
        }
        else {
            alertsMenu(Constants.SCRATCHING_CASE);
        }
    }

    public static void sneezing(Head head) {
        if(head != null && head.getOrgansAmount() != 0) {
            head.getBrain().controlOfOrgan(head, Constants.CHOICE_4);
        }
        else {
            alertsMenu(Constants.SNEEZING_CASE);
        }
    }

    public static void alertsMenu(byte changer) {
        Alert alert;
        switch(changer) {
            case Constants.EATING_CASE: {
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle(Constants.EATING_TITLE);
                alert.setHeaderText(Constants.EATING_TXT);
                alert.show();
            } break;
            case Constants.SPEAKING_CASE: {
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle(Constants.SPEAKING_TITLE);
                alert.setHeaderText(Constants.SPEAKING_TXT);
                alert.show();
            } break;
            case Constants.SCRATCHING_CASE: {
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle(Constants.SCRATCHING_TITLE);
                alert.setHeaderText(Constants.SCRATCHING_TXT);
                alert.show();
            } break;
            case Constants.SNEEZING_CASE: {
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle(Constants.SNEEZING_TITLE);
                alert.setHeaderText(Constants.SNEEZING_TXT);
                alert.show();
            } break;
        }
    }
}
