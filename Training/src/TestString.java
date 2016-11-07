
public class TestString {

	public static void main(String[] args) {
		String a="Hello";
		String b="Hello";
		String c=new String("Hello");
		if(a==b)
			System.out.println("x");
		if(a.equals(c))
			System.out.println("y");
		if(a==c)
			System.out.println("z");
	

	}

}
