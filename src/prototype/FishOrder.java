package prototype;

public class FishOrder implements Cloneable, Order {
	private String Uname;
	private int num;
	private Product product;
 
	public FishOrder(String Uname) {
		this.Uname = Uname;
		product = new Product();
	}
 
	public void setNum(int num) {
		this.num = num;
	}
 
	public int getNum() {
		return num;
	}
 
	private FishOrder(Product product) throws CloneNotSupportedException {
		this.product = (Product) product.Clone();
	}
 
	public void setProduct(int Pid, String Pname) {
		product.setId(Pid);
		product.setName(Pname);
	}
 
	public void display() {
		System.out.print("客户名:" + Uname + " ");
		System.out.println("订购数目:" + num);
		System.out.println("产品号" + product.getId() + " 产品名" + product.getName());
		
		 Order fishorder = new FishOrder(Uname);
	     OrderFolds.ChickenOrderList.add(fishorder);
	     System.out.println(" Successfully create A fishorder!");
	}
 
	public Object Clone() throws CloneNotSupportedException {
		FishOrder obj = new FishOrder(this.product);
		obj.Uname = this.Uname;
		obj.num = this.num;
		return obj;
	}
}
