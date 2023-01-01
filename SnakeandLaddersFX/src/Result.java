import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Result {
	private String url;
	private String uname;
	private String pass;
	private Connection con;
	private static String query;
	private Statement stmt;
	
	public Result() {
		url = "jdbc:mysql://localhost:3306/snakenladders";
		uname = "root";
		pass = "Malik 123";
		this.setConnection();
	}

	private void setConnection() {
		try {
			con = DriverManager.getConnection(url, uname, pass);
			stmt = con.createStatement();
			
		}catch(SQLException ex){
			System.err.print(ex.getMessage());
			System.exit(1);
		}
		
	}

	/*public static void savetoDB(boolean b) {
		try {
			query = "INSERT INTO snakenladder VALUES ('%s', '%s', '%s')";
			
		
	}*/

}
