<!DOCTYPE html>
<!-- BEGIN SIDEBAR -->
<div class="page-sidebar-wrapper">
	<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
	<!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
	<div class="page-sidebar navbar-collapse collapse">
		<!-- BEGIN SIDEBAR MENU -->
		<ul class="page-sidebar-menu" data-auto-scroll="true" data-slide-speed="200">

			<li class="sidebar-search-wrapper">
				
				<form class="sidebar-search" action="extra_search.html" method="POST">
				</form>
				<!-- END RESPONSIVE QUICK SEARCH FORM -->
			</li>

			<li id="menu_panel">
				<a href="${createLink(controller: 'dashboard', action: 'index')}">
				<i class="icon-bar-chart"></i>
				<span class="title"><g:message code="dashboard.menu.panel"/></span>
				</a>
				
			</li>
			<li id="menu_brands">
				<a href="${createLink(controller: 'brand', action: 'index')}">
				<i class="glyphicon glyphicon-registration-mark"></i>
				<span class="title"><g:message code="dashboard.menu.brands"/></span>
				</a>
				
			</li>
			<li id="menu_models">
				<a href="#">
				<i class="glyphicon glyphicon-tags"></i>
				<span class="title" style="color:#cecece"><g:message code="dashboard.menu.models"/></span>
				</a>
				
			</li>
			<li id="menu_collections">
				<a href="#">
				<i class="glyphicon glyphicon-briefcase"></i>
				<span class="title" style="color:#cecece"><g:message code="dashboard.menu.collections"/></span>
				</a>
				
			</li>
			<li id="menu_products">
				<a href="#">
				<i class="icon-basket"></i>
				<span class="title" style="color:#cecece"><g:message code="dashboard.menu.products"/></span>
				</a>
				
			</li>
			<li id="menu_team">
				<a href="#">
				<i class="icon-users"></i>
				<span class="title" style="color:#cecece"><g:message code="dashboard.menu.team"/></span>
				</a>
				
			</li>
			<li id="menu_reports">
				<a href="#">
				<i class="icon-docs"></i>
				<span class="title" style="color:#cecece"><g:message code="dashboard.menu.reports"/></span>
				</a>
				
			</li>
			<li id="menu_industry">
				<a href="#">
				<i class="fa fa-building-o" style="font-size:17px"></i>
				<span class="title" style="color:#cecece"><g:message code="dashboard.menu.industry"/></span>
				</a>
			</li>
			<li id="clear">
				<ia style="font-size:17px"></i>
			</li>		

			<li id="menu_profile">
				<g:render template="/layouts/profile"/>
			</li>

		</ul>
		<!-- END SIDEBAR MENU -->
	</div>
</div>



