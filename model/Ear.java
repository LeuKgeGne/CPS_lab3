package epam.bsuir.oop.model;

import epam.bsuir.oop.start.Constants;
import javafx.scene.control.Alert;

public class Ear extends HeadOrgan {
    private String shackle;

    public Ear(String _shackle, double _weight) {
        super(_weight);
        this.shackle = _shackle;
    }

    public String getShackle() {
        return this.shackle;
    }

    public void hearing() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(Constants.HEAR_TITEL);
        alert.setHeaderText(Constants.HEAR_TEXT);
        alert.show();
    }
}
