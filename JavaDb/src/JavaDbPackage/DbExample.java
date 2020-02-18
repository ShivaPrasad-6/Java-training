package JavaDbPackage;
import java.sql.*;
public class DbExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			
			PreparedStatement ps=con.prepareStatement("insert into jobs values(?,?,?,?)");
			ps.setString(1, "Shiva");
			ps.setString(2, "Human Resources" );
			ps.setInt(3, 6666);
			ps.setInt(4, 19000);
			int j=ps.executeUpdate();
			System.out.println("record inserted");
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery("select * from jobs");
			while(r.next()) {
				System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getInt(3)+" "+r.getInt(4));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
