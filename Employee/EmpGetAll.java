import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpGetAll {
   public static void main(String[] args) {
	   
	   String url="jdbc:mysql://localhost:3306/javabatch";
	   String username="root";
	   String password="root";
//	   String sql="DELETE FROM employee  WHERE ID= 3 ";
	   Connection connection=null;
	  
	   
	   //STEP 1: Load/Register the driver
	   
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   //2:Establish Connection
		   
		   connection= DriverManager.getConnection(url, username, password);
		   //3:Establish statement
		   Statement statement=connection.createStatement();
		   //4.Execute the statement
		   ResultSet resultset = statement.executeQuery("SELECT * FROM employee  WHERE ID= 4 ");
		   //5.Close Connection
		  while(resultset.next()) {
			  System.out.println(resultset.getInt(1));
			  System.out.println(resultset.getString(2));
			  System.out.println(resultset.getString(3));
			  System.out.println("==========================");
		  }
		   
	   } catch (ClassNotFoundException e) {
		   //TODO Auto-Generated catch block
		   e.printStackTrace();
	   } catch(SQLException e) {
		   //TODO Auto-generated catch block
		   e.printStackTrace();
	   } finally {
		    try {
				connection.close();
				 System.out.println("All good");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
	   }
	   
}
 
}
