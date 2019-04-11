package epam.bsuir.oop.model;

import epam.bsuir.oop.start.Constants;
import javafx.scene.control.Alert;

public class Mouth extends HeadOrgan{
    private String sizeOfMouth;

    public Mouth(String _sizeOfMouse, double _weight) {
        super(_weight);
        this.sizeOfMouth = _sizeOfMouse;
    }

    public void eat() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(Constants.EAT_TITLE);
        alert.setHeaderText(Constants.EAT_TEXT);
        alert.show();
    }

    public void speak() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(Constants.SPEAK_TITLE);
        alert.setHeaderText(Constants.SPEAK_TEXT);
        alert.show();
    }
}
