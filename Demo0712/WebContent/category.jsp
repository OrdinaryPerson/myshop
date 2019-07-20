<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    	<table>
    		<tr>
    			<td>id</td>
    			<td>name</td>
    			<td>创建时间</td>
    			<td>更新时间</td>
    		</tr>
    		<c:forEach items="${list}" var="category">
 			<tr>
    			<td>${category.id}</td>
    			<td>${category.name}</td>
    			<td>${category.createTime}</td>
    			<td>${category.updateTime}</td>
    		</tr> 			
 			</c:forEach>
    		<tr>
    			<td>11</td>
    			<td>11</td>
    			<td>11</td>
    			<td>11</td>
    		</tr>
    		<tr>
    			<td></td>
    			<td></td>
    			<td></td>
    			<td></td>
    		</tr>
    	</table>
 	</body>
</html>