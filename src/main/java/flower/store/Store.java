package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
  private List<FlowerBucket> flowerBuckets = new ArrayList<>();

  public void addFlowerBucket(FlowerBucket bucket) {
    flowerBuckets.add(bucket);
  }

  public List<FlowerPack> search(FlowerType flowerType) {
    List<FlowerPack> result = new ArrayList<>();
    for (FlowerBucket bucket : flowerBuckets) {
      for (FlowerPack pack : bucket.getFlowerPacks()) {
        if (pack.getFlower().getFlowerType() == flowerType) {
          result.add(pack);
        }
      }
    }
    return result;
  }
}
