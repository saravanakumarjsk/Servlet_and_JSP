package demo;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class Listener implements HttpSessionListener {
	ServletContext context = null;
	static int total=0, current=0;
   
    public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("Inside Listener");
         total++;
         current++;
         context = arg0.getSession().getServletContext();
         context.setAttribute("totalUsers", total);
         context.setAttribute("currentUsers", current);
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         current--;
         context.setAttribute("currentUsers", current);
    }
	
}
