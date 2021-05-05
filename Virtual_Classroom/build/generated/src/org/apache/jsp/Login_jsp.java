package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title> VIRTUAL CLASSROOM</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\r\n");
      out.write("<link rel = \"stylesheet\" type=\"text/css\" href=\"login.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t<h1 class=\"text-left\">VIRTUAL CLASSROOM</h1>\r\n");
      out.write("\t\t\t\t<p class=\"text-left\">\r\n");
      out.write("\t\t\t\t\tDeveloping a virtual classroom system to promote a greater count of students to splurge\r\n");
      out.write("                                        into the field of Education. It integrates the benefits of a physical classroom with the\r\n");
      out.write("                                        convenience of a no-physical-bar virtual learning environment. The clients can register\r\n");
      out.write("                                        using their email and password that helps them to get connected to the server.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"text-left text-white\">LOGIN FORM</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form  method=\"post\" action=\"Login\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"\" class=\"label control-label\">EMAIL</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" type=\"email\" name=\"email\" id=\"email\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"\" class=\"label control-label\">PASSWORD</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"form-control\" type=\"password\" name=\"pass\" id=\"pass\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-outline-light\" type=\"submit\">LOGIN</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"http://localhost:8080/Virtual_Classroom/Register.jsp\" class=\"btn btn-primary btn-outline-lg active\" role=\"button\" aria-pressed=\"true\">New To Classroom? SignUp</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"F:\\smaple bootstrap\\js\\bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"F:\\smaple bootstrap\\js\\jquery.min.js\"></script>\r\n");
      out.write("</body>\r\n");
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
