package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Título aqui</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\t<meta http-equiv=\"Cache-Control\" content=\"no-cache, no-store, must-revalidate\" />\r\n");
      out.write("\t<meta http-equiv=\"Pragma\" content=\"no-cache\" />\r\n");
      out.write("\t<meta http-equiv=\"Expires\" content=\"0\" />\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction focar() {\r\n");
      out.write("\t\t\tdocument.getElementById(\"usuario\").focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"j_spring_security_check\" method=\"post\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("    \t<div class=\"container\">\r\n");
      out.write("        \t<div class=\"row branding\">\r\n");
      out.write("            \t<div class=\"span6\">\r\n");
      out.write("                \t<h1 class=\"pull-left\"><a href=\"index.html\"><strong>Título Sistema</strong></a></h1>\r\n");
      out.write("                </div>            \t\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row navigation\">\r\n");
      out.write("\t           \t<div class=\"span12\">\r\n");
      out.write("                    <ul class=\"nav nav-tabs\">\r\n");
      out.write("                      <li><a href=\"menu1.jsp\">Menu 1</a></li>\r\n");
      out.write("                      <li><a href=\"menu2.jsp\">Menu 2</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>        \r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"container content\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"span8 leftContent\">\r\n");
      out.write("            \t<h2>subtítulo sistema</h2>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                \t<div class=\"span4\">\r\n");
      out.write("                    \t<p class=\"cntPara simpleDesign\" align=\"justify\">\r\n");
      out.write("                        \t<strong class=\"lead\">Titulo caixa 1</strong>\r\n");
      out.write("\t\t\t\t\t\t\tConteúdo caixa 1                        \t\r\n");
      out.write("                        </p>            \t                                                \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"span4\">\r\n");
      out.write("                    \t<p class=\"cntPara itsFree\" align=\"justify\">\r\n");
      out.write("                        \t<strong class=\"lead\">Título caixa 2</strong>\r\n");
      out.write("\t\t\t\t\t\t\tConteúdo caixa 2\r\n");
      out.write("                       </p>      \r\n");
      out.write("                    </div>                                        \r\n");
      out.write("                </div>\r\n");
      out.write("                <hr/>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                \t<div class=\"span4\">\r\n");
      out.write("                    \t<p class=\"cntPara secureApp\"  align=\"justify\">\r\n");
      out.write("                        \t<strong class=\"lead\">Título caixa 2</strong>\r\n");
      out.write("\t\t\t\t\t\t\tconteúdo caixa 3\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"span4\">\r\n");
      out.write("                    \t<p class=\"cntPara easyUse\">\r\n");
      out.write("                        \t<strong class=\"lead\">Título caixa 4</strong>\r\n");
      out.write("\t\t\t\t\t\t\tconteúdo caixa 4\r\n");
      out.write("                         </p>      \r\n");
      out.write("                    </div>                                        \r\n");
      out.write("                </div>\r\n");
      out.write("                <hr/>   \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                \t<div class=\"span8\">\r\n");
      out.write("                    \t<h3 class=\"quickTour\">Rodapé</h3>\r\n");
      out.write("\t\t\t\t\t\tconteúdo rodapé\r\n");
      out.write("                    </div>                                        \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"span4 sidebar\">\r\n");
      out.write("                <h2><a href=\"#\" class=\"btn btn-large btn-warning\">Alguma ação</a></h2>\r\n");
      out.write("                <div class=\"well quickSignupForm\">\r\n");
      out.write("                  <h3>Acesso ao Sistema</h3>\r\n");
      out.write("\t\t\t\t\t");

					if (request.getParameter("msg") != null) {
						out.print("<span style='color: red;font-weight: bold;'>Usuário ou senha incorretos</span>");
					}
      out.write("\t\t\r\n");
      out.write("                  <label>Login</label>\r\n");
      out.write("                  <input type=\"text\" id=\"usuario\" name=\"j_username\" class=\"span3\"  />\r\n");
      out.write("                  <label>Senha</label>\r\n");
      out.write("                  <input name=\"j_password\" type=\"password\" class=\"span3\" />                  \r\n");
      out.write("                  <input class=\"btn btn-large btn-success btnSignup\" type=\"submit\" value=\"Entrar\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <h3>Titulo caixa</h3>\r\n");
      out.write("                <p>\r\n");
      out.write("\t\t\t\t\tConteúdo caixa \r\n");
      out.write("                </p>                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
