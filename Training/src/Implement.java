interface Animal{
	void eat();
	void walk();
}
class Camel implements Animal{
	public void eat(){
		System.out.println("It eats grass");
	}
	public void walk(){
		System.out.println("It walks on sand");
	}
}
class Dog implements Animal{
	public void eat(){
		System.out.println("It eats mutton");
	}
	public void walk(){
		System.out.println("It walks on land");
	}
}
class Bird implements Animal{
	public void eat(){
		System.out.println("It eats worms");
	}
	public void walk(){
		System.out.println("It fly");
	}
}
public class Implement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Animal a=new Camel();
		Animal b=new Bird();
		Animal c=new Dog();
		a.eat();
		b.eat();
		c.eat();
		a.walk();
		b.walk();
		c.walk();

	}

}
