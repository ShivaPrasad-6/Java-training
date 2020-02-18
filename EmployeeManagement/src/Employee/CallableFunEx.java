package Employee;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
public class CallableFunEx {
   public static void main(String args[]) throws SQLException {
      //Registering the Driver
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost:3306/bsp";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "root");
      System.out.println("Connection established......");
      //Preparing a CallableStatement
      CallableStatement cstmt = con.prepareCall("{? = call getDob1()}");
      cstmt.registerOutParameter(1, Types.DATE);
      cstmt.setString(2,"Shiva");
    cstmt.execute();
    System.out.print("Date of birth: "+cstmt.getDate(1));
   }
}
