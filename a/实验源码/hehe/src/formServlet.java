import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * 
 */

/**
 *��������
 *@author: pingzhengpingzheng
 *@date�� ���ڣ�2016��4��6�� ʱ�䣺����12:44:41
 *@version MyElipse 2014
 ���������ֻ����־��ǿ���˲��ܵ���˰���
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
		out.println("�û���<input type='text' name='username' /><br>");
		out.println("����&nbsp;&nbsp;<input type='password' name='password'/><br>");
		out.println("<input type='Submit' value='�ύ'/><br>");
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
		