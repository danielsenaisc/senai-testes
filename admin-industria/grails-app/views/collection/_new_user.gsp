<!DOCTYPE html>

<!-- NEW USER MODAL -->
<div class="modal fade" id="new_user" role="new_user" aria-hidden="true">
	<div class="modal-dialog" id="new_user_dialog">
		<div class="modal-content" id="new_user_content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
				<h4 class="modal-title"><g:message code="collection.form.edit.modal.create"/></h4>
			</div>

			<div class="portlet-body" style="margin-top:30px;">

				<div role="form" class="form-horizontal">
					<div class="form-body">
						<!-- NAME -->
						<div class="form-group">
							<div class="col-md-8">
								<label class="col-md-3 control-label"><g:message code="team.table.column.name"/></label>
								<div class="col-md-3">
									<div class="input-icon right">
										<i class="fa tooltips"  data-container="body"></i>
										<input id="new_member_name" type="text" class="form-control input-xlarge" tabindex="1" autofocus>
									</div>
								</div>

							</div>
						</div>

						<!-- GENDER -->
						<div class="form-group">
							<div class="col-md-8">
								<label class="col-md-3 control-label"><g:message code="team.form.edit.gender"/></label>
								<div class="col-md-6">
									<div class="input-icon right">
										<label class="radio-inline">
											<input type="radio" name="optionsRadio" id="optionsRadios4" value="option1" checked tabindex="-1"> Masc. 
										</label>		
										<label class="radio-inline">
											<input type="radio" name="optionsRadio" id="optionsRadios5" value="option2" tabindex="-1"> Fem.
										</label>								
									</div>
								</div>
							</div>
						</div>

						<!-- POSITION -->
						<div class="form-group">
							<div class="col-md-8">
								<label class="col-md-3 control-label"><g:message code="collection.table.column.userjob"/></label>
								<div class="col-md-3">
									<div class="input-icon right">
										<i class="fa tooltips"  data-container="body"></i>
										<input id="new_member_position" type="text" class="form-control input-xlarge" tabindex="2">
									</div>
								</div>

							</div>
						</div>

					</div>
				</div>
			</div>

			<div class="form-actions right" style="text-align:right; margin-right:84px;">
				<div class="col-md-9">
					<span style="font-size: 14px;font-family: sans-serif;font-style: italic;">
						<g:message code="collection.form.edit.modal.create-info"/>
					</span>
				</div>
				<div class="col-md-2">
					<button type="submit" class="btn blue-madison" data-dismiss="modal">
						<g:message code="collection.form.edit.modal.create-add"/>
					</button>
				</div>
			</div>

		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<script>
	jQuery(document).ready(function() {   
		 $('#new_member_name').focus();

	});

</script>