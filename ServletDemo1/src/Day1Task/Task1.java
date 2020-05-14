package Day1Task;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task1")
public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Task1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		try
		{
			String s1 = request.getParameter("t1");
			int a = Integer.parseInt(request.getParameter("t2"));
			String s2 = request.getParameter("t3");
			String s3 = request.getParameter("t4");
			pw.println("<title> User Details </title>");
			pw.println("<center><h1> User Details </h4></center><br>");
			pw.println("<center><table border=2 id=user>"
					+ "<tr>\r\n" + 
					"<td>Name</td>>\r\n" + 
					"<td>"+s1+"</td>\r\n" +
					"</tr>"+
					"<tr>\r\n" + 
					"<td>Phone Number</td>>\r\n" + 
					"<td>"+a+"</td>\r\n" +
					"</tr>"+
					"<tr>\r\n" + 
					"<td>Address</td>>\r\n" + 
					"<td>"+s2+"</td>\r\n" +
					"</tr>"+
					"<tr>\r\n" +
					"<td>Email</td>>\r\n" + 
					"<td>"+s3+"</td>\r\n" +
					"</tr></table></center>");
		}
		catch(Exception e)
		{
			pw.println("<br>Error in input");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
