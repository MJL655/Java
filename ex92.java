package MJL;

import java.util.Scanner;

class MyException extends Exception{
	public String toString() {
		return "非十六进制字符";
	}
}
public class ex92 {
	static int change(char c) throws MyException{
		switch(c) {
			case '0':case '1':case '2':case'3':case '4':
			case '5':case '6':case '7':case '8':
			case '9':return c-'0';
			case 'a':
			case 'A':return 10;
			case 'b':
			case 'B':return 11;
			case 'c':
			case 'C':return 12;
			case 'd':
			case 'D':return 13;
			case 'e':
			case 'E':return 14;
			case 'f':
			case 'F':return 15;
			default: throw new MyException();
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str;
       long sum=0;
       str=args[0];
       for(int i=0;i<str.length();i++)
       {
    	   try {
    		   int m=change(str.charAt(i));
    		   sum=m+sum*16;
    	   }catch(MyException e) {System.out.print("不是十六进制数");return;}
    	   
       }
       System.out.println(sum);
       
	}

}
