package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demoexam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Online Test</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <!-- FontAweome CDN Link for Icons-->\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("    <script>\n");
      out.write("           var obj;\n");
      out.write("          // document.getElementById(\"a\").innerHTML\n");
      out.write("        function test(str)\n");
      out.write("        {\n");
      out.write("              \n");
      out.write("                alert(str);\n");
      out.write("                var ob=new XMLHttpRequest();\n");
      out.write("                \n");
      out.write("                ob.onreadystatechange=function ss()\n");
      out.write("                {\n");
      out.write("                    if(ob.readyState===4)\n");
      out.write("                    {\n");
      out.write("                        console.log(\"kk\");\n");
      out.write("                        var str=(ob.responseText);\n");
      out.write("                         console.log(\"kk332\");\n");
      out.write("                        obj=JSON.parse(str);\n");
      out.write("                      \n");
      out.write("                        for(i=0;i<obj.length;i++)\n");
      out.write("                        {\n");
      out.write("                            console.log(obj[i].ID);\n");
      out.write("                            console.log(obj[i].QUESTION);\n");
      out.write("                            console.log(obj[i].ANSWERS);\n");
      out.write("                   //         console.log(online[i].Date_Of_Birth);\n");
      out.write("                   //         console.log(online[i].Place_Of_Birth);\n");
      out.write("                   //         console.log(online[i].Country);\n");
      out.write("                            var ary_options=obj[i].OPTIONS;\n");
      out.write("                            console.log(obj[i].OPTIONS);\n");
      out.write("                            for(j=0;j<ary_options.length;j++)\n");
      out.write("                            console.log(ary_options[j]);\n");
      out.write("\n");
      out.write("                        }  \n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("              //  alert(obj);\n");
      out.write("\n");
      out.write("            ob.open(\"GET\",\"JSONServlet?table_name=\"+str,true);\n");
      out.write("            ob.send();\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("   \n");
      out.write("</head>\n");
 String 
       //s=request.getParameter("select_code"); 
        s="18toc101_cia4";
//session.setAttribute("qcode_result", s);

      out.write("\n");
      out.write("<body onload=\"test('");
      out.print(s);
      out.write("')\">\n");
      out.write("    <!-- start Quiz button -->\n");
      out.write("    <div class=\"start_btn\" onclick=\"asd()\" ><button>Start Exam</button></div>\n");
      out.write("\n");
      out.write("    <!-- Info Box -->\n");
      out.write("    <div class=\"info_box\">\n");
      out.write("        <div class=\"info-title\"><span>Some Rules for Online Examination</span></div>\n");
      out.write("        <div class=\"info-list\">\n");
      out.write("            <div class=\"info\">1. You will have only <span>15 seconds</span> per each question.</div>\n");
      out.write("            <div class=\"info\">2. You can't select any option once time goes off.</div>\n");
      out.write("            <div class=\"info\">3. If you exceed tab switching <span>of 2 times</span> your test will be ended</div>\n");
      out.write("            <div class=\"info\">4. You'll get mark on the basis of your correct answers.</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"buttons\">\n");
      out.write("            <button class=\"quit\">Exit Exam</button>\n");
      out.write("            <button class=\"restart\">Continue</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Quiz Box -->\n");
      out.write("    <div class=\"quiz_box\">\n");
      out.write("        <header>\n");
      out.write("            <div class=\"title\">");
      out.print(s);
      out.write("</div>\n");
      out.write("            <div class=\"timer\">\n");
      out.write("                <div class=\"time_left_txt\">Time Left</div>\n");
      out.write("                <div class=\"timer_sec\">15</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"time_line\"></div>\n");
      out.write("        </header>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"que_text\">\n");
      out.write("                <!-- Here I've inserted question from JavaScript -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"option_list\">\n");
      out.write("                <!-- Here I've inserted options from JavaScript -->\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- footer of Quiz Box -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"total_que\">\n");
      out.write("                <!-- Here I've inserted Question Count Number from JavaScript -->\n");
      out.write("            </div>\n");
      out.write("            <button class=\"next_btn\">Next Que</button>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Result Box -->\n");
      out.write("    <div class=\"result_box\">\n");
      out.write("        <div class=\"icon\">\n");
      out.write("            <i class=\"fas fa-crown\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"complete_text\">You've completed the Examination!</div>\n");
      out.write("        <div class=\"score_text\">\n");
      out.write("            <!-- Here I've inserted Score Result from JavaScript -->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"buttons\">\n");
      out.write("          \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Inside this JavaScript file I've inserted Questions and Options only -->\n");
      out.write("\n");
      out.write("    <!-- Inside this JavaScript file I've coded all Quiz Codes -->\n");
      out.write("    <script src=\"Script.js\"></script>\n");
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
