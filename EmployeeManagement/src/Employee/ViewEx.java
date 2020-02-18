package Employee;
import java.sql.Date;
import java.sql.*;


/**
 * A Java MySQL PreparedStatement INSERT example.
 * Demonstrates the use of a SQL INSERT statement against a
 * MySQL database, called from a Java program, using a
 * Java PreparedStatement.
 * 
 * Created by Alvin Alexander, http://alvinalexander.com
 */
public class ViewEx
{

  public static void main(String[] args)
  {
    try
    {
      // create a mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/bsp";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
    
      // create a sql date object so we can use it in our INSERT statement
    //  Calendar calendar = Calendar.getInstance();
      //java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

      // the mysql insert statement
      String query = " insert into employees (id ,name ,profile,location,salary,address,dob)"
        + " values (?, ?, ?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setInt (1, 7);
      preparedStmt.setString (2, "Sunny");
      preparedStmt.setString  (3, "Trainer");
      preparedStmt.setString(4, "chennai");
      preparedStmt.setInt(5,32154);
      preparedStmt.setString(6, "Siddipet");
     //preparedStmt.setDate (7,2017/05/29);
      // execute the preparedstatement
      preparedStmt.execute();
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
}