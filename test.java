package eight;

interface Dispaly{
	void dispaly();
}
class inform implements Dispaly{
	public void dispaly(){
		System.out.println("֪ͨ����");
	}
}
class car implements Dispaly{
	public void dispaly(){
		System.out.println("��������");
	}
}
class ad implements Dispaly{
	public void dispaly(){
		System.out.println("�����Ϣ");
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
