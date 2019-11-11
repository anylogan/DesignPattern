	package Flyweight;
	import java.util.ArrayList;
	
	
	public class Product {
		private static Product instance = new Product();
		private static  int price = 20;
		public static Product getProduct(){
			System.out.println("You have successfully sold out a good!");
			return instance;
	 }
	
	 private Product(){ }
	
	 public class Chicken extends Product{}
	 
	 public class Fish extends Product{}
	 
	 public class Bull extends Product{}
	
	 
	 public void SellChicken(){
	     Product chicken = new Chicken();
	     ProductFolds.chickenList.add(chicken);
	     System.out.println(" Successfully sell A chicken!");
	 }
	
	
	 public void SellFish(){
		 Product fish = new Fish();
		 ProductFolds.fishList.add(fish);
	     System.out.println("Successfully sell A fish!");
	 }
	
	
	 public void SellBull(){
		 Product bull = new Bull();
		 ProductFolds.bullList.add(bull);
	     System.out.println("Successfully sell A bull!");
	 }
	
	
	 public void getProductNumber(){
	     System.out.println("The Chicken, Fish, Bull Number is:");
	
	     ProductList productList = new ProductList();
	     for(ProductList.Interator iter = productList.getIterator(); iter.hasNext();){
	         ArrayList<Product> tmp = iter.next();
	         System.out.println(tmp.size());
	     }
	 }
	}