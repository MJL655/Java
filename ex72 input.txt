package practice;

//import java.util.ArrayList;  
import java.util.Scanner;
//import java.util.List; 

public class input {
	public static void main(String[] args){
	//	String[] str2=new String[10];
		String str="";
		String str1="";
		Scanner input = new Scanner(System.in);
		int i = 0,x=0;
		while(!str1.equals("end")){
			str1=input.nextLine();
			//str2[i]=str1;
	        str = str+""+str1;
			//i++;
		}
		//for(int k=0;k<i-1;k++)
			//System.out.print(str2[k]);
		char c[];
		c=str.toCharArray();
		for(int k=0;k<str.length()-3;k++)
		{
			if(c[k]>='A'&&c[k]<='z')
				i++;
		}
		System.out.println(i);
		for(int k=0;k<str.length()-2-2*x;k++)
		{
			if(c[k]=='t'&&c[k+1]=='h'&&c[k+2]=='e')
			{  
				x++;
				c[k]='a';
				for(int j=k+1;j<str.length()-3-2*(x-1);j++)
					c[j]=c[j+1];
				for(int j=k+1;j<str.length()-3-2*(x-1);j++)
					c[j]=c[j+1];
			}
		}
		for(int k=0;k<str.length()-3-2*x;k++)
			System.out.print(c[k]);
		System.out.println();
		for(int k=0;k<str.length()-3-2*x;k++)
		{
			if(c[k]>='1'&&c[k]<='9')
				System.out.print(c[k]);
		}
		/*List<String>str_list=new ArrayList<String>();//´æ´¢ÊäÈëµÄ×Ö·û

		while (!str.equals("end")) {

		str=input.nextLine();

		str_list.add(str);

		}

		for(int i=0;i<str_list.size();i++){

		System.out.println(str_list.get(i));

		}*/
	}

}
