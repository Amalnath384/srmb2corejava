class person{
	String Name;
	int Age;
	int Phonenumber;
	String Address;
	int Salary;
	void printsalary(){
		System.out.println("salary="+this.Salary);
	}
}
class Employee extends person{
	String specialization;
	String department;
}
class Manager extends person{
	String specialization;
	String department;	
}
 class personmain {

	public static void main(String[] args) {
		Employee ref=new Employee();
		ref.Name="amal";
	    ref.Age=25;
		ref.Phonenumber=937852;
		ref.Address="chennai";
		ref.specialization="developer";
		ref.department="hrx";
		ref.Salary=40000;
		System.out.println("name="+ref.Name);
		System.out.println("age="+ref.Age);
		System.out.println("number="+ref.Phonenumber);
		System.out.println("address="+ref.Address);
		System.out.println("specialization="+ref.specialization);
		System.out.println("department="+ref.department);
		ref.printsalary();
		System.out.println("");
		Manager res=new Manager();
		res.Name="raj";
	    res.Age=35;
		res.Phonenumber=978524;
		res.Address="chennai";
		res.specialization="Manager";
		res.department="hrx";
		res.Salary=100000;
		res.printsalary();
		System.out.println("name="+res.Name);
		System.out.println("age="+res.Age);
		System.out.println("number="+res.Phonenumber);
		System.out.println("address="+res.Address);
		System.out.println("specialization="+res.specialization);
		System.out.println("department="+res.department);
		res.printsalary();
		
		

	}

}