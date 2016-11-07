class Base{
	Base(){System.out.println("this is main");}
	Base(int x){System.out.println(x*5);}
}
public class TestPara extends Base{
      TestPara(){System.out.println("This is extended");}
      TestPara(int p){
    	 super(p);
    	  System.out.println(p*6);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TestPara t1=new TestPara();
    TestPara t2=new TestPara(5);
	}

}
