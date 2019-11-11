package Sleep;

public class test {
	public static void sleeptest() {
	     Context context;
	 
	     System.out.println("---People need sleep---");
	     context = new Context(new peopleSleep());
	     context.Sleep();
	     System.out.println("\n");
	 
	     System.out.println("---Chicken need sleep---");
	     context.setStrategy(new chickenSleep());
	     context.Sleep();
	     System.out.println("\n");
	 
	     System.out.println("---Cow need sleep---");
	     context.setStrategy(new cowSleep());
	     context.Sleep();
	     System.out.println("\n");
	     
	     System.out.println("---Fish need sleep---");
	     context.setStrategy(new fishsleep());
	     context.Sleep();
	     System.out.println("\n");
	     }

}
