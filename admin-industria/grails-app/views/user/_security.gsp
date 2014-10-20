<!DOCTYPE html>

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="security.form.edit.title"/>
			
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="Como realizar esse cadastro!" data-original-title="Mais informações" 
			data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
				
		</div>
	</div>

	<div class="portlet-body">

		<table class="table table-striped table-hover" id="permission_table">
			<thead>
			<tr>
				<th style="width:300px">
				</th>
				<th >
					 <g:message code="security.table.column.view"/>
				</th>
				<th >
					 <g:message code="security.table.column.edit"/>
				</th>
				<th>
					 <g:message code="security.table.column.add"/>
				</th>
				<th >
					 <g:message code="security.table.column.delete"/>
				</th>

				<th class="table-checkbox">
					 <g:message code="security.table.column.full"/>
				</th>

			</tr>
			</thead>
			<tbody>
			<g:each var="permission" in="${permissionList}" status="i">
				<tr class="odd gradeX">
					<td>
						 ${permission}
					</td>
					<td>
						<input type="checkbox" value="1">
					</td> 
					<td>
						<input type="checkbox" value="1">
					</td>
					<td>
						<input type="checkbox" value="1">
					</td>
					<td>
						<input type="checkbox" value="1">
					</td>
					<td>
						<input type="checkbox" class="checkboxes" value="1">
					</td>
				</tr>
			</g:each>	
			

			</tbody>
		</table>	
	</div>
</div>

<script>
	jQuery(document).ready(function() {   
		
		PermissionTableManaged.init('permissão', 'permission_table');

	});
</script>