package MJL;

public class English {
	public static void main(String[] args){
		char c[]={'J','a','v','a',' ','i','s',' ','a','n',' ','O','b','j','e','c','t',' ','O','r','i','e','n','t','e','d',' ','p','r','o','g','r','a','m','m','i','n','g',' ','l','a','n','g','u','a','g','e'};
		String str="Java is an Object Oriented programming language";
		String[] s1=str.split(" ");
		float sum=0;
		for(int i=0;i<s1.length;i++){
			System.out.println(s1[i]);
		}
		for(int i=0;i<s1.length;i++){
			sum=sum+s1[i].length();
		}
		sum=sum/s1.length;
		System.out.println(sum);
		String s = String.valueOf(c);//将char[]转化为String类型
		System.out.println(s);
	}

}
