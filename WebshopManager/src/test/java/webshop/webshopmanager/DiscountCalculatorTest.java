package webshop.webshopmanager;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

import model.Chestnut;
import model.Cucumber;
import model.Product;
import model.RubberDuck;
import model.Salami;
import service.DefaultDiscountCalculator;
import service.Megapack;
import service.ThreeForTwo;

public class DiscountCalculatorTest {

	DefaultDiscountCalculator dicountCalculator = new DefaultDiscountCalculator();
	HashMap<Product, Integer> productList = new HashMap<>();
	Megapack megapack = new Megapack();
	ThreeForTwo threeForTwo = new ThreeForTwo();
	
	@Before 
	   public void setUp() {
		productList.put(new Salami(), 3);
		productList.put(new RubberDuck(), 1);
		productList.put(new Chestnut(), 12);
		productList.put(new Cucumber(), 3);
	   } 
	
	@Test
	public void testCalculate() {
		int discountValue = dicountCalculator.calculate(productList).getTotalWithDiscount();
		assertEquals(20600, discountValue);
	}
	
	@Test
	public void testThreeForTwokDiscount1() {
		int discountValue = threeForTwo.discount(new Salami(), 1);
		assertEquals(0, discountValue);
	}
	
	@Test
	public void testThreeForTwokDiscount2() {
		int discountValue = threeForTwo.discount(new Salami(), 3);
		assertEquals(2000, discountValue);
	}
	
	@Test
	public void testThreeForTwokDiscount3() {
		int discountValue = threeForTwo.discount(new Salami(), 4);
		assertEquals(2000, discountValue);
	}
	
	@Test
	public void testMegapackDiscount1() {
		int discountValue = megapack.discount(new Chestnut(), 2);
		assertEquals(0, discountValue);
	}
	
	@Test
	public void testMegapackDiscount2() {
		int discountValue = megapack.discount(new Chestnut(), 12);
		assertEquals(6000, discountValue);
	}
	
	@Test
	public void testMegapackDiscount3() {
		int discountValue = megapack.discount(new Chestnut(), 13);
		assertEquals(6000, discountValue);
	}
	
	@Test
	public void testMegapackTotalDiscount() {
		int discountValue = megapack.totalDiscount(productList);
		assertEquals(6000, discountValue);
	}
	
	@Test
	public void testThreeForTwoTotalDiscount() {
		int discountValue = threeForTwo.totalDiscount(productList);
		assertEquals(8800, discountValue);
	}
	

}
