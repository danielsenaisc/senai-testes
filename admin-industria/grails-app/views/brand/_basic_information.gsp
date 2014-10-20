<!DOCTYPE html>

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="brand.form.edit.basic"/>
			
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="<g:message code="popovers.title"/>" data-original-title="<g:message code="popovers.info"/>" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
				
		</div>
	</div>
	<g:form name="testForm" controller="brand" action="index">
    	<g:textField name="input1" value="${input1}"> </g:textField>
    	<g:textField name="input2" value="${input2}"> </g:textField>
		<g:submitButton name="Submit" value="Submit"></g:submitButton>
	</g:form>
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
									<input id="brand_name" name="brand_name" type="text" class="form-control input-xlarge col-wid399" tabindex="1">
								</div>
							</div>

						</div>
						<!-- DESCRIPTION -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="brand.form.edit.description"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<textarea class="form-control input-xlarge col-wid399" rows="7" tabindex="2" maxlength="600"></textarea>
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
												Selecione um arquivo 
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
				
				<!-- DATA -->
				<div class="form-group">
					<div class="col-md-4">
						<label style = "text-align:right;" class="col-md-6 control-label">
							<g:message code="brand.form.edit.dt_created"/>
						</label>
						<div  class="col-md-4 col-wd148">
							<input id="date-picker" class="form-control form-control-inline input-small date-picker" size="16" type="text" value="" tabindex="3"/></i>
						</div>
					</div>
					<!-- COUNTRY -->
					<div class="col-md-4">
						<label class="control-label col-md-2"><g:message code="brand.form.edit.country"/></label>
						<div class="col-md-8" style="margin-right: 10px; margin-left: 12px;">
							<div class="form-group">
								<select class="form-control input-small col-wd148" tabindex="4">
									<option>Brasil</option>
									<option>EUA</option>
									<option>Itália</option>
								</select>
							</div>
						</div>
					</div>	
				</div>

				<!-- ACTIVE -->
				<div class="form-group">
					<div class="col-md-2">
					</div>
					<div  class="col-md-4">
						<label class="radio-inline">
						<input type="radio" name="optionsRadio" id="optionsRadios4" value="option1" checked tabindex="5"> Ativa </label>
						<label class="radio-inline">
						<input type="radio" name="optionsRadio" id="optionsRadios5" value="option2" tabindex="6"> Inativa </label>
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