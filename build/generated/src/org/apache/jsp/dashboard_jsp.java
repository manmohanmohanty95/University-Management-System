package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Simple Bootstrap Dashboard</title>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            .sidebar {\n");
      out.write("                height: 100vh;\n");
      out.write("                background-color: #343a40;\n");
      out.write("                padding: 20px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar h2 {\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar a {\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 10px 0;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidebar a:hover {\n");
      out.write("                background-color: #495057;\n");
      out.write("                padding-left: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topbar {\n");
      out.write("                background-color: #6200ea;\n");
      out.write("                padding: 15px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card {\n");
      out.write("                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Footer logout button */\n");
      out.write("            .logout-btn {\n");
      out.write("                background-color: #ff4d4d;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                text-align: center;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logout-btn:hover {\n");
      out.write("                background-color: #ff6666;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- Sidebar -->\n");
      out.write("                <div class=\"col-md-2 sidebar\">\n");
      out.write("                    <h5>");
      out.print( session.getAttribute("fname"));
      out.print( session.getAttribute("lname"));
      out.write(" </h5>\n");
      out.write("                    <a href=\"#\">Home</a>\n");
      out.write("                    <a href=\"#\">Analytics</a>\n");
      out.write("                    <a href=\"#\">Users</a>\n");
      out.write("                    <a href=\"#\">Settings</a>\n");
      out.write("                    <a href=\"delete.html\">Delete Account</a>\n");
      out.write("                    <!-- Logout Button -->\n");
      out.write("                    <!-- Logout Button -->\n");
      out.write("                    <form action=\"logout\" method=\"post\" style=\"margin-top: 20px;\">\n");
      out.write("                        <button type=\"submit\" class=\"logout-btn\">Logout</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div class=\"col-md-10\">\n");
      out.write("                    <!-- Top Bar -->\n");
      out.write("                    <div class=\"topbar\">\n");
      out.write("                        <h1>Welcome to Your Dashboard</h1>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Content -->\n");
      out.write("                    <div class=\"container mt-4\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <div class=\"card p-3 text-center\">\n");
      out.write("                                    <h3>Total Users</h3>\n");
      out.write("                                    <p>1000</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <div class=\"card p-3 text-center\">\n");
      out.write("                                    <h3>New Signups</h3>\n");
      out.write("                                    <p>50</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <div class=\"card p-3 text-center\">\n");
      out.write("                                    <h3>Active Users</h3>\n");
      out.write("                                    <p>800</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap JS (Optional) -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
