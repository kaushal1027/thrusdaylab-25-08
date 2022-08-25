package thrusdaylabtest;

public class Circle {
	private static int count;  
	float center,radius;
	public Circle(float center,float radius) {
		this.center=center;
		this.radius=radius;
		count++;
	}
	Circle(float center, int radius){
		this.center=center;
		this.radius=radius;
		count++;
	}
	Circle(int center, int radius){
		this.center=center;
		this.radius=radius;
		count++;
	}
	void display() {
	System.out.println("Center: "+center+" "+"Radius: "+radius);
}
	public static void main(String[] args) {
		Circle c1=new Circle(15.3f,34.2f);
		Circle c2=new Circle(17.4f,21.6f);
		Circle c3 = new Circle(13.6f,16);
		Circle c4 = new Circle(24,19);
		c1.display();
		c2.display();
		c3.display();
		c4.display();
		System.out.print("The Total Number of Instance: " + Circle.count); 
		
	}

}