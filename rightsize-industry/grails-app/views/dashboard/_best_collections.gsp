<!DOCTYPE html>
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<i class="icon-heart"></i><g:message code="dashboard.form.bestcollections"/>
		</div>
		
	</div>
	<div class="portlet-body">
		<div class="table-scrollable" style="height: 380px;" >
			<table class="table table-striped table-hover">
			<thead>
			<tr>
				<th>
					 P
				</th>
				<th>
					<g:message code="dashboard.form.bestcollections.product"/>
				</th>
				<th>
					<g:message code="dashboard.form.bestcollections.likes"/>
				</th>
				<th>
					<g:message code="dashboard.form.bestcollections.dislikes"/>
				</th>
				<th>
				</th>	
			</tr>
			</thead>
			<tbody>
				<g:each var="collection" in="${bestCollectionsList}" status="i">
					<tr>
						<td>
							${i}
						</td>
						<td>
							 ${collection}
						</td>
						
						<td>
							 Likes 
						</td>
						<td>
							 Dislikes
						</td>
						<td>
							<a href="/collection/edit"><i class="fa fa-edit"></i></a>
						</td>
						
					</tr>
				</g:each>
			</tbody>
			</table>
		</div>
	</div>
</div>