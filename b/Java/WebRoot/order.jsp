<%@ page contentType="text/html" pageEncoding="GBK"%>
 <%@ page import="java.util.*,java.sql.*,javax.sql.*,javax.naming.*"%>
 <!doctype html>
<html lang="en">
<head>

	<title>order.jsp</title>
</head>
<body>
<form action="success_order.jsp">
<table border="1">
<tr>
<td>商品编号</td>
<td>商品名称</td>
<td>单价</td>
<td>购物篮</td>
</tr>
<%
////////////////////////////////////////////////////////////////////////////
String driverName="com.mysql.jdbc.Driver";
String userName="root";
String userPasswd="root";
String dbName="hehe";
String tableName="week1212";
String url="jdbc:mysql://localhost/"+dbName+"?user="+userName+"&password="+userPasswd;
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection connection=DriverManager.getConnection(url);
Statement statement = connection.createStatement();
String sql="SELECT * FROM "+tableName;
ResultSet rs = statement.executeQuery(sql);
ResultSetMetaData rmeta = rs.getMetaData();
int numColumns=rmeta.getColumnCount();
////////////////////////////////////////////////////////////////////////////
while  (rs.next()) {
 %>
<tr>
<td><%=rs.getString("goods_id") %></td>
<td><%=rs.getString("goods_name") %></td>
<td><%=rs.getString("prive") %></td>
<td><input type='text' size=3 style="text-align:right;" maxlength='3'></td>
 <td><input type='checkbox'></td>
 <%
 }
statement.close();
connection.close();
 %>
 </table>
<br>
<input type='submit' value='确认订购'>
</form>
</body>
</html>
