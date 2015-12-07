package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

import util.Jdbcutil;

import model.RegForm;

public class RegDao 
{
	public void save(RegForm regform,String uname,String ps)
	{
	try{	
	Connection con1=Jdbcutil.getConnection(uname,ps);
	String sql="insert into register(name,pass,contact,edu,add1,dob,nation,gender,cat) values('"+regform.getName()+"','"+regform.getPass()+"','"+regform.getContact()+"','"+regform.getEdu()+"','"+regform.getAdd()+"','"+regform.getDob()+"','"+regform.getNation()+"','"+regform.getGender()+"','"+regform.getCat()+"')";
	System.out.println(sql);
	
	Statement stmt=con1.createStatement();

	stmt.executeUpdate(sql);
	System.out.println(sql);
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	public ResultSet login(RegForm regform, String uname , String pass)
	{
		ResultSet rs=null;
		try{
			Connection con=Jdbcutil.getConnection(uname, pass);
			System.out.println(regform.getName());
			String sql="select * from register where name='"+regform.getName()+"' and pass='"+Cryption.decrypt(regform.getPass())+"'";  
			System.out.println(sql);
			
			Statement smt=con.createStatement();
			
			rs=smt.executeQuery(sql);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		return rs;
				
	}
	
}
