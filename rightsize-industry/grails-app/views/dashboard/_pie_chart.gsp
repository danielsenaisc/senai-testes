<!DOCTYPE html>
<div class="col-md-11 col-sm-11 portlet box red" style="height:400px;margin-left:20px;">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-bar-chart-o"></i><g:message code="dashboard.form.pierchart.title"/>
		</div>
		
	</div>
	<div class="portlet-body">
		<div id="pie_chart_3" class="chart">
		</div>
	</div>
</div>

<r:require module="dashboard_level_plugins" />
<r:require module="dashboard_chart_plugin" />
<r:layoutResources />

<script>
    jQuery(document).ready(function() {   

    	PieChart.insertData("teste",10);	
        PieChart.createPieChart();	

    });

</script>