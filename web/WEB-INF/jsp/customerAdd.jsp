<%-- 
    Document   : customer
    Created on : Jan 8, 2018, 10:12:31 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<a:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <script src="<a:url value="/resources/js/jquery-3.2.1.min.js" />"></script>
        <script src="<a:url value="/resources/js/bootstrap.js" />"></script>
        <title>Customer</title>
    </head>
    <body>
         <form:form action="customer/saveAdd" modelAttribute="customerBean" method="POST">
            <div class="center-block" style="width: 400px">
            <table class="table table-striped">
                <tr>
                    <td><form:label path="customerName">Full Name</form:label></td>
                    <td>:</td>
                    <td><form:input path="name"/></td>
                    
                </tr>
                <tr>
                    <td><form:label path="customerEmail">Email</form:label></td>
                    <td>:</td>
                    <td><form:input path="email"/></td>
                    
                </tr>
                <tr>
                    <td><form:label path="customerAddress">Address</form:label></td>
                     <td>:</td>
                    <td><form:input path="address" height="300"/></td>
                    
                </tr>
                <tr>
                    <td><form:label path="customerTelepon">Telepon</form:label></td>
                     <td>:</td>
                    <td><form:input path="telepon"/></td>
                    
                </tr>
                <tr>
                    <td><form:label path="customerDob">Date Of Birth</form:label></td>
                     <td>:</td>
                    <td><form:input path="dateofBirth"/></td>
                    
                </tr>
                <tr>
                    <td><form:label path="customerTanggungan">Attendance</form:label></td>
                     <td>:</td>
                    <td><form:input path="attandance"/></td>
                   
                </tr>
                <tr>
                    <td><form:label path="customerGaji">Salary</form:label></td>
                     <td>:</td>
                    <td><form:input path="salary"/></td>
                   
                </tr>
                <tr>
                    <td><form:label path="customerPenghasilanTambahan">Extra Salary</form:label></td>
                     <td>:</td>
                    <td><form:input path="extraRevenue"/></td>
                   
                </tr>
               
            </table>
                    <form:button class="btn btn-primary" name="submitButton" value="Submit">Save</form:button>
       
                 </div> 
        </form:form>
        
         <table class="table table-striped" width="20" >
            
            <tr>
                <th>ID</th>
                <th>Full Name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Telepon</th>
                <th>Date Of Birth</th>
                <th>Attendance</th>
                <th>Salary</th>
                <th>Extra Salary</th>
                
            </tr>
        <a:forEach var="c" items="${custs}">
            <tr>
                <td>${c.customerId}</td>
                <td>${c.customerName}</a> </td>
                <td>${c.customerEmail}</td>
                <td>${c.customerAddress}</td>
                <td>${c.customerTelepon}</td>
                <td>${c.customerDob}</td>
                <td>${c.customerDob}</td>
                <td>${c.customerTanggungan}</td>
                <td>${c.customerGaji}</td>
                <td>${c.customerPenghasilanTambahan}</td>
            </tr>
        </a:forEach>
        </table>
    </body>
</html>
