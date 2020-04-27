/**
 * @author Long
 * QQ:584614151
 * version:1.0
 */
package cn.xiao.common.pager;

import java.util.List;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
public class ButtonTag extends TagSupport {

	 private String value;
	
	@Override
	public int doStartTag() throws JspException {
		HttpSession session = this.pageContext.getSession();
		List<String> operas = (List<String>)session.getAttribute("operas");
	    if(operas.indexOf(value) != -1) {
	    	return EVAL_PAGE;
	    }else {
	    	return SKIP_BODY;
	    }
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


	
}
