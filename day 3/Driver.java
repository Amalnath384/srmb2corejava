class Publication{
String title;
int price;
Publication(String title,int price){
this.title=title;
this.price=price;
}
void display(){
System.out.println("Title:"+title);
System.out.println("Price:"+price);
}
}
class Book{
	int Page;
Book(int Page){
this.Page=Page;
}
void display(){
System.out.println("Page No:"+Page);
}
}
class CD{
	double PlayTime;
CD(double PlayTime){
this.PlayTime=PlayTime;
}
void display(){
System.out.println("Playing Time:"+PlayTime+"secs");
}
}
class Driver{
public static void main(String args[]){
Publication obj=new Publication("Aim",150);
obj.display();
Book ref=new Book(3);
ref.display();
CD obj1=new CD(11.30);
obj1.display();
}
}