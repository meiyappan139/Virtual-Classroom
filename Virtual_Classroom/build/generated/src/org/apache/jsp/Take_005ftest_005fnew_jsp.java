package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Take_005ftest_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>VIRTUAL CLASSROOM</title>\n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"student_result.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <header>\n");
      out.write("                    <div class=\"container-fluid bg-dark\">\n");
      out.write("                        <h3 class=\"text-white\">WELCOME #NAME</h3>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("                <h2 class=\"text-center text-white\">TAKE TEST</h2>\n");
      out.write("                <table class=\"table table-striped table-dark\">\n");
      out.write("                    <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">S.NO</th>\n");
      out.write("                        <th scope=\"col\">TEST CODE</th>\n");
      out.write("                        <th scope=\"col\">START TIME</th>\n");
      out.write("                        <th scope=\"col\">END TIME</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">1</th>\n");
      out.write("                        <td>Mark</td>\n");
      out.write("                        <td>Otto</td>\n");
      out.write("                        <td>@mdo</td>\n");
      out.write("                    </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <div class=\"spc\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <form>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"move\">\n");
      out.write("                            <select class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("                                <option selected>Open this select menu</option>\n");
      out.write("                                <option>One</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <button class=\"btn btn-outline-light\" type=\"submit\">EDIT TEST</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        <script src=\"bootstrap.min.js\"></script>\n");
      out.write("   <script src=\"./assets/js/jquery.min.js\"></script>\n");
      out.write("    </body>\n");
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
