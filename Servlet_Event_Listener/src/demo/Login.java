package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		System.out.println("Inside login servlet");
		
		HttpSession session = request.getSession();
		System.out.println("session created");
		
		String name = request.getParameter("username");
		session.setAttribute("name", name);
		
		ServletContext context = getServletContext();
		int t = (int) context.getAttribute("totalUsers");
		int c = (int) context.getAttribute("currentUsers");
		out.println("Welcome "+ name);
		out.println("<br>Total :"+ t);
		out.println("Current :"+ c);
		out.println("<br><br><a href='Logout'>Logout</a><br>  "+ name);
	}

}
