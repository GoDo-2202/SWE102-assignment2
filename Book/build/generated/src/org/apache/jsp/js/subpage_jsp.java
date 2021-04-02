package org.apache.jsp.js;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class subpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../css/templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"templatemo_container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_content\">\n");
      out.write("\n");
      out.write("                <div id=\"templatemo_content_left\">\n");
      out.write("                    <div class=\"templatemo_content_left_section\">\n");
      out.write("                        <h1>Categories</h1>\n");
      out.write("                        <ul>\n");
      out.write("                            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"c\">\n");
      out.write("                                <li><a href=\"home\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                            </c:forEach>  \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"templatemo_content_left_section\">\n");
      out.write("                        <h1>Bestsellers</h1>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Đảo hải tặc</a></li>\n");
      out.write("                            <li><a href=\"#\">Photography</a></li>\n");
      out.write("                            <li><a href=\"#\">Cooking</a></li>\n");
      out.write("                            <li><a href=\"#\">Đấu pha thương khung</a></li>\n");
      out.write("                            <li><a href=\"#\">Sherlock home</a></li>\n");
      out.write("                            <li><a href=\"#\">Nghìn lẻ một đêm</a></li>\n");
      out.write("                            <li><a href=\"#\">Cấu trúc cơ sở dữ liệu và giải thuật</a></li>\n");
      out.write("                            <li><a href=\"#\">Phàm nhân tu tiên</a></li>\n");
      out.write("                            <li><a href=\"#\">Web Design</a></li>\n");
      out.write("                            <li><a href=\"http://www.photovaco.com\" target=\"_parent\">Free Photos</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div> <!-- end of content left -->\n");
      out.write("\n");
      out.write("                <div id=\"templatemo_content_right\">\n");
      out.write("\n");
      out.write("                    <h1>Name}</h1>\n");
      out.write("                    <div class=\"image_panel\"><img src=\"../images/daupha.jpg\" alt=\"CSS Template\" width=\"100\" height=\"150\" /></div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Tác giả: <a href=\"#\">Thiên tằm thổ đậu</a></li>\n");
      out.write("                        <li>Detail:</li>\n");
      out.write("                        <li>January 2024</li>\n");
      out.write("                        <li>Pages: 498</li>\n");
      out.write("                        <li>ISBN 10: 0-496-91612-0 | ISBN 13: 9780492518154</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <p></p>\n");
      out.write("                    <div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("                </div> <!-- end of content right -->   \n");
      out.write("            </div> <!-- end of content -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
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
