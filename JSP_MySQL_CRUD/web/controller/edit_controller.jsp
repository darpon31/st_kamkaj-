<%@ page import="CRUD.Edit_values" %>
<%@ page import="common.User_Bean" %><%--
  Created by IntelliJ IDEA.
  User: ifte.islam
  Date: 12/27/2018
  Time: 5:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>






<%
    String sl_no=request.getParameter("sl_no");
    String email=request.getParameter("email");
    String mobile=request.getParameter("mobile");
    String user_name=request.getParameter("user_name");

    User_Bean obj_User_Bean=new User_Bean();

    obj_User_Bean.setSl_no(sl_no);
    obj_User_Bean.setUser_name(user_name);
    obj_User_Bean.setMobile(mobile);
    obj_User_Bean.setEmail(email);

    Edit_values obj_Edit_values=new Edit_values();
    obj_Edit_values.edit_user(obj_User_Bean);
%>



<script type="text/javascript">
    window.location.href="http://localhost:8080/JSP_MySQL_CRUD/insert_values.jsp"
</script>



</body>
</html>
