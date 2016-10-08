/**
 * 
 */
package hehe;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *类描述：
 *@author: pingzhengpingzheng
 *@date： 日期：2016年4月10日 时间：下午11:12:06
 *@version MyElipse 2014
生活就像海洋，只有意志坚强的人才能到达彼岸。
 */
public class StudentServlet extends HttpServlet{
	private static final String CONTENT_TYPE="text/html; charset=GBK"
    int count=0;
	
	public void init() throws ServletException{
		public void doGet(HttpServletRequest request,HttpServletResponse response) 
throws ServletException,IOException{
		response.setContentType(CONTENT_TYPE);
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>StudentServlet</title></head>");
		out.println("<body bgcolor=\"#ffffff\">");
		if((request.getParameter("studentName"))==null||(request.getParameter(studentName)).equal("Input number"))
		{out.println("<Form method='post' action='/hehe/sutdentservlet'>");
		out.println("学生学号<input type='text' name='studentName' value='Input number'/>");
		out.println("<input type='Submit' value='查询'/><br>");
		out.println("</form>");
		}
		else if(request.getParameter("studentName")).equals("Input number")){
			Vector vc=new Vector();
			out.println("<Form method='post' action='/hehe/Student")
		}
		}
		}

}
