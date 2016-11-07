import java.util.Scanner;
public class Fib  {
	public int fib(int i){
		int result;
	    result = i+fib(i-1);
		return result;
					
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Factorial f=new Factorial();
		System.out.println(f.fact(x));
        sc.close();
	}

}



