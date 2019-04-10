package epam.bsuir.oop.start;

import epam.bsuir.oop.manipulations.ButtonManipulations;
import epam.bsuir.oop.model.Body;
import epam.bsuir.oop.model.Head;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Initialization {
    private GridPane gridPane = new GridPane();
    private Insets insets = new Insets(Constants.INSETS_TOP, Constants.INSETS_RIGHT,
            Constants.INSETS_BOTTOM, Constants.INSETS_LEFT);

    //Here we're keeping our head
    private Head head = new Head();
    private Body body = new Body();

    //Button's field
    public Button createButton = new Button(Constants.CREATING_TEXT);
    public Button buttonOfEating = new Button(Constants.EAT_BTN_TEXT);
    public Button buttonOfSpeaking = new Button(Constants.SPEAK_BTN_TEXT);
    public Button buttonOfSneezing = new Button(Constants.SNEEZE_BTN_TEXT);
    public Button buttonOfScratching = new Button(Constants.SCRATCH_BTN_TEXT);

    //public Button btnOfDigest = new Button(Constants);

    //The an image & a path to the image
    private Image image = new Image("file:C:\\Users\\Admin\\IdeaProjects\\brain.jpg",
            Constants.IMAGE_WIDTH, Constants.IMAGE_HEIGHT, true, false);
    private ImageView imageView = new ImageView(image);

    //default constructor
    public Initialization() {
        gridPane.setPadding(insets);
        gridPane.setVgap(Constants.SET_V_GAP);
        gridPane.setHgap(Constants.SET_H_GAP);
        gridPane.add(imageView, Constants.IMAGE_COOR_X, Constants.IMAGE_COOR_Y);
        //Buttons
        gridPane.add(createButton, Constants.CREATE_BTN_X, Constants.CREATE_BTN_Y);
        gridPane.add(buttonOfEating, Constants.EAT_BTN_X, Constants.EAT_BTN_Y);
        gridPane.add(buttonOfSpeaking, Constants.SPEAK_BTN_X, Constants.SPEAK_BTN_Y);
        gridPane.add(buttonOfScratching, Constants.SCRATCH_BTN_X, Constants.SCRATCH_BTN_Y);
        gridPane.add(buttonOfSneezing, Constants.SNEEZE_BTN_X, Constants.SNEEZE_BTN_Y);
    }

    public GridPane getGridPane() {
        return gridPane;
    }

    public Head getHead() {
        return head;
    }

    public Body getBody() {
        return body;
    }
}
