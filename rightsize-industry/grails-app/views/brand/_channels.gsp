<!DOCTYPE html>
<!-- AUDIENCE -->
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="brand.form.edit.channels"/>
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="Como realizar esse cadastro!" data-original-title="Mais informações" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
		</div>
		<div class="actions">
			<button id="channels_table_new" class="btn btn-default btn-sm">
				<i class="glyphicon glyphicon-plus"></i><g:message code="brand.form.action.new"/>
			</button>
			
		</div>
	</div>

	<div class="portlet-body form">
		
		<div class="portlet-body">

			<table class="table table-striped table-hover" id="channels_table">
				<thead>
				<tr>
					
					<th>
						 <g:message code="brand.table.column.channel.type"/>
					</th>
					<th>
						 <g:message code="brand.table.column.channel.url"/>
					</th>
					<th>
						 <g:message code="brand.table.column.channel.location"/>
					</th>
					<th>
						 <g:message code="brand.table.column.channel.description"/>
					</th>

					<th >
						
					</th>

				</tr>
				</thead>
				<tbody>
				<g:each var="channel" in="${channelList}" status="i">
					<tr class="odd gradeX">
						
						<td>
								<select class="form-control input-sm">
									<option><g:message code="brand.form.edit.facebook"/></option>
									<option><g:message code="brand.form.edit.sac"/></option>
									<option><g:message code="brand.form.edit.site"/></option>
								</select>
						</td>
						<td>
							<input type="text" class="form-control input-medium" style="margin-left:40px;">
						</td>
						<td>
								<select class="form-control input-sm">
									<option><g:message code="brand.form.edit.all"/></option>
									<option><g:message code="brand.form.edit.brazil"/></option>
									<option><g:message code="brand.form.edit.eua"/></option>
								</select>
						</td>
						<td>
							<input type="text" class="form-control input-medium" style="margin-left:40px;">
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
</div>

<script>
	jQuery(document).ready(function() {   
		
		EditableTableManaged.init('canais', 'channels_table');

	});
</script>