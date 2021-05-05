package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fill_005fquestion_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"rank.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("  ");

  String no_of_ques="6";
  int no=Integer.parseInt(no_of_ques);
  
      out.write("\n");
      out.write("   <div class=\"spc\"></div>\n");
      out.write("  <div class=\"container\">\n");
      out.write("                <header>\n");
      out.write("                    <div class=\"container-fluid bg-dark\">\n");
      out.write("                        <h3 class=\"text-white\">WELCOME #NAME</h3>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("            <h2 class=\"text-center text-white\">QUESTION PAPER</h2>\n");
      out.write("             <form method=\"post\" action=\"fill_question\">\n");
      out.write("                <table class=\"table table-striped table-dark\">\n");
      out.write("                    <thead>\n");
      out.write("                      <tr>\n");
      out.write("  <tr>\n");
      out.write("  <th scope=\"col\">S.NO</th>\n");
      out.write("  <th scope=\"col\">QUESTIONS</th>\n");
      out.write("  <th scope=\"col\">OPTION A</th>\n");
      out.write("  <th scope=\"col\">OPTION B</th>\n");
      out.write("  <th scope=\"col\">OPTION C</th>\n");
      out.write("  <th scope=\"col\">OPTION D</th>\n");
      out.write("  <th scope=\"col\">ANSWER</th>\n");
      out.write("  </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("  ");

  for(int i=0;i<no;i++)
  {
      out.write("\n");
      out.write("  <tr>\n");
      out.write("  <td scope=\"row\">");
      out.print(i+1 );
      out.write("</td>\n");
      out.write("  <td> <input type=\"text\" id=\"question\" name=\"question\" required> </td>\n");
      out.write("  <td> <input type=\"text\" id=\"option1\" name=\"option1\" required> </td>\n");
      out.write("  <td> <input type=\"text\" id=\"option2\" name=\"option2\" required> </td>\n");
      out.write("  <td> <input type=\"text\" id=\"option3\" name=\"option3\" required> </td>\n");
      out.write("  <td> <input type=\"text\" id=\"option4\" name=\"option4\" required> </td>\n");
      out.write("  <td> <input type=\"text\" id=\"answer\" name=\"answer\" required> </td>\n");
      out.write("  </tr>\n");
      out.write("  ");
}
  
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("  </table>\n");
      out.write("  <button class=\"btn btn-outline-light\" type=\"submit\">SET QUESTIONS</button>\n");
      out.write("  </form>\n");
      out.write("  <div class=\"spc\" ></div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-10\">\n");
      out.write("                            <a href=\"DashBoard.jsp\" class=\"btn btn-primary btn-outline-lg active\" role=\"button\" aria-pressed=\"true\">Home</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("              </div>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("</body>\n");
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
