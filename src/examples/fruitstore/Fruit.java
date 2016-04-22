package examples.fruitstore;

public class Fruit implements IFruit {

	private double pricePerKg;
	private String name;
	
	public Fruit(String name, double pricePerKg){
		this.name = name;
		this.pricePerKg = pricePerKg;
	}
	@Override
	public double getPricePerKg() {
		return pricePerKg;
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public double calculatePrice(int weight) {
		return pricePerKg*weight;
	}

}
