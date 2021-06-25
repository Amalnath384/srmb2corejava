
package work;
import java.util.Scanner;

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
		
		Scanner s=new Scanner (System.in) ;
		Scanner s1=new Scanner (System.in) ;
        int rollno,mark;
        String name;
        System.out.println("Enter the roll no");
        rollno=s.nextInt();
        System.out.println("Enter the name");
        name=s1.nextLine();
        System.out.println("Enter the Marks obtained");
        mark=s.nextInt();
		 Student obj=new Student(rollno,name,mark);
		
	      obj.display();
		
	}

}