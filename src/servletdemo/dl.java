package servletdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dl
 */
@WebServlet("/dl")
public class dl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String filename=request.getParameter("filename");
		//System.out.println(filename);
		ServletContext context=request.getServletContext();
		String path=context.getRealPath("/img/"+filename);
		String type=context.getMimeType("/img/"+filename);
		//System.out.println(path);
		//System.out.println(type);
		response.setHeader("content-type", type);//设置内容的类型
		response.setHeader("content-disposition", "attachment;filename="+filename);
		System.out.println(path);
		InputStream in=new FileInputStream(path);
		byte[] b=new byte[1024*8];
		int len=0;
		ServletOutputStream out= response.getOutputStream();
		while((len=in.read(b))!=-1) {
			out.write(b, 0, len);	
		}
		in.close();
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
