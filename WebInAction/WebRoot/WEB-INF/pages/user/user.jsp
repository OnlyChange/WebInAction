<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户列表</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  <body>
  		<center>
  			<s:iterator value="userVo.userList" var="user">
  					<s:property value="id"/>
  					<s:property value="name"/>
  					<s:property value="phone"/>
  					<s:property value="email"/>
  					<s:property value="address"/>
  			</s:iterator>
  		</center>
  </body>
</html>
