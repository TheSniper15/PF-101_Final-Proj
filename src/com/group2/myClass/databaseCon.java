package com.group2.myClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class databaseCon 
{
	public Connection con;
	public PreparedStatement pst;
	public ResultSet rs;
        public ResultSetMetaData rss;
	
	private final String uName = "root";
	private final String pass = "";
	private final String host = "jdbc:mysql://localhost:3306/library";
	
	public void Connect()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(host, uName, pass);
		} 
		catch (ClassNotFoundException ex) 
		{
			Logger.getLogger(databaseCon.class.getName()).log(Level.SEVERE, null, ex);
		}
		catch (SQLException ex) 
		{
			Logger.getLogger(databaseCon.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
