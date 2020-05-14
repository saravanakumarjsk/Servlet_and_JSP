package task;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MListener implements ServletContextListener {
	
	ServletContext context = null;

    public void contextInitialized(ServletContextEvent arg0)  { 
    	context = arg0.getServletContext();
        context.setAttribute("Gold", 250);
        context.setAttribute("Platinum", 300);
        context.setAttribute("Silver", 150);
    }

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
	
}
