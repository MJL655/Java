package MJL;

import java.util.Scanner;

public class myinput {

	public static long fac(int n) {
		long res = 1;
		for(int i=2;i<=n;i++)
			res=res*i;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int k=0;
		 String str="";
		 try{ 
			 Scanner input = new Scanner(System.in);
			 str=input.next();	
			 if(str.startsWith("0x")||str.startsWith("0X")) {
				 k=Integer.parseInt(str.substring(2,str.length()),16);
		 	}
			 
			 else{
				 k = Integer.parseInt(str);  
			}
			 
			System.out.println(fac(k));
	        
	        }catch(NumberFormatException ex){  
	            System.out.println("ÇëÊäÈëÕûÊý");  
	            ex.printStackTrace(); 
	        } 
	}

}
