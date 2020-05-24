package servletdemo;

import java.sql.*;

public class tryconnectmaysql {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "123456");
			if(con==null) {
				System.out.println("Á¬½ÓÎª¿Õ");
			}
			
			Statement s=con.createStatement();
			ResultSet res= s.executeQuery("select * from score");
		    int num=6;
		    while(res.next()) {
		    	
		    	for(int u=2;u<=num;u++) {
		    		System.out.print(res.getString(u)+" ");//System.out.println("6666");
		    	}
		    	System.out.println();
		    }
		
		
		
		con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("8888");
		}


	}

}
