/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-03 12:22:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>捷途软件--智能办公</title>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/base.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("resources/css/platform.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/easyUI/easyui.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/jquery/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/jquery/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/easyUI/jquery.easyui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/main.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $('#tt').tabs({\r\n");
      out.write("                tabHeight: 40,\r\n");
      out.write("                onSelect: function (title, index) {\r\n");
      out.write("                    var currentTab = $('#tt').tabs(\"getSelected\");\r\n");
      out.write("                    if (currentTab.find(\"iframe\") && currentTab.find(\"iframe\").size()) {\r\n");
      out.write("                        currentTab.find(\"iframe\").attr(\"src\", currentTab.find(\"iframe\").attr(\"src\"));\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        // 写一个方法往easyUI中添加面板\r\n");
      out.write("        function addPanel(id, url, name) {\r\n");
      out.write("            name = name.replace(/-/g, \"\");\r\n");
      out.write("            // 判断之前是否已经存在该面板存在就不创建新的面板\r\n");
      out.write("            var exist = $('#tt').tabs('exists', name);\r\n");
      out.write("            if (exist) {\r\n");
      out.write("                // 已经存在就将该面板选中  exist\r\n");
      out.write("                $('#tt').tabs('select', name);\r\n");
      out.write("                var currentTab = $('#tt').tabs('getTab', name);\r\n");
      out.write("                // 刷新一下界面\r\n");
      out.write("                if (currentTab.find(\"iframe\") && currentTab.find(\"iframe\").size()) {\r\n");
      out.write("                    currentTab.find(\"iframe\").attr(\"src\", currentTab.find(\"iframe\").attr(\"src\"));\r\n");
      out.write("                }\r\n");
      out.write("            } else {\r\n");
      out.write("                $('#tt').tabs('add', {\r\n");
      out.write("                    id: id,\r\n");
      out.write("                    title: name,\r\n");
      out.write("                    content: '<div style=\"width:100%;height:100%;\"><iframe class=\"page-iframe\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("' + url + '\" frameborder=\"no\"   border=\"no\" height=\"100%\" width=\"100%\" scrolling=\"auto\"></iframe></div>',\r\n");
      out.write("                    closable: true\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $(window).resize(function () {\r\n");
      out.write("            $('.tabs-panels').height($(\"#pf-page\").height() - 46);\r\n");
      out.write("            $('.panel-body').height($(\"#pf-page\").height() - 76)\r\n");
      out.write("        }).resize();\r\n");
      out.write("\r\n");
      out.write("        var page = 0,\r\n");
      out.write("            pages = ($('.pf-nav').height() / 70) - 1;\r\n");
      out.write("\r\n");
      out.write("        if (pages === 0) {\r\n");
      out.write("            $('.pf-nav-prev,.pf-nav-next').hide();\r\n");
      out.write("        }\r\n");
      out.write("        $(document).on('click', '.pf-nav-prev,.pf-nav-next', function () {\r\n");
      out.write("\r\n");
      out.write("            if ($(this).hasClass('disabled')) return;\r\n");
      out.write("            if ($(this).hasClass('pf-nav-next')) {\r\n");
      out.write("                page++;\r\n");
      out.write("                $('.pf-nav').stop().animate({'margin-top': -70 * page}, 200);\r\n");
      out.write("                if (page == pages) {\r\n");
      out.write("                    $(this).addClass('disabled');\r\n");
      out.write("                    $('.pf-nav-prev').removeClass('disabled');\r\n");
      out.write("                } else {\r\n");
      out.write("                    $('.pf-nav-prev').removeClass('disabled');\r\n");
      out.write("                }\r\n");
      out.write("            } else {\r\n");
      out.write("                page--;\r\n");
      out.write("                $('.pf-nav').stop().animate({'margin-top': -70 * page}, 200);\r\n");
      out.write("                if (page == 0) {\r\n");
      out.write("                    $(this).addClass('disabled');\r\n");
      out.write("                    $('.pf-nav-next').removeClass('disabled');\r\n");
      out.write("                } else {\r\n");
      out.write("                    $('.pf-nav-next').removeClass('disabled');\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div id=\"pf-hd\">\r\n");
      out.write("        <div class=\"pf-logo\"\r\n");
      out.write("        \">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/main/main_logo.png\" alt=\"logo\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"pf-nav-wrap\">\r\n");
      out.write("        <div class=\"pf-nav-ww\">\r\n");
      out.write("            <ul class=\"pf-nav\">\r\n");
      out.write("\r\n");
      out.write("                <li class=\"pf-nav-item home\" data-menu=\"sys-manage\">\r\n");
      out.write("                    <a href=\"javascript:;\">\r\n");
      out.write("                        <span class=\"iconfont\">&#xe63f;</span>\r\n");
      out.write("                        <span class=\"pf-nav-title\">系统管理</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"javascript:;\" class=\"pf-nav-prev disabled iconfont\">&#xe606;</a>\r\n");
      out.write("        <a href=\"javascript:;\" class=\"pf-nav-next iconfont\">&#xe607;</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"pf-user\">\r\n");
      out.write("        <div class=\"pf-user-photo\">\r\n");
      out.write("            <img style=\"width: 40px;height: 40px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/main/xxxx.jpg\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <h4 class=\"pf-user-name ellipsis\">XXX</h4>\r\n");
      out.write("        <i class=\"iconfont xiala\">&#xe607;</i>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"pf-user-panel\">\r\n");
      out.write("            <ul class=\"pf-user-opt\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"javascript:;\">\r\n");
      out.write("                        <i class=\"iconfont\">&#xe60d;</i>\r\n");
      out.write("                        <span class=\"pf-opt-name\">用户信息</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li id=\"exit\">\r\n");
      out.write("                    <a href=\"javascript:exit();\">\r\n");
      out.write("                        <i class=\"iconfont\">&#xe60e;</i>\r\n");
      out.write("                        <span class=\"pf-opt-name\">退出</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"pf-bd\">\r\n");
      out.write("    <div id=\"pf-sider\">\r\n");
      out.write("        <h2 class=\"pf-model-name\">\r\n");
      out.write("            <span class=\"iconfont\">&#xe64a;</span>\r\n");
      out.write("            <span class=\"pf-name\">信息系统</span>\r\n");
      out.write("            <span class=\"toggle-icon\"></span>\r\n");
      out.write("        </h2>\r\n");
      out.write("        <!-- 展示系统左侧权限树  -->\r\n");
      out.write("        <ul class=\"sider-nav\" id=\"sider-nav\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 面板 -->\r\n");
      out.write("    <div id=\"pf-page\">\r\n");
      out.write("        <div class=\"easyui-tabs\" id=\"tt\" style=\"width:100%;height:100%;\">\r\n");
      out.write("            <div title=\"当前用户\" id=\"user\" style=\"padding:10px 5px 5px 10px;\">\r\n");
      out.write("                <iframe class=\"page-iframe\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/oa/home.jspx\" frameborder=\"no\" border=\"no\" height=\"100%\"\r\n");
      out.write("                        width=\"100%\" scrolling=\"auto\"></iframe>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"pf-ft\">\r\n");
      out.write("    <div class=\"system-name\">\r\n");
      out.write("        <i class=\"iconfont\">&#xe6fe;</i>\r\n");
      out.write("        <span>智能办公平台&nbsp;v1.0</span>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"copyright-name\">\r\n");
      out.write("        <span>分享知识，传递希望&nbsp;版权所有</span>\r\n");
      out.write("        <i class=\"iconfont\">&#xe6ff;</i>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
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
    // /main.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/main.jsp(5,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /main.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /main.jsp(158,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/main.jsp(158,12) '${userPopedomModules}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${userPopedomModules}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /main.jsp(158,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("userModule");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <li>\r\n");
          out.write("                    <a href=\"javascript:;\">\r\n");
          out.write("                        <span class=\"iconfont sider-nav-icon\">&#xe611;</span>\r\n");
          out.write("                        <span class=\"sider-nav-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userModule.firstModule.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("                        <i class=\"iconfont\">&#xe642;</i>\r\n");
          out.write("                    </a>\r\n");
          out.write("                    <ul class=\"sider-nav-s\">\r\n");
          out.write("                        ");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                    </ul>\r\n");
          out.write("                </li>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /main.jsp(166,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/main.jsp(166,24) '${userModule.secondModules }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${userModule.secondModules }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /main.jsp(166,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("secondModule");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <li>\r\n");
          out.write("                                <a href=\"javascript:addPanel('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${secondModule.code }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("' ,'");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${secondModule.url }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${secondModule.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("');\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${secondModule.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("                            </li>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
