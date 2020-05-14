package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CourseServlet")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		request.getRequestDispatcher("index.html").include(request, response);
		Cookie ck[] = request.getCookies();
		
		if(ck != null)
		{
			String name = ck[0].getValue();
			if(!name.equals("")||name != null)
			{
				out.println("<br>Welcome "+name+"<br>");
				out.println("courses are processing ....");
			}
			else
			{
				out.println("please login first");
			}
		}

	}

}
