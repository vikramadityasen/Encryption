package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import dao.RegDao;

import model.RegForm;
import util.Jdbcutil;


public class Loginservlet extends HttpServlet
{
	String uname;
	String pass;
	@Override
	/*public void init(ServletConfig config) throws ServletException
	{
	 uname=config.getInitParameter("vikram");
	 pass=config.getInitParameter("aditya");
	System.out.println(uname);
	System.out.println(pass);
	}
	*/
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

	/*String uname=request.getParameter("name");
	String pass=request.getParameter("pass");
	*/
	
		ServletContext context=getServletContext();
		uname=context.getInitParameter("vikram");
		pass=context.getInitParameter("aditya");
		
		System.out.println(uname);
		System.out.println(pass);
		
		
	ResultSet rf;
	RegForm r=new RegForm();
	r.setName(request.getParameter("name"));
	r.setPass(request.getParameter("pass"));
	RegDao rd=new RegDao();
	
	rf=rd.login(r,uname,pass);
	try {
		if(rf.next())
		{
			RequestDispatcher rd1=request.getRequestDispatcher("success.jsp");
			rd1.forward(request, response);
		}
		else
		{
			RequestDispatcher rd1=request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "incorrect username and password");
			rd1.forward(request, response);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
