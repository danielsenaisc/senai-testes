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

	<!-- BASIC INFORMATION -->
	<div class="portlet-body form">
		<div role="form" class="form-horizontal">
			<div class="form-body">
				<!-- NAME -->
				<div class="form-group">
					<div class="col-md-8">
						<div class="form-group">
							<label class="col-md-3 control-label"><g:message code="report.form.edit.name"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<input id="report_name" type="text" class="form-control input-xlarge col-wid399" tabindex="1">
								</div>
							</div>

						</div>
						<!-- TYPE -->
						<div class="form-group ">
							<label class="control-label col-md-3"><g:message code="report.form.edit.type"/></label>
							<div class="col-md-6" style="margin-left: 14px;">
								<div class="form-group">
									<g:select name="type" from="${typeList}" value="${type}"
	          							 class="form-control input-small input-200" tabindex="2"/>
								</div>
							</div>
						</div>
						<!-- PERIOD -->
						<div class="form-group ">
							<label class="control-label col-md-3"><g:message code="report.form.edit.period"/></label>
							<div class="col-md-2" style="margin-left: 14px;margin-right:14px;">
								<div class="form-group">
									<g:select name="period" from="${periodList}" value="${period}"
	          							 class="form-control input-small" tabindex="3" id="period_id"/>
								</div>
							</div>

							<!-- VIGENCIA -->
								<div class="col-md-1 display-none" style="margin-left: 6px;margin-right:40px;" id="div_start_id">
										<div class="form-group ">
										<input id="date-picker-start" class="form-control form-control-inline input-small date-picker input-100" size="16" type="text" value="" tabindex="4"/></i>
										</div>
								</div>

								<div class="col-md-1 display-none" id="div_center_id">
									<i class="fa fa-chevron-right" style="padding-top:16px;padding-left:12px;"></i>
								</div>

								<div class="col-md-1 display-none" style="margin-left: 0px;" id="div_end_id">
										<div class="form-group ">
										<input id="date-picker-end" class="form-control form-control-inline input-small date-picker input-100" size="16" type="text" value="" tabindex="5"/></i>
										</div>
								</div>

						</div>

					</div>
					
				</div>

				<!-- REPORT TYPE -->
				<div class="form-group">
					<label class="control-label col-md-2"><g:message code="report.form.edit.report-type"/></label>
					<div  class="col-md-4">
						<label class="radio-inline">
						<input type="radio" name="optionsRadio" id="optionsRadios4" value="option1" checked tabindex="5"> <g:message code="report.form.edit.report-type.static"/> </label>
						<label class="radio-inline">
						<input type="radio" name="optionsRadio" id="optionsRadios5" value="option2" tabindex="6"> <g:message code="report.form.edit.report-type.free"/> </label>
					</div>
				</div>

				<div class="form-group ">
					<label class="control-label col-md-2"><g:message code="report.form.edit.access"/></label>
					<div class="col-md-6" style="margin-left: 14px;">
						<div class="form-group">
							<g:select name="access" from="${accessList}" value="${access}"
      							 class="form-control input-small input-200" tabindex="7"/>
						</div>
					</div>
				</div>

				

			</div>
			
		</div>
	</div>


</div>

<script>
	jQuery(document).ready(function() {   
		
        CustomDatePicker.init('date-picker-start');

        CustomDatePicker.init('date-picker-end');

        Popovers.handlePopovers();

        $('#report_name').focus();

        $('#period_id').on('change', function() {
			
			if ($(this).val() == 'Personalizado') {

				$("#div_start_id").removeClass("display-none");
				$("#div_start_id").addClass("display-show");

				$("#div_center_id").removeClass("display-none");
				$("#div_center_id").addClass("display-show");

				$("#div_end_id").removeClass("display-none");
				$("#div_end_id").addClass("display-show");

			}else{

				$("#div_start_id").removeClass("display-show");
				$("#div_start_id").addClass("display-none");

				$("#div_center_id").removeClass("display-show");
				$("#div_center_id").addClass("display-none");

				$("#div_end_id").removeClass("display-show");
				$("#div_end_id").addClass("display-none");
			}

		});

	});
</script>