<!DOCTYPE html>

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="modeling.form.edit.models.title"/>

			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="<g:message code="popovers.title"/>" data-original-title="<g:message code="popovers.info"/>" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
		</div>
		
		<!-- RESTORE MODELS MODAL -->
		<g:render template="/product/restore_models"/>
		<!-- COPY MODELS MODAL -->
		<g:render template="/product/copy_models"/>

	</div>

	<div class="portlet-body form">
		<form role="form" class="form-horizontal">
		<div class="form-body">

			<div class="form-group" style="min-height:124px;">
				<div class="form-content">

						<div class="form-group ">
							<label class="col-md-1 control-label" style="color: black; margin-left:15px"><g:message code="modeling.form.edit.models.unit"/></label>
							<div class="col-md-2" style="margin-right: 10px; margin-left: 12px;">
								<div class="form-group">
									<select class="form-control input ">
										<option>Centímetro</option>
										<option>Milímetro</option>
										<option>Metros</option>
									</select>
								</div>
							</div>
						
							<label class="col-md-1 control-label" style="color: black;"><g:message code="modeling.form.edit.models.measures"/></label>
							<div class="col-md-2" style="margin-right: 10px; margin-left: 12px;">
								<div class="form-group">
									<select id="num_type" class="form-control input ">
										<option value="0">Única</option>
										<option value="1">Intervalo</option>
									</select>
								</div>
							</div>
					
							<label class="col-md-1 control-label" style="color: black;"><g:message code="modeling.form.edit.models.pattern"/></label>
							<div class="col-md-2" style="margin-right: 10px; margin-left: 12px;">
								<div class="form-group">
									<select class="form-control input ">
										<option>Brasil</option>
										<option>EUA</option>
									</select>
								</div>
							</div>

					</div>

				</div>
				<div class=" col-md-12">
					<div class="portlet-body">
							<div class="table-scrollable">
								<table class="table table-striped table_bordered table-hover" role="grid" id="grade_table">
									<thead>
										<tr>
											<th style="width:120px"></th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input"style="display:none; width:30px" type="text"/>				
												<a href="javascript:"  >XG </a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input" style="display:none" type="text"/>				
												<a href="javascript:"  >GG </a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input"style="display:none" type="text"/>				
												<a href="javascript:"   >XP1</a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>				
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input"style="display:none" type="text"/>		
												<a href="javascript:"  >1P</a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input"style="display:none" type="text"/>
												<a href="javascript:" >M2</a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<a href="javascript:" >M2</a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input"style="display:none" type="text"/>
												<a href="javascript:" >GG</a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input"style="display:none" type="text"/>		
												<a href="javascript:" >XGG</a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input"style="display:none" type="text"/>		
												<a href="javascript:" >XXGG</a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input"style="display:none" type="text"/>		
												<a href="javascript:" >1GG</a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input"style="display:none" type="text"/>		
												<a href="javascript:" >2XG</a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="two-states" style="padding: 0px; min-width: 80px">
												<input class="two-state-input"style="display:none" type="text"/>		
												<a href="javascript:"  >3XG</a>
												<span class='removeColumn' style="padding-left:5px; display:none"><i class='glyphicon glyphicon-remove'></i></span>
											</th>
											<th class="last-th" style="padding: 0px; min-width: 80px">
												<a id="new-column" href="javascript:" class="btn btn-circle btn-sm blue-madison" style="margin-left: 25px"><i class="fa fa-plus-circle"></i><g:message code="modeling.form.edit.models.newgrade"/> </a>

											</th>
											
										</tr>
									</thead>
								<tbody>
								<g:each var="grade" in="${gradeList}" status="i">
									<tr>
										<td>
											<select class='form-control input-small col-wd148 editable' disabled="disabled" >
												<option value='Comp. Peça'>Comp. Peça</option>
												<option value='Cava'>Cava</option>
												<option value='Ombro'>Ombro</option>
											</select>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >60</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >60</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >60</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >60</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >60</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >60</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >60</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >60-80</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >60</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >603-222</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >12-23</span>
										</td>
										<td>
											<input type="text" class="editable range" style="width:60px; display:none"/>
											<span class="not-editable" >123-234</span>
										</td>
										<td class="last-td"><a class='editLine' style='margin-right:15px' href='javascript:void(0)'><i class='glyphicon glyphicon-edit'><span></span></i></a><a class='removeLine' href='javascript:void(0)'><i class='glyphicon glyphicon-remove'><span></span></i></a></td>
									</tr>
								</g:each>
								<g:if test="${gradeList.size() == 0}">
										<tr>
											<td>
												<select class='form-control input-small col-wd148 editable' disabled="disabled" >
													<option value='Comp. Peça'>Comp. Peça</option>
													<option value='Cava'>Cava</option>
													<option value='Ombro'>Ombro</option>
												</select>
											</td>
											<td>
												<input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >123-234</span>
											</td>
											<td>
												<input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable">112</span>
											</td>
											<td>
												<input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >11</span>
											</td>
											<td>
												 <input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >223-234</span>
											</td>
											<td>
												 <input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >323</span>
											</td>
											<td>
												 <input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >1</span>
											</td>
											<td>
												 <input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >22</span>
											</td>
											<td>
												 <input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >333</span>
											</td>
											<td>
												 <input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >111</span>
											</td>
											<td>
												 <input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >23</span>
											</td>
											<td>
												 <input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >121</span>
											</td>
											<td>
												 <input type="text" class="editable range" style="width:60px; display:none"/>
											 	<span class="not-editable" >111</span>
											</td>
											<td class="last-td"><a class='editLine' style='margin-right:15px' href='javascript:void(0)'><i class='glyphicon glyphicon-edit'><span></span></i></a><a class='removeLine' href='javascript:void(0)'><i class='glyphicon glyphicon-remove'><span></span></i></a></td>
										</tr>
								</g:if>
							</tbody>
						</table>
						<div style="padding-top:5px;padding-bottom:5px;">
							<a id="new-row" href="javascript:" class="btn btn-circle btn-sm blue-madison" style="margin-left: 25px;"><i class="fa fa-plus-circle"></i> <g:message code="modeling.form.edit.models.newmeasure"/> </a>
						</div>
					</div><!--end scrollable-->
				</div><!--end portlet-->
			</div>
				<div class="col-md-12" style="margin-top:16px">
							<a href="${createLink(controller:'modeling', action:'edit')}" style="float:right;margin-right:15px" class="btn blue" >Salvar</a>
						</div>

			</div>
			
				
			</div>
			
		</form>
	</div>
</div>

<script>
	jQuery(document).ready(function() {   
		GradeTableManaged.init('modelagem', 'grade_table');
		$("#new-column").live("click", function(){
			addColumn();
		});

		$(".removeLine").live("click",function(){
			removeRow(this);
		});

		$(".removeColumn").live("click",function(){
			removeColumn(this);
		});
		

		$(".editLine").live("click",function(){
			editRow(this);
		});
		

		$("#new-row").click(function(){
			addRow();

		});

		$(".two-states").live("click",function(){
			var not_editable = $(this).find("a:first");
			not_editable.hide();
			var editable = $(this).find("input");
			$(this).find("span").show();
			editable.show();
			editable.val(not_editable.html())
			editable.focus()
		});


		$(".two-states input").live("keyup",function(){
		    if(event.keyCode == 13){
		        disableTitle(this);
		    }
		});

	});


</script>