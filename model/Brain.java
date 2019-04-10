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
            case 1: {
                mouth.eat();
            } break;
            case 2: {
                mouth.speak();
            } break;
            case 3: {
                nose.scratch();
            } break;
            case 4: {
                nose.sneeze();
            } break;
        }
    }

    public static class OrganOfHead {
        private double weightOfOrgan;

        public void setWeightOfOrgan(double weightOfOrgan) {
            this.weightOfOrgan = weightOfOrgan;
        }

        public double getWeightOfOrgan() {
            return weightOfOrgan;
        }
    }
}
