<!DOCTYPE html>
<!--TEAM -->
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption import-info">
			<g:message code="import.form.edit.table.info" args="${[ '75', '450']}"/>
		</div>

	</div>

	<div class="portlet-body">

		<table class="table table-striped table-hover" id="product_table">
			<thead>
			<tr>

				<th><g:message code="import.table.column.brand"/>
				</th>

				<th><g:message code="import.table.column.collection"/>
				</th>

				<th><g:message code="import.table.column.type"/>
				</th>

				<th><g:message code="import.table.column.product"/>
				</th>

				<th><g:message code="import.table.column.variants"/>
				</th>

				<th><g:message code="import.table.column.modeling"/>
				</th>


			</tr>
			</thead>
			<tbody>
			<g:each var="product" in="${productList}" status="i">
				<tr class="odd gradeX">
					
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

				</tr>	
			</g:each>	
			

			</tbody>
		</table>	
	</div>
</div>


<div>
	<span style="font-size:18px; font-style:italic; letter-spacing: 1px;"><g:message code="import.form.edit.extra-info"/>&nbsp;<a href="#"><g:message code="import.form.edit.click-here"/></a></span>
</div>

<script>
	jQuery(document).ready(function() {   
		
		ImportTableManaged.init('product', 'product_table');

	});
</script>


