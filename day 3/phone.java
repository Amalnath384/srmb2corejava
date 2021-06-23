abstract class Telephone {
	abstract void lift();
    abstract void disconnected();
}
class SmartTelephones extends Telephone{
    void lift(){
        System.out.println("Lift");}
    void disconnected(){
        System.out.println("Disconnected");
    }
    }
class phone {
	public static void main(String[] args) {
		SmartTelephones obj = new SmartTelephones();
        obj.lift();
        obj.disconnected();
    }

}