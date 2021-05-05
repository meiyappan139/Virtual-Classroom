package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database_Objects.Database_Connection;
import java.sql.*;

public final class show_005fstudents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      \n");
      out.write("    \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>VIRTUAL CLASSROOM</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"student_result.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <header>\n");
      out.write("                </header>\n");
      out.write("                 ");

                    try
                    {
                      String code="18toc101";
                      Connection con=Database_Connection.getConnection();
                      String query_stud="select * from students where code=?";
                      PreparedStatement prepared_Statement=con.prepareStatement(query_stud);
                      prepared_Statement.setString(1,code);
                      ResultSet rs=prepared_Statement.executeQuery();
                 
      out.write("\n");
      out.write("\n");
      out.write("                <h2 class=\"text-center text-white\">");
      out.print(code);
      out.write("</h2>\n");
      out.write("                <table class=\"table table-striped table-dark\">\n");
      out.write("                    <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">S.NO</th>\n");
      out.write("                        <th scope=\"col\">NAME</th>\n");
      out.write("                        <th scope=\"col\">EMAIL</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                        int i=1;
                          while(rs.next())
                          {
                              //out.println("<h1>"+rs.getString("email")+"</h1>");
                              String email_stud=rs.getString("email");
                              String query_name="select name from users where email=?";
                              PreparedStatement preparedStatement_stud=con.prepareStatement(query_name);
                              preparedStatement_stud.setString(1, email_stud);
                              ResultSet rs1=preparedStatement_stud.executeQuery();
                              rs1.next();
                            // out.println("<h1>"+rs1.getString("name")+"</h1>");
                             // out.println("==========================<br>");
       

                        
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">");
      out.print(i);
      out.write("</th>\n");
      out.write("                        <td>");
      out.print(rs1.getString("name") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("email") );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    </tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                      ");

                          i++;
         
                         }
                      
      out.write("\n");
      out.write("                </table>\n");
      out.write("             \n");
      out.write("                  ");

                        }
                        catch(Exception e)
                        {
                            out.println(e);
                        }
                       
                       
                        
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        <script src=\"./assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
