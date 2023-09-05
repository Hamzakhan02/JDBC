import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestGetAll{
   public static void main(String[] args) {
	   
	   String url="jdbc:mysql://localhost:3306/javabatch";
	   String username="root";
	   String password="root";
//	   String sql="DELETE FROM student WHERE ID=6";  //for deleting data records
	   String sql="SELECT * FROM student ";  //PUT WHERE ID=2 FOR PARTICULAR RECORD
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
//		   int a = statement.executeUpdate("UPDATE student SET name='abc',email='abc@gmail.com' WHERE Id=1");
		   
		   ResultSet resultSet= statement.executeQuery(sql);
		   while(resultSet.next()){
			   System.out.println(resultSet.getInt(1));
			   System.out.println(resultSet.getString(2));
			   System.out.println(resultSet.getString(3));
			   System.out.println("================================");
		   }
		   
		   
		   
//		   if (a>0) {
//			   System.out.println("UPDATED");
//		   }else {
//			   System.out.println("Not updated");
//		   }
//		   statement.executeUpdate(sql,1);
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

