<!DOCTYPE html>
<div class="portlet-title">
	<div class="caption">
		<g:message code="report.form.title"/>
		<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
		data-content="<g:message code="popovers.title"/>" data-original-title="<g:message code="popovers.info"/>" data-placement="top">
			<i class="fa fa-info-circle popovers" ></i> 
		</a>
	</div>
		
	<div class="actions">
		<a href="${createLink(controller:'report',action:'edit')}" class="btn btn-default btn-sm">
			<i class="fa fa-edit"></i>&nbsp;<g:message code="report.form.view.actions.edit"/>
		</a>
		<a href="${createLink(controller:'report',action:'edit')}" class="btn btn-default btn-sm">
			<i class="fa fa-copy"></i>&nbsp;<g:message code="report.form.view.actions.clone"/>
		</a>

		<div class="btn-group">
			<a class="btn btn-default grey-default btn-sm" href="#" data-toggle="dropdown">
				<i class="fa fa-cogs">&nbsp;</i> <g:message code="report.form.view.actions.export"/> 
				<i class="fa fa-angle-down"></i>
			</a>
			<ul class="dropdown-menu pull-right">
				<li>
					<a href="#">
					<i class="fa fa-file-pdf-o"></i><g:message code="report.form.view.actions.export.pdf"/> </a>
				</li>
				<li>
					<a href="#">
					<i class="fa fa-file-excel-o"></i> <g:message code="report.form.view.actions.export.xls"/> </a>
				</li>
			</ul>
			
		</div>
		<button id="report_print" class="btn btn-default btn-sm">
			<i class="fa fa-print"></i>&nbsp;<g:message code="report.form.view.actions.print"/>
		</button>
	</div>
	
</div>

<!-- BASIC INFORMATION -->
<div class="portlet-body form">
	<div role="form" class="form-horizontal">
		<div class="form-body">
			<div class="form-group">

				<div class="col-md-12">
					<div class="form-group">
						<h3 class="report-title">Nome do Relatório</h3>
					</div>
				</div>

				<div class="col-md-7">
					<div class="form-group report-form-group">
						<!-- TYPE -->
						<div class="form-group report-form-group">
							<label class="col-md-12 control-label report-label"><g:message code="report.form.view.type"/><span class="report-span">&nbsp;&nbsp;${report_type}</span></label>
						</div>

						<!-- PERIOD -->
						<div class="form-group report-form-group">
							<label class="col-md-12 control-label report-label"><g:message code="report.form.view.period"/><span class="report-span">&nbsp;&nbsp;${report_period}</span></label>
								
						</div>

						<!-- LOCATION -->
						<div class="form-group report-form-group">
							<label class="col-md-12 control-label report-label"><g:message code="report.form.view.location"/><span class="report-span">&nbsp;&nbsp;${report_location}</span></label>
						</div>

						<!-- FILTER BY -->
						<div class="form-group report-form-group">
							<label class="col-md-12 control-label report-label"><g:message code="report.form.view.filter"/><span class="report-span">&nbsp;&nbsp;${report_filter}</span></label>
						</div>

					</div>
				</div>

				<div class="col-md-5">
					<div class="form-group">
						<!-- CREATED BY -->
						<div class="form-group report-form-group">
							<label class="col-md-12 control-label report-label"><g:message code="report.form.view.created-by"/><span class="report-span">&nbsp;&nbsp;${report_owner}</span></label>
						</div>
						<!-- REPORT-TYPE -->
						<div class="form-group report-form-group">
							<label class="col-md-12 control-label report-label"><g:message code="report.form.view.report-type"/><span class="report-span">&nbsp;&nbsp;${report_category}</span></label>
							
						</div>
						<!-- SHARE -->
						<div class="form-group report-form-group">
							<label class="col-md-12 control-label report-label"><g:message code="report.form.view.share"/><span class="report-span">&nbsp;&nbsp;${report_share}</span></label>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>

<script>
	
	$('#report_print').click(function(){

		
	});
		
</script>
