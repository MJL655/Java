public class ex7_11 {
	public static void main(String[] args){
		String s=args[0];
		int len=s.length();
		char c[];
		c=s.toCharArray();
		int k=0;
		for(int i=0;i<len;i++)
			if(c[i] =='a')
				k++;
		System.out.println(k);
	}
}
