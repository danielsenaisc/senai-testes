<!DOCTYPE html>
<!-- AUDIENCE -->
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="brand.form.edit.audience"/>
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="Como realizar esse cadastro!" data-original-title="Mais informações" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
		</div>

	</div>

	<div class="portlet-body form">
		<div role="form" class="form-horizontal">
			<div class="form-body">
				<!-- LOCATION -->
				<div class="form-group">
					<div class="col-md-4">
						<label class="control-label col-md-6"><g:message code="brand.form.edit.audiente.location"/></label>
						<div class="col-md-2">
							<input id="location_tag" type="text" class="form-control tags medium" value="Brasil,EUA"/>
						</div>
					</div>
				</div>
				<!-- AGE -->
				<div class="form-group">
					<div class="col-md-4">
						<label class="col-md-6 control-label"><g:message code="brand.form.edit.audiente.ages"/></label>
						<div class="col-md-1" style="margin-left: 30px;">
							<div class="form-group">
								<div class="form-group">
									<g:select name="age" from="${12..65}" value="${age}"
	          							noSelection="['':' - ']" class="form-control input-sm" style="width:50px" />
								</div>
							</div>
						</div>

						<div class="col-md-1" >
							<i class="fa fa-chevron-right" style="padding-top:16px;"></i>
						</div>

						<div class="col-md-1" style="margin-left: 20px;">
							<div class="form-group">
								<div class="form-group">
									<g:select name="age" from="${12..65}" value="${age}"
	          							noSelection="['':' - ']" class="form-control input-sm" style="width:50px" />
								</div>
							</div>
						</div>
					</div>	
				</div>	

				<!-- GENRE -->
				<div class="form-group">
					<label class="col-md-2 control-label"><g:message code="product.table.column.gender"/></label>
					<div class="col-md-6 radio-list" style="margin-left: 26px;">
						<label class="radio-inline">
						<input type="radio" name="optionsRadios" id="optionsRadios4" value="option1" checked> Masculino </label>
						<label class	="radio-inline">
						<input type="radio" name="optionsRadios" id="optionsRadios5" value="option2"> Feminino </label>
						<label class="radio-inline">
						<input type="radio" name="optionsRadios" id="optionsRadios6" value="option3"> Unissex </label>
					</div>
				</div>

				<div class="form-group">
					<div class="col-md-4">
						<div class="form-group">
							<label class="control-label col-md-6"><g:message code="brand.form.edit.audiente.styles"/></label>
							<div class="col-md-6">
								<input id="style_tag" type="text" class="form-control tags medium" value="Casual,Alternativo"/>
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
		
        $('#location_tag').tagsInput({
            width: 300,
            'defaultText':'nova tag...'
        });
        $('#style_tag').tagsInput({
            width: 300,
            'defaultText':'nova tag...'
        });

	});
</script>