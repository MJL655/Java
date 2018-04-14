package eight;

interface Shape{
	double size();
}

class rectangle{
	int a;
	int b;
	public rectangle(int a,int b){
		this.a=a;
		this.b=b;
	}
	public double size(){
		return a*b;
	}
}
class circle{
	int a;
	public circle(int a){
		this.a=a;
	}
	public double size(){
		return a*Math.PI*a;
	}
}
class cylinder{
	int a;
	int h;
	public cylinder(int a,int h){
		this.a=a;
		this.h=h;
	}
	public double size(){
		return a*Math.PI*a*h;
	}
}
public class ex2 {
	public static void main(String[] args) {
		rectangle a=new rectangle(1,2);
		circle b=new circle(3);
		cylinder c=new cylinder(3,6);
		System.out.println(a.size());
		System.out.println(b.size());
		System.out.println(c.size());

	}

}
