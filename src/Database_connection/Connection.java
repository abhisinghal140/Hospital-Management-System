package Database_connection;

import java.sql.DriverManager;

public class Connection {
    static Connection con;
	public static Connection createC() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
            con= (Connection) DriverManager.getConnection(url);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return con;
    }
}
