<%@ page import="CRUD.Insert_Values" %><%--
  Created by IntelliJ IDEA.
  User: ifte.islam
  Date: 12/27/2018
  Time: 12:46 PM
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
    Insert_Values obj_Insert_Values=new Insert_Values();
    obj_Insert_Values.insert_values(sl_no, user_name, email, mobile);

//    out.println( sl_no);
//    out.println( email);
//    out.println( mobile);
//    out.println( user_name);









%>






finishes!!

</body>
</html>
