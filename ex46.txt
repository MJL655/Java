package mjl;

public class ex6 {

	public static void main(String[] args) {
		int m[]=new int[100];
		int k=0;
		
		
		for(int j=3;j<=99;j++)
		{
			int l=0;
			for(int i=2;i<=Math.sqrt(j);i++)
			{
				if(j%i==0)
				{
					l=1;
					
				}	
			}
			if(l==0)
			{
				m[k]=j;
			//   System.out.print(m[k]+" ");
			   k++;
			}
		}
		for(int i=0;i<=k;i++)
			if(m[i]==m[i+1]-2)
				System.out.println(m[i]+" "+m[i+1]);
	}
       
	}


