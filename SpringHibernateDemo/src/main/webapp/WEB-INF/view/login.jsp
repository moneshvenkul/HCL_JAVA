<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.error{

 

color: red;
}
</style>
</head>
<body>
<form:form action="login" method = "post" modelAttribute="alias">

 

Enter user id : <form:input path ="userId"/>
                <form:errors path = "userId"></form:errors>
enter user name: <form:input path="userName"/>
                 <form:errors path = "userName" cssClass="error"></form:errors>
Enter password : <form:password path = "password"/>
                <form:errors path = "password" cssClass="error"></form:errors>
                <input type="submit"value="Login">

 

</form:form>
<%--     <form action="login" method="post">

 

        Enter user id <input type="text" name="userId"> Enter user
        Name <input type="text" name="userName"> Enter Password <input
            type="password" name="password"> <input type="submit"
            value="Login">
    </form>
 --%>
 </body>
</html>