<!DOCTYPE html>
<!-- AUDIENCE -->
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="collection.form.edit.attachments"/>
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="Como realizar esse cadastro!" data-original-title="Mais informações" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
		</div>
		<div class="actions">
			<a class="btn btn-default btn-small" data-toggle="modal" href="#new_attachment">
				<i class="glyphicon glyphicon-plus"></i> <g:message code="collection.form.edit.attachments.new"/> 
			</a>
			
		</div>
	</div>

	<!-- NEW ATTACHMENT MODAL -->
	<g:render template="/collection/new_attachment"/>

	<div class="portlet-body form">
		
		<div class="portlet-body">

			<table class="table table-striped table-hover" id="attachments_table">
				<thead>
				<tr>
					
					<th>
					</th>

					<th><g:message code="collection.table.column.attachments.title"/>
					</th>

					<th><g:message code="collection.table.column.attachments.description"/>
					</th>

					<th><g:message code="collection.table.column.attachments.category"/>
					</th>

					<th><g:message code="collection.table.column.attachments.type"/>
					</th>
					
					<th >
					</th>

				</tr>
				</thead>
				<tbody>
				<g:each var="attachment" in="${attachmentsList}" status="i">
					<tr class="odd gradeX">
						
						<td>
							<i class="glyphicon glyphicon-picture" style="font-size:20px;"></i>
						</td>
						<td>
							${attachment}
						</td>
						<td>
							${attachment}
						</td>
						<td>
							${attachment}
						</td>
						
						<td>
							${attachment}
						</td>
						
						<td>
							<a  data-toggle="modal" href="#new_attachment">
								<i class="fa fa-edit"></i>
							</a>	
						
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
</div>

<script>
	jQuery(document).ready(function() {   
		
		AttachmentTableManaged.init('anexo', 'attachments_table');

		//FormFileUpload.init();

	});

</script>