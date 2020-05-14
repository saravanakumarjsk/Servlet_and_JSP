package task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		ServletContext context = request.getServletContext();
		PrintWriter out = response.getWriter();

		String name = request.getParameter("seatingType");
		int cost = (int) context.getAttribute(name);
//		System.out.println("typing the name "+name); platinum

		int TicketCount = Integer.parseInt(request.getParameter("numOfTickets"));

		out.println("<h1 align='center'>Ticket Cost</h1>" + "<p align='center'>The ticket cost for " + TicketCount
				+ " seats with type " + name + " is " + cost * TicketCount + "</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				doGet(request, response);
	}

}
