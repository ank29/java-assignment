import java.io.*;
public class TestInput {
	public static void main(String[] args) {
		try{  
			FileOutputStream f=new FileOutputStream("abc.txt");
			String s="Hey I am writing in this file";
			byte b[]=s.getBytes();
			f.write(b);
			f.close();
			System.out.println("Success....");
			
		}catch(Exception e){System.out.println(e);}
		

	}

}
