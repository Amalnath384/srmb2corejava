class shape{
void print(){
System.out.println("This is shape");
}
}

class circle extends shape{
void print(){
System.out.println("This is circle");
}
}
class rectangle extends shape{
void print(){
System.out.println("This is Rectangle");
}
}
class squareofrec extends rectangle{
void print(){
System.out.println("Square is Rectangle");
}
 public static void main( String[] args ){
 shape ref=new shape();
 ref.print();
 circle obj = new circle();
 obj.print();
 rectangle obj1=new rectangle();
 obj1.print();
 }
}