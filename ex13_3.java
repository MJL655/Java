package MJL;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class ex13_3 {
	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			String filename = input.next();
			FileReader file = new FileReader(filename);
			LineNumberReader in = new LineNumberReader(file);
			boolean eof = false;
			while(!eof){
				String x=in.readLine();
				if(x==null)
					eof = true;
				else
					System.out.println(in.getLineNumber()+": "+x);
			}
			in.close();
		}catch(IOException e){};
	}
}
