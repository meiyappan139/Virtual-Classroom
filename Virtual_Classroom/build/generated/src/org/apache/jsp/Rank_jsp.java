package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database_Objects.Database_Connection;
import java.sql.*;

public final class Rank_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write(" ");

 	
 out.println("<h1>Welcome</h1>");
 String email=(String)session.getAttribute("email");
 try
 {
 
   Connection con=Database_Connection.getConnection();
   String query="select code from teachers where email=?";
   PreparedStatement preparedStatement=con.prepareStatement(query);
   preparedStatement.setString(1, email);
   ResultSet rs=preparedStatement.executeQuery();
   
      out.write("\n");
      out.write("   <form action=\"show_results_and_rank.jsp\">\n");
      out.write("    <select name=\"selectvalue\">\n");
      out.write("    ");

   while(rs.next())
   {
	   String str=rs.getString("code");
	   str=str+"_"+"qbinfo";
	   String query_in="select * from "+str;
	 PreparedStatement preparedStatement2=con.prepareStatement(query_in);
	 ResultSet rs1=preparedStatement2.executeQuery();
	 while(rs1.next())
	 {
      out.write("\n");
      out.write("\t \n");
      out.write("\t \t<option value='");
      out.print(rs1.getString("testcode") );
      out.write('\'');
      out.write('>');
      out.print(rs1.getString("testcode") );
      out.write("</option>\n");
      out.write("\t\t \n");
      out.write("\t ");
 }
	 
	 
	 
      out.write("\n");
      out.write("\t  \n");
      out.write("\t  \n");
      out.write("\t     \n");
      out.write("   ");
 
   }
    
      out.write("\n");
      out.write("    \n");
      out.write("    </select>\n");
      out.write("    <input type=\"submit\" value=\"Submit\">\n");
      out.write("    </form>\n");
      out.write("    ");

   
 }
 catch(Exception e)
 {
	 
 }
   
 
 
 
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
