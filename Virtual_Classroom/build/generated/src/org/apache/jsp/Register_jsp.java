package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>VIRTUAL CLASSROOM</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\r\n");
      out.write("    <link rel = \"stylesheet\" type=\"text/css\" href=\"Register.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"Validation_registration.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        \r\n");
      out.write("        function test_email(str)\r\n");
      out.write("        {\r\n");
      out.write("            var xmlhttp;\r\n");
      out.write("\t    if (window.XMLHttpRequest) \r\n");
      out.write("\t    {\r\n");
      out.write("\t        xmlhttp = new XMLHttpRequest();\r\n");
      out.write("\t    } \r\n");
      out.write("\t   \r\n");
      out.write("\t    xmlhttp.onreadystatechange = function() \r\n");
      out.write("\t    {\r\n");
      out.write("\t    \t\r\n");
      out.write("\t        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) \r\n");
      out.write("\t        {\r\n");
      out.write("\t            var obj=xmlhttp.responseText;\r\n");
      out.write("\t          //  console.log(obj);\r\n");
      out.write("\t            \r\n");
      out.write("\t            if(parseInt(obj)==1)\r\n");
      out.write("\t            {\r\n");
      out.write("\t            \t//document.getElementById(\"as\").innerHTML=str\r\n");
      out.write("\t            \tconsole.log(obj);\r\n");
      out.write("\t            \tvar x=document.getElementById(\"email\");\r\n");
      out.write("\t            \tx.classList.add(\"correct\");\r\n");
      out.write("\t            \tx.classList.remove(\"incorrect\");\r\n");
      out.write("\t            }\r\n");
      out.write("\t            else\r\n");
      out.write("            \t{\r\n");
      out.write("\t            \tconsole.log(obj);\r\n");
      out.write("\t            \tvar x=document.getElementById(\"email\");\r\n");
      out.write("\t            \tx.classList.add(\"incorrect\");\r\n");
      out.write("\t            \tx.classList.remove(\"correct\");\r\n");
      out.write("            \t\r\n");
      out.write("            \t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t    }\r\n");
      out.write("\t    xmlhttp.open(\"POST\", \"RegisterEmailValidate?email=\" +str, true);\r\n");
      out.write("\t    xmlhttp.send(null);\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
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
      out.write("\t\t\t\t\t<div class=\"col-md-10 hed\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"text-left text-white\">REGISTRATION FORM</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("                                <form  method=\"post\" action=\"Registration\" onsubmit=\"return Validate()\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"\" class=\"label control-label\">NAME</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" type=\"text\" name=\"name\" id=\"name\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"\" class=\"label control-label\">EMAIL</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" type=\"text\" name=\"email\" id=\"email\" onkeyup=\"test_email(this.value)\" required>\r\n");
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
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"\" class=\"label control-label\">REPEAT PASSWORD</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"form-control\" type=\"password\" name=\"cpass\" id=\"cpass\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"\" class=\"label control-label\">MOBILE</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" type=\"text\" name=\"mobile\" id=\"mobile\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-outline-light\" type=\"submit\">REGISTER</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"http://localhost:8080/Virtual_Classroom/Login.jsp\" class=\"btn btn-primary btn-outline-lg active\" role=\"button\" aria-pressed=\"true\">Already Have a Account ? SignIn</a>\r\n");
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
      out.write("</body>");
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
