package prototype;


public class Product implements Cloneable {
	private int Id;
	private String name;
 
	public Product() {
		
	}
 
	public int getId() {
		return Id;
	}
 
	public void setId(int id) {
		Id = id;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public Object Clone() throws CloneNotSupportedException {
 
		return super.clone();
	}
}
