<!DOCTYPE html>

<!-- COPY VARIANTS MODAL -->
<div class="modal fade" id="copy_attributes" role="copy_attributes" aria-hidden="true">
	<div class="modal-dialog" id="copy_models_dialog">
		<div class="modal-content" id="copy_models_content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
				<h4 class="modal-title"><g:message code="product.form.edit.modal.copy-attributes.title"/></h4>
				<h5 > <g:message code="product.form.edit.modal.copy-attributes.info"/></h5>
			</div>

			<div class="portlet-body ">

				<table class="table table-striped table-hover" id="copy_attributes_table">
					<thead class="copy_models_head">
						<tr>
							<th>
								 <g:message code="product.form.edit.copymodels.code"/>
							</th>
							<th>
								 <g:message code="product.form.edit.copymodels.name"/>
							</th>
							<th>
								 <g:message code="product.form.edit.copymodels.collection"/>
							</th>
							
							<th>
								<g:message code="product.form.edit.copymodels.created_at"/>
							</th>
							
							<th >
							</th>
							
						</tr>
					</thead>
					<tbody>

					<g:each var="product" in="${productList}" status="i">
						<tr class="odd gradeX">
							<td class="t-column">
								 ${product}
							</td>
							<td class="t-column">
								 ${product}
							</td>
							<td class="t-column">
								 ${product} 
							</td>
							
							<td class="t-column">
								 ${product} 
							</td>
							<td>
								<input style="height: 24px;width: 40px; position:absolute; bottom:4px;" type="radio" name="pSelect" id="pSelect${i}" value="option${i}" checked>
							</td>
							
							
						</tr>
					</g:each>	
					</tbody>
				</table>

			</div>

			<div class="modal-footer">
				<button type="button" class="btn default" data-dismiss="modal">
					<g:message code="product.form.edit.copymodels.cancel"/></button>
				<button type="button" class="btn blue add-lines">
					<g:message code="product.form.edit.copymodels.copy"/></button>
			</div>

		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<script>
	jQuery(document).ready(function() {   
		
		CopyAttributesTableManaged.init('atributo', 'copy_attributes_table');


		var copyAttributesTable = $("#copy_variants_table").DataTable();

		$("#copy_attributes_table_wrapper").find("#copy_attributes_table_filter").each(function(){
			$(this).addClass("col-md-12");
 		 		
		});

		$("#copy_attributes_table_wrapper").find("#copy_attributes_table_filter label").each(function(){
			$(this).addClass("col-md-6");
 		 		
		});

		$("#copy_attributes_table_wrapper").find("#copy_attributes_table_filter select").each(function(){
			$(this).addClass("col-md-6");
 		 	
		});

		$("#copy_attributes_table_wrapper").find("#copy_attributes_table_filter").each(function(){
 		 	//$(this).append(select_box);
 		 	
		});

		$('.add-lines').click(function(){
			addLines();
       	});

        copyAttributesTable.draw();

	});


	function addLines(){
		//function to copy models
	}

</script>