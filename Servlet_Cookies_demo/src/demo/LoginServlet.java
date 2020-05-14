package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("index.html").include(request, response);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(password.equals("student"))
		{
			out.println("you are sucessfully logged in");
			Cookie ck = new Cookie("name", username);
			response.addCookie(ck);
		}
		else
		{
			out.println("<font color=red>Invalid Password, try again</font>");
		}
	}

}
