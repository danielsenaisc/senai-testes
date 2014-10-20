<!DOCTYPE html>

<div class="portlet-title">
	
	<div class="actions">
		<a href="${createLink(controller:'collection',action:'create',params:[id:0])}" class="btn btn-default red btn-sm">
			<i class="fa fa-pencil">
				</i> <g:message code="collection.form.action.new"/> 
		</a>
		<div class="btn-group">
			<a class="btn btn-default btn-sm grey-default" href="#" data-toggle="dropdown">
				<i class="fa fa-cogs"></i> <g:message code="product.form.actions"/> <i class="fa fa-angle-down"></i>
			</a>
			<ul class="dropdown-menu pull-right">
				<li>
					<a href="#">
					<i class="fa fa-plus-circle"></i> <g:message code="product.form.actions.enable"/> </a>
				</li>
				<li>
					<a href="#">
					<i class="fa fa-minus-circle"></i> <g:message code="product.form.actions.disable"/> </a>
				</li>
			</ul>
			
		</div>
		
	</div>
</div>

<div class="portlet-body">

	<table class="table table-striped table-hover" id="collection_table">
		<thead>
		<tr>
			
			<th >
				 <g:message code="collection.table.column.name"/>
			</th>
			<th>
				 <g:message code="collection.table.column.gender"/>
			</th>
			<th>
				 <g:message code="collection.table.column.brand"/>
			</th>
			<th style="width:200px">
				 <g:message code="collection.table.column.period"/>
			</th>
			<th style="width:80px">
				 <g:message code="collection.table.column.products"/>
			</th>
			<th style="width:200px">
				 <g:message code="collection.table.column.status"/>
			</th>

			<th class="table-checkbox">
				<input type="checkbox" class="group-checkable" data-set="collection_table .checkboxes"/>
			</th>

		</tr>
		</thead>
		<tbody>
		<g:each var="collection" in="${collectionList}" status="i">
			<tr class="odd gradeX">
				
				<td>
					<a href="${createLink(controller:'collection',action:'edit',params:[id:i])}" class="t-column">
					 ${collection}
					</a>
				</td>
				<td><a href="${createLink(controller:'collection',action:'edit',params:[id:i])}" class="t-column">
					 ${collection}</a>
				</td>
				<td><a href="${createLink(controller:'collection',action:'edit',params:[id:i])}" class="t-column">
					 ${collection} </a>
				</td>
				<td><a href="${createLink(controller:'collection',action:'edit',params:[id:i])}" class="t-column">
					 ${collection} </a>
				</td>
				<td><a href="${createLink(controller:'collection',action:'edit',params:[id:i])}" class="t-column">
					 ${collection} </a>
				</td>
				<td><a href="${createLink(controller:'collection',action:'edit',params:[id:i])}" class="t-column">
					 ${collection} </a>
				</td>
				
				<td>
					<input type="checkbox" class="checkboxes" value="1"/>
				</td>
				
			</tr>
		</g:each>	
		

		</tbody>
	</table>	


</div>
<script>
	jQuery(document).ready(function() {   
		
		CollectionsTableManaged.init('coleção', 'collection_table');

	});
</script>