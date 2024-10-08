package flower.store;

import lombok.Getter;
import lombok.Setter;


@Setter
public class Flower {
    @Getter 
    private double sepalLength;
    private FlowerColor color;
    @Getter 
    private double price;
    @Getter 
    private FlowerType flowerType;

    public Flower() {
        this.sepalLength = 0;
        this.color = FlowerColor.RED;
        this.price = 0;
        this.flowerType = FlowerType.ROSE;
    } 

    public Flower(double sepalLength, FlowerColor color, 
    double price, FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    public String getColor(){
        return this.color.toString();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() 
        + " [Sepal Length: " + sepalLength
        + ", Color: " + color + ", Price: $" + price + "]";
    }
}
