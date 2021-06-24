package work;

class MarkException extends Exception{
	private int mark;
	MarkException(int mark){
		this.mark=mark;
	}
	public String toString() {
		return ("mark not valid"+" "+mark);
	}
}

class Student  {
	private int rollno;
	private String name;
	private int mark;
	Student(int rollno,String name,int mark){
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
	}
	public void display() {
		try {
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		if(mark<40)throw new MarkException(mark);
		System.out.println("Mark:"+mark);
		}
		catch(MarkException ma){
			System.out.println(ma);
		}
	}
	
	
}
public class StudentMain {

	public static void main(String[] args) {
		 Student obj=new Student(1011,"amal",57);
		 Student obj1=new Student(1012,"arul",32);
		 obj.display();
		 obj1.display();

	}

}