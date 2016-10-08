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
 *类描述：
 *@author: pingzhengpingzheng
 *@date： 日期：2016年4月8日 时间：上午9:33:19
 *@version MyElipse 2014
 生活就像海洋，只有意志坚强的人才能到达彼岸。
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
		out.println("<p>用户名:"+username);
		out.println("<p>密码:"+password);
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
		
