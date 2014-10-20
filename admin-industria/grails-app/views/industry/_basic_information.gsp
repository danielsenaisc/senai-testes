<!DOCTYPE html>
<!-- ABOUT -->
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="brand.form.edit.basic"/>
			
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="Como realizar esse cadastro!" data-original-title="Mais informações" 
			data-placement="top">
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
							<label class="col-md-3 control-label"><g:message code="industry.form.edit.name"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<input id="industry_name" type="text" class="form-control input-xlarge input-446" tabindex="1">
								</div>
							</div>

						</div>
						<!-- SOCIAL -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="industry.form.edit.social"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<input class="form-control input-xlarge input-446" tabindex="2"></input>
								</div>
							</div>
						</div>

						<!-- CNPJ , INSC. ESTADUAL -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="industry.form.edit.cnpj"/></label>
							<div class="col-md-2">
								<div class="input-icon right">
									<input id="cnpj-id" class="form-control input-small input-150" tabindex="3" ></input>
								</div>
							</div>
							<label class="col-md-3 control-label"><g:message code="industry.form.edit.inscricao-estadual"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<input class="form-control input-small input-150" tabindex="4"></input>
								</div>
							</div>
						</div>
						<!-- CEP , BAIRRO -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="industry.form.edit.cep"/></label>
							<div class="col-md-2">
								<div class="input-icon right">
									<input id="cep-id" class="form-control input-small input-150" tabindex="5"></input>
								</div>
							</div>
							<label class="col-md-3 control-label"><g:message code="industry.form.edit.neighborhood"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<input class="form-control input-small input-150" tabindex="6"></input>
								</div>
							</div>
						</div>

						<!-- ADDRESS -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="industry.form.edit.address"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<input class="form-control input-xlarge input-446" tabindex="7"></input>
								</div>
							</div>
						</div>

						<!-- ADDITIONAL , CITY -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="industry.form.edit.additonal"/></label>
							<div class="col-md-2">
								<div class="input-icon right">
									<input class="form-control input-small input-150" tabindex="8"></input>
								</div>
							</div>
							
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label" ><g:message code="industry.form.edit.country"/></label>
							<div class="col-md-2">
								<div class="input-icon right">
									<g:select name="country" from="${countryList}" value="${country}"
	          							 class="form-control input-small input-150" tabindex="9"/>							
								</div>
							</div>
						
							
						</div>

						<div class="form-group">
							<label class="col-md-3 control-label" ><g:message code="industry.form.edit.state"/></label>
							<div class="col-md-1">
								<div class="input-icon right">
									<g:select name="state" from="${stateList}" value="${state}"
	          							 class="form-control input-small" tabindex="10" style="width:55px !important;"/>							
								</div>
							</div>

							<div class="col-md-2">
								<div class="input-icon right">
									<g:select name="city" from="${cityList}" value="${city}"
	          							 class="form-control input-small" tabindex="10" style="width:300px !important;"/>							
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
		

        Popovers.handlePopovers();

        $('#industry_name').focus();

        $('#cnpj-id').mask("99.999.999/9999-99");

        $('#cep-id').mask("99.999-999");


	});

  
</script>