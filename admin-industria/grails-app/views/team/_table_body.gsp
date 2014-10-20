<!DOCTYPE html>

<div class="portlet-title">

	<div class="actions">
		<a href="${createLink(controller:'team',action:'create',params:[id:0])}" class="btn btn-default red btn-sm">
			<i class="fa fa-pencil">
				</i> <g:message code="team.form.action.new"/> 
		</a>
		<div class="btn-group">
			<a class="btn btn-default btn-sm grey-default" href="#" data-toggle="dropdown">
				<i class="fa fa-cogs"></i> <g:message code="team.form.actions"/> <i class="fa fa-angle-down"></i>
			</a>
			<ul class="dropdown-menu pull-right">
				<li>
					<a href="#">
					<i class="fa fa-plus-circle"></i> <g:message code="team.form.actions.enable"/> </a>
				</li>
				<li>
					<a href="#">
					<i class="fa fa-minus-circle"></i> <g:message code="team.form.actions.disable"/> </a>
				</li>
			</ul>
			
		</div>
		
	</div>
</div>

<div class="portlet-body">

	<table class="table table-striped table-hover" id="team_table">
		<thead>
		<tr>
			<th style="width:100px">
			</th>
			<th style="width:320px">
				 <g:message code="team.table.column.name"/>
			</th>
			<th style="width:120px">
				 <g:message code="team.table.column.position"/>
			</th>
			<th>
				 <g:message code="team.table.column.date"/>
			</th>
			<th style="width:100px">
				 <g:message code="team.table.column.status"/>
			</th>

			<th class="table-checkbox">
				<input type="checkbox" class="group-checkable" data-set="team_table .checkboxes"/>
			</th>

		</tr>
		</thead>
		<tbody>
		<g:each var="team" in="${teamList}" status="i">
			<tr class="odd gradeX">
				<td>
					<i class="glyphicon glyphicon-picture" style="font-size:20px;" class="t-column"> </i>
				</td>
				<td>
					<a href="${createLink(controller:'team',action:'edit',params:[id:i])}" class="t-column">
					 ${team}
					</a>
				</td>
				<td>
					<a href="${createLink(controller:'team',action:'edit',params:[id:i])}" class="t-column">
					 ${team}
					</a>
				</td>
				<td><a href="${createLink(controller:'team',action:'edit',params:[id:i])}" class="t-column">
					 ${team} 
				</td></a>
				<td><a href="${createLink(controller:'team',action:'edit',params:[id:i])}" class="t-column">
					 ${team} 
				</td></a>
				
				
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
		
		TeamTableManaged.init('integrante', 'team_table');

	});
</script>