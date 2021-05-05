package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UploadFile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>VIRTUAL CLASSROOM</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap1.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"dem.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"col-md-5\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <div class=\"col-md-10\">\r\n");
      out.write("                        <h3 class=\" up text-center text-white\">UPLOAD FILE</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    \r\n");
      out.write("                <hr>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <h1 class=\"text-center\">SUBJECT NAME RAJESH KUMAR MEIYAPPAN</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <hr>\r\n");
      out.write("\r\n");
      out.write("                <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/UploadtoDB\"\r\n");
      out.write("        enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-10\">\r\n");
      out.write("                            <input type=\"file\" class=\"form-control\" id=\"file\" name=\"file\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <hr>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row lm\">\r\n");
      out.write("                        <label for=\"\" class=\"label control-label\">DESCRIPTION</label>\r\n");
      out.write("                        <div class=\"col-md-10\">\r\n");
      out.write("                            <textarea name=\"description\" id=\"description\" cols=\"45\" rows=\"6\"></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"btn btn-outline-light\" type=\"submit\">SUBMIT</button>\r\n");
      out.write("                </form>\r\n");
      out.write("    \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-10\">\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary btn-outline-lg active\" role=\"button\" aria-pressed=\"true\">BACK</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <hr>\r\n");
      out.write("    \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
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
