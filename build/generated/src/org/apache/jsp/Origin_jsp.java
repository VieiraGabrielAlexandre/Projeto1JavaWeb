package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Origin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Plataforma de Jogos</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css.css\" type=\"text/css\" />\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                 box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .conteudo{\n");
      out.write("               text-align: center;\n");
      out.write("               position:absolute; \n");
      out.write("               top:40%;\n");
      out.write("               left:40%;\n");
      out.write("               margin-top:-60px;\n");
      out.write("               margin-left:-60px;\n");
      out.write("               border: 1px solid black;\n");
      out.write("               padding: 10px;\n");
      out.write("            }\n");
      out.write("            li{\n");
      out.write("                padding: 0 0 10px 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"conteudo\" >\n");
      out.write("        <h1>Escolha o Jogo da sua preferencia</h1>\n");
      out.write("        \n");
      out.write("        <ol type=\"123\">\n");
      out.write("            <li>The Sims</li>\n");
      out.write("            <li>Dragon Age</li>\n");
      out.write("            <li>FIFA</li>\n");
      out.write("            <li>Madden NFL</li>\n");
      out.write("            <ul></ul>\n");
      out.write("            <form action=\"acao2.jsp\" method=\"get\">\n");
      out.write("                <input type=\"text\"  name=\"escolha\" placeholder=\"Digite o N* da opcao\"/> <br><br>\n");
      out.write("                <input type=\"submit\"  value=\"entrar\"/>\n");
      out.write("            </form>\n");
      out.write("        </ol>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
