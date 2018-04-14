package mjl;

public class student {

	int no;
	String name;
	int age;
	public student(int nn,String na,int ag)
	{
		no=nn;
		name=na;
		age=ag;
	}
	public void print(){System.out.println(no+" "+name+" "+age);}
	public void addage(){age++;}
	public static void main(String[] args) {
		student x[]=new student[3];
		student x1=new student(01,"Li",20);
		student x2=new student(02,"Meng",19);
		student x3=new student(03,"Wang",21);
		x[0]=x1;
		x[1]=x2;
		x[2]=x3;
		System.out.println("before addage:");
		for(int i=0;i<3;i++)
			x[i].print();
		for(int i=0;i<3;i++)
			x[i].addage();
		System.out.println("after addage:");
		for(int i=0;i<3;i++)
			x[i].print();
		for(int i=0;i<3;i++)
			if(x[i].age>20)
				System.out.println(x[i].name);
	}
}
