import java.io.FileInputStream;
import java.io.FileOutputStream;
public class TestOutput {
	public static void main(String[] args) {
		try{  
			FileInputStream g=new FileInputStream("abc.txt");
			int i=0;
			while((i=g.read())!=-1){
				System.out.println((char)i);
			}
			g.close();
		}catch(Exception e){System.out.println(e);}
		

	}

}