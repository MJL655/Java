package eight;

interface Dispaly{
	void dispaly();
}
class inform implements Dispaly{
	public void dispaly(){
		System.out.println("通知内容");
	}
}
class car implements Dispaly{
	public void dispaly(){
		System.out.println("汽车油量");
	}
}
class ad implements Dispaly{
	public void dispaly(){
		System.out.println("广告消息");
	}
}
public class test {
	public static void main(String[] args){
		inform a=new inform();
		car b=new car();
		ad c=new ad();
		a.dispaly();
		b.dispaly();
		c.dispaly();
	}
}
