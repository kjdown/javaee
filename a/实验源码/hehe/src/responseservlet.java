import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */

/**
 *��������
 *@author: pingzhengpingzheng
 *@date�� ���ڣ�2016��4��8�� ʱ�䣺����9:33:19
 *@version MyElipse 2014
 ���������ֻ����־��ǿ���˲��ܵ���˰���
 */

public class responseservlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html;charset=GBK");
		PrintWriter out= response.getWriter();
		request.setCharacterEncoding("GBK");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		out.println("<html>");
		out.println("<head><title>responseServlet</title></head>");
		out.println("<body bgcolor=\"#ffffff\">");
		out.println("<p>�û���:"+username);
		out.println("<p>����:"+password);
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{ 
		doGet(request,response);
		}
	}	
		
