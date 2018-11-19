package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            @import url(https://fonts.googleapis.com/css?family=Roboto:400,300,500);\n");
      out.write("*:focus {\n");
      out.write("  outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  background: #DDD;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: #222;\n");
      out.write("  font-family: 'Roboto', sans-serif;\n");
      out.write("  font-weight: 300;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login-box {\n");
      out.write("  position: relative;\n");
      out.write("  margin: 5% auto;\n");
      out.write("  width: 600px;\n");
      out.write("  height: 400px;\n");
      out.write("  background: #FFF;\n");
      out.write("  border-radius: 2px;\n");
      out.write("  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  padding: 40px;\n");
      out.write("  width: 300px;\n");
      out.write("  height: 400px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  margin: 0 0 20px 0;\n");
      out.write("  font-weight: 300;\n");
      out.write("  font-size: 28px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"],\n");
      out.write("input[type=\"password\"] {\n");
      out.write("  display: block;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 4px;\n");
      out.write("  width: 220px;\n");
      out.write("  height: 32px;\n");
      out.write("  border: none;\n");
      out.write("  border-bottom: 1px solid #AAA;\n");
      out.write("  font-family: 'Roboto', sans-serif;\n");
      out.write("  font-weight: 400;\n");
      out.write("  font-size: 15px;\n");
      out.write("  transition: 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"]:focus,\n");
      out.write("input[type=\"password\"]:focus {\n");
      out.write("  border-bottom: 2px solid #16a085;\n");
      out.write("  color: #16a085;\n");
      out.write("  transition: 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"] {\n");
      out.write("  margin-top: 28px;\n");
      out.write("  width: 120px;\n");
      out.write("  height: 32px;\n");
      out.write("  background: #16a085;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 2px;\n");
      out.write("  color: #FFF;\n");
      out.write("  font-family: 'Roboto', sans-serif;\n");
      out.write("  font-weight: 500;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  transition: 0.1s ease;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"]:hover,\n");
      out.write("input[type=\"submit\"]:focus {\n");
      out.write("  opacity: 0.8;\n");
      out.write("  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);\n");
      out.write("  transition: 0.1s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"]:active {\n");
      out.write("  opacity: 1;\n");
      out.write("  box-shadow: 0 1px 2px rgba(0, 0, 0, 0.4);\n");
      out.write("  transition: 0.1s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".or {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 180px;\n");
      out.write("  left: 280px;\n");
      out.write("  width: 40px;\n");
      out.write("  height: 40px;\n");
      out.write("  background: #DDD;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);\n");
      out.write("  line-height: 40px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".right {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  right: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  padding: 40px;\n");
      out.write("  width: 300px;\n");
      out.write("  height: 400px;\n");
      out.write("  background: url('https://goo.gl/YbktSj');\n");
      out.write("  background-size: cover;\n");
      out.write("  background-position: center;\n");
      out.write("  border-radius: 0 2px 2px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".right .loginwith {\n");
      out.write("  display: block;\n");
      out.write("  margin-bottom: 40px;\n");
      out.write("  font-size: 28px;\n");
      out.write("  color: #FFF;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.social-signin {\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  width: 220px;\n");
      out.write("  height: 36px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 2px;\n");
      out.write("  color: #FFF;\n");
      out.write("  font-family: 'Roboto', sans-serif;\n");
      out.write("  font-weight: 500;\n");
      out.write("  transition: 0.2s ease;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.social-signin:hover,\n");
      out.write("button.social-signin:focus {\n");
      out.write("  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);\n");
      out.write("  transition: 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.social-signin:active {\n");
      out.write("  box-shadow: 0 1px 2px rgba(0, 0, 0, 0.4);\n");
      out.write("  transition: 0.2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.social-signin.facebook {\n");
      out.write("  background: #32508E;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.social-signin.twitter {\n");
      out.write("  background: #55ACEE;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.social-signin.google {\n");
      out.write("  background: #DD4B39;\n");
      out.write("}\n");
      out.write(".greetings{\n");
      out.write("    margin-top: 20px ;\n");
      out.write("    text-align: center;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("        <h1 class=\"greetings\">Hi dear student!</h1>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action=\"RegistServlet\" method=\"POST\">\n");
      out.write("           <div id=\"login-box\">\n");
      out.write("  <div class=\"left\">\n");
      out.write("    <h1>Sign up</h1>\n");
      out.write("    \n");
      out.write("    <input type=\"text\" name=\"username\" placeholder=\"Username\" />\n");
      out.write("    <input type=\"text\" name=\"email\" placeholder=\"E-mail\" />\n");
      out.write("    <input type=\"password\" name=\"password\" placeholder=\"Password\" />\n");
      out.write("    <input type=\"password\" name=\"password2\" placeholder=\"Retype password\" />\n");
      out.write("    \n");
      out.write("    <input type=\"submit\" name=\"signup_submit\" value=\"Sign me up\" />\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"right\">\n");
      out.write("    <span class=\"loginwith\">Sign in with<br />social network</span>\n");
      out.write("    \n");
      out.write("    <button class=\"social-signin facebook\">Log in with facebook</button>\n");
      out.write("    <button class=\"social-signin twitter\">Log in with Twitter</button>\n");
      out.write("    <button class=\"social-signin google\">Log in with Google+</button>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"or\">OR</div>\n");
      out.write("</div>\n");
      out.write("            <script> \n");
      out.write("document.getElementById(\"signup_submit\").disabled = true; \n");
      out.write("</script> \n");
      out.write("        </form>\n");
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
