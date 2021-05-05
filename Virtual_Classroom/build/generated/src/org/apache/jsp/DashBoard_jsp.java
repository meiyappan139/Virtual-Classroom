package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database_Objects.Database_Connection;
import java.sql.*;

public final class DashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Dashboard.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\r\n");
      out.write("<!--     <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">-->\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <div class=\"navigation nav navbar\">\r\n");
      out.write("       \r\n");
      out.write("       <div class=\"navLink\"> <a href=\"http://localhost:8080/Virtual_Classroom/startchat.jsp\" class=\"nav_cont\">CHAT</a></div>\r\n");
      out.write("      <div class=\"navLink\"> <a href=\"http://localhost:8080/Virtual_Classroom/Create_Class.jsp\" class=\"nav_cont\">CREATE CLASS</a></div>\r\n");
      out.write("    <div class=\"navLink\"> <a href=\"http://localhost:8080/Virtual_Classroom/Join_class.jsp\" class=\"nav_cont\">JOIN CLASS</a></div>\r\n");
      out.write("    <div class=\"navLink\"> <a href=\"http://localhost:8080/Virtual_Classroom/Show_profile_new.jsp\" class=\"nav_cont\">SHOW PROFILE</a></div>\r\n");
      out.write("    <div class=\"navLink\"> <a href=\"http://localhost:8080/Virtual_Classroom/Update_Profile_new.jsp\" class=\"nav_cont\">UPDATE PROFILE</a></div>\r\n");
      out.write("    <div class=\"navLink\"> <a href=\"http://localhost:8080/Virtual_Classroom/placement.html\" class=\"nav_cont\">PLACEMENT</a></div>\r\n");
      out.write("    <div class=\"navLink\"> <a href=\"http://localhost:8080/Virtual_Classroom/Logout.jsp\" class=\"nav_cont\">LOGOUT</a></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"teacher_container\">\r\n");
      out.write("      \r\n");
      out.write("      ");

                        String email=(String)session.getAttribute("email");
 	String name=null,mobile=null,password=null;
 	try
 	{
 		Connection con=Database_Connection.getConnection();
		String query="select * from users where email=?";
		
		PreparedStatement pstmt=con.prepareStatement(query);
        pstmt.setString(1,email);
        ResultSet rs=pstmt.executeQuery();
        
        if(rs.next())
        {
        	name=rs.getString("name");
        	mobile=rs.getString("mobile");
        	password=rs.getString("password");
        }
        
                session.setAttribute("name", name);
		session.setAttribute("email", email);
		session.setAttribute("password", password);
		session.setAttribute("mobile", mobile);
        con.close();
 	}
 	catch(Exception exp)
 	{
 		System.out.println("Exception is "+exp);
 	}
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
      
      out.write("\r\n");
      out.write("      <!--if loop of teacher boolean -->\r\n");
      out.write("      <h2 class=\"teacher_cnt\">Teacher</h2>\r\n");
      out.write("     \r\n");
      out.write("      <button class=\"create bg-primary text-white\" style=\"width:200px\" onclick=\"create_tes()\">Test Options</button>\r\n");
      out.write("     \r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("    \r\n");
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
                                                    int count=0;
                                                    
                                                    try
                                                    {
                                                  //   Statement s = con.createStatement();
                                                     PreparedStatement s=con.prepareStatement("SELECT COUNT(*) AS rowcount FROM students where code=?");
                                                     s.setString(1,rs.getString("code") );
                                                     ResultSet r = s.executeQuery();
                        r.next();
                       count = r.getInt("rowcount") ;
                        r.close() ;
                        System.out.println("MyTable has " + count + " row(s).");
                                                    }
                                                    catch(Exception e)
                                                    {
                                                       System.out.println(e);
                                                    }
                                                    
						
            
   
      out.write("\r\n");
      out.write("         <div class=\"table basic\">\r\n");
      out.write("        <div class=\"price-section\">\r\n");
      out.write("          <div class=\"price-area\">\r\n");
      out.write("            <div class=\"inner-area\">\r\n");
      out.write("              <span class=\"text\"></span>\r\n");
      out.write("              <span class=\"price\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"package-name\"></div>\r\n");
      out.write("        <ul class=\"features\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <span class=\"list-name\">");
      out.print(rs.getString("subject"));
      out.write("</span>\r\n");
      out.write("           \r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <span class=\"list-name\">");
      out.print(rs.getString("code"));
      out.write("</span>\r\n");
      out.write("            \r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <span class=\"list-name\">");
      out.print(count);
      out.write(" Students</span>\r\n");
      out.write("            \r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <span class=\"list-name\"></span>\r\n");
      out.write("            \r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"btn \" onclick=\"teacher_page(this)\"><button>Enter</button></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");

                                                } 
        
        }
				catch(Exception e)
				{
					
				}
        
        
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write("  </div>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");

       if(student)
       {
           
      out.write("\r\n");
      out.write("        <!-- Student if starts  -->\r\n");
      out.write("        \r\n");
      out.write("         <div class=\"student_container\">\r\n");
      out.write("    <h2 class=\"student_text\">Student</h2>\r\n");
      out.write("     <button class=\"take_test bg-primary text-white\"  onclick=\"take_test()\">Take test</button>\r\n");
      out.write("     <button class=\"view_res bg-primary text-white\" style=\"width:200px\" onclick=\"view_res()\">View Results</button>\r\n");
      out.write("    <div class=\"wrapper\" onclick=\"testing()\">\r\n");
      out.write("    \r\n");
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
            
    
      out.write("\r\n");
      out.write("         <div class=\"table basic\">\r\n");
      out.write("        <div class=\"price-section\">\r\n");
      out.write("          <div class=\"price-area\">\r\n");
      out.write("            <div class=\"inner-area\">\r\n");
      out.write("              <span class=\"text\"></span>\r\n");
      out.write("              <span class=\"price\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"package-name\"></div>\r\n");
      out.write("        <ul class=\"features\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <span class=\"list-name\">");
      out.print(rs.getString("subject"));
      out.write("</span>\r\n");
      out.write("           \r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <span class=\"list-name\">");
      out.print(rs.getString("code"));
      out.write("</span>\r\n");
      out.write("            \r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <span class=\"list-name\"></span>\r\n");
      out.write("            \r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <span class=\"list-name\"></span>\r\n");
      out.write("<!--              <span class=\"icon cross\"><i class=\"fas fa-times\"></i></span>-->\r\n");
      out.write("          </li>\r\n");
      out.write("          \r\n");
      out.write("        </ul>\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"btn\" onclick=\"download(this)\"><button>Enter</button></div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");

                                                }
                                                    }
				catch(Exception e)
				{
					
				}
            
        
        
        
        
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("        \r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("      function teacher_page(ele)\r\n");
      out.write("      {\r\n");
      out.write("          var x=ele.parentElement; //table_basics\r\n");
      out.write("          var y=x.getElementsByClassName(\"features\"); //features[class[0]]\r\n");
      out.write("          var li_child=y[0].children; //childres of ul\r\n");
      out.write("          //var span_child=li_child[0].children[0];\r\n");
      out.write("         // alert(li_child[0].children[0]);\r\n");
      out.write("         //alert(li_child.length);\r\n");
      out.write("         var ary=[];\r\n");
      out.write("         for(var i=0;i<li_child.length;i++)\r\n");
      out.write("         {\r\n");
      out.write("             var span_child=li_child[i].children[0];\r\n");
      out.write("             console.log(span_child.innerHTML);\r\n");
      out.write("             ary[i]=span_child.innerHTML;\r\n");
      out.write("         }\r\n");
      out.write("         //alert(ary[0]+\" \"+ary[1]);\r\n");
      out.write("         window.location=\"http://localhost:8080/Virtual_Classroom/UploadFile.jsp?subject=\"+ary[0]+\"&code=\"+ary[1];\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("       function download(ele)\r\n");
      out.write("      {\r\n");
      out.write("          var x=ele.parentElement; //table_basics\r\n");
      out.write("          var y=x.getElementsByClassName(\"features\"); //features[class[0]]\r\n");
      out.write("          var li_child=y[0].children; //childres of ul\r\n");
      out.write("          //var span_child=li_child[0].children[0];\r\n");
      out.write("         // alert(li_child[0].children[0]);\r\n");
      out.write("         //alert(li_child.length);\r\n");
      out.write("         var ary=[];\r\n");
      out.write("         for(var i=0;i<li_child.length;i++)\r\n");
      out.write("         {\r\n");
      out.write("             var span_child=li_child[i].children[0];\r\n");
      out.write("             console.log(span_child.innerHTML);\r\n");
      out.write("             ary[i]=span_child.innerHTML;\r\n");
      out.write("         }\r\n");
      out.write("         //alert(ary[0]+\" \"+ary[1]);\r\n");
      out.write("         window.location=\"http://localhost:8080/Virtual_Classroom/DownloadFile.jsp?subject=\"+ary[0]+\"&code=\"+ary[1];\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function create_tes()\r\n");
      out.write("      {\r\n");
      out.write("        //alert(\"hai\");\r\n");
      out.write("        window.location=\"http://localhost:8080/Virtual_Classroom/Test_options.jsp\";\r\n");
      out.write("      }\r\n");
      out.write("      function take_test()\r\n");
      out.write("      {\r\n");
      out.write("          //alert(\"take\");\r\n");
      out.write("          window.location=\"http://localhost:8080/Virtual_Classroom/Take_test.jsp\";\r\n");
      out.write("      }\r\n");
      out.write("      function view_res()\r\n");
      out.write("      {\r\n");
      out.write("          //alert(\"view\");\r\n");
      out.write("          window.location=\"http://localhost:8080/Virtual_Classroom/Student_result.jsp\";\r\n");
      out.write("      }\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
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
