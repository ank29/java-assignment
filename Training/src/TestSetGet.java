class student{
	private String name;
	private int age;
	private String department;
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setDept(String department){
		this.department=department;
	}
	public void getName(){
		System.out.println("The name is  "+this.name);}
	public void getAge(){
		System.out.println("The age is "+this.age);
	}
	public void getDept(){
		System.out.println("the dept is "+this.department);
	}
}
public class TestSetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student t=new student();
		t.setName("Ankita");
		t.setAge(20);
		t.setDept("IT");
		t.getName();
		t.getAge();
		t.getDept();
	}


	}


