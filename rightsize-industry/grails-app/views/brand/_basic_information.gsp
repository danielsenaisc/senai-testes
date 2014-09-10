<!DOCTYPE html>

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="brand.form.edit.basic"/>
			
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="Como realizar esse cadastro!" data-original-title="Mais informações" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
				
		</div>
	</div>

	<!-- BASIC INFORMATION -->
	<div class="portlet-body form">
		<div role="form" class="form-horizontal">
			<div class="form-body">
				<!-- NAME -->
				<div class="form-group">
					<div class="col-md-8">
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="brand.table.column.name"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<i class="fa tooltips"  data-container="body"></i>
									<input type="text" class="form-control input-xlarge">
								</div>
							</div>

						</div>
						<!-- DESCRIPTION -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="brand.form.edit.description"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<i class="fa tooltips"  data-container="body"></i>
									<textarea class="form-control input-xlarge" rows="7"></textarea>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-3">

						<div class="form-group ">
							<div class="col-md-3">
								<div class="fileinput fileinput-new" data-provides="fileinput">
									<div class="fileinput-new thumbnail" style="width: 200px; height: 150px; background-color: #eaeaea;">
										<i class="icon-picture" style="font-size:60px;margin-top:60px"></i> 
									</div>
									<div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;">
									</div>
									<div>
										<span class="btn btn-sm blue btn-file">
											<span class="fileinput-new">
												Selecione uma imagem 
											</span>
											<span class="btn btn-sm blue fileinput-exists">
												Alterar 
											</span>
											<input type="file" name="...">
											</span>
												<a href="#" class="btn btn-sm red fileinput-exists" data-dismiss="fileinput">
												Remover 
											</a>
									</div>
								</div>
								
							</div>
						</div>


					</div>
				</div>
				
				<!-- DATA -->
				<div class="form-group">
					<div class="col-md-4">
						<div class="form-group">
							<label style = "text-align:right;" class="col-md-6 control-label">
								<g:message code="brand.form.edit.dt_created"/>
							</label>
							<div  class="col-md-4">
								<input id="date-picker" class="form-control form-control-inline input-small date-picker" size="16" type="text" value=""/></i>
							</div>
						</div>
					</div>
					<!-- COUNTRY -->
					<div class="col-md-4">
						<label class="col-md-2 control-label"><g:message code="brand.form.edit.country"/></label>
						<div class="col-md-8" style="margin-right: 10px; margin-left: 12px;">
							<div class="form-group">
								<select class="form-control input-sm">
									<option>Brasil</option>
									<option>EUA</option>
									<option>Itália</option>
								</select>
							</div>
						</div>
					</div>	

					<div class="col-md-4">
						<div class="form-group">
							<div class="col-md-8 radio-list" style="margin-left: 26px;">
								<label class="radio-inline">
								<input type="radio" name="optionsRadios" id="optionsRadios4" value="option1" checked> Ativa </label>
								<label class="radio-inline">
								<input type="radio" name="optionsRadios" id="optionsRadios5" value="option2"> Inativa </label>
								
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
		
        $('#date-picker').datepicker({
            rtl: false,
            orientation: "left",
            autoclose: true,
            buttonImageOnly: true
        });

        Popovers.handlePopovers();

	});
</script>