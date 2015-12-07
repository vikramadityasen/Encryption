package util;

import java.sql.Connection;
import java.sql.DriverManager;

import servlet.Loginservlet;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

public class Jdbcutil 
{
	public static Connection getConnection(String uname,String pass)
	{
	Connection con=null;
try{
	
	
	
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro1",uname,pass);

	
	
}catch(Exception e)
{
	e.printStackTrace();
	}
return con;

	}
	
}
