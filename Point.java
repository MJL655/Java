package lihe;

public class Point {
	private int x,y;
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public Point()
	{
		this(0,0);
	}
	public String toString(){
		String s = "µã: "+x+","+y;
		return s;
	}
	public double distance(Point p)
	{
		double dis = Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
		return dis;
	}
    public double distance(int x , int y)
    {
    	double dis = Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
		return dis;
    }
    public static double distance(Point x , Point y)
    {
    	double dis = Math.sqrt((x.x-y.x)*(x.x-y.x)+(x.y-y.y)*(x.y-y.y));
		return dis;
    }
    public static void main(String[] args){
    	Point a = new Point(3,3);
    	Point b = new Point(4,4);
    	System.out.println(a.distance(b));
    	
    }
}
