package Sleep;

public class Context {
	private SleepStrategy strategy;
    //¹¹Ôìº¯Êý
    public Context(SleepStrategy strategy){
         this.strategy = strategy;
    }
    public void setStrategy(SleepStrategy strategy){
         this.strategy = strategy;
    }
    public void Sleep(){
         this.strategy.Sleep();
    }

}
