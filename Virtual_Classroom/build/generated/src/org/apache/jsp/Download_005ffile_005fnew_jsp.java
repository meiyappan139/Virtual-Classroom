package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database_Objects.Database_Connection;
import java.sql.*;

public final class Download_005ffile_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>VIRTUAL CLASSROOM</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"demo.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div style=\"padding:5px; color:red;font-style:italic;\">\n");
      out.write("       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    <div class=\"spc\"></div>\n");
      out.write("   \n");
      out.write("   ");

   
    String email="18euit080@skcet.ac.in";
    String subject="TOC";
    String code="18toc101";
    session.setAttribute("subject", subject);
    session.setAttribute("code", code);
   

      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("            <header>\n");
      out.write("                <div class=\"container-fluid bg-dark\">\n");
      out.write("                    <h3 class=\"text-center text-white\">DOWNLOAD FILE</h3>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <hr>\n");
      out.write("        <h2 class=\"text-center text-white\">");
      out.print(subject );
      out.write("</h2><hr>\n");

    Connection con=null;
    try
    {
  con=Database_Connection.getConnection();
 
  String  query="select * from "+code;
  PreparedStatement preparedStatement=con.prepareStatement(query);
  ResultSet rs=preparedStatement.executeQuery();
 

      out.write("\n");
      out.write("\n");
      out.write("<table class=\"table table-striped table-dark\">\n");
      out.write("                <thead>\n");
      out.write("                  <tr>\n");
      out.write("                    <th scope=\"col\">ID</th>\n");
      out.write("                    <th scope=\"col\">FILENAME</th>\n");
      out.write("                    <th scope=\"col\">DESCRIPTION</th>\n");
      out.write("                    <th scope=\"col\">DOWNLOAD</th>\n");
      out.write("                  </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("\n");

   while(rs.next())
   {
      out.write("\n");
      out.write("   \n");
      out.write("    <tr>\n");
      out.write("                    <th scope=\"row\">");
      out.print(rs.getString("id") );
      out.write("</th>\n");
      out.write("                    <td>");
      out.print(rs.getString("filename") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("description") );
      out.write("</td>\n");
      out.write("                    <td  style=\"padding-left:50px\" id=");
      out.print(rs.getString("id")  );
      out.write(" onclick=\"func(this.id)\"><i class=\"fa fa-download\" aria-hidden=\"true\"/></td>\n");
      out.write("             </tr>\n");
      out.write("   \n");
      out.write(" \n");
      out.write("  ");
 }
    }
    catch(Exception e)
    {
   
    }
   
   
   
   
      out.write("\n");
      out.write("   </tbody>\n");
      out.write("   </table>\n");
      out.write("   \n");
      out.write("   </div>\n");
      out.write(" \n");
      out.write("     <script>\n");
      out.write("   \n");
      out.write("        var table = document.getElementById('table');\n");
      out.write("\n");
      out.write("        function func(ele)\n");
      out.write("        {\n");
      out.write("        window.location=\"http://localhost:8080/Virtual_Classroom/DownloadFromServlet?id=\"+ele;\n");
      out.write("       \n");
      out.write(" \n");
      out.write("        }\n");
      out.write("\n");
      out.write("         </script>\n");
      out.write("         \n");
      out.write("         <script src=\"bootstrap.min.js\"></script>\n");
      out.write("   <script src=\"jquery.min.js\"></script>\n");
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
