/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-22 07:42:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Alert Messager - jQuery EasyUI Demo</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/easyUI/themes/default/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/easyUI/themes/icon.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/easyUI/css/demo.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/easyUI/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/easyUI/jquery.easyui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2>Alert Messager</h2>\r\n");
      out.write("\t<div class=\"demo-info\">\r\n");
      out.write("\t\t<div class=\"demo-tip icon-tip\"></div>\r\n");
      out.write("\t\t<div>Click on each button to display different alert message box.</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<h2>Message Box Position</h2>\r\n");
      out.write("\t<div class=\"demo-info\">\r\n");
      out.write("\t\t<div class=\"demo-tip icon-tip\"></div>\r\n");
      out.write("\t\t<div>Click the buttons below to display message box on different position.</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"margin:10px 0;\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"topLeft();\">TopLeft</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"topCenter()\">TopCenter</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"topRight()\">TopRight</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"centerLeft()\">CenterLeft</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"center()\">Center</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"centerRight()\">CenterRight</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"bottomLeft()\">BottomLeft</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"bottomCenter()\">BottomCenter</a>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"bottomRight()\">BottomRight</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\tfunction topLeft(){\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle:'My Title',\r\n");
      out.write("\t\t\t\tmsg:'The message content',\r\n");
      out.write("\t\t\t\tshowType:'show',\r\n");
      out.write("\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\tright:'',\r\n");
      out.write("\t\t\t\t\tleft:0,\r\n");
      out.write("\t\t\t\t\ttop:document.body.scrollTop+document.documentElement.scrollTop,\r\n");
      out.write("\t\t\t\t\tbottom:''\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction topCenter(){\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle:'My Title',\r\n");
      out.write("\t\t\t\tmsg:'The message content',\r\n");
      out.write("\t\t\t\tshowType:'slide',\r\n");
      out.write("\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\tright:'',\r\n");
      out.write("\t\t\t\t\ttop:document.body.scrollTop+document.documentElement.scrollTop,\r\n");
      out.write("\t\t\t\t\tbottom:''\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction topRight(){\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle:'My Title',\r\n");
      out.write("\t\t\t\tmsg:'The message content',\r\n");
      out.write("\t\t\t\tshowType:'show',\r\n");
      out.write("\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\tleft:'',\r\n");
      out.write("\t\t\t\t\tright:0,\r\n");
      out.write("\t\t\t\t\ttop:document.body.scrollTop+document.documentElement.scrollTop,\r\n");
      out.write("\t\t\t\t\tbottom:''\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction centerLeft(){\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle:'My Title',\r\n");
      out.write("\t\t\t\tmsg:'The message content',\r\n");
      out.write("\t\t\t\tshowType:'fade',\r\n");
      out.write("\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\tleft:0,\r\n");
      out.write("\t\t\t\t\tright:'',\r\n");
      out.write("\t\t\t\t\tbottom:''\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction center(){\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle:'My Title',\r\n");
      out.write("\t\t\t\tmsg:'The message content',\r\n");
      out.write("\t\t\t\tshowType:'fade',\r\n");
      out.write("\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\tright:'',\r\n");
      out.write("\t\t\t\t\tbottom:''\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction centerRight(){\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle:'My Title',\r\n");
      out.write("\t\t\t\tmsg:'The message content',\r\n");
      out.write("\t\t\t\tshowType:'fade',\r\n");
      out.write("\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\tleft:'',\r\n");
      out.write("\t\t\t\t\tright:0,\r\n");
      out.write("\t\t\t\t\tbottom:''\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction bottomLeft(){\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle:'My Title',\r\n");
      out.write("\t\t\t\tmsg:'The message content',\r\n");
      out.write("\t\t\t\tshowType:'show',\r\n");
      out.write("\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\tleft:0,\r\n");
      out.write("\t\t\t\t\tright:'',\r\n");
      out.write("\t\t\t\t\ttop:'',\r\n");
      out.write("\t\t\t\t\tbottom:-document.body.scrollTop-document.documentElement.scrollTop\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction bottomCenter(){\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle:'My Title',\r\n");
      out.write("\t\t\t\tmsg:'The message content',\r\n");
      out.write("\t\t\t\tshowType:'slide',\r\n");
      out.write("\t\t\t\tstyle:{\r\n");
      out.write("\t\t\t\t\tright:'',\r\n");
      out.write("\t\t\t\t\ttop:'',\r\n");
      out.write("\t\t\t\t\tbottom:-document.body.scrollTop-document.documentElement.scrollTop\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction bottomRight(){\r\n");
      out.write("\t\t\t$.messager.show({\r\n");
      out.write("\t\t\t\ttitle:'My Title',\r\n");
      out.write("\t\t\t\tmsg:'The message content',\r\n");
      out.write("\t\t\t\tshowType:'show'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /alert.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/alert.jsp(5,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /alert.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
