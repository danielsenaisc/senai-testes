<!DOCTYPE html>

<!-- COPY PRODUCT MODAL -->
<g:render template="/product/copy_product"/>

<div class="portlet-title">
		
	<div class="actions">
		<a href="${createLink(controller:'product',action:'create',params:[id:0])}" class="btn btn-default red btn-sm">
			<i class="fa fa-pencil">
				</i> <g:message code="brand.form.action.new"/> 
		</a>

		<a href="${createLink(controller:'import',action:'index',params:[id:0])}" class="btn btn-default red btn-sm">
			<i class="glyphicon glyphicon-import">
				</i> <g:message code="product.form.action.import"/> 
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

	<table class="table table-striped table-hover" id="product_table">
		<thead>
		<tr>
			<th>
			</th>
			<th style="width:200px">
				 <g:message code="product.table.column.name"/>
			</th>
			<th>
				 <g:message code="product.table.column.category"/>
			</th>
			<th>
				 <g:message code="product.table.column.gender"/>
			</th>
			<th>
				 <g:message code="product.table.column.collection"/>
			</th>
			<th>
				 <g:message code="product.table.column.variants"/>
			</th>
			<th>
				 <g:message code="product.table.column.status"/>
			</th>

			<th class="table-checkbox">
				<input type="checkbox" class="group-checkable" data-set="product_table .checkboxes"/>
			</th>

		</tr>
		</thead>
		<tbody>
		<g:each var="product" in="${productList}" status="i">
			<tr class="odd gradeX">
				<td>
					<i class="glyphicon glyphicon-picture" style="font-size:20px;" class="t-column"></i>
				</td>
				<td>
					<a href="${createLink(controller:'product',action:'edit',params:[id:i])}" class="t-column">
					 ${product}
					</a>
				</td>
				<td>
					<a href="${createLink(controller:'product',action:'edit',params:[id:i])}" class="t-column">
					 ${product}</a>
				</td>
				<td><a href="${createLink(controller:'product',action:'edit',params:[id:i])}" class="t-column">
					 ${product} </a>
				</td>
				<td><a href="${createLink(controller:'product',action:'edit',params:[id:i])}" class="t-column">
					 ${product} </a>
				</td>
				<td><a href="${createLink(controller:'product',action:'edit',params:[id:i])}" class="t-column">
					 ${product} </a>
				</td>
				<td><a href="${createLink(controller:'product',action:'edit',params:[id:i])}" class="t-column">
					 ${product} </a>
				</td>
				
				<td>
					<input type="checkbox" class="checkboxes" value="1"/>
					<p>
						<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
							data-content="LOREN IPSUM LOREN IPSUM" data-original-title="" data-placement="left">
						<i class="fa fa-warning tooltips yellow"></i>
						</a>
					</p>
					<a data-toggle="modal" href="#copy-product">
						<i class="fa fa-copy"></i>
					</a>
				</td>
			</tr>
		</g:each>	
		

		</tbody>
	</table>	


</div>
<script>
	jQuery(document).ready(function() {   
		
		ProductsTableManaged.init('produto', 'product_table');

	});
</script>