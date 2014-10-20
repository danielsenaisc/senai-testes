<!DOCTYPE html>

<div class="dropdown-toggle" data-toggle="" data-hover="" data-close-others="true">
	<div class="col-md-12">
		<img alt="" class="img-circle" src="${resource(dir:'images', file: 'avatar.jpg')}"/>
		<span class="username">Janderson Araújo </span>
	</div>
	<div class="col-md-12">
		<div class="col-md-5">
			<a href="${createLink(controller: 'profile', action: 'edit')}" class="btn yellow-gold btn-xs">
				Editar
			</a>
		</div>
		<div class="col-md-4">
			<a href="${createLink(controller: 'login', action: 'index')}" class="btn blue-madison btn-xs">
				Sair
			</a>
		</div>
	</div>
</div>