<!DOCTYPE html>
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="config.form.edit.additional"/>
		</div>
	</div>

	<!-- BASIC INFORMATION -->
	<div class="portlet-body form">
		<div role="form" class="form-horizontal">
			<div class="form-body">
				<!-- NAME -->
				<div class="form-group">

					<div class="col-md-5">
						<!-- LANGUAGE -->
						<div class="form-group">
							<label class="col-md-5 control-label"><g:message code="config.form.edit.language"/></label>
							<div class="col-md-1">
								<g:select id="language_id" name="lang" from="${languageList}" value="${lang}"
	      							 class="form-control input-small input-200" tabindex="1"/>
							</div>
						</div>

						<!-- DATE -->
						<div class="form-group">
							<label class="col-md-5 control-label"><g:message code="config.form.edit.date"/></label>
							<div class="col-md-1">
								<g:select name="lang" from="${languageList}" value="${lang}"
	      							 class="form-control input-small input-200" tabindex="1"/>
							</div>
						</div>

						<!-- TIME -->
						<div class="form-group">
							<label class="col-md-5 control-label"><g:message code="config.form.edit.time"/></label>
							<div class="col-md-1">
								<g:select name="lang" from="${languageList}" value="${lang}"
	      							 class="form-control input-small input-200" tabindex="1"/>
							</div>
						</div>

						<!-- NUMBER -->
						<div class="form-group">
							<label class="col-md-5 control-label"><g:message code="config.form.edit.number"/></label>
							<div class="col-md-1">
								<g:select name="lang" from="${languageList}" value="${lang}"
	      							 class="form-control input-small input-200" tabindex="1"/>
							</div>
						</div>

					</div>

					<div class="col-md-6">
						<!-- TYPE -->
						<div class="form-group">
							<label class="col-md-5 control-label"><g:message code="config.form.edit.type"/></label>
							<div class="col-md-1">
								<g:select id="language_id" name="lang" from="${languageList}" value="${lang}"
	      							 class="form-control input-small input-200" tabindex="1"/>
							</div>
						</div>

						<!-- MEASURES -->
						<div class="form-group">
							<label class="col-md-5 control-label"><g:message code="config.form.edit.measures"/></label>
							<div class="col-md-1">
								<g:select id="language_id" name="lang" from="${languageList}" value="${lang}"
	      							 class="form-control input-small input-200" tabindex="1"/>
							</div>
						</div>

						<!-- MEASURES -->
						<div class="form-group">
							<label class="col-md-5 control-label"><g:message code="config.form.edit.weight"/></label>
							<div class="col-md-1">
								<g:select id="language_id" name="lang" from="${languageList}" value="${lang}"
	      							 class="form-control input-small input-200" tabindex="1"/>
							</div>
						</div>

						<!-- REFERENCE -->
						<div class="form-group">
							<label class="col-md-5 control-label"><g:message code="config.form.edit.reference"/></label>
							<div class="col-md-1">
								<g:select id="language_id" name="lang" from="${languageList}" value="${lang}"
	      							 class="form-control input-small input-200" tabindex="1"/>
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

        $('#language_id').focus();

	});
</script>