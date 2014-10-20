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
							<label class="col-md-3 control-label"><g:message code="user.form.edit.name"/></label>
							<div class="col-md-3">
								<div class="input-icon right ">
									<input id="user_name" type="text" class="form-control input-xlarge input-446 placeholder-no-fix" tabindex="1">
								</div>
							</div>

						</div>

						<!-- POSITION, DEPTO -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="user.form.edit.position"/></label>
							<div class="col-md-2">
								<div class="input-icon right">
									<input class="form-control input-small input-150" tabindex="2" ></input>
								</div>
							</div>
							<label class="col-md-3 control-label"><g:message code="user.form.edit.departament"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<input class="form-control input-small input-150" tabindex="3"></input>
								</div>
							</div>
						</div>
						
						<!-- GENDER -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="user.form.edit.gender"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<label class="radio-inline">
										<input type="radio" name="genderRadio" id="optionsRadios4" value="option1" checked tabindex="4"> Masc 
									</label>		
									<label class="radio-inline">
										<input type="radio" name="genderRadio" id="optionsRadios5" value="option2" tabindex="5"> Fem
									</label>								
								</div>
							</div>
							<label class="col-md-2 control-label" ><g:message code="user.form.edit.birthday"/></label>
							<div  class="col-md-2">
								<input id="date-picker" class="form-control form-control-inline input-small input-150 date-picker" size="16" type="text" value="" tabindex="6"/></i>
							</div>
						</div>


						<!-- EMAIL -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="user.form.edit.email"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<input class="form-control input-xlarge input-446" tabindex="7" aria-required="true"></input>
								</div>
							</div>
						</div>

						<!-- LANGUAGE -->
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="user.form.edit.language"/></label>
							<div class="col-md-1">
									<g:select name="lang" from="${languageList}" value="${lang}"
	          							 class="form-control input-small input-150" tabindex="8"/>
							</div>

						</div>

						<!-- ACTIVE -->
						<div class="form-group">
							<div class="col-md-3">
							</div>
							<div  class="col-md-4">
								<label class="radio-inline">
								<input type="radio" name="activeRadio" id="optionsRadios4" value="option1" checked tabindex="5"> Ativo </label>
								<label class="radio-inline">
								<input type="radio" name="activeRadio" id="optionsRadios5" value="option2" tabindex="9"> Inativo </label>
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
												Selecione uma foto 
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

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="profile.form.edit.title"/>
				
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

				<div class="alert alert-danger display-hide">
					<button class="close" data-close="alert"></button>
					<span>
					Entre com seus dados de acesso. </span>
				</div>

				<!-- ACTUAL PASSWORD -->
				<div class="form-group">
					<div class="col-md-8">
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="profile.form.edit.actual-password"/></label>
							<div class="col-md-3">
								<div class="input-icon right ">
									<input name="actual_password" id="actual_password" type="password" class="form-control input-small placeholder-no-fix" tabindex="10" maxlength="14" autocomplete="off" placeholder="Senha atual">
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- NEW PASSWORD -->
				<div class="form-group">
					<div class="col-md-8">
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="profile.form.edit.new-password"/></label>
							<div class="col-md-3">
								<div class="input-icon right ">
									<input name="new_password" id="new_password" type="password" class="form-control input-small placeholder-no-fix" tabindex="11" maxlength="14" autocomplete="off" placeholder="Nova senha">
								</div>
							</div>

						</div>
					</div>
				</div>

				<!-- CONFIRM PASSWORD -->
				<div class="form-group">
					<div class="col-md-8">
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="profile.form.edit.confirm-password"/></label>
							<div class="col-md-3">
								<div class="input-icon right ">
									<input name="confirm_password" id="confirm_password" type="password" class="form-control input-small placeholder-no-fix" tabindex="12" maxlength="14" autocomplete="off" placeholder="Nova Senha">
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

        $('#user_name').focus();

	});
</script>