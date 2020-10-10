package com.bookmyshow.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class DbUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\prasa-bolisettykana2\\eclipse-workspace\\ServletExample7\\connection.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        Properties p=new Properties (); 
        p.load (fis); 
        String dname= (String) p.get ("Dname"); 
        String url= (String) p.get ("URL"); 
        String username= (String) p.get ("Uname"); 
        String password= (String) p.get ("password"); 
		Class.forName(dname);
		Connection con = DriverManager.getConnection(url, username,password);
		return con;
		
	}
}
