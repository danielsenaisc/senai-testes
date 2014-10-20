<!DOCTYPE html>
<div class="portlet box blue-madison" style="height:400px;">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-warning"></i><g:message code="dashboard.form.alerts.title"/>
		</div>
		
	</div>
	<div class="portlet-body" style="height:80%">
		<g:each var="alert" in="${alertList}">
			<p class="note note-warning">
				 Existem 300 produtos sem dados de modelagem
			</p>
		</g:each>
	</div>
</div>