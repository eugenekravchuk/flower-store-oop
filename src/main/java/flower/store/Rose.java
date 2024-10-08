package flower.store;

public class Rose extends Flower {
    private static final double ROSE_SEPAL_LEN = 10.0;
    private static final int ROSE_PRICE = 100;
    public Rose() {
        super(ROSE_SEPAL_LEN, FlowerColor.RED, ROSE_PRICE, FlowerType.ROSE);
    }

    public Rose(double sepalLength, FlowerColor color, double price) {
        super(sepalLength, color, price, FlowerType.ROSE);
    }
}
