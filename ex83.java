package practice;

abstract class fruit{
	abstract float getWeight();
}
class apple extends fruit{
	float weight;
	apple(float w){
		weight=w;
	}
    float getWeight() {return weight;}
}
class peach extends fruit{
	float weight;
	peach(float w){
		weight=w;
	}
    float getWeight() {return weight;}
}
class orange extends fruit{
	float weight;
	orange(float w){
		weight=w;}
    float getWeight() {return weight;}
}
public class ex83 {
	public static void main(String[] args) {
		fruit a[]=new fruit[3];
		a[0]=new apple(10);
		a[1]=new apple(20);
		a[2]=new apple(30);
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i].getWeight());
			System.out.println(a[i].getClass().getName());
		}
	}
}
