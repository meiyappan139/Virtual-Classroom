package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database_Objects.Database_Connection;
import java.sql.*;

public final class show_005fresults_005fand_005frank_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("        <title>VIRTUAL CLASSROOM</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"rank.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("\n");
String res=request.getParameter("selectvalue");


      out.write("\n");
      out.write("\n");
      out.write("<div class=\"spc\"></div>\n");
      out.write("<div class=\"container dic\">\n");
      out.write("                <header>\n");
      out.write("                    <div class=\"container bg-dark\">\n");
      out.write("                        <h3 class=\"text-white\">");
      out.print(res );
      out.write("</h3>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("               \n");
      out.write("                ");

                String arr[]=new String[100];
                int ind=0;
                
  if(res!=null)
  {
  try
  {
   Connection con=Database_Connection.getConnection();
    String query="select * from results where qcode=?";
    PreparedStatement preparedStatement=con.prepareStatement(query);
    preparedStatement.setString(1, res);
    ResultSet rs=preparedStatement.executeQuery();
    int i=0,k=1;
    int total=0;
    
      out.write("\n");
      out.write("   \n");
      out.write("    <div class=\"spc\"></div>\n");
      out.write("               \n");
      out.write("            <h2 class=\"text-center text-white\">RESULT</h2>\n");
      out.write("                <table class=\"table table-striped table-dark\">\n");
      out.write("                    <thead>\n");
      out.write("                      <tr>\n");
      out.write("                        <th scope=\"col\">IDNO</th>\n");
      out.write("                        <th scope=\"col\">NAME</th>\n");
      out.write("                        <th scope=\"col\">MARKS</th>\n");
      out.write("                        <th scope=\"col\">TOTAL MARKS</th>\n");
      out.write("                      </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    ");

     while(rs.next())
     {
     i++;
     
     total=Integer.parseInt(rs.getString("total"));
     arr[ind++]=rs.getString("email");
     
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                      <tr>\n");
      out.write("      <th scope=\"row\">");
      out.print(k );
      out.write("</th>\n");
      out.write("      <td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("mark") );
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("total") );
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("                    ");
  
                    k++;
     }
      
     String string[]=res.split("_");
     //out.println("<h1>"+string[0]+"</h1>");
     String stud_query="select email from students where code=?";
     PreparedStatement stud_pre=con.prepareStatement(stud_query);
     stud_pre.setString(1, string[0]);
     ResultSet result=stud_pre.executeQuery();
     while(result.next())
     {
         
         String email_stud=result.getString("email");
         int flag=0;
         for(int x=0;x<ind;x++)
         {
             if(email_stud.equals(arr[x]))
             {
                 flag=1;
                 break;
             }
         }
         if(flag==0)
         {
              
              String name_query="select name from users where email=?";
              PreparedStatement name_pre=con.prepareStatement(name_query);
              name_pre.setString(1, email_stud);
              ResultSet r_names=name_pre.executeQuery();
              while(r_names.next())
              {
                  //out.println(r_names.getString("name"));
                    
      out.write("\n");
      out.write("                     <tr>\n");
      out.write("      <th scope=\"row\">");
      out.print(k);
      out.write("</th>\n");
      out.write("      <td>");
      out.print(r_names.getString("name") );
      out.write("</td>\n");
      out.write("      <td>NOT ATTEMPTED </td>\n");
      out.write("      <td>");
      out.print(total);
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("              \n");
      out.write("                ");
 
                k++;
              }
              
         }
     }
     
     
     
     
     
    
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("            </table>\n");
      out.write("<div class=\"spc\"></div>\n");
      out.write("<h2 class=\"text-center text-white\">RANK</h2>\n");
      out.write("                <table class=\"table table-striped table-dark\">\n");
      out.write("                    <thead>\n");
      out.write("                      <tr>\n");
      out.write("                        <th scope=\"col\">RANK</th>\n");
      out.write("                        <th scope=\"col\">NAME</th>\n");
      out.write("                        <th scope=\"col\">MARKS</th>\n");
      out.write("                        <th scope=\"col\">TOTAL MARKS</th>\n");
      out.write("                      </tr>\n");
      out.write("                    </thead>\n");
      out.write("                      ");
  
    int mark[]=new int[i];
    String name[]=new String[i];
    int j=0;
  ResultSet rs1=preparedStatement.executeQuery();
    while(rs1.next())
    {
    mark[j]=Integer.parseInt(rs1.getString("mark"));
    name[j]=rs1.getString("name");
    j++;
    }
    for(int x=0;x<i;x++)
    {
    for(int y=x+1;y<i;y++)
    {
    if(mark[x]<mark[y])
    {
    int temp=mark[x];
    mark[x]=mark[y];
    mark[y]=temp;
   
    String t=name[x];
    name[x]=name[y];
    name[y]=t;
    }
    }
    }
   for(int x=0;x<i;x++)
    {
      out.write("\n");
      out.write("    <tbody>\n");
      out.write("     <tr>\n");
      out.write("      <th scope=\"row\">");
      out.print(x+1 );
      out.write("</th>\n");
      out.write("      <td>");
      out.print(name[x] );
      out.write("</td>\n");
      out.write("      <td>");
      out.print(mark[x] );
      out.write("</td>\n");
      out.write("      <td>");
      out.print(total );
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("   \n");
      out.write("   ");

    }
    
      out.write("\n");
      out.write("   \n");
      out.write("   \n");
      out.write("           </tbody>\n");
      out.write("            </table>\n");
      out.write("           \n");
      out.write("            ");

   
   
  }
  catch(Exception e)
  {
 
  }
 
 
  }
 
 
 
 
               
  
      out.write("\n");
      out.write("  <div class=\"spc\"></div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("<div class=\"col-md-10\">\n");
      out.write("<a href=\"http://localhost:8080/Virtual_Classroom/DashBoard.jsp\" class=\"btn btn-primary btn-outline-lg active\" role=\"button\" aria-pressed=\"true\">BACK</a>\n");
      out.write("</div>\n");
      out.write("</div>  \n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("                 \n");
      out.write("<script src=\"bootstrap.min.js\"></script>\n");
      out.write("   <script src=\"jquery.min.js\"></script>\n");
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
