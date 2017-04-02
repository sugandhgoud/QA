package dbpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class MySql {
		@Test
		public void testdb() throws ClassNotFoundException, SQLException{
			
			// Separate class in java with method forName
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//Load the driver
			System.out.println("Driver loaded");
			
			//Give Separate class DriverManager and connection string
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","****");
			
			System.out.println("Connected to Mysql Db");
			
		}
	

	}

