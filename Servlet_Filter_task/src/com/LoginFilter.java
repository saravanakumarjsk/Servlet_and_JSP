package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.*;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = { "/Display" }, servletNames = { "Display" })
public class LoginFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		UserDAO userDAO = new UserDAO();
//		List<User> userList = user.getUserList();
		
		List<User> userList = null;
		try
		{
			userList = userDAO.getUserList();
		}
		catch(Exception e)
		{
			
		}

		boolean valid = false;
		Iterator<User> data = userList.iterator();
		while (data.hasNext()) {
			System.out.println("inside while loop");
			User u = (User) data.next();
			System.out.println(u.getUsername());
			System.out.println("username -> "+username);
			if(u.getUsername().equals(username) && u.getPassword().equals(password))
			{
				valid = true;
				break;
			}
		}
		if (valid == true) {
			chain.doFilter(request, response);
		} else {
			out.println("<p> Incorrect user name or password");
			request.getRequestDispatcher("index.html").include(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
