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

@WebFilter(dispatcherTypes = { DispatcherType.INCLUDE }, 
urlPatterns = { "/Servlet2" }, servletNames = { "demo.Servlet2" })
//@WebServlet("/Servlet2")
public class Filter2 implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<br>Before Servlet2- Filter2 <br>");
		chain.doFilter(request, response);
		out.println("<br>After Servlet - Filter2 <br>");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
