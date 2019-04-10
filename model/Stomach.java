package epam.bsuir.oop.model;

public class Stomach extends BodyOrgan {
    private double volume;

    public Stomach(double _volume, double _weight) {
        super(_weight);
        this.volume = _volume;
    }

    public void getFood(String food) {
        remakeFood();
    }
    public void remakeFood() {

    }
}
