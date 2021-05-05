package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database_Objects.Database_Connection;
import java.sql.*;

public final class Update_005fProfile_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    \t    \n");
      out.write(" ");

 	String email="18euit080@skcet.ac.in";
 	String password=null;
 	String name=null,mobile=null;
 	int id=0;
 	try
 	{
 		Connection con=Database_Connection.getConnection();
		String query="select * from users where email=?";
		
		PreparedStatement pstmt=con.prepareStatement(query);
        pstmt.setString(1,email);
        ResultSet rs=pstmt.executeQuery();
        
        while(rs.next())
        {
        	id=rs.getInt("id");
        	name=rs.getString("name");
        	mobile=rs.getString("mobile");
        	password=rs.getString("password");
        }
        
        session.setAttribute("id", id);
        session.setAttribute("name", name);
		session.setAttribute("email", email);
		session.setAttribute("password", password);
		session.setAttribute("mobile", mobile);
        
        con.close();
 	}
 	catch(Exception exp)
 	{
 		System.out.println("Exception is "+exp);
 	}
 
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>VIRTUAL CLASSROOM</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"show.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"Update_Validation.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5\">\n");
      out.write("                    <h1 class=\"text-center\">UPDATE PROFILE</h1>\n");
      out.write("                    <form method=\"post\" action=\"Update\" onsubmit=\"return Validate();\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">NAME</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" type=\"text\" name=\"name\" value='");
      out.print(name );
      out.write(" id=\"name\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("    \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">EMAIL</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" type=\"email\" name=\"email\" value='");
      out.print(email);
      out.write(" id=\"email\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("    \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">PASSWORD</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input class=\"form-control\" type=\"password\" name=\"pass\" id=\"pass\" value='");
      out.print(password );
      out.write(" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("    \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">MOBILE</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" type=\"text\" name=\"mobile\" id=\"mobile\" value='");
      out.print(mobile );
      out.write(" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button class=\"btn btn-outline-light\" type=\"submit\">UPDATE</button>\n");
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
      out.write("\n");
      out.write("        <script src=\"./assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.min.js\"></script>\n");
      out.write("    </body>\n");
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
