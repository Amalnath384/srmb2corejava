class ControlStatement {
    
     public static void main(String[] args) {
       //if else statement
       int x=2;
       int y=8;
       if(x>y){
           System.out.println("x is bigger");
       }
       else{
           System.out.println("y is bigger");
       }
       if(x>y){
           System.out.println("x is bigger");
       }
       else if(x<y){
           System.out.println("y is bigger");
       }
       else{
           System.out.println("both are equal");
       }
       switch(x){

        case 10:System.out.println(x);
        break;
        case 20:System.out.println(y);
        break;
        default:System.out.println("no number is matching with input label");
        break;

       }
    }
}
