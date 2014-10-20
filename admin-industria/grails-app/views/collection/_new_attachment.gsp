<!DOCTYPE html>
<!-- NEW ATTACHMENT MODAL -->
<div class="modal fade" id="new_attachment" role="new_attachment" aria-hidden="true">
	<div class="modal-dialog" id="restore_collections_id">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
				<h4 class="modal-title"><g:message code="collection.form.edit.modal.attachment.title"/> </h4>
			</div>

			<div class="modal-body">
				<form>
				<!-- NAME -->
				<div class="form-group">
					<label class="col-md-3 control-label"><g:message code="collection.form.edit.modal.attachment.name"/></label>
					<div class="col-md-3">
						<div class="input-icon right">
							<i class="fa tooltips"  data-container="body"></i>
							<input id="attachment_id" type="text" class="form-control input-large" autofocus tabindex="1">
						</div>
					</div>
				</div>
				<!-- DESCRIPTION -->
				<div class="form-group">
					<label class="col-md-3 control-label"><g:message code="collection.form.edit.modal.attachment.description"/></label>
					<div class="col-md-3">
						<div class="input-icon right">
							<i class="fa tooltips"  data-container="body"></i>
							<textarea class="form-control input-large" rows="4" tabindex="2" maxlength="600"></textarea>
						</div>
					</div>
				</div>

				<!-- TYPE -->
				<div class="form-group">
					<label class="col-md-3 control-label"><g:message code="collection.form.edit.modal.attachment.type"/></label>
					<div class="col-md-3" style="margin-right: 10px; margin-left: 12px;">
						<div class="form-group">
							<select class="form-control input-small">
								<option>Desfile</option>
								<option>Moda</option>
								<option>Exposição</option>
							</select>
						</div>
					</div>	
				</div>

				<!-- FILE TYPE -->
				<div class="form-group">
					<label class="col-md-3 control-label"><g:message code="collection.form.edit.modal.attachment.file-type"/></label>
					<div class="col-md-3" style="margin-right: 10px; margin-left: 12px;">
						<div class="form-group">
							<select class="form-control input-small" id="file-type-id">
								<option>Foto</option>
								<option>Vídeo</option>
								<option>Link</option>
							</select>
						</div>
					</div>	
				</div>

				<!-- lINK -->
				<div id="link-id" class="form-group display-none">
					<label class="col-md-3 control-label"><g:message code="collection.form.edit.modal.attachment.link"/></label>
					<div class="col-md-3">
						<div class="input-icon right">
							<i class="fa tooltips"  data-container="body"></i>
							<input id="link-input-id" type="text" class="form-control input-large" autofocus tabindex="1">
						</div>
					</div>
				</div>

				<!-- FILE -->
				<div id="file-id" class="form-group display-show">
					<label class="col-md-3 control-label"></label>
					<div class="col-md-9">
						<div class="fileinput fileinput-new" data-provides="fileinput">
							<div class="input-group input-large">
								<div class="form-control uneditable-input span3" data-trigger="fileinput">
									<i class="fa fa-file fileinput-exists"></i>&nbsp; <span class="fileinput-filename">
									</span>
								</div>
								<span class="input-group-addon btn default btn-file">
								<span class="fileinput-new">
								Selecionar arquivo... </span>
								<span class="fileinput-exists">
								Alterar </span>
								<input type="file" name="...">
								</span>
								<a href="#" class="input-group-addon btn red fileinput-exists" data-dismiss="fileinput">
								Remover </a>
							</div>
						</div>
					</div>
				</div>


				
				</form>
			</div>

			<div class="modal-footer">
				<button type="button" class="btn default" data-dismiss="modal">Não</button>
				<a href="${createLink(controller:'collection', action:'edit')}" class="btn blue">Sim</a>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<script>
	jQuery(document).ready(function() {   
		
        $('#attachment_id').focus();

         $('#file-type-id').on('change', function() {
			
			if ($(this).val() == 'Link' || $(this).val() == 'Vídeo' ) {

				$("#link-id").removeClass("display-none");
				$("#link-id").addClass("display-show");

				$("#file-id").removeClass("display-show");
				$("#file-id").addClass("display-none");

			}else{

				$("#link-id").removeClass("display-show");
				$("#link-id").addClass("display-none");

				$("#file-id").removeClass("display-none");
				$("#file-id").addClass("display-show");	

			}

			if ( $(this).val() == 'Vídeo' ) {
				$("#link-input-id").attr("placeHolder","Cole aqui o link do seu vídeo. Youtube,Vímeo,...");
			}

			if ( $(this).val() == 'Link' ) {
				$("#link-input-id").attr("placeHolder","Cole aqui o seu link.");
			}

		});

	});

</script>

