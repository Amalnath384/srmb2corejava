class Employee{
String Empname;
String Empid;
String Address;
String Mailid;
long Mobileno;
void setValue(String Empname,String Empid,String Address,String Mailid, long Mobileno){
this.Empname=Empname;
this.Empid=Empid;
this.Address=Address;
this.Mailid=Mailid;
this.Mobileno=Mobileno;
}
void display(){
System.out.println("Employee Name:"+Empname);
System.out.println("Employee ID :"+Empid);
System.out.println("Address :"+Address);
System.out.println("Mail ID :"+Mailid);
System.out.println("Mobile no :"+Mobileno);
}
}
class Programmer extends Employee{
int BP;
int DA;
int HRA;
int PF;
double staffclubfund;
int gross;
double net;

void setValue1( int BP){

this.BP=BP;
this.DA=DA;
this.HRA=HRA;
this.PF=PF;
this.staffclubfund=staffclubfund;
this.gross=gross;
this.net=net;
 DA=BP/100*97;
 HRA=BP/100*10;
 PF=BP/100*12;
 staffclubfund=BP/100*0.1;
 gross=BP+DA+HRA;
 net=gross+PF+staffclubfund;
	

}
void put(){
	
	System.out.println("BasicPay:"+BP);
	System.out.println("DA:"+DA);
	System.out.println("HRA:"+HRA);
	System.out.println("PF:"+PF);
	System.out.println("staff club fund:"+staffclubfund);
	System.out.println("Gross:"+gross);
	System.out.println("Net Salary:"+net);
}
}
class Professor extends Employee{
int BP;
int DA;
int HRA;
int PF;
double staffclubfund;
int gross;
double net;

void setValue1( int BP){

this.BP=BP;
this.DA=DA;
this.HRA=HRA;
this.PF=PF;
this.staffclubfund=staffclubfund;
this.gross=gross;
this.net=net;
 DA=BP/100*97;
 HRA=BP/100*10;
 PF=BP/100*12;
 staffclubfund=BP/100*0.1;
 gross=BP+DA+HRA;
 net=gross+PF+staffclubfund;
	

}
void put(){
	
	System.out.println("BasicPay:"+BP);
	System.out.println("DA:"+DA);
	System.out.println("HRA:"+HRA);
	System.out.println("PF:"+PF);
	System.out.println("staff club fund:"+staffclubfund);
	System.out.println("Gross:"+gross);
	System.out.println("Net Salary:"+net);
}
}	
	
class Main{
public static void main(String args[]){
Employee ref=new Employee();
ref.setValue("amal","A12","chennai","abc@gmail.com",9874561);
ref.display();	
Programmer obj=new Programmer();
obj.setValue1(15000);
obj.put();
Employee ref1=new Employee();
ref1.setValue("arun","A13","chennai","abd@gmail.com",9874577);
ref1.display();
 Professor obj1=new  Professor();
obj1.setValue1(18000);
obj1.put();
}
}
