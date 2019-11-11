package prototype;


public interface Order {
	int getNum();
	 
	void setNum(int num);
 
	void display();
 
	Object Clone() throws CloneNotSupportedException;
}
