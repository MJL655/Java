package mjl;

import java.util.Scanner;

public class date {
	int year=2000;
	int month=1;
	int day;
	int dayy[]= {30,28,31,30,31,30,31,31,30,31,30,31};
	public void xiugai() {
		while(true) {
		if(month>12||month<1)
		{
			System.out.println("date error!\nplease input again");
			
		}
		Scanner input1= new Scanner(System.in);
			year=input1.nextInt();
			month=input1.nextInt();
		if(month<=12&&month>=1)
			break;
		}
	}
	public date(int y,int m)
	{
		year=y;
		month=m;
	}
	public date()
	{
		Scanner input= new Scanner(System.in);
		year=input.nextInt();
		month=input.nextInt();
	}
	public void print() {
		day=dayy[month-1];
		System.out.println(year+"/"+month+"/"+day);
	}
	public static void main(String[] args) {
		date d1=new date();
		date d2=new date(2001,12);
		if(d1.year%400==0||(d1.year%4==0&&d1.year%100!=0))
			d1.day=29;
		d1.xiugai();
		d1.print();
	}

}
