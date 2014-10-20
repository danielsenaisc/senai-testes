<!DOCTYPE html>
<!--TEAM -->
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="collection.form.edit.team"/>
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="Como realizar esse cadastro!" data-original-title="Mais informações" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
		</div>
		<div class="actions">
			<a class="btn btn-default btn-small" data-toggle="modal" href="#list_user">
				<i class="glyphicon glyphicon-plus"></i> <g:message code="collection.form.edit.attachments.new"/> 
			</a>
		</div>


	</div>

	<!-- LIST USER MODAL -->
	<g:render template="/collection/list_user"/>

	<!-- NEW USER MODAL -->
	<g:render template="/collection/new_user"/>

	<div class="portlet-body">

		<table class="table table-striped table-hover" id="users_table">
			<thead>
			<tr>

				<th>
				</th>

				<th><g:message code="collection.table.column.name"/>
				</th>

				<th><g:message code="collection.table.column.userjob"/>
				</th>

				<th>
				</th>


			</tr>
			</thead>
			<tbody>
			<g:each var="user" in="${userList}" status="i">
				<tr class="odd gradeX">
					
					<td>
							<i class="glyphicon glyphicon-user" style="font-size:20px;"></i>
					</td>
					<td>	
							${user}
					</td>

					<td>	
							${user}
					</td>
					
					<td>	
						<a class="delete" href="javascript:;">
							<i class="glyphicon glyphicon-remove"><span></span></i> 
						</a>
					</td>
				</tr>	
			</g:each>	
			

			</tbody>
		</table>	
	</div>
</div>

<script>
	jQuery(document).ready(function() {   
		
		CollectionTeamTableManaged.init('integrante', 'users_table');

	});
</script>


