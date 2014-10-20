<!DOCTYPE html>
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="config.form.edit.summary"/>
		</div>
	</div>

	<!-- BASIC INFORMATION -->
	<div class="portlet-body form">
		<div role="form" class="form-horizontal">
			<div class="form-body">
				<div class="form-group">
					<div class="col-md-12">
						<div class="form-group">
							<div class="col-md-6">
								<h3 class="summary_title"><g:message code="config.form.edit.summary"/></h3>
							</div>
							<div class="col-md-6">
								<h3 class="summary_title"><g:message code="config.form.edit.month-summary"/></h3>
							</div>
						</div>
					</div>

					<div class="col-md-5">
						<div class="form-group">
							<!-- BRANDS -->
							<div class="form-group">
								<label class="col-md-6 control-label"><g:message code="config.form.edit.brands"/></label>
								<div class="col-md-1">
								<input readonly="true" type="text" class="form-control input-small" value="${brandCount}">
								</div>
							</div>

							<!-- COLLECTIONS -->
							<div class="form-group">
								<label class="col-md-6 control-label"><g:message code="config.form.edit.collections"/></label>
								<div class="col-md-1">
								<input readonly="true" type="text" class="form-control input-small" value="${collectionCount}">
								</div>
							</div>

							<!-- PRODUCTS -->
							<div class="form-group">
								<label class="col-md-6 control-label"><g:message code="config.form.edit.products"/></label>
								<div class="col-md-1">
								<input readonly="true" type="text" class="form-control input-small" value="${productCount}">
								</div>
							</div>

							<!-- VARIANTS -->
							<div class="form-group">
								<label class="col-md-6 control-label"><g:message code="config.form.edit.variants"/></label>
								<div class="col-md-1">
								<input readonly="true" type="text" class="form-control input-small" value="${variantCount}">
								</div>
							</div>

							<!-- STORAGE -->
							<div class="form-group">
								<label class="col-md-6 control-label"><g:message code="config.form.edit.storage"/></label>
								<div class="col-md-1">
								<input readonly="true" type="text" class="form-control input-small" value="${storageCount}">
								</div>
							</div>
							
						</div>
					</div>

					<div class="col-md-6">
						<!-- PRODCUT VIEW -->
						<div class="form-group">
							<label class="col-md-6 control-label"><g:message code="config.form.edit.product.view"/></label>
							<div class="col-md-1">
								<input readonly="true" type="text" class="form-control input-small" value="${viewCount}">
							</div>
						</div>
						<!-- COMPARISONS -->
						<div class="form-group">
							<label class="col-md-6 control-label"><g:message code="config.form.edit.comparisons"/></label>
							<div class="col-md-1">
								<input readonly="true" type="text" class="form-control input-small" value="${compareCount}">
							</div>
						</div>
						<!-- INDICATIONS -->
						<div class="form-group">
							<label class="col-md-6 control-label"><g:message code="config.form.edit.indications"/></label>
							<div class="col-md-1">
								<input readonly="true" type="text" class="form-control input-small" value="${indicationCount}">
							</div>
						</div>
						<!-- USERS -->
						<div class="form-group">
							<label class="col-md-6 control-label"><g:message code="config.form.edit.users"/></label>
							<div class="col-md-1">
								<input readonly="true" type="text" class="form-control input-small" value="${userCount}">
							</div>
						</div>
						<!-- TRAFFIC -->
						<div class="form-group">
							<label class="col-md-6 control-label"><g:message code="config.form.edit.traffic"/></label>
							<div class="col-md-1">
								<input readonly="true" type="text" class="form-control input-small" value="${trafficCount}">
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>

</div>
