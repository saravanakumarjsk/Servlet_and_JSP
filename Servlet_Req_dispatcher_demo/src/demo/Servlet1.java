package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		request.setAttribute("username", username);
		
		RequestDispatcher rd;
		
		if(username.equals("sk") && password.equals("sk") 
				|| username.equals("admin") && password.equals("admin"))
		{
			rd = request.getRequestDispatcher("Servlet2");
			rd.forward(request, response);
		}
		else
		{
			pw.println("Invalid UserName / Password");
			rd = request.getRequestDispatcher("/home.html");
			rd.include(request, response);
		}
	}

	
}
