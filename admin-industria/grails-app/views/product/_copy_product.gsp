<!DOCTYPE html>
<!-- COPY PRODUCT MODAL -->
<div class="modal fade" id="copy-product" role="copy-product" aria-hidden="true">
	<div class="modal-dialog" id="copy_product_id">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
				<h4 class="modal-title"><g:message code="product.form.edit.modal.title"/> </h4>
			</div>

			<div class="modal-body">



				<div class="form-group">
					<div class="col-md-1">
						<input name="basic" type="checkbox" class="group-checkable" data-set="teste"/>
					</div>
					<label class="col-md-11 control-label"><g:message code="product.form.edit.modal.basic-info"/></label>
				</div>

				<div class="form-group">
					<div class="col-md-1">
						<div>
							<input name="modeling" type="checkbox" class="group-checkable" data-set=""/>
						</div>
					</div>
					<label class="col-md-11 control-label"><g:message code="product.form.edit.modal.modeling"/></label>
				</div>

				<div class="form-group">
					<div class="col-md-1">
						<div>
							<input name="variants" type="checkbox" class="group-checkable" data-set=""/>
						</div>
					</div>
					<label class="col-md-11 control-label"><g:message code="product.form.edit.modal.variants"/></label>
				</div>

				<div class="form-group">
					<div class="col-md-1">
						<div>
							<input name="code" type="checkbox" class="group-checkable" data-set=""/>
						</div>
					</div>
					<label class="col-md-11 control-label"><g:message code="product.form.edit.modal.code"/></label>
				</div>

				<div class="form-group">
					<div class="col-md-1">
						<div>
							<input name="videos" type="checkbox" class="group-checkable" data-set=""/>
						</div>
					</div>
					<label class="col-md-11 control-label"><g:message code="product.form.edit.modal.videos"/></label>
				</div>

				<div class="form-group">
					<div class="col-md-1">
						<div>
							<input name="attributes" type="checkbox" class="group-checkable" data-set=""/>
						</div>
					</div>
					<label class="col-md-11 control-label"><g:message code="product.form.edit.modal.attributes"/></label>
				</div>
			</div> 

			<div class="modal-footer copy-product-modal">
				<div class="col-md-7 copy-product-div">
					<span style="font-size: 14px;font-family: sans-serif;font-style: italic; margin-top:20px;">
						<g:message code="product.form.edit.modal.confirm"/>
					</span>
				</div>
				<button type="button" class="btn default copy-product-div" data-dismiss="modal"><g:message code="button.default.cancel"/></button>
				<button type="button" class="btn blue copy-product-div"><g:message code="product.form.edit.modal.copy"/></button>
			</div>

		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>