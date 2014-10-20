<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>2014 © RightSize</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport"/>
<meta content="" name="description"/>
<meta content="" name="author"/>

<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
<link rel="shortcut icon" href="favicon.ico"/>

<r:require modules="page_level_css" />
<r:require modules="theme_level_css" />	
<r:require modules="custom_css" />
<r:require modules="table_managed_css" />		

<g:javascript library='jquery'/>
<r:layoutResources />

<!-- END THEME STYLES -->

</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->

<body class="page-header-fixed page-quick-sidebar-over-content">

	<g:render template="/layouts/header"/>

	<div class="clearfix">
	</div>

<!-- BEGIN CONTAINER -->
<div class="page-content-wrapper">
	<div class="page-container">

		<g:render template="/layouts/menu"/>

		<div class="portlet-title">
			<div class="caption">
				<i class="icon-basket"></i> <g:message code="variants.table.name"/>
			</div>
			<div class="actions">
				<a href="#" class="btn btn-default btn-sm">
					<i class="fa fa-pencil"></i> <g:message code="variants.form.action.new"/> 
				</a>
				<a href="#" class="btn btn-default btn-sm">
					<i class="fa icon-arrow-up"></i> <g:message code="variants.form.action.copy"/> 
				</a>
				
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">
				<div class="row">
					<div class="col-md-12">
						<g:render template="/product/variant"/>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<g:render template="/layouts/footer"/>
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="../../assets/global/plugins/respond.min.js"></script>
<script src="../../assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->


<r:require module="dashboard_level_plugins" />
<r:require module="table_managed_plugins" />
<r:layoutResources />


<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>


