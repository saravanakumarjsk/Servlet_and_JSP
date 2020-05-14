package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		request.setAttribute("user", request.getAttribute("username"));
		
		pw.print("This is Servlet2");
		
		if(request.getAttribute("username").equals("admin"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Servlet3");
			rd.forward(request, response);
		}
		else
		{
			response.sendRedirect("https://google.com");
		}
	}

}
