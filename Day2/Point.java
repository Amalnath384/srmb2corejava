 import java.lang.*;
 class Point {
	private int x;
	private int y;
	Point(){
		
	}
	 Point(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setXY(int x,int y){
		this.x=x;
		this.y=y;
	}
	public double distance(Point p2){
	return (Math.sqrt( (x-p2.x)*(x-p2.x)+(y-p2.y)*(y-p2.y)));
	
		
	}
	
	public static void main(String[] args) {
		double a, b, c;
       
		Point ref=new Point(6,6);
		Point obj=new Point();
		Point obj1=new Point();
		ref.setX(6);
		ref.setY(6);
		ref.setXY(6, 6);
		a = ref.distance(obj);
        b = obj.distance(obj1);
        c = ref.distance(obj1);
        System.out.println("Distance between point p1 to p2 is " + a);
        System.out.println("Distance between point p2 to p is "  + b);
        System.out.println("Distance between point p to p1 is "  + c);
        	
		
	}

}