import java.sql.*;
import javax.sql.*;

public class DBConnection {
	 public static void main(String[] args) {
		 
	        Connection conn = null;
	 
	        try {
	 
	            String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=CS442";//user=sa;Password=secret";
	          String user = "sa";
	          String pass = "secret";
	            conn = DriverManager.getConnection(dbURL, user, pass);
	            if (conn != null) {
	                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
	                System.out.println("Driver name: " + dm.getDriverName());
	                System.out.println("Driver version: " + dm.getDriverVersion());
	                System.out.println("Product name: " + dm.getDatabaseProductName());
	                System.out.println("Product version: " + dm.getDatabaseProductVersion());
	            }
	 
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        } finally {
	            try {
	                if (conn != null && !conn.isClosed()) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
}
