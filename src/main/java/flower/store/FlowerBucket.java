package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class FlowerBucket {
  private List<FlowerPack> flowerPacks = new ArrayList<>();

  public void add(FlowerPack pack) {
    flowerPacks.add(pack);
  }

  public double getPrice(){
    double total = 0;
    for (FlowerPack pack : flowerPacks){
      total += pack.getPrice();
    }
    return total;
  }
}
