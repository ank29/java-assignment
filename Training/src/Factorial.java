import java.util.Scanner;
public class Factorial {
	public int fact(int i){
		int result;
		if(i==0)
			return 1;
		else 
			result=i*fact(i-1);
		return result;
					
	}
	public void pattern(int y){
		for(int i=1;i<=y;i++){
			for(int j=1;j<=i;j++)
			System.out.print("*");
		System.out.println();}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Factorial f=new Factorial();
		System.out.println(f.fact(x));
		f.pattern(x);
		sc.close();

	}

}
