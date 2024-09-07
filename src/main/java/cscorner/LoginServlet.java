package cscorner;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  try {
   PrintWriter out = response.getWriter();
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","user","password");
   String n = request.getParameter("txtName");
   String p = request.getParameter("txtPwd");
   PreparedStatement ps=con.prepareStatement("select username from users where username=? and password=?;");
   ps.setString(1, n);
   ps.setString(2, p);
   ResultSet rs = ps.executeQuery();
   if(rs.next()) {
    RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
    rd.forward(request, response);
   }
   else {
      out.println("<div style='display: flex; align-items: center; justify-content: center; height: 100vh; background-color: #f8d7da;'>");
      out.println("  <div style='text-align: center; padding: 20px; border: 1px solid #f5c2c7; background-color: #f8d7da; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);'>");
      out.println("    <h1 style='color: #721c24; font-size: 24px; margin-bottom: 20px;'>Login Failed!!</h1>");
      out.println("    <a href='login.jsp' style='display: inline-block; padding: 10px 20px; background-color: #f5c6cb; color: #721c24; text-decoration: none; border-radius: 5px; font-weight: bold;'>Try AGAIN!!</a>");
      out.println("  </div>");
      out.println("</div>");
  }
   
  } catch (ClassNotFoundException e) {
   e.printStackTrace();
  } catch (SQLException e) {
   
   e.printStackTrace();
  }
  
 }

}