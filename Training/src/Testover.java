class Newclass{
	protected void dis(int x){System.out.println("This is base class");}
}
public class Testover extends Newclass {
	public void dis(){System.out.println("This is new class");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testover t=new Testover();
		t.dis();
		t.dis(5);

	}

}
