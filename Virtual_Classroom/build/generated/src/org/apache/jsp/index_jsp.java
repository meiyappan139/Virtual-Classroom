package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("        <script type=\"text/javascript\" src=\"check.js\"></script>\n");
      out.write("         <script type=\"text/javascript\" src=\"fetch.jsp\"></script>\n");
      out.write("        <title>The Chat Room</title>\n");
      out.write("        <link rel = \"stylesheet\" type=\"text/css\" href=\"index_new.css\">\n");
      out.write("<!--        <script>\n");
      out.write("            function redirecting()\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            </script>-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"chatCont\">\n");
      out.write("        <h1 class=\"titleCont\">Chat Box</h1>\n");
      out.write("        <div class=\"middle\" id=\"result-data\">\n");
      out.write("           \n");
      out.write("            <form autocomplete=\"off\" action=\"checking\">\n");
      out.write("\n");
      out.write("            <table class=\"main container\">\n");
      out.write("                <tr height=\"80px\">\n");
      out.write("                    <td class=\"userCont\">Username:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"uname\" id=\"uname\" class=\"textbox\" autocomplete=\"off\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr height=\"20px\">\n");
      out.write("                    <td class=\"passwrdCont\">Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"pw\" id=\"pw\"  class=\"textbox\"></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("                  <div class=\"goContainer\">\n");
      out.write("                  <input type=\"submit\" value=\"Go\" class=\"circle\">\n");
      out.write("                  </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
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
