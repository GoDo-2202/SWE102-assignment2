package org.apache.jsp.js;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"logreg-forms\">\n");
      out.write("            <form class=\"form-signin\">\n");
      out.write("                <h1 class=\"h3 mb-3 font-weight-normal\" style=\"text-align: center\"> Sign in</h1>\n");
      out.write("                <div class=\"social-login\">\n");
      out.write("                    <button class=\"btn facebook-btn social-btn\" type=\"button\"><span><i class=\"fab fa-facebook-f\"></i> Sign in with Facebook</span> </button>\n");
      out.write("                    <button class=\"btn google-btn social-btn\" type=\"button\"><span><i class=\"fab fa-google-plus-g\"></i> Sign in with Google+</span> </button>\n");
      out.write("                </div>\n");
      out.write("                <p style=\"text-align:center\"> OR  </p>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"email\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required=\"\" autofocus=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <button class=\"btn btn-md btn-rounded btn-block form-control submit\" type=\"submit\"><i class=\"fas fa-sign-in-alt\"></i> Sign in</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a href=\"#\" id=\"forgot_pswd\">Forgot password?</a>\n");
      out.write("                <hr>\n");
      out.write("                <!-- <p>Don't have an account!</p>  -->\n");
      out.write("                <button class=\"btn btn-primary btn-block\" type=\"button\" id=\"btn-signup\"><i class=\"fas fa-user-plus\"></i> Sign up New Account</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <form action=\"#\" class=\"form-reset\">\n");
      out.write("                <input type=\"email\" id=\"resetEmail\" class=\"form-control\" placeholder=\"Email address\" required=\"\" autofocus=\"\">\n");
      out.write("                <button class=\"btn btn-primary btn-block\" type=\"submit\">Reset Password</button>\n");
      out.write("                <a href=\"#\" id=\"cancel_reset\"><i class=\"fas fa-angle-left\"></i> Back</a>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"#\" class=\"form-signup\">\n");
      out.write("            <div class=\"social-login\">\n");
      out.write("                <button class=\"btn facebook-btn social-btn\" type=\"button\"><span><i class=\"fab fa-facebook-f\"></i> Sign up with Facebook</span> </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"social-login\">\n");
      out.write("                <button class=\"btn google-btn social-btn\" type=\"button\"><span><i class=\"fab fa-google-plus-g\"></i> Sign up with Google+</span> </button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <p style=\"text-align:center\">OR</p>\n");
      out.write("\n");
      out.write("            <input type=\"text\" id=\"user-name\" class=\"form-control\" placeholder=\"Full name\" required=\"\" autofocus=\"\">\n");
      out.write("            <input type=\"email\" id=\"user-email\" class=\"form-control\" placeholder=\"Email address\" required autofocus=\"\">\n");
      out.write("            <input type=\"password\" id=\"user-pass\" class=\"form-control\" placeholder=\"Password\" required autofocus=\"\">\n");
      out.write("            <input type=\"password\" id=\"user-repeatpass\" class=\"form-control\" placeholder=\"Confirm Password\" required autofocus=\"\">\n");
      out.write("\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <button class=\"btn btn-md btn-block submit\" type=\"submit\"><i class=\"fas fa-user-plus\"></i> Sign Up</button>\n");
      out.write("            </div>\n");
      out.write("        </form>    \n");
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
