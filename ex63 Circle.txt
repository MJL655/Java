package lihe;

public class Circle {
	Point center;
	double r;
	
	public Circle(Point p , double r)
	{
		center = p;
		this.r=r;
	}
	public double area()
	{
		return Math.PI*r*r;
	}
	public static double area(double r)
	{
		return Math.PI*r*r;
	}
	public static double area(Circle c)
	{
		return Math.PI*c.r*c.r;
	}
	public static void main(String[] args) {
		Point p = new Point(1,2);
		Circle c = new Circle(p,3);
	  System.out.println("面积："+c.area());	
	  System.out.println("面积："+area(4));	
	  System.out.println("面积："+area(c));	

	}

}
