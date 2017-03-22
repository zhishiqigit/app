<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored ="false" %>
<%-- <html>
<body>
<h2>Hello World!</h2>
<h1>${requestScope.name}</h1>
</body>
</html> --%>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>授权系统</title>

    <!-- Bootstrap -->
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
    <script src="/static/js/jquery.min.js"></script>
	<script src="/static/js/bootstrap.min.js"></script>
   
  </head>
  <body >
  <div class="container-fluid bg-primary">
  	<h4>&nbsp</h4>
  </div>
  	<div class="container-fluid bg-success">
  		<div class="form-group col-md-6 col-md-offset-3">
  			<form action='/user/login.html' method="post">
			    <fieldset>
			      <legend>登录</legend>			
			      <div class="form-group form-group-lg">			        
			        <input class="form-control input-lg" name="user_name" placeholder="请输入用户名" type="text">
			      </div>
			
			      <div class="form-group form-group-lg">
			        <input class="form-control input-lg" id="password" name="password" placeholder="请输入登录密码" type="password">
			      </div>
			
			      <div class="form-group form-group-lg">
			        <input class="btn btn-primary btn-lg" name="commit" type="submit" value="登    录">
			      </div>
			    </fieldset>
			</form>
  		</div>
  		
  		
  		
  	</div>
    
  </body>