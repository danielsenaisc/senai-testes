<!DOCTYPE html>
<!-- validar status da conta -->
<g:if test="${true}">
	<div class="dashboard-stat green config-status">
		<div class="form-group">

			<div class="col-md-3">
				<i class="fa fa-gear config-status-visual"></i>
			</div>
			<div class="col-md-8">
				<div class="desc config-status-info">
					 Status
				</div>
				<div class="desc config-status-value">
					 ATIVA
				</div>
			</div>

		</div>
		
	</div>
</g:if>
<g:if test="${false}">
	<div class="dashboard-stat red config-status">
		<div class="form-group">

			<div class="col-md-3">
				<i class="fa fa-gear config-status-visual"></i>
			</div>
			<div class="col-md-8">
				<div class="desc config-status-info">
					 Status
				</div>
				<div class="desc config-status-value">
					 INATIVA
				</div>
			</div>

		</div>
		
	</div>
</g:if>

<g:if test="${false}">
	<div class="dashboard-stat yellow config-status">
		<div class="form-group">

			<div class="col-md-3">
				<i class="fa fa-gear config-status-visual"></i>
			</div>
			<div class="col-md-8">
				<div class="desc config-status-info">
					 Status
				</div>
				<div class="desc config-status-value">
					 INATIVA
				</div>
			</div>

		</div>
		
	</div>
</g:if>