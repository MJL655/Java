package MJL;

import java.util.Scanner;
class MyException1 extends Exception{
	public String toString(){
		return "日期格式不对";
	}
}
public class ex93 {
	/*static void change(int[] x)throws MyException1{
		if(x[0]<=0)
			throw new MyException1();
		if(x[1]<=0)
	}*/
	public static void main(String[] args){
		try{
			int x[]=new int [3];
			Scanner input = new Scanner(System.in);
			String str=input.next();
			String[] s=str.split("/");
			for(int i=0;i<3;i++)
				x[i] = Integer.parseInt(s[i]);
			System.out.println(x[0]+"-"+x[1]+"-"+x[2]);
		}catch(NumberFormatException e){System.out.println("日期格式不对");return;}
	}
}
