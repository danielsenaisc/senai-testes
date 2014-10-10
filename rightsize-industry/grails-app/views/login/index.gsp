<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="pt_BR">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>2014 © RightSize</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta content="" name="description"/>
<meta content="" name="author"/>

<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
<link rel="shortcut icon" href="favicon.ico"/>

<r:require modules="page_level_css" />
<r:require modules="theme_level_css" />	
<g:javascript library='jquery'/>
<r:layoutResources />

</head>
<!-- END HEAD -->

<body class="login">


<!-- BEGIN LOGO -->
<div class="logo">
	<a href="index.html">
	<img src="../../assets/admin/layout/img/logo-big.png" alt=""/>
	</a>
</div>
<!-- END LOGO -->
<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
<div class="menu-toggler sidebar-toggler">
</div>
<!-- END SIDEBAR TOGGLER BUTTON -->
<!-- BEGIN LOGIN -->
<div class="content">
	<!-- BEGIN LOGIN FORM -->
	<g:form class="login-form" controller="dashboard" action="index">
		<h3 class="form-title"><g:message code="login.form.title"/></h3>
		<div class="alert alert-danger display-hide">
			<button class="close" data-close="alert"></button>
			<span>
			Entre com seus dados de acesso. </span>
		</div>
		<div class="form-group">
			<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
			<label class="control-label visible-ie8 visible-ie9">
				<g:message code="login.form.field.user"/>
			</label>
			<div class="input-icon">
				<i class="fa fa-user"></i>
				<input class="form-control placeholder-no-fix" type="text" autocomplete="off" 
				placeholder="<g:message code="login.form.field.user"/>" name="username"/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label visible-ie8 visible-ie9">
				<g:message code="login.form.field.user"/>
			</label>
			<div class="input-icon">
				<i class="fa fa-lock"></i>
				<input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="<g:message code="login.form.field.pass"/>" name="password"/>
			</div>
		</div>
		<div class="form-actions">
			<a href="" id="forget-password"> <g:message code="login.form.label.forget.pass"/>	
			</a>
			
			<button type="submit" class="btn blue pull-right">
				<g:message code="login.form.button.login"/> <i class="m-icon-swapright m-icon-white"></i>
			</button>
		</div>
		
	</g:form>
	
	
</div>
<!-- END LOGIN -->
<!-- BEGIN COPYRIGHT -->
<div class="copyright">
	 2014 &copy; RightSize.
</div>
<!-- END COPYRIGHT -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="../../assets/global/plugins/respond.min.js"></script>
<script src="../../assets/global/plugins/excanvas.min.js"></script> 
<![endif]
-->

<r:require module="page_level_plugins" />
<r:require module="page_level_scripts" />
<r:require module="application" />
<r:layoutResources />

<script>
	jQuery(document).ready(function() {     
	  	CustomLogin.init();
       	
	});
</script>
<!-- END JAVASCRIPTS -->

</body>
<!-- END BODY -->
</html>