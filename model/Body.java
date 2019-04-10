package epam.bsuir.oop.model;

import epam.bsuir.oop.start.Constants;

import java.util.ArrayList;

public class Body {
    private ArrayList<BodyOrgan> bodyOrgans = new ArrayList<BodyOrgan>(Constants.BODY_ORGANS_AMOUNT);

    public void setOrgans(BodyOrgan organ) {
        bodyOrgans.add(organ);
    }

    public Stomach getBrain() {
        return (Stomach)bodyOrgans.get(Constants.BRAIN_POS_IN_ARR);
    }
}
