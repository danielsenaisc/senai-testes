<!DOCTYPE html>

			<table class="table table-striped table-hover dataTable variant-table" role="grid" id="grade_table2">
				<thead>
					<tr>
						<th style="padding: 0px; vertical-align:top;" colspan="3">
							<div class="variant-square">
							</div>
							<div class="variant-title">33009 - Vermelho brilhante
								<a href="#new_color" data-toggle="modal"><i class="fa fa-edit"  style="margin-left: 8px;font-size: 16px;line-height: 16px;"></i></a>
							</div>
						</th>
					</tr>
					<tr>
						<th style="padding: 0px; vertical-align:top;">
							<g:message code="product.variant.table.grade"/>
						</th>
						<th style="padding: 0px; vertical-align:top;">
							<g:message code="product.variant.table.internalcode"/>
						</th>
						<th style="padding: 0px; vertical-align:top;">
							EAN
						</th>
						
					</tr>
				</thead>
			<tbody>

				<g:each var="grade" in="${gradeList}" status="i">
					<tr>
						<td>
							333XXX
						</td>
						<td>
							<input type="text" style="width:94%" value="11111111"  />
							</td>
						<td>
							<input type="text" style="width:94%" value="11111111111111"  />
						</td>
					</tr>
				</g:each>
			</tbody>
	</table>