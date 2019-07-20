<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Page</title>
		<script type="text/javascript" src="js/jquery-3.1.0.js" ></script>
	</head>

	<body>
		<script>
			$(function() {
				/*function ajaxFunction() {
					var xmlHttp;
					try { // Firefox, Opera 8.0+, Safari
						xmlHttp = new XMLHttpRequest();
					} catch(e) {
						try { // Internet Explorer
							xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
						} catch(e) {
							try {
								xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
							} catch(e) {}
						}
					}

					return xmlHttp;
				}
				var request = ajaxFunction();*/

				$("#username").blur(function() {
					alert($(this).val());
					var name=$(this).val();
					/*$.get("/Demo0712/CheckUsername?name="+name,function(data){
						$("#span01").html(data);
					})*/
					/*$.post("/Demo0712/CheckUsername",{"name":name},function(data){
						$("#span01").html(data);
					})*/
					$.ajax({
						type:"post",
						url:"/Demo0712/CheckUsername",
						data:{"name":name,"password":"110110"},
						dataType:"json",
						success:function(data){
							$("#span01").html(data.password);
						}
						//error:
					});
					
					/*request.open("POST", "/Demo0712/CheckUsername?name="+name+"",true);
					//request.open("GET", "/Demo0712/CheckUsername?name="+name+"",true);
					request.onreadystatechange=function(data){
						//打开1 打不开2 发送3 处理返回4
						if(request.readyState==4&&request.status==200){
							//alert(data);
							alert(request.responseText);
							$("#span01").html(request.responseText);
						}
					}
					request.send("name="+name);
					//request.send();*/
					
					
				});
			});
		</script>
		<form action="login.do" method="post">
			用户名：<input type="text" name="username" id="username" /><span id="span01"></span><br /> 密码：
			<input type="password" name="password" /><br /> 验证码
			<input type="text" name="checkCode" /><img alt=" " src="/Demo0712/code">
			<input type="submit" value="上交" /><br />

		</form>
		${msg}
	</body>

</html>