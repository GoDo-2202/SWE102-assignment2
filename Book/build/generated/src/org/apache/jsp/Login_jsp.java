package org.apache.jsp;

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
      out.write("        <link href=\"css/Template_login.css\" rel=\"stylesheet\" id=\"text/css\">\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"logreg-forms\">\n");
      out.write("            <form class=\"form-signin\" action=\"login\" method=\"post\">\n");
      out.write("                <h1 class=\"h3 mb-3 font-weight-normal\" style=\"text-align: center\"> Sign in</h1>\n");
      out.write("                <div class=\"social-login\">\n");
      out.write("                    <button class=\"btn facebook-btn social-btn\" type=\"button\"><span><i class=\"fab fa-facebook-f\"></i> Sign in with Facebook</span> </button>\n");
      out.write("                    <button class=\"btn google-btn social-btn\" type=\"button\"><span><i class=\"fab fa-google-plus-g\"></i> Sign in with Google+</span> </button>\n");
      out.write("                </div>\n");
      out.write("                <p style=\"text-align:center\"> OR  </p>\n");
      out.write("                <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input name=\"user\"  type=\"text\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Username\" required=\"\" autofocus=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input name=\"pass\"  type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group form-check\">\n");
      out.write("                    <input name=\"remember\" value=\"1\" type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"exampleCheck1\">Remember me</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <button class=\"btn btn-md btn-rounded btn-block form-control submit\" type=\"submit\"><i class=\"fas fa-sign-in-alt\"></i> Sign in</button>\n");
      out.write("                </div>                          \n");
      out.write("                <a href=\"#\" id=\"forgot_pswd\">Forgot password?</a>\n");
      out.write("                <hr>\n");
      out.write("                <!-- <p>Don't have an account!</p>  -->\n");
      out.write("                <button class=\"btn btn-primary btn-block\" type=\"button\" id=\"btn-signup\"><i class=\"fas fa-user-plus\"></i> Sign up New Account</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <form action=\"#\" class=\"form-reset\" method=\"post\">\n");
      out.write("                <input type=\"email\" id=\"resetEmail\" class=\"form-control\" placeholder=\"Email address\" required=\"\" autofocus=\"\">\n");
      out.write("                <button class=\"btn btn-primary btn-block\" type=\"submit\">Reset Password</button>\n");
      out.write("                <a href=\"#\" id=\"cancel_reset\"><i class=\"fas fa-angle-left\"></i> Back</a>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <form action=\"signup\" method=\"post\" class=\"form-signup\">\n");
      out.write("                <div class=\"social-login\">\n");
      out.write("                    <button class=\"btn facebook-btn social-btn\" type=\"button\"><span><i class=\"fab fa-facebook-f\"></i> Sign up with Facebook</span> </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"social-login\">\n");
      out.write("                    <button class=\"btn google-btn social-btn\" type=\"button\"><span><i class=\"fab fa-google-plus-g\"></i> Sign up with Google+</span> </button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <p style=\"text-align:center\">OR</p>\n");
      out.write("\n");
      out.write("                <input name=\"user\" type=\"text\" id=\"user-name\" class=\"form-control\" placeholder=\"User name\" required=\"\" autofocus=\"\">\n");
      out.write("                <input name=\"pass\" type=\"password\" id=\"user-pass\" class=\"form-control\" placeholder=\"Password\" required autofocus=\"\">\n");
      out.write("                <input name=\"repass\" type=\"password\" id=\"user-repeatpass\" class=\"form-control\" placeholder=\"Repeat Password\" required autofocus=\"\">\n");
      out.write("\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <button class=\"btn btn-md btn-block submit\" type=\"submit\"><i class=\"fas fa-user-plus\"></i> Sign Up</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a href=\"#\" id=\"cancel_signup\"><i class=\"fa fa-angle-left\"></i> Back</a>\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("            <script>\n");
      out.write("                function toggleResetPswd(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    $('#logreg-forms .form-signin').toggle() // display:block or none\n");
      out.write("                    $('#logreg-forms .form-reset').toggle() // display:block or none\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function toggleSignUp(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    $('#logreg-forms .form-signin').toggle(); // display:block or none\n");
      out.write("                    $('#logreg-forms .form-signup').toggle(); // display:block or none\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                $(() => {\n");
      out.write("                    // Login Register Form\n");
      out.write("                    $('#logreg-forms #forgot_pswd').click(toggleResetPswd);\n");
      out.write("                    $('#logreg-forms #cancel_reset').click(toggleResetPswd);\n");
      out.write("                    $('#logreg-forms #btn-signup').click(toggleSignUp);\n");
      out.write("                    $('#logreg-forms #cancel_signup').click(toggleSignUp);\n");
      out.write("                })\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("    </body>    \n");
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
