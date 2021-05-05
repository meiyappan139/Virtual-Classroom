package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_005fclass_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>VIRTUAL CLASSROOM</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"createClass.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5\">\n");
      out.write("                    <h1 class=\"text-center\">CREATE CLASS</h1>\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">SUBJECT</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" type=\"text\" name=\"subject\" id=\"subject\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("    \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">CODE</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" type=\"text\" name=\"code\" id=\"code\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("    \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"\" class=\"label control-label\">SECTION</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"section\" id=\"section\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button class=\"btn btn-outline-light\" type=\"submit\">CREATE</button>\n");
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
