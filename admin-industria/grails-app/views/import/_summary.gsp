<!DOCTYPE html>
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="import.form.edit.summary"/>
		</div>
		
	</div>
	<div class="portlet-body" style="height:200px">
		<g:each var="summary" in="${summaryList}" status="index">
			<p class="note-warning">
				 ${index} - Lorem ipsum Lorem ipsum
			</p>
		</g:each>
	</div>
</div>