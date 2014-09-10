<!DOCTYPE html>

	<div class="col-md-6 col-sm-6">

		<!--****** BRANDS ******-->
		<div class="dashboard-stat blue-madison" style="height:220px">
			<a class="more" href="${createLink(controller: 'brand', action: 'index')}">
				<g:message code="dashboard.form.brands"/> <i class="m-icon-swapright m-icon-white"></i>
			</a>
			<div class="visual">
				<i class="fa fa-th-large"></i>
			</div>
			<div class="details">
				<div class="number">
					 ${brandCount}
				</div>
				<div class="desc">
					 <g:message code="dashboard.form.brands"/>
				</div>
			</div>
			
		</div>
		<!--****** COLLECTIONS ******-->
		<div class="dashboard-stat green-meadow" style="height:220px">
			<a class="more" href="#">
				<g:message code="dashboard.form.collections"/> <i class="m-icon-swapright m-icon-white"></i>
			</a>
			<div class="visual">
				<i class="fa fa-th-large"></i>
			</div>
			<div class="details">
				<div class="number">
					  ${activeCollectionCount} 
				</div>
				<div class="desc">
					<g:message code="dashboard.form.collections.active"/>
				</div>
				<div class="number">
					 ${inactiveCollectionCount}  
				</div>
				<div class="desc">
					<g:message code="dashboard.form.collections.inactive"/>
				</div>
			</div>
			
		</div>
	</div>


	<div class="col-md-6 col-sm-6">
		<!--****** PRODUCTS ******-->
		<div class="dashboard-stat yellow-gold" style="height:220px">
			<a class="more" href="#">
				<g:message code="dashboard.form.products"/> <i class="m-icon-swapright m-icon-white"></i>
			</a>
			<div class="visual">
				<i class="fa fa-th-large"></i>
			</div>
			<div class="details">
				<div class="number">
					 ${activeProductCount} 
				</div>
				<div class="desc">
					<g:message code="dashboard.form.products.active"/>
				</div>
				<div class="number">
					  ${inactiveProductCount}
				</div>
				<div class="desc">
					<g:message code="dashboard.form.products.inactive"/>
				</div>
			</div>
			
		</div>

		<!--****** MODELS ******-->
		<div class="dashboard-stat red-intense" style="height:220px">
			<a class="more" href="#">
				<g:message code="dashboard.form.models"/> <i class="m-icon-swapright m-icon-white"></i>
			</a>
			<div class="visual">
				<i class="fa fa-th-large"></i>
			</div>
			<div class="details">
				<div class="number">
					  ${activeModelCount}
				</div>
				<div class="desc">
					<g:message code="dashboard.form.models.active"/>
				</div>
				<div class="number">
					  ${inactiveModelCount}
				</div>
				<div class="desc">
					<g:message code="dashboard.form.models.inactive"/>
				</div>
			</div>
			
		</div>

	</div>
