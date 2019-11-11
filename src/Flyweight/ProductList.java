package Flyweight;
import java.util.ArrayList;

public class ProductList {
    public ArrayList<ArrayList<Product>> productList = new ArrayList<>();

    public ProductList(){
    	productList.add(ProductFolds.chickenList);
    	productList.add(ProductFolds.bullList);
    	productList.add(ProductFolds.fishList);

    }

    public Interator getIterator(){
        System.out.println("------------Iterator test in Product------------");
        return new Interator();
    }

    public class Interator{
        int index;

        public boolean hasNext(){
            if(index<productList.size()){
                return true;
            }
            else return false;
        }

        public ArrayList<Product> next(){
            if(hasNext()){
                return productList.get(index++);
            }
            return null;
        }
    }


}

