package epam.bsuir.oop.model;

import epam.bsuir.oop.start.Constants;
import java.util.ArrayList;

public class Head {
    private ArrayList<HeadOrgan> organs = new ArrayList<HeadOrgan>(Constants.HEAD_ORGANS_AMOUNT);

    public void setOrgans(HeadOrgan organ) {
        organs.add(organ);
    }

    public byte getOrgansAmount() {
        return (byte)this.organs.size();
    }

    public HeadOrgan getHeadOrgan(byte index) {
        return organs.get(index);
    }

    public Brain getBrain() {
        return (Brain)organs.get(Constants.BRAIN_POS_IN_ARR);
    }

    public Mouth getMouth() {
        return (Mouth)organs.get(Constants.MOUTH_POS_IN_ARR);
    }

    public Nose getNose() {
        return (Nose)organs.get(Constants.NOSE_POS_IN_ARR);
    }

    public Ear getEar() {
        return (Ear)organs.get(Constants.EAR_POS_IN_ARR);
    }
}
