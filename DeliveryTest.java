import org.junit.Test;

import org.junit.Assert;

public class DeliveryTest {
	Delivery D1 = new Delivery();
	
	@Test
	public void testPriceForDistanceUnder10KM() {
	
		D1.priceforDistance(6);
		int price = D1.priceforDistance(9);

		Assert.assertEquals(10, price);
	}

	@Test
	public void PriceForDistanceGreaterThan10KM() {
		int price = D1.priceforDistance(12);
		Assert.assertEquals(25, price);
	}
	
	@Test
	public void PriceForDistanceLessThan10KMandStairs() {
		int price = D1.priceforDistanceAndStairs(7);
		Assert.assertEquals(20, price);
		
	}
	
	@Test
	public void PriceForDistanceGreaterThan10andStairs() {
		int price = D1.priceforDistanceAndStairs(14);
		Assert.assertEquals(35, price);
		

	}
	
}
