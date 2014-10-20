<!DOCTYPE html>

<div class="portlet-title">

	<div class="actions">
		<a
			href="${createLink(controller:'modeling',action:'create',params:[id:0])}"
			class="btn btn-default red btn-sm"> <i class="fa fa-pencil">
		</i> <g:message code="brand.form.action.new" />
		</a>
		<div class="btn-group">
			<a class="btn btn-default grey-default btn-sm" href="#"
				data-toggle="dropdown"> <i class="fa fa-cogs"></i> <g:message
					code="product.form.actions" /> <i class="fa fa-angle-down"></i>
			</a>
			<ul class="dropdown-menu pull-right">
				<li><a href="#"> <i class="fa fa-plus-circle"></i> <g:message
							code="product.form.actions.enable" />
				</a></li>
				<li><a href="#"> <i class="fa fa-minus-circle"></i> <g:message
							code="product.form.actions.disable" />
				</a></li>
			</ul>

		</div>

	</div>
</div>

<div class="portlet-body">

	<table class="table table-striped table-hover" id="models_table">
		<thead>
			<tr>
				<th width="200px">
					<g:message code="models.table.column.name" />
				</th>
				
				<th width="200px">
					<g:message code="models.table.column.status" />
				</th>
				
				<th>
					<g:message code="models.table.column.gender" />
				</th>
				
				<th>
					<g:message code="models.table.column.description" />
				</th>
				
				<th class="table-checkbox">
					<input type="checkbox" class="group-checkable" data-set="models_table .checkboxes"/>
				</th>
			</tr>
		</thead>
		
		<tbody>
			<g:each var="model" in="${modelList}" status="i">
				<tr class="odd gradeX">				
					<td>
						<a
							href="${createLink(controller:'modeling',action:'edit',params:[id:i])}"
							class="t-column"> ${model.nome}
						</a>
					</td>
					
					<td>
						<a
							href="${createLink(controller:'modeling',action:'edit',params:[id:i])}"
							class="t-column"> ${model.status}
						</a>
					</td>
					
					<td>
						<a
							href="${createLink(controller:'modeling',action:'edit',params:[id:i])}"
							class="t-column"> ${model.genero}
						</a>
					</td>
					
					<td>
						<a
							href="${createLink(controller:'modeling',action:'edit',params:[id:i])}"
							class="t-column"> ${model.descricao}
						</a>
					</td>
					
					<td>
						<input type="checkbox" class="checkboxes" value="1" />
					</td>
				</tr>
			</g:each>
		</tbody>
	</table>


</div>
<script>
	jQuery(document).ready(function() {   
		
		ModelsTableManaged.init('modelagem', 'models_table');

	});
</script>