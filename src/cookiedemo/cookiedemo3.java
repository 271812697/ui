package cookiedemo;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookiedemo3
 */
@WebServlet("/cookiedemo3")
public class cookiedemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cookiedemo3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		Cookie[] cook=request.getCookies();
		boolean flag=true;
		if(cook!=null&&cook.length!=0) {
			for(Cookie temp:cook) {
				if(temp.getName().equals("lasttime")) {
					String value=temp.getValue();
					value=URLDecoder.decode(value, "utf-8");
					response.getWriter().write("<h1>欢迎回来，您上次访问的时间是"+value+"</h1>");
					SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
					String s=format.format(new Date());
					s=URLEncoder.encode(s, "utf-8");
					temp.setValue(s);
					temp.setMaxAge(60*60*24*30);
					response.addCookie(temp);
					
					flag=false;
					break;
				}
				
			}
			
		}
		if(flag) {
			
			response.getWriter().write("<h1>欢迎访问,这是你第一次访问</h1>");
			SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
			String s=format.format(new Date());
			s=URLEncoder.encode(s, "utf-8");
			Cookie temp=new Cookie("lasttime",s);
			temp.setMaxAge(60*60*24*30);
			response.addCookie(temp);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
