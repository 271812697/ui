package servletdemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo3
 */
@WebServlet("/demo3")
public class demo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     *
     * @see HttpServlet#HttpServlet()
     */
    public demo3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	     String method=request.getMethod();//获取请求方法
	     String virtualpath=request.getContextPath();//获取虚拟目录
	     String servletpath=request.getServletPath();//获取servlet路径
	     String URI=request.getRequestURI();
	     String protocal=request.getProtocol();
	     String address=request.getRemoteAddr();
	     System.out.println(method);
	     System.out.println(virtualpath);
	     System.out.println(servletpath);
	     System.out.println(URI);
	     System.out.println(protocal);
	     System.out.println(address);
	    // System.out.println(method);
	     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
