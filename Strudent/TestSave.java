import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSave {
   public static void main(String[] args) {
	   
	   String url="jdbc:mysql://localhost:3306/javabatch";
	   String username="root";
	   String password="root";
//	   String sql="DELETE FROM student WHERE ID=6";  //for deleting data records
	   String sql="INSERT INTO student VALUES(6,'HAMZA','hamza.hk733@gmail.com')";
	   Connection connection = null;
	  
	   
	   //STEP 1: Load/Register the driver
	   
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   //2:Establish Connection
		    
		   connection= DriverManager.getConnection(url, username, password);
		   //3:Establish statement
		   Statement statement=connection.createStatement();
		   //4.Execute the statement
		   //statemet.execute("INSERT INTO student VALUE(1,"HAMZA","HAMZA@GAMAIL");
		   statement.execute(sql);
		   //5.Close Connection
		  
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
