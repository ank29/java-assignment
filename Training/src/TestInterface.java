interface NewInter{
	public void dis();
}
interface NewInter2{
	public void dis();
}
public class TestInterface implements NewInter,NewInter2 {
	public void dis(){System.out.println("The implementation of interface");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface t=new TestInterface();
		t.dis();

	}

}
