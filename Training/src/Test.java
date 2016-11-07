
class E implements Runnable{ 
   public void run(){ 
	System.out.println("run-A"); 
  } 
} 

 public class Test { 
 	public static void main(String argv[]){ 
 		E a = new E(); 
	 	Thread t = new Thread(a); 
 		System.out.println(t.isAlive()); 
 		t.start();
 		System.out.println(t.isAlive()); 
 	} 
}