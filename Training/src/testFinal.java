 class newBase{
	final int i=5;
	final void mul(){System.out.println("The result is "+i*5);}
}
public class testFinal extends newBase{
	void mul(int x){System.out.println("The result is "+x*6);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testFinal t=new testFinal();
		t.mul();
		t.mul(5);

	}

}

