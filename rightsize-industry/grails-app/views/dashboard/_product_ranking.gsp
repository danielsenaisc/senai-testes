<!DOCTYPE html>
<div class="portlet box blue-madison" style="margin-left:20px;">
	<div class="portlet-title">
		<div class="caption">
			<i class="icon-trophy"></i><g:message code="dashboard.form.productranking"/>
		</div>
		
	</div>
	<div class="portlet-body" >
		<div class="table-scrollable" style="height: 286px;" >
			<table class="table table-striped table-hover" >
			<thead>
			<tr>
				<th>
					 P
				</th>
				<th>
					<g:message code="dashboard.form.productranking.product"/>
				</th>
				<th>
					<g:message code="dashboard.form.productranking.collection"/>
				</th>
				<th>
					<g:message code="dashboard.form.productranking.compare"/>
				</th>
				<th>
					<g:message code="dashboard.form.productranking.shares"/>
				</th>
				<th>
					<g:message code="dashboard.form.productranking.likes"/>
				</th>
				<th>
				</th>	
			</tr>
			</thead>
			<tbody>
				<g:each var="product" in="${productRankingList}" status="i">
					<tr>

						<td>
							 ${i}
						</td>
						<td>
							 ${product}
						</td>
						<td>
							 ${product}
						</td>
						<td>
							 4.237
						</td>
						<td>
							 8.500
						</td>
						<td>
							 Likes
						</td>
						
						
						<td>
							<a href="${createLink(controller:'product',action:'edit',params:[id:i])}"><i class="fa fa-edit"></i></a>
						</td>

					</tr>
				</g:each>
			</tbody>
			</table>
		</div>
	</div>
</div>