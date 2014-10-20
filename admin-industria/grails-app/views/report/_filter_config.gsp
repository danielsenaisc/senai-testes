<!DOCTYPE html>

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="report.form.edit.config"/>
			
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="<g:message code="popovers.title"/>" data-original-title="<g:message code="popovers.info"/>" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
				
		</div>
	</div>

	<!-- BASIC INFORMATION -->
	<div class="portlet-body form">
		<div role="form" class="form-horizontal">
			
			<div class="form-body">

				<div class="form-group">
					<!-- BRAND -->
					<div class="col-md-4">
						<div class="form-group">
							<div class="col-md-12">
								<div class="col-md-2 config-checkbox" tabindex="20">
									<input type="checkbox" class="checkboxes" value="1"/>
								</div>
								<label class="control-label label-checkbox col-md-8"><g:message code="report.form.edit.group-by-brand"/></label>
							</div>
						</div>

						<!-- COLLECTION -->
						<div class="form-group">
							<div class="col-md-12">
								<div class="col-md-2 config-checkbox" tabindex="21">
									<input type="checkbox" class="checkboxes config-checkbox" value="1"/>
								</div>
								<label class="control-label label-checkbox col-md-8"><g:message code="report.form.edit.group-by-collection"/></label>
							</div>
						</div>

						<!-- PROFILE -->
						<div class="form-group">
							<div class="col-md-12">
								<div class="col-md-2 config-checkbox" tabindex="22">
									<input type="checkbox" class="checkboxes" value="1"/>
								</div>
								<label class="control-label label-checkbox col-md-8"><g:message code="report.form.edit.group-by-profile"/></label>
							</div>
						</div>
					</div>	
				
					<div class="col-md-4">
						<!-- LOCATION -->
						<div class="form-group">
							<div class="col-md-12">
								<div class="col-md-2 config-checkbox" tabindex="23">
									<input type="checkbox" class="checkboxes" value="1"/>
								</div>
								<label class="control-label label-checkbox col-md-8"><g:message code="report.form.edit.group-by-location"/></label>
							</div>
						</div>

						<!-- AGE -->
						<div class="form-group">
							<div class="col-md-12">
								<div class="col-md-2 config-checkbox" tabindex="24">
									<input type="checkbox" class="checkboxes" value="1"/>
								</div>
								<label class="control-label label-checkbox col-md-8"><g:message code="report.form.edit.group-by-age"/></label>
							</div>
						</div>

						<!-- AGE -->
						<div class="form-group">
							<div class="col-md-12">
								<div class="col-md-2 config-checkbox" tabindex="25">
									<input type="checkbox" class="checkboxes" value="1"/>
								</div>
								<label class="control-label label-checkbox col-md-6"><g:message code="report.form.edit.group-by-gender"/></label>
							</div>
						</div>
					</div>
				

					<div class="col-md-4">
						<!-- VARIANT -->
						<div class="form-group">
							<div class="col-md-12">
								<div class="col-md-2 config-checkbox" tabindex="26">
									<input type="checkbox" class="checkboxes" value="1"/>
								</div>
								<label class="control-label label-checkbox col-md-8"><g:message code="report.form.edit.group-by-variant"/></label>
							</div>
						</div>

						<!-- CATEGORY -->
						<div class="form-group">
							<div class="col-md-12">
								<div class="col-md-2 config-checkbox" tabindex="27">
									<input type="checkbox" class="checkboxes" value="1"/>
								</div>
								<label class="control-label label-checkbox col-md-8"><g:message code="report.form.edit.group-by-category"/></label>
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


	});
</script>