package com.Lister.newpackage;

public class fact{
	public int factor(int i){
		int result;
		if(i==0)
			return 1;
		else 
			result=i*factor(i-1);
		return result;
					
	}
	public void pattern(int y){
		for(int i=1;i<=y;i++){
			for(int j=1;j<=i;j++)
			System.out.print("*");
		System.out.println();}
	}
}
