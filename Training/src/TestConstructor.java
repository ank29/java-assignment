import java.util.Scanner;
public class TestConstructor {
	TestConstructor(int p){
		int j=5;
		int k=j*p;
		System.out.println("Its a parameterized constructor");
		System.out.println(k);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		TestConstructor t=new TestConstructor(x);
        sc.close();
	}

}
