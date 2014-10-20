<!DOCTYPE html>

<div class="portlet-title">
		
	<div class="actions">
		<a href="${createLink(controller:'report',action:'edit',params:[id:0])}" class="btn btn-default red btn-sm">
			<i class="fa fa-pencil">
				</i> <g:message code="report.form.action.new"/> 
		</a>
		
	</div>
</div>

<div class="portlet-body">

	<table class="table table-striped table-hover" id="brand_table">
		<thead>
		<tr>
			
			<th style="width:360px">
				 <g:message code="report.table.column.name"/>
			</th>
			<th>
				 <g:message code="report.table.column.period"/>
			</th>
			<th>
				 <g:message code="report.table.column.type"/>
			</th>
			<th style="width:100px">
				 <g:message code="report.table.column.created-by"/>
			</th>
			
		</tr>
		</thead>
		<tbody>
		<g:each var="report" in="${reportList}" status="i">
			<tr class="odd gradeX">
				
				<td>
					<a href="${createLink(controller:'report',action:'view',params:[id:i])}" class="t-column">
					 ${report}
					</a>
				</td>
				<td>
					<a href="${createLink(controller:'report',action:'view',params:[id:i])}" class="t-column">
					 ${report}</a>
				</td>
				<td><a href="${createLink(controller:'report',action:'view',params:[id:i])}" class="t-column">
					 ${report} </a>
				</td>
				<td><a href="${createLink(controller:'report',action:'view',params:[id:i])}" class="t-column">
					 ${report} </a>
				</td>
				
			</tr>
		</g:each>	
		

		</tbody>
	</table>	


</div>
<script>
	jQuery(document).ready(function() {   
		
		ReportTableManaged.init('relatório', 'report_table');

	});
</script>