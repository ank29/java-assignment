import java.sql.*;  
public class TestConnection{  
public static void main(String args[]){  
try{  
 
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
 
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@10.106.20.63/dexter","training5","training5");  
  
  
Statement stmt=con.createStatement();  
  

ResultSet rs=stmt.executeQuery("select emp_name from new_table where emp_id=1");   
while(rs.next())
System.out.println("name "+rs.getString(1));  
  

con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  



