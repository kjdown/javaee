/**
 * 
 */
package hehe;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *��������
 *@author: pingzhengpingzheng
 *@date�� ���ڣ�2016��4��10�� ʱ�䣺����11:12:06
 *@version MyElipse 2014
���������ֻ����־��ǿ���˲��ܵ���˰���
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
		out.println("ѧ��ѧ��<input type='text' name='studentName' value='Input number'/>");
		out.println("<input type='Submit' value='��ѯ'/><br>");
		out.println("</form>");
		}
		else if(request.getParameter("studentName")).equals("Input number")){
			Vector vc=new Vector();
			out.println("<Form method='post' action='/hehe/Student")
		}
		}
		}

}
