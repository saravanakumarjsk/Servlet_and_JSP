package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String user;
	ServletContext context;

	public void init(ServletConfig config) 
	{
		user = config.getInitParameter("user");
		context = config.getServletContext();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");

		out.println("<p>Welcome, " + request.getParameter("name") + "</p>");
		String[] skills = request.getParameterValues("skill");

		out.println("<ol>");
		for (String skill : skills) 
		{
			out.println("<li>" + skill + "</li>");
		}
		out.println("</ol>");

		String company = context.getInitParameter("company");
		out.println("<br> User is " + user);
		out.println("<br> Company is " + company);
		out.println("</html></body>");

		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
		rd.forward(request, response);
	}

}
