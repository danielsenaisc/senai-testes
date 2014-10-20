<!DOCTYPE html>

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="import.form.edit.basic"/>
		</div>
			
	</div>

	<!-- BASIC INFORMATION -->
	<div class="portlet-body form">
		<div role="form" class="form-horizontal">
			<div class="form-body">
				<div class="form-group">
					
					<div class="col-md-3">
						<div class="form-group">
							<div class="col-md-3 dashboard-stat green import-file">
								<div class="visual">
									<i class="fa fa-file-excel-o" ></i> 
								</div>
								<a class="more" href="#">
									<g:message code="import.form.edit.download.xml"/>
								</a>
							</div>
						</div>
					</div>

					<div class="col-md-7">
						<div class="form-group report-form-group">
							<!-- FILE NAME -->
							<div class="form-group report-form-group">
								<label class="col-md-12 control-label report-label">
									<g:message code="import.form.edit.file-name"/>
									<span class="report-span">&nbsp;&nbsp;Produtos de Inverno 2013.xml</span></label>
							</div>

							<!-- DATE -->
							<div class="form-group report-form-group">
								<label class="col-md-12 control-label report-label">
									<g:message code="import.form.edit.created_at"/>
									<span class="report-span">&nbsp;&nbsp;${paramDate}</span></label>
							</div>

							<!-- SIZE -->
							<div class="form-group report-form-group">
								<label class="col-md-12 control-label report-label">
									<g:message code="import.form.edit.file-size"/>
									<span class="report-span">&nbsp;&nbsp;${paramFileSize} Kb</span></label>
							</div>

							<!-- CODE -->
							<div class="form-group report-form-group">
								<label class="col-md-12 control-label report-label">
									<g:message code="import.form.edit.code"/>
									<span class="report-span">&nbsp;&nbsp;${paramCode}</span></label>
							</div>

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
