package servletdemo;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo9
 */
@WebServlet("/demo9")
public class demo9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demo9() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String user=request.getParameter("username");
		String password=request.getParameter("password");
	
	
		System.out.println("8888");
		try { 
			
			
			Connection con=connectmysql.getconnection();
			if(con==null) {
				System.out.println("����Ϊ��");
			}
			 
			 PreparedStatement pre=con.prepareStatement("select password from username where user=?");
			
			 pre.setString(1, user);
			 ResultSet res=pre.executeQuery();
			 if(res.next()) {
				 String pass=res.getString(1); 
				 if(pass.equals(password)) {//������ȷ
					 System.out.println("������ȷ");
					 request.getRequestDispatcher("/successlogin.html").forward(request, response);;
				 }
				 else {//�������
					 System.out.println("�������");
					 request.getRequestDispatcher("/failed.html").forward(request, response);
					 
				 }
			 }
			 else {//�û�����û������û�
				 
				 
				 
			 }
			 
			 
			 
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
