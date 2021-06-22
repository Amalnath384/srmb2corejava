class Room {
    int roomNo;
    String roomType;
    String roomArea;
    String acMachine;

void setData(int rn, String rt, String ra,String ac)
{
roomNo=rn;
roomType=rt;
roomArea=ra;
acMachine=ac;
}
void displayData()
{
System.out.println("Room number : "+ roomNo);
System.out.println("Room type : "+ roomType);
System.out.println("Area of the room : "+roomArea);
System.out.println("AC:"+acMachine);

}
public static void main(String[] args)
{
Room obj= new Room();
obj.setData(05, "suit","600sq.ft","yes");
obj.displayData();
}
}