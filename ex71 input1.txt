import java.util.Scanner;

public class input1 {
	public static void main(String[] args){
		String str="";
		String str1="";
		  	Scanner input = new Scanner(System.in);
		int i=0;
	    /*do{
	    	str[i]=input.next();
	    	i++;
	    }while(str[i-1]!="end");*/
		while(!str[i].equals("end")){
			str=input.nextLine();
			
		}
		for(int k=0;k<i;k++)
			System.out.println(str[k]+" ");
	}

}