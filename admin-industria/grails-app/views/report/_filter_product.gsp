<!DOCTYPE html>

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="report.form.edit.product-filter"/>
			
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
					<div class="col-md-6">
						
						<!-- BRANDS -->
						<div class="form-group ">
							<label class="control-label col-md-4"><g:message code="report.form.edit.brands"/></label>
							<div class="col-md-6" style="margin-left: 14px;">
								<div class="form-group">
									<g:select name="brand" from="${brandList}" value="${brand}"
	          							 class="form-control input-small input-200" tabindex="8"/>
								</div>
							</div>
						</div>

						<!-- COLLECTIONS -->
						<div class="form-group ">
							<label class="control-label col-md-4"><g:message code="report.form.edit.collections"/></label>
							<div class="col-md-6" style="margin-left: 14px;">
								<div class="form-group">
									<g:select name="collection" from="${collectionList}" value="${collection}"
	          							 class="form-control input-small input-200" tabindex="9"/>
								</div>
							</div>
						</div>

						<!-- PRODUCTS -->
						<div class="form-group ">
							<label class="control-label col-md-4"><g:message code="report.form.edit.products"/></label>
							<div class="col-md-6" style="margin-left: 14px;">
								<div class="form-group">
									<g:select name="product" from="${productList}" value="${product}"
	          							 class="form-control input-small input-200" tabindex="10"/>
								</div>
							</div>
						</div>

					</div>

					<div class="col-md-6">
						<!-- CATEGORY -->
						<div class="form-group ">
							<label class="control-label col-md-3"><g:message code="report.form.edit.category"/></label>
							<div class="col-md-6" style="margin-left: 14px;">
								<div class="form-group">
									<g:select name="category" from="${categoryList}" value="${category}"
	          							 class="form-control input-small input-200" tabindex="11"/>
								</div>
							</div>
						</div>

						<div class="form-group ">
							<label class="control-label col-md-3"></label>
							<div class="col-md-6" style="margin-left: 14px;">
								<div class="form-group">
									<g:select name="sub" from="${subCategoryList}" value="${sub}"
	          							 class="form-control input-small input-200" tabindex="12"/>
								</div>
							</div>
						</div>

						<div class="form-group ">
							<label class="control-label col-md-3"></label>
							<div class="col-md-6" style="margin-left: 14px;">
								<div class="form-group">
									<g:select name="sub" from="${subCategoryList}" value="${sub}"
	          							 class="form-control input-small input-200" tabindex="13"/>
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

        Popovers.handlePopovers();

	});
</script>