package mjl;

import java.util.Scanner;

public class ex41 {
	public static void  main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int n=input1.nextInt();
		int m[]=new int[n];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			
			m[i]=s.nextInt();
		}
		int bujige=0,jige=0,zhong=0,liang=0,you=0;
		int k=0,sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=m[i];
			if(m[k]<m[i])
				k=i;
			
			if(m[i]<60)
				bujige++;
			else if(m[i]<69)
				jige++;
			else if(m[i]<79)
				zhong++;
			else if(m[i]<89)
				liang++;
			else
				you++;	
		}
		System.out.println("��߷֣�"+m[k]);
		System.out.println("ƽ���֣�"+sum/n);
		System.out.println("������"+bujige+"   ����"+jige+"   �У�"+zhong+"   ����"+liang+"   �ţ�"+you);
 
		
	}

}
