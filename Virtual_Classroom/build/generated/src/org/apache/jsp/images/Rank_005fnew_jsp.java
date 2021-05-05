package org.apache.jsp.images;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database_Objects.Database_Connection;
import java.sql.*;

public final class Rank_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("        <title>VIRTUAL CLASSROOM</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap1.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"aa.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"spc\"></div>\n");
      out.write(" \n");
      out.write(" ");

 
 String u_name=(String)session.getAttribute("name");
 
 String email="18euit080@skcet.ac.in";
 try
 {
 
   Connection con=Database_Connection.getConnection();
   String query="select code from teachers where email=?";
   PreparedStatement preparedStatement=con.prepareStatement(query);
   preparedStatement.setString(1, email);
   ResultSet rs=preparedStatement.executeQuery();
   
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5\">\n");
      out.write("                    <h1 class=\"text-center\">WELCOME #NAME</h1>\n");
      out.write("                   \n");
      out.write("                    <form action=\"show_results_and_rank.jsp\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"move\">\n");
      out.write("                                <select class=\"form-select\" name=\"selectvalue\">\n");
      out.write("                                <option selected>Open this select menu</option>\n");
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
      out.write("\n");
      out.write("<option value='");
      out.print(rs1.getString("testcode") );
      out.write('\'');
      out.write('>');
      out.print(rs1.getString("testcode") );
      out.write("</option>\n");
      out.write("\n");
 }



      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("   \n");
      out.write("   ");

   }
    
      out.write("\n");
      out.write("</select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <button class=\"btn btn-outline-light\" type=\"submit\">SUBMIT</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-10\">\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary btn-outline-lg active\" role=\"button\" aria-pressed=\"true\">Home</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    ");

   
 }
 catch(Exception e)
 {

 }
   
 
 
      out.write("\n");
      out.write(" \n");
      out.write("  <script src=\"./assets/js/bootstrap.min.js\"></script>\n");
      out.write(" <script src=\"./assets/js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
