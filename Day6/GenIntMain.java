package Generic;
 interface gint<T>{
	void setvalue(T t);
	void getvalue();
}
 class gclass<T> implements gint<T>{
	private T t;
	 public void setvalue(T t) {
		this.t=t;
	}
	public void getvalue() {
		System.out.println("hello"+t);
		
	}
	 
 }
public class GenIntMain {

	public static void main(String[] args) {
		
		gclass<Integer> obj = new gclass<Integer>();
		obj.setvalue(1000);
		obj.getvalue();
	}

}
