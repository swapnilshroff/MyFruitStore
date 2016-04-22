package examples.fruitstore.client;

import java.util.Map;

import examples.fruitstore.IFruit;
import examples.fruitstore.repo.PriceRepositoryFactory;

public class FruitStore {

	public static void main(String[] args) throws Exception {
		
		Map<String, IFruit> fruitPrices = PriceRepositoryFactory.getPriceRepository().getFruitPrices();
		
		if(args.length%2 != 0){
			throw new Exception("Incorrect Basket " + args.length);
		}
			
		double total = 0;
		for (int i = 0; i < args.length; i=i+2) {
			String fruitN = args[i];
			int weight = Integer.parseInt(args[i+1]);
			IFruit fruit = fruitPrices.get(fruitN);
			if(fruit != null){
				System.out.println(fruitN + " PricePerKg: " + fruit.getPricePerKg());
				total += total + fruit.calculatePrice(weight);
			}else{
				System.out.println(fruitN + " not in stock");
			}
			
			
		}
		
		System.out.println("Total cost of basket " + total);

	}

}
