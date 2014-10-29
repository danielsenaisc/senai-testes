<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="pt_BR" class="no-js">
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

<r:require modules="file_upload_css" />	
<r:require modules="page_level_css" />
<r:require modules="theme_level_css" />	
<r:require modules="form_level_css" />	
<r:require modules="table_managed_css" />	
<r:require modules="custom_css" />	


<g:javascript library='jquery'/>
<r:layoutResources />

<!-- END THEME STYLES -->

</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed page-quick-sidebar-over-content">

<div class="clearfix">
</div>

<!-- BEGIN CONTAINER -->
<div class="page-container">

	<g:render template="/layouts/menu"/>

	<!-- BEGIN CONTENT -->
	<div class="page-content-wrapper">
		<div class="page-content">

			<g:render template="/layouts/breadcrumb" 
					model="['section_name': "Importando Produtos", 'section_sub': ""]" />
			<!-- BEGIN ROW -->	
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN EXAMPLE TABLE PORTLET-->
					<div class="portlet box">

						<g:render template="/import/import_file"/>

					</div>

				</div>
			<!-- END ROW -->
			</div>

			<div class="form-actions right" style="text-align:right; padding-right:20px;">
				<a href="${createLink(controller:'product',action:'index')}" class="btn btn-default">
					<g:message code="import.form.edit.cancel"/>
				</a>
				<a href="${createLink(controller:'import',action:'edit')}" class="btn red">
					<g:message code="import.form.edit.import"/>
				</a>
			</div>

		</div>
	<!-- END CONTENT -->
	</div>
<!-- END CONTAINER -->	
</div>

<g:render template="/layouts/footer"/>
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="../../assets/global/plugins/respond.min.js"></script>
<script src="../../assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->

<r:require module="form_level_scripts" />
<r:require module="table_managed_plugins" />
<r:require module="dashboard_level_plugins" />
<r:require module="file_upload_scripts" />
<r:require module="application" />

<r:layoutResources />

<script>
	jQuery(document).ready(function() {   

		$('[id^="menu_"]' ).removeClass("active");
		$("#menu_products").addClass("active");

		//FormFileUpload.init();

	});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>


