package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database_Objects.Database_Connection;
import java.sql.*;

public final class Dashboard_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Styling.css\">\n");
      out.write("<!--     <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">-->\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("  <div class=\"navigation\">\n");
      out.write("      <div class=\"navLink\"> <a href=\"#\" class=\"nav_cont\">CREATE CLASS</a></div>\n");
      out.write("    <div class=\"navLink\"> <a href=\"#\" class=\"nav_cont\">JOIN CLASS</a></div>\n");
      out.write("    <div class=\"navLink\"> <a href=\"#\" class=\"nav_cont\">SHOW CLASS</a></div>\n");
      out.write("    <div class=\"navLink\"> <a href=\"#\" class=\"nav_cont\">UPDATE PROFILE</a></div>\n");
      out.write("    <div class=\"navLink\"> <a href=\"#\" class=\"nav_cont\">LOGOUT</a></div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"teacher_container\">\n");
      out.write("      \n");
      out.write("      ");

                        String email="18euit080@skcet.ac.in";
		//	out.println("<h1>Welcome "+email+"</h1>");
			Connection con=Database_Connection.getConnection();
			boolean teacher=false;
			boolean student=false;
			
					try
					{
						
					String query="select 1 from teachers where email=?";
					PreparedStatement preparedStatement=con.prepareStatement(query);
					preparedStatement.setString(1, email);
					ResultSet rs=preparedStatement.executeQuery();
				//	out.println(rs.next());
				
					teacher=rs.next();
					
					String query1="select 1 from students where email=?";
					PreparedStatement preparedStatement1=con.prepareStatement(query1);
					preparedStatement1.setString(1, email);
					ResultSet rs1=preparedStatement1.executeQuery();
				//	out.println(rs1.next());
					student=rs1.next();
					
					
						
						
					}
					catch(Exception e)
					{
						out.println(e);
					}
                                      
       if(teacher)
       {
      
      out.write("\n");
      out.write("      <!--if loop of teacher boolean -->\n");
      out.write("      <h2 class=\"teacher_cnt\">Teacher</h2>\n");
      out.write("     \n");
      out.write("      <button class=\"create\"  onclick=\"create_tes()\">create test</button>\n");
      out.write("     \n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("    \n");
      out.write("     ");
 
          // out.println("<h1>Your role as a Teacher</h1>");
				try
				{
					//	out.println("<a href='Test_options.jsp'>Create Test</a>");	
						String class_query="select * from teachers where email=?";
						PreparedStatement prepare_class=con.prepareStatement(class_query);
						prepare_class.setString(1, email);
						ResultSet rs=prepare_class.executeQuery();
						
							
						while(rs.next())
						{
						
            
   
      out.write("\n");
      out.write("         <div class=\"table basic\">\n");
      out.write("        <div class=\"price-section\">\n");
      out.write("          <div class=\"price-area\">\n");
      out.write("            <div class=\"inner-area\">\n");
      out.write("              <span class=\"text\"></span>\n");
      out.write("              <span class=\"price\"></span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"package-name\"></div>\n");
      out.write("        <ul class=\"features\">\n");
      out.write("          <li>\n");
      out.write("            <span class=\"list-name\">");
      out.print(rs.getString("subject"));
      out.write("</span>\n");
      out.write("           \n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <span class=\"list-name\">");
      out.print(rs.getString("code"));
      out.write("</span>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <span class=\"list-name\"></span>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <span class=\"list-name\"></span>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("    \n");
      out.write("        <div class=\"btn\" onclick=\"test(this)\"><button>Enter</button></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

                                                } 
        
        }
				catch(Exception e)
				{
					
				}
        
        
      out.write("\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("  </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        ");

       if(student)
       {
           
      out.write("\n");
      out.write("        <!-- Student if starts  -->\n");
      out.write("        \n");
      out.write("         <div class=\"student_container\">\n");
      out.write("    <h2 class=\"student_text\">Student</h2>\n");
      out.write("     <button class=\"take_test\"  onclick=\"take_test()\">Take test</button>\n");
      out.write("     <button class=\"view_res\"  onclick=\"view_res()\">View Results</button>\n");
      out.write("    <div class=\"wrapper\" onclick=\"testing()\">\n");
      out.write("    \n");
      out.write("    ");
 //out.println("<h1>Your role as a Student</h1>");
				try
				{
                                               // out.println("<a href='Take_test.jsp'>Take Test</a><br>");
                                               // out.println("<a href='Student_result.jsp'>view Results</a>");
						String class_query="select * from students where email=?";
						PreparedStatement prepare_class=con.prepareStatement(class_query);
						prepare_class.setString(1, email);
						ResultSet rs=prepare_class.executeQuery();
						
						
						while(rs.next())
						{
            
    
      out.write("\n");
      out.write("         <div class=\"table basic\">\n");
      out.write("        <div class=\"price-section\">\n");
      out.write("          <div class=\"price-area\">\n");
      out.write("            <div class=\"inner-area\">\n");
      out.write("              <span class=\"text\"></span>\n");
      out.write("              <span class=\"price\"></span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"package-name\"></div>\n");
      out.write("        <ul class=\"features\">\n");
      out.write("          <li>\n");
      out.write("            <span class=\"list-name\">");
      out.print(rs.getString("subject"));
      out.write("</span>\n");
      out.write("           \n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <span class=\"list-name\">");
      out.print(rs.getString("code"));
      out.write("</span>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <span class=\"list-name\"></span>\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <span class=\"list-name\"></span>\n");
      out.write("<!--              <span class=\"icon cross\"><i class=\"fas fa-times\"></i></span>-->\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("    \n");
      out.write("        <div class=\"btn\" onclick=\"download(this)\"><button>Enter</button></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

                                                }
                                                    }
				catch(Exception e)
				{
					
				}
            
        
        
        
        
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("      function test(ele)\n");
      out.write("      {\n");
      out.write("          var x=ele.parentElement; //table_basics\n");
      out.write("          var y=x.getElementsByClassName(\"features\"); //features[class[0]]\n");
      out.write("          var li_child=y[0].children; //childres of ul\n");
      out.write("          //var span_child=li_child[0].children[0];\n");
      out.write("         // alert(li_child[0].children[0]);\n");
      out.write("         alert(li_child.length);\n");
      out.write("         var ary=[];\n");
      out.write("         for(var i=0;i<li_child.length;i++)\n");
      out.write("         {\n");
      out.write("             var span_child=li_child[i].children[0];\n");
      out.write("             console.log(span_child.innerHTML);\n");
      out.write("             ary[i]=span_child.innerHTML;\n");
      out.write("         }\n");
      out.write("         alert(ary[0]+\" \"+ary[1]);\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("       function download(ele)\n");
      out.write("      {\n");
      out.write("          var x=ele.parentElement; //table_basics\n");
      out.write("          var y=x.getElementsByClassName(\"features\"); //features[class[0]]\n");
      out.write("          var li_child=y[0].children; //childres of ul\n");
      out.write("          //var span_child=li_child[0].children[0];\n");
      out.write("         // alert(li_child[0].children[0]);\n");
      out.write("         alert(li_child.length);\n");
      out.write("         var ary=[];\n");
      out.write("         for(var i=0;i<li_child.length;i++)\n");
      out.write("         {\n");
      out.write("             var span_child=li_child[i].children[0];\n");
      out.write("             console.log(span_child.innerHTML);\n");
      out.write("             ary[i]=span_child.innerHTML;\n");
      out.write("         }\n");
      out.write("         alert(ary[0]+\" \"+ary[1]);\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      function create_tes()\n");
      out.write("      {\n");
      out.write("        alert(\"hai\");\n");
      out.write("      }\n");
      out.write("      function take_test()\n");
      out.write("      {\n");
      out.write("          alert(\"take\");\n");
      out.write("      }\n");
      out.write("      function view_res()\n");
      out.write("      {\n");
      out.write("          alert(\"view\");\n");
      out.write("      }\n");
      out.write("  </script>\n");
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
