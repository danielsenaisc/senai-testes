<!DOCTYPE html>
<div class="portlet-body">
	<table class="table table-striped table-bordered table-hover" id="product_table">
		<thead>
		<tr>
			
			<th>
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
				 <g:message code="product.table.column.brand"/>
			</th>
			<th>
				 <g:message code="product.table.column.variables"/>
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
					<a href="/product/${i}/edit">
					 ${product}
					</a>
				</td>
				<td>
					 ${product}
				</td>
				<td>
					 ${product} 
				</td>
				<td>
					 ${product} 
				</td>
				<td>
					 ${product} 
				</td>
				<td>
					 ${product} 
				</td>
				<td>
					 ${product} 
				</td>
				<td>
					<input type="checkbox" class="checkboxes" value="1"/>
				</td>
			</tr>
		</g:each>	
		

		</tbody>
	</table>	

</div>