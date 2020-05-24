package servletdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/des")
public class demo1 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public void doPost(HttpServletRequest req,
	          HttpServletResponse resp)
	               throws ServletException,
	                      IOException{
		
		System.out.println("dopost");
		
		
	}
	
	
	
	public void doGet(HttpServletRequest req,
	         HttpServletResponse resp)
	              throws ServletException,
	                     IOException{
		
		
		System.out.println("doget");
		
	}

}
