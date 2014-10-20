<!DOCTYPE html>
<style type="text/css">
	select.input-sm {
		height: 28px;
		line-height: 28px;
		vertical-align: middle;
		padding-top: 10px;
		margin: 0;
		padding: auto 0;
	}
</style>
<div class="portlet box blue-madison">
<div class="portlet-title">
		<div class="caption">
			<g:message code="team.form.edit.basic"/>
			
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
							<label class="col-md-3 control-label"><g:message code="team.table.column.name"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<input id="member_name" type="text" class="form-control input-xlarge col-wid399" tabindex="1">
								</div>
							</div>

						</div>

						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="team.form.edit.position"/></label>
							<div class="col-md-2 col-wd148">
								<div class="input-icon right">
									<input type text class="form-control form-control-inline input-small" tabindex="2" />
								</div>
							</div>
							<label class="col-md-1 control-label col-wid130" ><g:message code="team.form.edit.natural"/></label>
							<div class="col-md-2">
								<div class="input-icon right">
									<select class="form-control input-small" tabindex="3">
										<option>Brasil</option>
										<option>EUA</option>
										<option>Itália</option>
									</select>								
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="team.form.edit.gender"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<label class="radio-inline">
										<input type="radio" name="optionsRadio" id="optionsRadios4" value="option1" checked tabindex="4"> Masc 
									</label>		
									<label class="radio-inline">
										<input type="radio" name="optionsRadio" id="optionsRadios5" value="option2" tabindex="5"> Fem
									</label>								
								</div>
							</div>
							
						</div>


						<div class="form-group">
							<label class="col-md-3 control-label" style="padding: 7px 14px 0px 20px;"><g:message code="team.form.edit.birthday"/></label>
							<div  class="col-md-1">
								<input id="date-picker" class="form-control form-control-inline input-small date-picker" size="16" type="text" value="" tabindex="6"/></i>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="team.form.edit.about"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<textarea class="form-control input-large col-wid399" rows="7" cols="50" tabindex="7"></textarea>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-3">
							</div>
							<div  class="col-md-4">
								<label class="radio-inline">
								<input type="radio" name="optionsRadio" id="optionsRadios4" value="option1" checked tabindex="8"> Ativo </label>
								<label class="radio-inline">
								<input type="radio" name="optionsRadios" id="optionsRadios5" value="option2" tabindex="9"> Inativo </label>
							</div>
						</div>
								
					</div>

					<div class="col-md-3">
						<div class="form-group">
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
											<input type="file" name="..." tabindex="-1">
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
			
			</div>
			
		</div>
	</div>


</div>

<script>
	jQuery(document).ready(function() {   
		
        CustomDatePicker.init('date-picker');

        Popovers.handlePopovers();

        $('#member_name').focus();

	});
</script>