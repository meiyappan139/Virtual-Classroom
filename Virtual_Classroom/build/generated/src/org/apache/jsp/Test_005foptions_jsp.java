package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Test_005foptions_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>VIRTUAL CLASSROOM</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"test_option.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");

	 String name=(String)session.getAttribute("name");
    
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-7\">\r\n");
      out.write("                <h1 class=\"text-left\">VIRTUAL CLASSROOM</h1>\r\n");
      out.write("                <p class=\"text-left\">\r\n");
      out.write("                    Virtual Classroom as \"mission control for \r\n");
      out.write("                    your classroom,\" and this might be the easiest way to \r\n");
      out.write("                    think about it.It also acts as a digital organizer where \r\n");
      out.write("                    teachers can keep class materials and share them with \r\n");
      out.write("                    students -- all paperless-ly. From there, you can pick \r\n");
      out.write("                    and choose the features you want to incorporate.\r\n");
      out.write("                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Quibusdam unde laboriosam iure suscipit. Reiciendis, numquam exercitationem recusandae facere hic sit assumenda est. Dolorem ullam numquam consequatur odit cumque quae. Exercitationem! Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi harum molestiae commodi omnis laudantium facere officia officiis vitae? Tenetur illum laudantium placeat minus libero labore iusto obcaecati nobis quibusdam a! \r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-5\">\r\n");
      out.write("                <div class=\"mic\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-10\">\r\n");
      out.write("                            <div class=\"spc\"></div>\r\n");
      out.write("                            <h2 class=\"text-center text-light\">WELCOME ");
      out.print(name );
      out.write("</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mov\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary active\" role=\"button\">SET QUESTION PAPER</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary active\" role=\"button\">VIEW RESULT</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary active\" role=\"button\">EDIT QUESTION PAPER</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary active\" role=\"button\">PRINT AS EXCEL</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"jib\">\r\n");
      out.write("                                <div class=\"col-md-10\">\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary btn-outline-lg active\" role=\"button\" aria-pressed=\"true\">Home</a>\r\n");
      out.write("                                    <div class=\"spc\"></div>\r\n");
      out.write("                                    <div class=\"spc\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"./assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"./assets/js/jquery.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
