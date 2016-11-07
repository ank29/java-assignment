abstract class Speed{
	abstract void speed();
}
public class TestAbstract extends Speed {
	public void speed(){
		System.out.println("The speed is 60km/h");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAbstract t=new TestAbstract();
		t.speed();

	}

}
