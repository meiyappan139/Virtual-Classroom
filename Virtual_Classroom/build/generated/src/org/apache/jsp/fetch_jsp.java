package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fetch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("    .titleCnt{\n");
      out.write("        color: #ffffff;\n");
      out.write("    }\n");
      out.write("    body{\n");
      out.write("         background-image: url(https://wallpapercave.com/wp/huDiDyr.jpg);\n");
      out.write("    }\n");
      out.write("   .buttonCont {\n");
      out.write("        display: flex;\n");
      out.write("        margin: auto;\n");
      out.write("        width: 27.25%;\n");
      out.write("        flex-wrap: wrap;\n");
      out.write("   }\n");
      out.write("   .chatButton,.logout-chat {\n");
      out.write("       cursor: pointer;\n");
      out.write("        display: flex;\n");
      out.write("        color: #000000;\n");
      out.write("        border: 1px solid #ffffff;\n");
      out.write("        height: 30px;\n");
      out.write("        align-items: center;\n");
      out.write("        flex-wrap: wrap;\n");
      out.write("        justify-content: center;\n");
      out.write("        flex: 0 0 40%;\n");
      out.write("        margin-right: 40px;\n");
      out.write("        text-decoration: none;\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("        margin-top: 15px;\n");
      out.write("        margin-bottom: 19px;\n");
      out.write("        cursor: pointer;\n");
      out.write("        padding: 15px;\n");
      out.write("        /* margin-right: 73px; */\n");
      out.write("        width: 10%;\n");
      out.write("        background: white;\n");
      out.write("        font-family: 'Poppins', sans-serif\n");
      out.write("   }\n");
      out.write("</style>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String name="mugundhan";
           
         
      out.write("\n");
      out.write("         <h1 class=\"titleCnt\">");
      out.print(name);
      out.write("</h1>\n");
      out.write("        <div class=\"buttonCont\">\n");
      out.write("<a class=\"chatButton\" href='startchat.jsp'> Chat here </a>\n");
      out.write("<a class='logout-chat' href='Logout_chat.jsp' > Logout </a>\n");
      out.write("</div>\n");
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
