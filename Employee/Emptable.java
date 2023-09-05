import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Emptable {
   public static void main(String[] args) {
	   
	   String url="jdbc:mysql://localhost:3306/javabatch";
	   String username="root";
	   String password="root";
	   String sql="INSERT INTO employee VALUES(4,'dani alves','jordi.hk733@gmail.com')";
	  
	   
	   //STEP 1: Load/Register the driver
	   
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   //2:Establish Connection
		   
		   Connection connection= DriverManager.getConnection(url, username, password);
		   //3:Establish statement
		   Statement statement=connection.createStatement();
		   //4.Execute the statement
		   statement.execute(sql);
		   //5.Close Connection
		   connection.close();
		   System.out.println("All good");
	   } catch (ClassNotFoundException e) {
		   //TODO Auto-Generated catch block
		   e.printStackTrace();
	   } catch(SQLException e) {
		   //TODO Auto-generated catch block
		   e.printStackTrace();
	   }
	   
}
 
}
