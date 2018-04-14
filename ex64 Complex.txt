package lihe;

public class Complex {
	private double x,y;
	public Complex(double real,double imag)
	{
		x=real;
		y=imag;
	}
	public Complex mul(double x,double y)
	{
		return new Complex(x*this.x-y*this.y,this.x*y+this.y*x);
	}
	public static Complex mul(Complex a,Complex b)
	{
		return new Complex(a.x*b.x-a.y*b.y,a.x*b.y+a.y*b.x);
	}
	public Complex mul(Complex a)
	{
		return new Complex(x*a.x-y*a.y,x*a.y+y*a.x);
	}
	public String toString()
	{
		return "("+x+","+y+"i"+")";
	}
	public double qumo()
	{
		return Math.sqrt(x*x+y*y);
	}
	
	
	//加法：
	//加法：
	//加法：
	
	
	public static void main(String[] args)
	{
		Complex a = new Complex(1,2);
		Complex b = new Complex(3,4);
		Complex z= a.mul(3,4);
		System.out.println("mul:result1="+z);
		z = mul(a,b);
		System.out.println("mul:result2="+z);
		z = a.mul(b);
		System.out.println("mul:result3="+z);
	}
}

