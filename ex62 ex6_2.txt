package lihe;

class Person {
	String name;
	String sex;
	int age;
	public Person(String na,String se,int ag)
	{
		name=na;
		sex=se;
		age=ag;
	}
}
class Teacher extends Person{
	String place;
	String bumen;
	public Teacher(String na,String se,int ag,String pla,String bu)
	{
		super(na,se,ag);
		place=pla;
		bumen=bu;
	}
	public String toString()
	{
		String s = "Teacher: "+"姓名："+name+" "+"性别："+sex+" "+" 年龄："+age+" "+"职位："+place+" "+"部门："+bumen;
		return s;
	}
}
class Student1 extends Person{
	int id;
	int year,month,day;
	String major;
	
	public Student1(String na,String se,int ag,int idd,int ye,int mon,int da,String maj)
	{
		super(na,se,ag);
		id=idd;
		year=ye;
		month=mon;
		day=da;
		major=maj;
	}
	public String toString()
	{
		String s = "Student: "+"姓名："+name+" "+"性别："+sex+" "+" 年龄："+age+" "+"学号："+id+" "+"入学时间："+year+"年"+month+"月"+day+"日  "+"专业："+major;
		return s;
	}
}
public class ex6_2{
	 public static void main(String[] args)
	    {
	    	Teacher a = new Teacher("li","man",30,"professor","com");
	    	Student1 b = new Student1("meng","female",20,01,2016,8,29,"computer");
	    	System.out.println(a);
	    	System.out.println(b);
	    }
}

