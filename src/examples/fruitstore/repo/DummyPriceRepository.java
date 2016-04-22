package examples.fruitstore.repo;

import java.util.HashMap;
import java.util.Map;

import examples.fruitstore.Fruit;
import examples.fruitstore.IFruit;

public class DummyPriceRepository implements IPriceRepository {

	@Override
	public Map<String, IFruit> getFruitPrices() {
		Map<String, IFruit> fruits = new HashMap<>();
		
		fruits.put("Banana", new Fruit("Banana", 10));
		fruits.put("Orange", new Fruit("Orange", 20));
		fruits.put("Apple", new Fruit("Apple", 30));
		fruits.put("Lemon", new Fruit("Lemon", 40));
		fruits.put("Peach", new Fruit("Peach", 50));
		return fruits;
	}

}
