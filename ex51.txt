package mjl;

public class triangle {

	double a,b,c;
	public triangle(double aa,double bb,double cc)
	{
		a=aa;b=bb;c=cc;
	}
    public double area(){
    	double p=(a+b+c)/2.0;
    	return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    	}
    public double perimter(){return a+b+c;};
	public static void main(String[] args) {
		triangle t1=new triangle(3,4,5);
		triangle t2=new triangle(7,8,9);
		System.out.println("t1 area is:"+t1.area());
		System.out.println("t1 perimter is:"+t1.perimter());
		System.out.println("t2 area is:"+t2.area());
		System.out.println("t2 perimter is:"+t2.perimter());
		// TODO Auto-generated method stub

	}

}
