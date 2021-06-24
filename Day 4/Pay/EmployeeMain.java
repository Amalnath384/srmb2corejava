package work;

class PayException extends Exception{
	private int bpay;
	PayException(int bpay){
		this.bpay=bpay;
	}
	public String toString() {
		return ("Pay not valid"+" "+bpay);
	}
}

class Employee  {
	private String eno;
	private String ename;
	private int bpay;
	Employee(String eno,String ename,int bpay){
		this.eno=eno;
		this.ename=ename;
		this.bpay=bpay;
	}
	public void display() {
		try {
		System.out.println("Employee No:"+eno);
		System.out.println("Employee Name:"+ename);
		if(bpay<5000)throw new PayException(bpay);
		System.out.println("Basic Pay:"+bpay);
		}
		catch(PayException pay){
			System.out.println(pay);
		}
	}
	
	
}
public class EmployeeMain {

	public static void main(String[] args) {
		Employee obj=new Employee("A123","Raghu",10000);
		Employee obj1=new Employee("A125","Rahul",4000);
		 obj.display();
		 obj1.display();

	}

}