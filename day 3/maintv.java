interface TVremote{
public void ONOFF();
}
interface SmartTvRemote extends TVremote
{

 public void apps();

}

class Tv implements SmartTvRemote
{
public void ONOFF(){
System.out.println("TV:on");
 }
 public void apps(){
 System.out.println("Netflix");
 }
 }
 class maintv{

	 public static void main( String[] args ){
	 Tv ref = new Tv();
	 ref.ONOFF();
	 ref.apps(); 
	
	 }
}