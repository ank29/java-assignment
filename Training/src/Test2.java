class Person {
public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getMyAge() {
		return myAge;
	}
	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}
	public String getMyGender() {
		return myGender;
	}
	public void setMyGender(String myGender) {
		this.myGender = myGender;
	}
protected String myName ;
protected int myAge ;
protected String myGender ;
public Person(String name,int age, String gender){
myName = name;
myAge = age ;
myGender = gender;
}
public String toString(){return myName+ ". age:" + myAge +". gender:" + myGender;}
}
class Student1 extends Person 
{
public String getMyIdNum() {
		return myIdNum;
	}
	public void setMyIdNum(String myIdNum) {
		this.myIdNum = myIdNum;
	}
	public double getMyGpa() {
		return myGpa;
	}
	public void setMyGpa(double myGpa) {
		this.myGpa = myGpa;
	}
protected String myIdNum;
protected double myGpa;
public Student1 (String name,int age,String gender,String IdNum,double gpa) {
	super(name,age,gender);
	myIdNum=IdNum;
	myGpa=gpa;

}
public String toString(){return super.toString()+" ID:"+ myIdNum +" GPA:"+myGpa;}
}
class Teacher extends Person{
	public double getMySalary() {
		return mySalary;
	}
	public void setMySalary(double mySalary) {
		this.mySalary = mySalary;
	}
	public String getMySubject() {
		return mySubject;
	}
	public void setMySubject(String mySubject) {
		this.mySubject = mySubject;
	}
	protected double mySalary;
	protected String mySubject;
	public Teacher(String name,int age, String gender,double salary,String subject){
		super(name,age,gender);
		mySalary=salary;
		mySubject=subject;
	}
	public String toString(){return super.toString()+". Salary: "+mySalary+".Subject:"+mySubject;}
	}
class CollegeStudent extends Student1{
	public String getMyYear() {
		return myYear;
	}
	public void setMyYear(String myYear) {
		this.myYear = myYear;
	}
	public String getMyMajor() {
		return myMajor;
	}
	public void setMyMajor(String myMajor) {
		this.myMajor = myMajor;
	}
	protected String myYear;
	protected String myMajor;
	public CollegeStudent (String name,int age,String gender,String IdNum,double gpa,String year,String major) {
		super(name,age,gender,IdNum,gpa);
		myYear=year;
		myMajor=major;
	}
	public String toString(){return super.toString()+"Year: "+myYear+" Major: "+myMajor;}
}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bob =new Person("Coach bob",27,"M");
		System.out.println(bob);
		
		
	}

}
