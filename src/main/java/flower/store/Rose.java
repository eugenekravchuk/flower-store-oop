package flower.store;

public class Rose extends Flower {
    public Rose() {
        super(10.0, FlowerColor.RED, 100, FlowerType.ROSE);
    }

    public Rose(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, price, FlowerType.ROSE);
    }
}
