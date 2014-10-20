<!DOCTYPE html>
<!-- AUDIENCE -->
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="collection.form.edit.audience"/>
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="Como realizar esse cadastro!" data-original-title="Mais informações" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
		</div>
		<div class="actions">
			<a class="btn btn-default btn-sm" data-toggle="modal" href="#restore_collections">
				<i class="fa fa-copy"></i> <g:message code="collection.form.edit.audience.restore"/> 
			</a>
		</div>

		<!-- RESTORE MODELS MODAL -->
		<g:render template="/collection/restore_collections"/>

	</div>

	<div class="portlet-body form">
		<div role="form" class="form-horizontal">
			<div class="form-body">
				<!-- LOCATION -->
				<div class="form-group">
					<div class="col-md-4">
						<label class="control-label col-md-6"><g:message code="collection.form.edit.audiente.location"/></label>
						<div class="col-md-2" tabindex="9">
							<input id="location_tag" type="text" class="form-control tags medium" value="Brasil,EUA" />
						</div>
					</div>
				</div>
				<!-- AGE -->
				<div class="form-group">
					<div class="col-md-6">
						<label class="col-md-4 control-label"><g:message code="collection.form.edit.audiente.ages"/></label>
						<div class="col-md-1" style="margin-left: 30px;">
							<div class="form-group">
								<div class="form-group">
									<g:select name="age" from="${0..99}" value="${age}"
	          							noSelection="['':' - ']" class="form-control input-small age-select" tabindex="10"/>
								</div>
							</div>
						</div>

						<div class="col-md-1" >
							<i class="fa fa-chevron-right" style="padding-top:16px;"></i>
						</div>

						<div class="col-md-1" style="margin-left: 20px;">
							<div class="form-group">
								<div class="form-group">
									<g:select name="age" from="${0..99}" value="${age}"
	          							noSelection="['':' - ']" class="form-control input-small age-select" tabindex="11"/>
								</div>
							</div>
						</div>
					</div>	
				</div>	

				<!-- GENRE -->
				<div class="form-group">
					<label class="col-md-2 control-label"><g:message code="product.table.column.gender"/></label>
					<div class="col-md-6 radio-list" >
						<label class="radio-inline">
						<input type="radio" name="optionsRadio" id="optionsRadios4" value="option1" checked tabindex="12"> Masc. </label>
						<label class="radio-inline">
						<input type="radio" name="optionsRadio" id="optionsRadios5" value="option2" tabindex="13"> Fem. </label>
						<label class="radio-inline">
						<input type="radio" name="optionsRadio" id="optionsRadios6" value="option3" tabindex="14"> Unissex </label>
					</div>
				</div>

				<div class="form-group">
					<div class="col-md-4">
						<div class="form-group">
							<label class="control-label col-md-6"><g:message code="collection.form.edit.audiente.styles"/></label>
							<div class="col-md-6" tabindex="15">
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
		
        $("#location_tag").select2({
        	width: 300,
        	'defaultText':'nova tag...',
            tags: ["Loren Ipsum", "Loren Ipsum", "Loren Ipsum"]
        });

        $("#style_tag").select2({
        	width: 300,
        	'defaultText':'nova tag...',
            tags: ["Loren Ipsum", "Loren Ipsum", "Loren Ipsum"]
        });

	});
</script>