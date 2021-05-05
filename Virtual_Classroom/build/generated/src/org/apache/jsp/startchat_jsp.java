package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class startchat_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    
    if(session.getAttribute("name")==null)
  response.sendRedirect("Index.jsp");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    ");
String uname=(String)session.getAttribute("name"); 
      out.write("\n");
      out.write("    <center> <h1 class=\"bg-dark text-white vfont\">VIRTUAL CLASSROOM DISCUSSION FORUM</h1></center>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"startchatting.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"check.js\"></script>\n");
      out.write("        <title>The Chat Room</title>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"icon.jpeg\" />\n");
      out.write("    <script>\n");
      out.write("      ");
 System.out.println("hai"); 
      out.write("\n");
      out.write("      setInterval(reloaddata, 3);\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <p id=\"result\"></p>\n");
      out.write("        <h2 class=\"vfont\">  Welcome, ");
      out.print(uname);
      out.write("</h2>\n");
      out.write("        <div class=\"logout-div\" align=\"right\"><a href=\"DashBoard.jsp\" class=\"logout-chat\">Logout</a></div>\n");
      out.write("        <div id=\"list\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("            </div>\n");
      out.write("            <input style=\"display: none\" type=\"text\" id=\"u\" value=\"");
      out.print(uname);
      out.write("\">\n");
      out.write("            \n");
      out.write("            <textarea id='h' style=\"width: 94%;border-radius: 10px;height: 10%;margin-left: 24px;\"></textarea>\n");
      out.write("            <div class=\"sendCnt\" onclick=\"addText()\">\n");
      out.write("                \n");
      out.write("            <svg enable-background=\"new 0 0 24 24\" height=\"30px\" viewBox=\"0 0 24 24\" width=\"50px\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"m8.75 17.612v4.638c0 .324.208.611.516.713.077.025.156.037.234.037.234 0 .46-.11.604-.306l2.713-3.692z\"/><path d=\"m23.685.139c-.23-.163-.532-.185-.782-.054l-22.5 11.75c-.266.139-.423.423-.401.722.023.3.222.556.505.653l6.255 2.138 13.321-11.39-10.308 12.419 10.483 3.583c.078.026.16.04.242.04.136 0 .271-.037.39-.109.19-.116.319-.311.352-.53l2.75-18.5c.041-.28-.077-.558-.307-.722z\"/></svg>\n");
      out.write("            </div>\n");
      out.write("<!--            <input type=\"button\" value=\"send\" onclick=\"addText()\" />-->\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
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
