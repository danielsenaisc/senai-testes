<!DOCTYPE html>
<div class="portlet box blue-madison" style="height:400px;width=500px;">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-bar-chart-o"></i><g:message code="dashboard.form.pierchart.title"/>
		</div>
		
	</div>
	<div class="portlet-body">
		<div class="chart" id="pie_chart" >
			
		</div>
	</div>
</div>

<r:require module="dashboard_level_plugins" />
<r:require module="dashboard_chart_plugin" />
<r:layoutResources />

<script>
    jQuery(document).ready(function() {   

        PieChart.insertData('Calça Jeans', 20);
        PieChart.insertData('Camiseta Pólo', 12);
        PieChart.insertData('Moleton', 25);
        PieChart.insertData('Blusa', 17);
        PieChart.insertData('Camisa Social', 26);

        PieChart.createPieChart('pie_chart');

    });

</script>