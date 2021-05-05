package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database_Objects.Database_Connection;
import java.sql.*;

public final class set_005fquestion_005fpaper_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>VIRTUAL CLASSROOM</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"question.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");

String email="18euit080@skcet.ac.in";
try
{
Connection con=Database_Connection.getConnection();
String query="select subject from teachers where email=?";
PreparedStatement pst=con.prepareStatement(query);
pst.setString(1, email);
ResultSet rs=pst.executeQuery();




      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5\">\n");
      out.write("                    <h1 class=\"text-center\">CREATE QB</h1>\n");
      out.write("                    <form method=\"post\" action=\"set_question_paper\" onsubmit=\"check()\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"move\">\n");
      out.write("                                <label for=\"\" class=\"label control-label\">SUBJECT</label>\n");
      out.write("                                <div class=\"spc\"></div>\n");
      out.write("                                <select class=\"form-select\" aria-label=\"Default select example\" required>\n");
      out.write("                                    <option selected>Open this select menu</option>\n");
      out.write("                                    ");
while(rs.next()) { 
      out.write("\n");
      out.write("   <option  value='");
      out.print(rs.getString("subject") );
      out.write('\'');
      out.write('>');
      out.print(rs.getString("subject") );
      out.write("</option>\n");
 }
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("   \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">EXAM NAME</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" type=\"text\" name=\"exam_name\" id=\"exam_name\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("   \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">NO OF QUESTIONS</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input class=\"form-control\" type=\"number\" name=\"no_of_questions\" id=\"no_of_questions\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">START TIME</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input class=\"form-control\" type=\"datetime-local\" name=\"start_time\" id=\"start_time\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">END TIME</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input class=\"form-control\" type=\"datetime-local\" name=\"end_time\" id=\"end_time\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
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
      out.write("  ");

 
}
catch(Exception e)
{
System.out.println("Error: "+e);
}

      out.write("\n");
      out.write("        <script src=\"bootstrap.min.js\"></script>\n");
      out.write("   <script src=\"./assets/js/jquery.min.js\"></script>\n");
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
