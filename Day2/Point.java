 class Point {
	private int x;
	private int y;
	Point(){
		System.out.println("Hello");
	}
	 Point(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println(x+" "+y);
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
	public void distance(Point p1,Point p2){
		new Point();
		new Point();
		p1.x=30;
		p2.x=40;
		System.out.println(p1.x+" "+p2.x);
		
	}
	
	public static void main(String[] args) {
		Point ref=new Point(2,5);
		Point obj=new Point();
		Point obj1=new Point();
		
		ref.setX(1);
		ref.setY(2);
		ref.setXY(3, 4);
		ref.distance(obj, obj1);
			
		
	}

}