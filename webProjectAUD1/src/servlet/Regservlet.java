package servlet;
import model.RegForm;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Cryption;
import dao.RegDao;

public class Regservlet extends HttpServlet 
	{
	String uname;
	String ps;
	/*public void init(ServletConfig config) throws ServletException {
	uname=config.getInitParameter("vikram");
	ps=config.getInitParameter("aditya");
	System.out.println(uname);
	System.out.println(ps);
	
	}*/
@Override
protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	
	ServletContext context=getServletContext();
	uname=context.getInitParameter("vikram");
	ps=context.getInitParameter("aditya");
	
	System.out.println(uname);
	System.out.println(ps);
String name=request.getParameter("name");
String pass=request.getParameter("pass");
String contact=request.getParameter("contact");
int x=Integer.parseInt(contact);
String edu=request.getParameter("edu");
String add=request.getParameter("add");
String dob=request.getParameter("dob");
String nation=request.getParameter("nation");
String gender=request.getParameter("gender");
String cat=request.getParameter("cat");
RegForm r=new RegForm();
try {
r.setName(name);
r.setPass(Cryption.encrypt(pass));
r.setContact(x);
r.setEdu(edu);
r.setAdd(add);
r.setDob(dob);
r.setNation(nation);
r.setGender(gender);
r.setCat(cat);


RegDao rg=new RegDao();
rg.save(r,uname,ps);
} catch (Exception e) {
	e.printStackTrace();
}

RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
rd.forward(request, response);


}
}
