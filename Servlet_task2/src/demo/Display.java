package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String s;
		if(request.getParameter("options")!=null)
		{
		   s =(String)request.getParameter("options");
		   out.println(s);
		   if(s.equals("Exhibition"))
		   {
			   out.println("<html><body>");
			   out.println("<center>"
			   		+ "<h1>Stall Details</h1>"
			   		+ "<table border=2>"
			   		+ "<tr>"
			   		+ "<b><td>Stall Name</td></b>"
			   		+ "<b><td>Minimum Price</td></b>"
			   		+ "<b><td>Owner Name</td></b>"
			   		+ "</tr>"
			   		+ "<tr>"
			   		+ "<b><td>PrintArt</td></b>"
			   		+ "<b><td>2500</td></b>"
			   		+ "<b><td>John</td></b>"
			   		+ "</tr>"
			   		+ "<tr>"
			   		+ "<b><td>Fashion</td></b>"
			   		+ "<b><td>2000</td></b>"
			   		+ "<b><td>Sandra</td></b>"
			   		+ "</tr>"
			   		+ "<tr>"
			   		+ "<b><td>ToeRinger</td></b>"
			   		+ "<b><td>3000</td></b>"
			   		+ "<b><td>Maria</td></b>"
			   		+ "</tr>"
			   		+ "</table>"
			   		+ "</center>");
			   out.println("</html></body>");
		   }
		   else if(s.equals("StageShow"))
		   {
			   out.println("<html><body>");
			   out.println("<center>"
			   		+ "<h1>Stage Show Details</h1>"
			   		+ "<table border=2>"
			   		+ "<tr>"
			   		+ "<b><td>Seat Type</td></b>"
			   		+ "<b><td>Ticket Cost</td></b>"
			   		+ "<b><td>Available Seats</td></b>"
			   		+ "</tr>"
			   		+ "<tr>"
			   		+ "<b><td>Platinum</td></b>"
			   		+ "<b><td>300</td></b>"
			   		+ "<b><td>15</td></b>"
			   		+ "</tr>"
			   		+ "<tr>"
			   		+ "<b><td>Gold</td></b>"
			   		+ "<b><td>250</td></b>"
			   		+ "<b><td>25</td></b>"
			   		+ "</tr>"
			   		+ "<tr>"
			   		+ "<b><td>Silver</td></b>"
			   		+ "<b><td>200</td></b>"
			   		+ "<b><td>35</td></b>"
			   		+ "</tr>"
			   		+ "</table>"
			   		+ "</center>");
			   out.println("</html></body>");
		   }
		}
	}

}
