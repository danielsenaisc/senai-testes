<!DOCTYPE html>
<div class="row">
	<div class="col-md-12">
		<!-- BEGIN PAGE TITLE & BREADCRUMB-->
		<h3 class="page-title">
		${section_name} <small>${section_info}</small>
		</h3>
		<ul class="page-breadcrumb breadcrumb">
			<li>
				<i class="fa fa-home"></i>
				<a href="${createLink(controller:'dashboard', action:'index')}">Home</a>
			</li>
			<g:if test="${section_name}">
				<li>
					<i class="fa fa-angle-right"></i>
					<a href="#">${section_name}</a>
				</li>
			</g:if>
			<g:if test="${section_sub}">
				<li>
					<i class="fa fa-angle-right"></i>
					<a href="#">${section_sub}</a>
				</li>
			</g:if>

		</ul>

		<!-- END PAGE TITLE & BREADCRUMB-->
	</div>
</div>