package examples.fruitstore.repo;

import java.util.Map;

import examples.fruitstore.IFruit;

public interface IPriceRepository {
		public Map<String, IFruit> getFruitPrices();
}
