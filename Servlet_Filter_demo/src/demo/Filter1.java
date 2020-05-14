package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
//@WebServlet("/Servlet1")
@WebFilter(dispatcherTypes = {DispatcherType.INCLUDE }
					, urlPatterns = { "/Servlet1"}, 
							servletNames = {"demo.Servlet1"})
public class Filter1 implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<br>Before Servlet2 - Filter1 <br>");
		chain.doFilter(request, response);
		out.println("<br>After Servlet2 - Filter1 <br>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
