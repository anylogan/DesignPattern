package abstractfactory;

public class FactoryProducer {
	   public static AbstractFactory GetFactory(String choice){
	      if(choice.equalsIgnoreCase("animal")){
	         return new AnimalFactory();
	      } else if(choice.equalsIgnoreCase("plant")){
	         return new PlantFactory();
	      }
	      return null;
	   }
	}