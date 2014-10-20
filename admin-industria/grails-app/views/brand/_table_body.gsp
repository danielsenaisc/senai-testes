<!DOCTYPE html>

<div class="portlet-title">		
	<div class="actions">
		<a href="${createLink(controller:'brand',action:'create',params:[id:0])}" class="btn btn-default red btn-sm">
			<i class="fa fa-pencil">
				</i> <g:message code="brand.form.action.new"/> 
		</a>
		<div class="btn-group">
			<a class="btn btn-default grey-default btn-sm" href="#" data-toggle="dropdown">
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

	<table class="table table-striped table-hover" id="brand_table">
		<thead>
		<tr>
			<th style="width:100px">
			</th>
			<th style="width:360px">
				 <g:message code="brand.table.column.name"/>
			</th>
			<th style="width:50px">
				 <g:message code="brand.table.column.collections"/>
			</th>
			<th>
				 <g:message code="brand.table.column.garments"/>
			</th>
			<th style="width:100px">
				 <g:message code="brand.table.column.status"/>
			</th>

			<th class="table-checkbox">
				<input type="checkbox" class="group-checkable" data-set="brand_table .checkboxes"/>
			</th>

		</tr>
		</thead>
		
		<tbody>
		<g:each var="brand" in="${brandList}" status="i">
			<tr class="odd gradeX">
				<td>
					<i class="glyphicon glyphicon-picture" style="font-size:20px;" class="t-column"></i>
				</td>
				<td>
					<a href="${createLink(controller:'brand',action:'edit',params:[id:i])}" class="t-column">
					 ${brand.nome}
					</a>
				</td>
				<td>
					<a href="${createLink(controller:'brand',action:'edit',params:[id:i])}" class="t-column">
					 ${brand.descricao}</a>
				</td>
				<td><a href="${createLink(controller:'brand',action:'edit',params:[id:i])}" class="t-column">
					 ${brand.genero} </a>
				</td>
				<td><a href="${createLink(controller:'brand',action:'edit',params:[id:i])}" class="t-column">
					 ${brand.status} </a>
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
		
		BrandsTableManaged.init('marca', 'brand_table');

	});
</script>