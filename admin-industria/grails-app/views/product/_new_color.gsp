<!DOCTYPE html>

<!-- NEW COLOR MODAL -->
<div class="modal fade" id="new_color" role="new_color" aria-hidden="true">
	<div class="modal-dialog" id="new_color_dialog">
		<div class="modal-content" id="new_color_content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
				<h4 class="modal-title"><g:message code="product.modal.new.color.title"/></h4>

			</div>

			<div class="modal-body" >


					<div class="form-group  ">
						<div class="col-md-11" style="padding-bottom:19px">
							<span style="font-size: 14px;font-family: sans-serif;font-style: italic;\ ">
								<g:message code="product.form.edit.modal.color.create-info"/>
							</span>
						</div>

						<div class="col-md-4">
							<label class=" col-md-12 color-title"><g:message code="product.form.edit.modal.color1"/></label>
							<g:render template="/product/color_table" model="[tableId: 'color-selector-1']" />
						</div>
						<div class="col-md-4">
							<label class=" col-md-12 color-title"><g:message code="product.form.edit.modal.color2"/></label>
							<g:render template="/product/color_table" model="[tableId: 'color-selector-2']" />
						</div>
						
						<div class="col-md-4">
							<div id="color-holder1" class="color-variant-square" style="background:#38a872;">
								Cor 1
							</div>
							<div id="color-holder2" class="color-variant-square" style="background:#FFFFFF;">
								<span class="colo2-name" style="display:none">Cor 2</span>
								<a class="remove-color" style="display:none" href="javascript:void(0);" ><i class="glyphicon glyphicon-remove i-right" ><span></span></i></a>
							</div>
						</div>

						<div class="col-md-12" style="margin-top:30px; padding-bottom:10px">

							<label class="control-label col-md-2"><g:message code="product.form.edit.modal.label.code"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<i class="fa tooltips" data-container="body"></i>
									<input type="text" class="form-control input-sm">
								</div>
							</div>

							<label class="control-label col-md-3"><g:message code="product.form.edit.modal.nickname"/></label>
							<div class="col-md-3">
								<div class="input-icon right">
									<i class="fa tooltips" data-container="body"></i>
									<input id="color-name" type="text" class="form-control input-sm">
								</div>
							</div>

						</div>

					</div>

					
				<div class="modal-footer">
					<button type="button" class="btn default" data-dismiss="modal">Cancelar</button>
					<a href="${createLink(controller:'product', action:'edit')}" class="btn blue">Salvar</a>
				</div>
			</div>

				
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<script>
	jQuery(document).ready(function() {   
		$("#color-selector-1 tr td div.color-square").click(function(){
			var color = $(this).css("background");
			var color_name = $(this).find("input").val();

			$("#color-holder1").css("background",color);
			$("#color-name").val(color_name);
		});

		$("#color-selector-2 tr td div.color-square").click(function(){
			var color = $(this).css("background");
			var color_name = $(this).find("input").val();

			$("#color-holder2").css("background",color);

			var middle = ""
			if(color_name != ""){
				middle = " & "
			}
				
			if($("#color-name").val().indexOf("&") == -1){
				$("#color-name").val($("#color-name").val() + middle + color_name);
			}else{
				var old_name  = $("#color-name").val();
				var base_name = old_name.substring(0, (old_name.indexOf("&") - 1));
				$("#color-name").val(base_name +  middle + color_name);
			}
			
			$(".colo2-name").show();
			$(".remove-color").show();
		});

		$(".remove-color").click(function(){
			var el = $(this)
			el.hide();
			el.parent().css("background","none");
			el.siblings().hide();

			var color_name = $("#color-name").val();
			
			if(color_name.indexOf("&") != -1){
				$("#color-name").val(color_name.substring(0, color_name.indexOf("&")));
			}		
		});
	});
</script>