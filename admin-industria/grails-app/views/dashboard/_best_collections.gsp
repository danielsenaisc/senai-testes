<!DOCTYPE html>
<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<i class="icon-heart"></i><g:message code="dashboard.form.bestcollections"/>
		</div>
		
	</div>
	<div class="portlet-body">


		<table class="table table-hover table-dashboard-head">
			<tr>
				<th style="width:100px;">
					 &nbsp;&nbsp;&nbsp;P
				</th>
				<th style="width:156px;">
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
		</table>	

		<div class="table-scrollable table-dashboard-body" style="height:356px;">
			<table class="table table-striped table-hover">
			<thead>
			
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
							<a href="${createLink(controller:'collection',action:'index',params:[id:i])}">
								<i class="fa fa-edit"></i>
							</a>
						</td>
						
					</tr>
				</g:each>
			</tbody>
			</table>
		</div>
	</div>
</div>