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
<r:require modules="dashboard_level_css" />	
<r:require modules="custom_css" />	
<g:javascript library='jquery'/>
<r:layoutResources />

<!-- END THEME STYLES -->

</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="page-header-fixed page-quick-sidebar-over-content">

<!-- BEGIN CONTAINER -->
<div class="page-container">

	<g:render template="/layouts/menu"/>

	<!-- BEGIN CONTENT -->
	<div class="page-content-wrapper">
		<div class="page-content">
			
			
			<!-- BEGIN PAGE HEADER-->
			<div class="row">
				<div class="col-md-12">
					<!-- BEGIN PAGE TITLE & BREADCRUMB-->
					<h3 class="page-title">
					<g:message code="dashboard.form.title"/> <small><g:message code="dashboard.form.description"/></small>
					</h3>
					<ul class="page-breadcrumb breadcrumb">
						<li>
							<i class="fa fa-home"></i>
							<a href="index.html">Home</a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li>
							<a href="#">Dashboard</a>
						</li>
						<li class="pull-right">
							<div id="dashboard-report-range" class="dashboard-date-range tooltips" data-placement="top" data-original-title="Change dashboard date range">
								<i class="icon-calendar"></i>
								<span></span>
								<i class="fa fa-angle-down"></i>
							</div>
						</li>
					</ul>
					<!-- END PAGE TITLE & BREADCRUMB-->
				</div>
			</div>
			<!-- END PAGE HEADER-->
			
			<!-- END DASHBOARD STATS -->
			<div class="clearfix">
			</div>
			

			<div class="row">
				<!--****** BAR CHART ******-->
				<div class="col-md-6 col-sm-6" id="dashboard_box">
					<g:render template="/dashboard/bar_chart"/>
				</div>

				<!--****** PRODUCT RANKING ******-->
				<div class="col-md-6 col-sm-6" id="dashboard_box">
					<g:render template="/dashboard/product_ranking"/>
				</div>

			</div>

			<div class="row">
				<!--****** BEST COLLECTIONS ******-->
				<div class="col-md-6 col-sm-6" id="dashboard_box">
					<g:render template="/dashboard/best_collections"/>
				</div>
				<div class="col-md-6 col-sm-6" id="dashboard_box">
					<g:render template="/dashboard/brands"/>
				</div>
				
			</div>

			<!-- BEGIN DASHBOARD STATS -->
			<div class="row">
				<!--****** BRANDS,PRODUCTS,COLLECTIONS,ETC ******-->
				<div class="col-md-6 col-sm-6" id="dashboard_box">
					<!--****** ALERTS ******-->
					<g:render template="/dashboard/alerts" />
				</div>	

				<div class="col-md-6 col-sm-6" id="dashboard_box">
					<g:render template="/dashboard/pie_chart" />
				</div>
			</div>

			
			<div class="clearfix">
			</div>
			
					<!-- END PORTLET-->
				
		</div>
	</div>
	<!-- END CONTENT -->
	
</div>
<!-- END CONTAINER -->

<g:render template="/layouts/footer"/>
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="../../assets/global/plugins/respond.min.js"></script>
<script src="../../assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->

<r:require module="dashboard_level_plugins" />
<r:require module="dashboard_chart_plugin" />
<r:layoutResources />


<script>
	jQuery(document).ready(function() {   

		$('[id^="menu_"]' ).removeClass("active");
		$("#menu_panel").addClass("active");

		//Criando o BarChart
		BarChart.insertData("Agosto",45,55);
		BarChart.insertData("Setembro",33,66);
		BarChart.insertData("Outubro",20,50);
		BarChart.createBarChart();

	});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>