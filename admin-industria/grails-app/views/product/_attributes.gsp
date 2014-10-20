<!DOCTYPE html>
<g:render template="/product/copy_attributes"/>

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="product.form.edit.attributes"/>
			
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="Como realizar esse cadastro!" data-original-title="Mais informações" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
		</div>

		<div class="btn-group actions" style="margin-top:14px;">
			<a class="btn btn-default btn-sm" data-toggle="modal" href="#copy_attributes">
				<i class="fa fa-copy"></i> <g:message code="product.form.edit.models.copy"/> 
			</a>

			<a class="btn btn-default blue-madison btn-sm" href="#" data-toggle="dropdown" style="margin-left:10px;">
				<i class="fa fa-cogs"></i> <g:message code="brand.form.action.new"/> 
				<i class="fa fa-angle-down"></i>
			</a>
			<ul class="dropdown-menu pull-right">
				<g:each var="attr" in="${attrlist}" status="i">
					<li>
						<a href="#">
						<i class="fa fa-plus-circle"></i> ${attr} </a>
					</li>
				</g:each>
			</ul>

		</div>


	</div>

	<div class="portlet-body form">
		<div role="form" class="form-horizontal">
			<div class="form-body">
				<!-- NAME -->
				<div class="form-group attribute-head" style="width: 100%;">
					<i class="glyphicon glyphicon-remove i-right remove" ><span></span></i>
					<h4 style="margin-left:15px"><g:message code="product.form.edit.composition"/></h4>
					<div class="col-md-2">
						<div class="input-icon right">
							<select class="form-control " tabindex="3">
								<option>Viscolycra</option>
								<option>Viscolycra</option>
								<option>Viscolycra</option>
							</select>								
						</div>
					</div>
					<div class="col-md-1"  style="width:38px" >
						<i class="fa fa-chevron-right" style="line-height:36px"></i>
					</div>
					<div class="col-md-2">
						<div class="input-icon right">
							<select class="form-control " tabindex="3">
								<option>Viscose</option>
								<option>Viscose</option>
								<option>Viscose</option>
							</select>								
						</div>
					</div>
					<div class="col-md-1" style="width:76px" >
						<div class="input-icon right">
							<input type="text" class="form-control form-control-inline "  style="width:50px !important" tabindex="2" value="96%"/>
						</div>
					</div>
					<div class="col-md-1" style="width:38px" >
						<i class="icon-plus plus-attr1"  style="line-height:36px"></i>
					</div>
					<div class="col-md-2 item2" >
						<div class="input-icon right">
							<select class="form-control " tabindex="3">
								<option>Viscose</option>
								<option>Viscose</option>
								<option>Viscose</option>
							</select>								
						</div>
					</div>
					<div class="col-md-1 item2" >
						<div class="input-icon right">
							<input type="text" class="form-control form-control-inline" style="width:50px !important" tabindex="2" value="8%"/>
						</div>
					</div>
					<div class="col-md-1 item2" style="width:38px" >
						<i class="icon-plus plus-attr2"  style="line-height:36px"></i>
					</div>
					<div class="col-md-2 item3">
						<div class="input-icon right">
							<select class="form-control " tabindex="3">
								<option>Viscose</option>
								<option>Viscose</option>
								<option>Viscose</option>
							</select>								
						</div>
					</div>
					<div class="col-md-1 item3" >
						<div class="input-icon right">
							<input type="text" class="form-control form-control-inline" style="width:50px !important" tabindex="2" value="8%"/>
						</div>
					</div>
				</div>
				<div class="form-group">
					<!--gola -->
					<div class="col-md-2 attribute"  style="padding-left:2px">
						<i class="glyphicon glyphicon-remove i-right remove" style="margin-right:-10px;" ><span></span></i>
						<h4 style="text-indent:10px">Gola</h4>
						<table>
							<tr>
								<td>
									<label class="radio-inline">
									<input type="radio" name="optionsRadios1" id="optionsRadios9" value="option1"  tabindex="10"> Gola V </label>
								</td>
							</tr>
							<tr>
								<td ><label class="radio-inline">
									<input type="radio" name="optionsRadios1" id="optionsRadios10" value="option1"  tabindex="10"> Gola U</label>
								</td>
							</tr>
							<tr>
								<td >
									<label class="radio-inline">
									<input type="radio" name="optionsRadios1" id="optionsRadios11" value="option1"  tabindex="10"> Sem</label>
								</td>
							</tr>
						</table>
					</div>

					<!--manga -->
					<div class="col-md-2 attribute" style="padding-left:0px">
						<i class="glyphicon glyphicon-remove i-right remove" style="margin-right:-10px;" ><span></span></i>
						<h4 style="text-indent:10px">Manga</h4>
						<table>
							<tr>
								<td>
									<label class="radio-inline">
									<input type="radio" name="optionsRadios2" id="optionsRadios9" value="option1"  tabindex="10"> Curta</label>
								</td>
							</tr>
							<tr>
								<td ><label class="radio-inline">
									<input type="radio" name="optionsRadios2" id="optionsRadios10" value="option1"  tabindex="10"> Longa </label>
								</td>
							</tr>
							<tr>
								<td >
									<label class="radio-inline">
									<input type="radio" name="optionsRadios2" id="optionsRadios11" value="option1"  tabindex="10"> 3/4</label>
								</td>
							</tr>
							<tr>
								<td >
									<label class="radio-inline">
									<input type="radio" name="optionsRadios2" id="optionsRadios11" value="option1"  tabindex="10"> Sem</label>
								</td>
							</tr>
						</table>
					</div>

					<!--fechamento -->
					<div class="col-md-2 attribute" style="padding-left:0px">
						<i class="glyphicon glyphicon-remove i-right remove" style="margin-right:-10px;" ><span></span></i>
						<h4 style="text-indent:10px">Fechamento</h4>
						<table>
							<tr>
								<td>
									<label class="radio-inline">
									<input type="radio" name="optionsRadios3" id="optionsRadios9" value="option1"  tabindex="10"> Botão </label>
								</td>
							</tr>
							<tr>
								<td ><label class="radio-inline">
									<input type="radio" name="optionsRadios3" id="optionsRadios10" value="option1"  tabindex="10"> Zíper </label>
								</td>
							</tr>
							<tr>
								<td >
									<label class="radio-inline">
									<input type="radio" name="optionsRadios3" id="optionsRadios11" value="option1"  tabindex="10"> Velcro</label>
								</td>
							</tr>
						</table>
					</div>

					<!--padrão -->
					<div class="col-md-2 attribute" style="padding-left:0px">
						<i class="glyphicon glyphicon-remove i-right remove" style="margin-right:-10px;" ><span></span></i>
						<h4 style="text-indent:10px">Padrão</h4>
						<table>
							<tr>
								<td>
									<label class="radio-inline">
									<input type="radio" name="optionsRadios4" id="optionsRadios9" value="option1"  tabindex="10"> Liso </label>
								</td>
							</tr>
							<tr>
								<td ><label class="radio-inline">
									<input type="radio" name="optionsRadios4" id="optionsRadios10" value="option1"  tabindex="10"> Xadrez </label>
								</td>
							</tr>
							<tr>
								<td >
									<label class="radio-inline">
									<input type="radio" name="optionsRadios4" id="optionsRadios11" value="option1"  tabindex="10"> Listrado</label>
								</td>
							</tr>
						</table>
					</div>

					<!--estampa -->
					<div class="col-md-4 attribute" style="width:40%;padding-left:0px" >
						<i class="glyphicon glyphicon-remove i-right remove" style="margin-right:-10px;" ><span></span></i>
						<h4 style="text-indent:10px">Estampa</h4>
						<div class="col-md-7" style="padding-left:0px">
						<table>
							<tr>
								<td>
									<label class="radio-inline">
									<input type="radio" name="optionsRadios" id="optionsRadios9" value="option1"  tabindex="10"> Abstrata </label>
								</td>
								<td ><label class="radio-inline">
									<input type="radio" name="optionsRadios" id="optionsRadios10" value="option1"  tabindex="10"> Marca </label>
								</td>
							</tr>
							<tr>
								<td ><label class="radio-inline">
									<input type="radio" name="optionsRadios" id="optionsRadios10" value="option1"  tabindex="10"> Animal </label>
								</td>
								<td ><label class="radio-inline">
									<input type="radio" name="optionsRadios" id="optionsRadios10" value="option1"  tabindex="10"> Bandas </label>
								</td>
							</tr>
							<tr>
								<td >
									<label class="radio-inline">
									<input type="radio" name="optionsRadios" id="optionsRadios11" value="option1"  tabindex="10"> Pessoas</label>
								</td>
								<td ><label class="radio-inline">
									<input type="radio" name="optionsRadios" id="optionsRadios10" value="option1"  tabindex="10"> Times</label>
								</td>
							</tr>
							<tr>
								<td >
									<label class="radio-inline">
									<input type="radio" name="optionsRadios" id="optionsRadios11" value="option1"  tabindex="10"> Personalidades</label>
								</td>
								<td ><label class="radio-inline">
									<input type="radio" name="optionsRadios" id="optionsRadios10" value="option1"  tabindex="10"> Frases</label>
								</td>
								<tr>
								<td >
									<label class="radio-inline">
									<input type="radio" name="optionsRadios" id="optionsRadios11" value="option1"  tabindex="10"> Floral</label>
								</td>
								<td ><label class="radio-inline">
									<input type="radio" name="optionsRadios" id="optionsRadios10" value="option1"  tabindex="10"> Sem</label>
								</td>
							</tr>
							</tr>
						</table>
						</div>
						<div class="col-md-3" >
								<div class="fileinput fileinput-new" data-provides="fileinput">
									<div class="fileinput-new thumbnail" style="width: 142px; height: 142px; background-color: #eaeaea;">
										<i class="icon-picture" style="font-size:60px;margin-top:60px"></i> 
									</div>
									<div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;">
									</div>
									<div style="width: 142px ">
										<span class="btn btn-sm blue btn-file" style="width: 142px;">
											<span class="fileinput-new">
												Carregar ...	
											</span>
											<span class="btn btn-sm blue fileinput-exists" style="width: 142px;" >
												Alterar 
											</span>
											<input type="file" name="..." tabindex="-1">
											</span>
												<a style="width: 142px;" href="#" class="btn btn-sm red fileinput-exists" data-dismiss="fileinput">
												Remover 
											</a>
									</div>
								</div>
								

						</div>

					</div>
					<div class="col-md-12" style="margin-top:16px">
							
						<a href="${createLink(controller:'product', action:'edit')}" style="float:right;margin-right:15px" class="btn blue" >Salvar</a>
					</div>
							
			</div>
		</div>
	</div>
</div>
<script>
	jQuery(document).ready(function() {   
		
        Popovers.handlePopovers();
        $(".remove").click(function(){

        	if (confirm("Deseja excluir essa variável ?") == false) {
                return;
            }

        	$(this).parent().fadeOut();
        });

        $(".plus-attr1").click(function(){
        	$(this).parent().hide();
        	$(".item2").fadeIn(300);
        });

        $(".plus-attr2").click(function(){
			$(this).parent().hide();
			$(".item3").fadeIn(300);
        });

	});
</script>