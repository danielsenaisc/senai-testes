<!DOCTYPE html>
<r:require module="application" />

<!-- BEGIN SIDEBAR -->
<div class="page-sidebar-wrapper">
	<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
	<!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
	<div class="page-sidebar navbar-collapse collapse fixed-menu">
		<!-- BEGIN SIDEBAR MENU -->
		<ul class="page-sidebar-menu" data-auto-scroll="true" data-slide-speed="200">


			<li class="sidebar-search-wrapper" style="height:72px;">
				<a href="${createLink(controller: 'dashboard', action: 'index')}">
					<img src="${resource(dir:'images', file: 'logo_temporaria.png')}" alt="logo" class="logo-default" style="width:120px;heigth:54px"/>
					
				</a>
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
				<a href="${createLink(controller: 'modeling', action: 'index')}">
				<i class="glyphicon glyphicon-tags"></i>
				<span class="title"><g:message code="dashboard.menu.models"/></span>
				</a>
				
			</li>
			<li id="menu_collections">
				<a href="${createLink(controller: 'collection', action: 'index')}">
				<i class="glyphicon glyphicon-briefcase"></i>
				<span class="title"><g:message code="dashboard.menu.collections"/></span>
				</a>
				
			</li>
			<li id="menu_products">
				<a href="${createLink(controller: 'product', action: 'index')}">
				<i class="icon-basket"></i>
				<span class="title"><g:message code="dashboard.menu.products"/></span>
				</a>
				
			</li>
			<li id="menu_team">
				<a href="${createLink(controller: 'team', action: 'index')}">
				<i class="icon-users"></i>
				<span class="title"><g:message code="dashboard.menu.team"/></span>
				</a>
				
			</li>
			<li id="menu_reports">
				<a href="${createLink(controller: 'report', action: 'index')}">
				<i class="icon-docs"></i>
				<span class="title"><g:message code="dashboard.menu.reports"/></span>
				</a>
				
			</li>
			<!--<li id="menu_industry" class="start active open">-->
			<li id="menu_industry" class="">
				<a href="javascript:;" id="id_industry">
				<i class="fa fa-building-o" style="font-size:17px"></i>
				<span class="title"><g:message code="dashboard.menu.industry"/></span>
				<span class="selected"></span>
				<span class="arrow"></span>
				</a>
				<ul class="sub-menu" id="id_submenu">
					<li id="menu_information">
						<a href="${createLink(controller: 'industry', action: 'edit')}" class="submenu-active">
						<span class="title"><g:message code="dashboard.menu.industry.information"/></a></span>
					</li>
					<li id="menu_users">
						<a href="${createLink(controller: 'user', action: 'index')}">
						<span class="title"><g:message code="dashboard.menu.industry.users"/></a></span>
					</li>
					<li  id="menu_configuration">
						<a href="${createLink(controller: 'configuration', action: 'index')}">
						<span class="title"><g:message code="dashboard.menu.industry.config"/></a></span>
					</li>
				</ul>
			</li>
			<li class="clear-space">
				<ia style="font-size:100px"></i>
			</li>		
			<!--
			<li id="menu_profile">
				<g:render template="/layouts/profile"/>
			</li>-->	
		</ul>
		<g:render template="/layouts/profile"/>
		
		<!-- END SIDEBAR MENU -->
	</div>
	
</div>

<script>
	jQuery(document).ready(function() {   
		
        Metronic.init();
        Layout.init(); 

	});

		
</script>



