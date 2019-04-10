package epam.bsuir.oop.model;

import epam.bsuir.oop.start.Constants;
import javafx.scene.control.Alert;

public class Nose extends HeadOrgan{
    private String figureOfNose;

    public Nose(String _figureOfNose, double _weight) {
        super(_weight);
        this.figureOfNose = _figureOfNose;
    }

    public void sneeze() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(Constants.SNEEZE_TITLE);
        alert.setHeaderText(Constants.SNEEZE_TEXT);
        alert.show();
    }

    public void scratch() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(Constants.SCRATCH_TITLE);
        alert.setHeaderText(Constants.SCRATCH_TEXT);
        alert.show();
    }
}
