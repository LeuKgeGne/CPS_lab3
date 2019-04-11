package epam.bsuir.oop.model;

import epam.bsuir.oop.start.Constants;

public class Brain extends HeadOrgan{
    private double efficientFactor;

    public Brain(double _efficientFactor, double _weight) {
        super(_weight);
        this.efficientFactor = _efficientFactor;
    }

    public void controlOfOrgan(Head head, int changer) {
        Mouth mouth = (Mouth)head.getHeadOrgan(Constants.MOUTH_POS_IN_ARR);
        Nose nose = (Nose)head.getHeadOrgan(Constants.NOSE_POS_IN_ARR);

        switch (changer) {
            case Constants.EATING_CASE: {
                mouth.eat();
            } break;
            case Constants.SPEAKING_CASE: {
                mouth.speak();
            } break;
            case Constants.SCRATCHING_CASE: {
                nose.scratch();
            } break;
            case Constants.SNEEZING_CASE: {
                nose.sneeze();
            } break;
        }
    }
}
