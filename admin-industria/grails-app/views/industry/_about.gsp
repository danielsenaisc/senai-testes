<!DOCTYPE html>
<!-- ABOUT -->
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="industry.form.edit.about"/>
			
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="Como realizar esse cadastro!" data-original-title="Mais informações" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
				
		</div>
	</div>

	<!--  ABOUT -->
	<div class="portlet-body form">
		<div role="form" class="form-horizontal">
			<div class="form-body">
				<!-- ABOUT -->
				<div class="form-group">
					<div class="col-md-8">
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="industry.form.edit.about"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<i class="fa tooltips"  data-container="body"></i>
									<textarea id="industry_name" type="text" class="form-control input-xlarge input-446" tabindex="10" rows="6" maxlength="600"></textarea>
								</div>
							</div>

						</div>
						<!-- DATE -->
						<div class="form-group">
							<label style = "text-align:right;" class="col-md-3 control-label">
								<g:message code="industry.form.edit.dt_created"/>
							</label>
							<div  class="col-md-4 col-wd148">
								<input id="date-picker" class="form-control form-control-inline input-small date-picker" size="16" type="text" value="" tabindex="11"/></i>
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

	});
</script>