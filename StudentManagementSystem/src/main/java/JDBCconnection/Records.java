package JDBCconnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Records {
	
	public void getRecord() throws ClassNotFoundException, SQLException {
		DBConnection db = new DBConnection();
		db.getConnection();
		
		String query = "select * from student";
		
		PreparedStatement ps = db.con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		System.out.printf("%-30s %-30s%n", "NAME", "PASSWORD");
		
		while(rs.next()) {
			System.out.printf("%-30s %-30s%n",
					rs.getString("name"), 
					rs.getString("password")
			);
		}
				
	}
	
	public boolean checkLogin(String name, String password) throws ClassNotFoundException, SQLException {
		DBConnection db = new DBConnection();
		db.getConnection();
		
		String query = "select * from student where name = ? and password = ?";
		
		PreparedStatement ps = db.con.prepareStatement(query);
		
		ps.setString(1, name);
        ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
        try {
            Records r = new Records();
            r.getRecord();
           boolean result = r.checkLogin("Shujatullah", "Shujju246@#");
           System.out.println(result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
