package MJL;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ex13_4 {
	public static void main(String[] args) {
		String[] str;
		try{
			FileReader file = new FileReader("C:\\1.txt");
			LineNumberReader in = new LineNumberReader(file);
			boolean eof = false;
			while(!eof){
				String x=in.readLine();
				if(x==null)
					eof = true;
				else{
					//System.out.println(in.getLineNumber()+": "+x);
					str=x.split(" ");
					int len=str.length;
					System.out.println("µ¥´Ê¸öÊý£º"+len);
				}
			}
			in.close();
		}catch(IOException e){};
	}
}
