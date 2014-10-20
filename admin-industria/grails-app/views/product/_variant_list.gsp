<!DOCTYPE html>


<!-- NEW COLOR MODAL -->
<g:render template="/product/new_color"/>

<g:render template="/product/copy_variants"/>

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="product.form.edit.colors.title"/>
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="<g:message code="popovers.title"/>" data-original-title="<g:message code="popovers.info"/>" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
		</div>
		<div class="actions">
			<a class="btn btn-default btn-sm" data-toggle="modal" href="#copy_variants">
				<i class="fa fa-copy"></i> <g:message code="product.form.edit.colors.copy"/> 
			</a>
			<a href="#new_color" class="btn btn-default btn-sm" data-toggle="modal">
				<i class="glyphicon glyphicon-plus"></i> <g:message code="product.form.edit.colors.new"/> 
			</a>
		</div>
	</div>

	<div class="portlet-body form">

		<div class="form-body">

			<!-- variant item 1-->
			<div class="form-group variant-group" style="padding-top:15px">

				<div class="col-md-5" style="margin-left:15px">
					<g:render template="/product/variant-table" />
				</div>
				<div class="col-md-6">
				  	<div >
				        <div class="caption">
				            <label class="control-label"><g:message code="product.form.edit.colors.new.img.video"/></label>
				            <p>
				            	<g:message code="product.form.edit.colors.new.add.img"/> 
				            </p>
				        </div>
					</div>
					<div id="whatever" class="scroll-div">
						<div class="item" style="text-align:center">
							<i id="plus-file1" class="icon-plus " style="font-size:30px;line-height:110px"></i> 
							<input id="input1" class="hiddenfile" type="file" name="newfile" tabindex="-1">
						</div>
						<g:each var="attach" in="${attachmentList}" status="i">
							<g:render template="/product/color_attach_item" model='["attach": "${attach}"]'/>
	   					</g:each>

					</div>						

					<!-- video -->
					<br/>
					<label class="control-label col-md-1" style="padding-left:0px;text-align: left;"><g:message code="product.form.edit.colors.video.link"/></label>
					<div class="input-icon right col-md-7">
						<i class="fa tooltips" data-container="body" data-original-title="" title=""></i>
						<input type="text" class="form-control " style="width:90%" placeHolder="Informe o link do vídeo...">
					</div>
				</div>
				<div class="col-md-12 button-line-with-border" >
				
					<a href="${createLink(controller:'product', action:'edit')}" style="float:right;margin-right:15px" class="btn blue">Editar</a>
				</div>
			</div>

			<!-- variant item 2-->

			<div id="variant2" class="form-group variant-group" style="padding-top:15px;">
				<div class="col-md-5" style="margin-left:15px">
					<g:render template="/product/variant-table" />
				</div>
				<div class="col-md-6">
				  	<div >
				        <div class="caption">
				            <label class="control-label"><g:message code="product.form.edit.colors.new.img.video"/></label>
				            <p>
				            	<g:message code="product.form.edit.colors.new.add.img"/> 
				            </p>
				        </div>
					</div>
					<div id="whatever2" class="scroll-div">
						<div class="item" style="text-align:center">
							<i id="plus-file2" class="icon-plus " style="font-size:30px;line-height:110px"></i> 
							<input id="input2" class="hiddenfile" type="file" name="newfile" tabindex="-1">

						</div>

					</div>						

					<!-- video -->
					<br/>
					<label class="control-label col-md-1" style="padding-left:0px;text-align: left;"><g:message code="product.form.edit.colors.video.link"/></label>
					<div class="input-icon right col-md-7">
						<i class="fa tooltips" data-container="body" data-original-title="" title=""></i>
						<input type="text" class="form-control " style="width:90%" placeHolder="Informe o link do vídeo...">
					</div>
				</div>
				<div class="col-md-12 button-line-with-border" style="">
					<button type="button" class="btn default remove-btn" style="margin-left:15px" data-dismiss="modal">Excluir</button>
					<a href="${createLink(controller:'product', action:'edit')}" style="float:right;margin-right:15px" class="btn blue">Salvar</a>
				</div>
			</div>

		</div>	
	</div>
</div>
<script>
	jQuery(document).ready(function() {   
		ComponentsPickers.init();
		$('#whatever').hoverGrid();
		$('#whatever2').hoverGrid();

		$('#plus-file1').click(function(){
			$("#input1").trigger("click");
		});

		$('#plus-file2').click(function(){
			$("#input2").trigger("click");
		});
		
		$('.remove-btn').click(function(){
			$("#variant2").fadeOut();
		});

		$("#input1").change(function(){
			var name = $(this).val();
			if(!isPicture(name)){
				alert("Por favor, escolha uma image nos formatos PNG, JPG, JPEG e TIFF!")
				$(this).attr("value","");
				return false;
			}else{
				appendImage()
			}
		});

		$("#input2").change(function(){
			var name = $(this).val();
			if(!isPicture(name)){
				alert("Por favor, escolha uma image nos formatos PNG, JPG, JPEG e TIFF!")
				$(this).attr("value","");
				return false;
			}else{
				appendImage2()
			}
		});


		$('#whatever .attach-item').live( "click", function() {
			$('#whatever .destaque').removeClass("destaque");
			$(this).parent("div").parent().addClass("destaque");
		});


		$('#whatever2 .attach-item').live( "click", function() {
			$('#whatever2 .destaque').removeClass("destaque");
			$(this).parent("div").parent().addClass("destaque");
		});

		$(".attach-item-remove").live("click",function(){
			$(this).parent().parent().fadeOut(300).remove();
		});

		//apenas para definir o destaque padrão
		//$('#whatever .caption:first').addClass("destaque").css("display","block");
		
	});

	function appendImage(){
		
		var newItem ="<div  class='item hover-grid-item'><img id='new-img1' style='width:110px; height:110px' src='' /><div class='caption' style='display:none;'><a class='attach-item' href='javascript:'><span style='color:white'>Destaque</span></a><br/><br/><a class='attach-item-remove' href='javascript:'><span style='color:white'>Remover</span></a></div></div>"

		$("#whatever").append(newItem);
		readURL($("#input1"))
		$('#whatever').hoverGrid();
	}

	function appendImage2(){
		var newItem ="<div  class='item hover-grid-item'><img id='new-img2' style='width:110px; height:110px' src='' /><div class='caption' style='display:none;'><a class='attach-item' href='javascript:'><span style='color:white'>Destaque</span></a><br/><br/><a class='attach-item-remove' href='javascript:'><span style='color:white'>Remover</span></a></div></div>"
		$("#whatever2").append(newItem);
		readURL($("#input2"))
		$('#whatever2').hoverGrid();
	}

	function isPicture(name){
		name = name.toLowerCase()
		return doesStringEndWith(name,".png") || doesStringEndWith(name,".jpg") || doesStringEndWith(name,".jpeg") || doesStringEndWith(name,".tiff") ;
	}
	function doesStringEndWith(myString, stringCheck){
	    var foundIt = (myString.lastIndexOf(stringCheck) === myString.length - stringCheck.length) > 0;
	    return foundIt;
	}

	function readURL(inputJ) {
		var input = inputJ.get(0)
        if (input.files && input.files[0]) {
            var reader = new FileReader();
            reader.onload = function (e) {
            	var id = "#new-img" 
            	if(input.id == "input1")
            		id = id + "1"
            	else
            		id = id + "2"
                $(id).attr('src', e.target.result);
                $(id).removeAttr("id")
            }
            reader.readAsDataURL(input.files[0]);
        }
    }


</script>