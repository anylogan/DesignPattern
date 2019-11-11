package fertilize;

public class Farmer {
	 public static void doFertilize() {
		 FertilizeHandler h1 = new PastureHandler();
		 FertilizeHandler h2 = new RiceHandler();
		 FertilizeHandler h3 = new CornHandler();
	     h3.setSuccessor(h2);
	     h2.setSuccessor(h1);
	     
	     String test = h3.handleRequest("Pasture");
	     System.out.println(test);
	     
	     test = h3.handleRequest("Rice");
	     System.out.println(test);
	     
	     test = h3.handleRequest("Corn");
	     System.out.println(test);
	}
}
