import java.util.Scanner;
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][2];
		System.out.println("enter the numbers");
		for (int i=0;i<5;i++){
			for(int j=0;j<2;j++)
			a[i][j]=sc.nextInt();
			
		}
		System.out.println("The array is");
		for (int i=4;i>=0;i--){
			for(int j=1;j>=0;j--)
			System.out.print(a[i][j] +" ");
			System.out.println();}
		sc.close();	
		}

	}


