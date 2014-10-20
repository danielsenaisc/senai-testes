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
					<div class="col-md-6">
						<div class="form-group">
							<label class="col-md-11 control-label import-file-info"><g:message code="import.form.edit.info"/></label>

						</div>
						<!-- DESCRIPTION -->
						<div class="form-group">
							<div class="col-md-3 dashboard-stat green import-file">
								<div class="visual">
									<i class="fa fa-file-excel-o" ></i> 
								</div>
								<a class="more import-file-link" href="#">
									<g:message code="import.form.edit.download.xls"/><i class="m-icon-swapright m-icon-white"></i>
								</a>
							</div>

							<div class="col-md-3 dashboard-stat red import-file">
								<div class="visual">
									<i class="fa fa-file-text-o" ></i> 
								</div>
								<a class="more import-file-link" href="#">
									<g:message code="import.form.edit.download.xml"/><i class="m-icon-swapright m-icon-white"></i>
								</a>
							</div>
							
						</div>
					</div>


					<div class="col-md-4">

						<div class="form-group">
							<label style="text-align:left;" class="control-label col-md-10">Selecione o arquivo para importação</label>
							<div class="col-md-9" style="margin-top:30px;">
								<div class="fileinput fileinput-new" data-provides="fileinput">
									<div class="input-group input-large">
										<div class="form-control uneditable-input span3" data-trigger="fileinput">
											<i class="fa fa-file fileinput-exists"></i>&nbsp; <span class="fileinput-filename">
											</span>
										</div>
										<span class="input-group-addon btn default btn-file">
										<span class="fileinput-new">
										Selecionar... </span>
										<span class="fileinput-exists">
										Alterar </span>
										<input type="file" name="...">
										</span>
										<a href="#" class="input-group-addon btn red fileinput-exists" data-dismiss="fileinput">
										Remover </a>
									</div>
								</div>
							</div>
							
						</div>

					</div>

					
				</div>

			</div>
			
		</div>
	</div>


</div>

<script>
	jQuery(document).ready(function() {   
		
        CustomDatePicker.init('date-picker');

        Popovers.handlePopovers();

        $('#brand_name').focus();

	});
</script>