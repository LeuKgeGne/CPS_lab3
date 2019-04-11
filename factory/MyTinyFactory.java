package epam.bsuir.oop.factory;

import epam.bsuir.oop.model.*;
import static jdk.nashorn.internal.objects.NativeMath.random;

public class MyTinyFactory {

    public static void createAHead(Head head) {
        head.setOrgans(createABrain());
        head.setOrgans(createAMouth());
        head.setOrgans(createANose());
    }

    public static void createABody(Body body) {
        body.setOrgans(createAStomach());
    }

    //I didn't make any constants for these methods, cause
    //in my opinion it's not too much important here, just
    //my thoughts,however you're able to change my mind
    public static Brain createABrain() {
        return new Brain((5 + random(100 - 5)), (500 + random(1500 - 500)));
    }

    public static Nose createANose() {
        String[] noseFigures = {"Aquiline", "Big", "Straight", "Upturned"};
        return new Nose(noseFigures[(int)random(3)], 100 + random(300 - 100));
    }

    public static Mouth createAMouth() {
        String[] mouthFigures = {"Wide", "Big", "Small", "Medium"};
        return new Mouth(mouthFigures[(int)random(3)], 100 + random(250 - 100));
    }

    public static Stomach createAStomach() {
        return new Stomach((5 + random(100 - 5)), 100 + random(250 - 100));
    }
}
