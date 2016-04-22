package examples.fruitstore.repo;

public class PriceRepositoryFactory {
	
	public static IPriceRepository getPriceRepository(){
		return new DummyPriceRepository();
	}
}
