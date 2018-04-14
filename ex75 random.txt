package practice;

public class random {
	public static void main(String[] args) {
		int a;
		int[] m= new int[20];
		String str="";
		String str1="";
		a=(10+(int)(Math.random()*80));
		str=String.valueOf(a);
		m[0]=a;
		for(int i=1;i<20;i++)
		{
			int p=0;
			a=10+(int)(Math.random()*80);
			str1=String.valueOf(a);
			for(int k=0;k<i;k++)
			{
				int b=str.indexOf(str1);
				if(b>=0&&b<=i*3) {
					p=1;
					i--;
					break;
				}
				
			}
			if(p==0) {
				str=str+","+str1;
				m[i]=a;
				
			}
		}
		System.out.println(str);
		int temp=0;
		
		String[] s=str.split(",");
		for(int i=0;i<20;i++) {
			for(int j=0;j<20-1;j++) {
				if(m[j]>m[j+1])
				{
					temp=m[j];
					m[j]=m[j+1];
					m[j+1]=temp;
				}
			}
		}
		for(int i=0;i<20;i++) {
			System.out.print(m[i]+" ");
		}
	}
}
