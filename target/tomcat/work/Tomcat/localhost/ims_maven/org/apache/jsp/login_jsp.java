/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-21 05:11:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>办公软件</title>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/login.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/easyUI/easyui.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/jquery/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/jquery/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/easyUI/jquery.easyui.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/easyUI/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("\r\n");
      out.write("            $(\"#vimg\").css(\"cursor\", \"pointer\").click(function () {\r\n");
      out.write("                $(\"#vimg\").prop(\"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/createCode?data=\" + Math.random())\r\n");
      out.write("            })\r\n");
      out.write("            $(\"#login_id\").click(function () {\r\n");
      out.write("\r\n");
      out.write("                var userId = $(\"#userId\").val();\r\n");
      out.write("                var password = $(\"#passWord\").val();\r\n");
      out.write("                var code = $(\"#vcode\").val();\r\n");
      out.write("                if (!/^[a-z0-9]{5,12}$/.test(userId)) {\r\n");
      out.write("                    $.messager.alert('My Title','账号不合法','warning');\r\n");
      out.write("                } else if (!/^[a-z0-9]{5,12}$/.test(password)) {\r\n");
      out.write("                    $.messager.alert(\"密码不合法\")\r\n");
      out.write("                } else if (!/^[0-9]{4}$/.test(code)) {\r\n");
      out.write("                    $.messager.alert(\"验证码不合法\")\r\n");
      out.write("                } else {\r\n");
      out.write("                    var data = $(\"#loginForm\").serialize();\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        type: \"POST\",\r\n");
      out.write("                        url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login\",\r\n");
      out.write("                        data: data,\r\n");
      out.write("                        dataType: \"text\",\r\n");
      out.write("                        success: function (result) {\r\n");
      out.write("                            if (result) {\r\n");
      out.write("                               alert(result)\r\n");
      out.write("                            }\r\n");
      out.write("                            else  window.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/main.action\";\r\n");
      out.write("                        },\r\n");
      out.write("                        error: function () {\r\n");
      out.write("\r\n");
      out.write("                            alert(\"登陆失败\")\r\n");
      out.write("\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"login-hd\">\r\n");
      out.write("    <div class=\"left-bg\"></div>\r\n");
      out.write("    <div class=\"right-bg\"></div>\r\n");
      out.write("    <div class=\"hd-inner\">\r\n");
      out.write("        <span class=\"logo\"></span>\r\n");
      out.write("        <span class=\"split\"></span>\r\n");
      out.write("        <span class=\"sys-name\">智能办公平台</span>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"login-bd\">\r\n");
      out.write("    <div class=\"bd-inner\">\r\n");
      out.write("        <div class=\"inner-wrap\">\r\n");
      out.write("            <div class=\"lg-zone\">\r\n");
      out.write("                <div class=\"lg-box\">\r\n");
      out.write("                    <div class=\"panel-heading\" style=\"background-color: #11a9e2;\">\r\n");
      out.write("                        <h3 class=\"panel-title\" style=\"color: #FFFFFF;font-style: italic;\">用户登陆</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form id=\"loginForm\">\r\n");
      out.write("                        <div class=\"form-horizontal\"\r\n");
      out.write("                             style=\"padding-top: 20px;padding-bottom: 30px; padding-left: 20px;\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\" style=\"padding: 5px;\">\r\n");
      out.write("                                <div class=\"col-md-11\">\r\n");
      out.write("                                    <input class=\"form-control\" id=\"userId\" name=\"userId\" type=\"text\"\r\n");
      out.write("                                           placeholder=\"账号/邮箱\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\" style=\"padding: 5px;\">\r\n");
      out.write("                                <div class=\"col-md-11\">\r\n");
      out.write("                                    <input class=\"form-control\" id=\"passWord\" name=\"passWord\" type=\"password\"\r\n");
      out.write("                                           placeholder=\"请输入密码\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\" style=\"padding: 5px;\">\r\n");
      out.write("                                <div class=\"col-md-11\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <input class=\"form-control \" id=\"vcode\" name=\"vcode\" type=\"text\" maxlength=\"4\"\r\n");
      out.write("                                               placeholder=\"验证码\">\r\n");
      out.write("                                        <span class=\"input-group-addon\" id=\"basic-addon2\">\r\n");
      out.write("                                            <img class=\"check-code\" id=\"vimg\" alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/createCode\"></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"tips clearfix\">\r\n");
      out.write("                            <label><input type=\"checkbox\" checked=\"checked\" name=\"rem\">记住用户名</label>\r\n");
      out.write("                            <a href=\"javascript:;\" class=\"register\">忘记密码？</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"enter\">\r\n");
      out.write("                            <a href=\"javascript:;\" id=\"login_id\" class=\"purchaser\">登录</a>\r\n");
      out.write("                            <a href=\"javascript:;\" class=\"supplier\" onClick=\"javascript:window.location='main.html'\">重\r\n");
      out.write("                                置</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"lg-poster\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"login-ft\">\r\n");
      out.write("    <div class=\"ft-inner\">\r\n");
      out.write("        <div class=\"about-us\">\r\n");
      out.write("            <a href=\"javascript:;\">关于我们</a>\r\n");
      out.write("            <a href=\"javascript:;\">法律声明</a>\r\n");
      out.write("            <a href=\"javascript:;\">服务条款</a>\r\n");
      out.write("            <a href=\"javascript:;\">联系方式</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"address\">\r\n");
      out.write("            地址：河南省焦作\r\n");
      out.write("            &nbsp;邮编：454550&nbsp;&nbsp;\r\n");
      out.write("            分享知识，传递希望&nbsp;版权所有\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"other-info\">\r\n");
      out.write("            建议使用火狐、谷歌浏览器，不建议使用IE浏览器！\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("</script>");
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
    // /login.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/login.jsp(5,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /login.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
