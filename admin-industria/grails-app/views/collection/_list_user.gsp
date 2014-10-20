<!DOCTYPE html>

<!-- COPY USERS MODAL -->
<div class="modal fade" id="list_user" role="list_user" aria-hidden="true">
	<div class="modal-dialog" id="list_user_dialog">
		<div class="modal-content" id="list_user_content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
				<h4 class="modal-title"><g:message code="collection.form.edit.modal.title"/></h4>
			</div>

			<div class="portlet-body">

				<table class="table table-striped table-hover" id="list_users_table">
					<thead >
					<tr>

						<th>
						</th>

						<th >	
							<g:message code="collection.table.column.name"/>
						</th>

						<th>
							<g:message code="collection.table.column.userjob"/>
						</th>
						
						<th class="table-checkbox">
							<!--<input type="checkbox" class="group-checkable" data-set="new_users_table .checkboxes"/>-->
						</th>
						

					</tr>
					</thead>
					<tbody>

					<g:each var="user" in="${userList}" status="i">
						<tr class="odd gradeX">
							
							<td class="t-column">
								<i class="glyphicon glyphicon-user" style="font-size:20px;"></i>
							</td>

							<td class="t-column">
								${user}
							</td>

							<td class="t-column">	
								${user}
							</td>

							<td><input type="checkbox" class="checkboxes user-list-checkbox" value="1"/>
							</td>
							
							
						</tr>	
					</g:each>	
					</tbody>
				</table>	

			</div>

			<div class="modal-footer" style="margin-right:40px;">
				<a class="btn red btn-small" data-toggle="modal" href="#new_user">
					<i class="glyphicon glyphicon-plus"></i> 
					<g:message code="collection.form.edit.modal.new"/> 
				</a>
				<button type="button" class="btn blue-madison add-lines" data-dismiss="modal">
					<g:message code="collection.form.edit.modal.add"/>
				</button>
			</div>

		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>


<script>
	jQuery(document).ready(function() {   
		ModalTableManaged.init('usuario', 'list_users_table');
		
		$('.add-lines').click(function(){
			addLines();
       	});
	});

	function addLines(){
		var removeButtonTd = "<td><a class='delete' href='javascript:void(0)'><i class='glyphicon glyphicon-remove'><span></span></i></a></td>";
		var usersTable = $("#users_table").DataTable()

		$("#list_users_table").find(".user-list-checkbox:checked").each(function(){
 		 	var tr = $(this).parents('tr').clone();
 		 	tr.find("td:last-child").remove();
 		 	var tds = tr.children()
 		 	usersTable.row.add([tds[0].outerHTML,tds[1].outerHTML, tds[2].outerHTML, removeButtonTd])
	 	});
	 	usersTable.draw()
	}
</script>