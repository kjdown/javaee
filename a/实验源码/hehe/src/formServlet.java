import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * 
 */

/**
 *类描述：
 *@author: pingzhengpingzheng
 *@date： 日期：2016年4月6日 时间：下午12:44:41
 *@version MyElipse 2014
 生活就像海洋，只有意志坚强的人才能到达彼岸。
 */
public class formServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<p>Please input a form</p>");
		out.println("<Form method='POST' action='/hehe/servlet/responseservlet'>");
		out.println("用户名<input type='text' name='username' /><br>");
		out.println("密码&nbsp;&nbsp;<input type='password' name='password'/><br>");
		out.println("<input type='Submit' value='提交'/><br>");
		out.println("</FORM>");
		out.println("</HTML>");
		out.flush();
		out.close();
		}              
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{ 
		doGet(request,response);
		}
	
	}
		