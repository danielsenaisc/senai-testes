<!DOCTYPE html>

<div class="portlet box blue-madison">
	<div class="portlet-title">
		<div class="caption">
			<g:message code="modeling.form.edit.basic"/>
			
			<a href="javascript:;" class="popovers" data-container="body" data-trigger="hover" 
			data-content="<g:message code="popovers.title"/>" data-original-title="<g:message code="popovers.info"/>" data-placement="top">
				<i class="fa fa-info-circle popovers" ></i> 
			</a>
				
		</div>
	</div>

	<!-- BASIC INFORMATION -->
	<div class="portlet-body form">
		<form role="form" class="form-horizontal">
			<div class="form-body">
				<!-- NAME -->
				<div class="form-group">
					<label class="col-md-2 control-label"><g:message code="modeling.table.column.name"/></label>
					<div class="col-md-3">
						<div class="input-icon right">
							<input id="product_name" type="text" class="form-control input-xlarge">
						</div>
					</div>
				</div>

				<!-- COLLECTION -->
				<div class="form-group">
					<label class="col-md-2 control-label"><g:message code="modeling.form.edit.brand"/></label>
					<div class="col-md-2" style="margin-right: 10px; margin-left: 12px;">
						<div class="form-group">
							<select id="main_collection" class="form-control input-small input-200">
								<option>Levis</option>
								<option>Hering</option>
								<option>Aleatory</option>
							</select>
						</div>
					</div>
					
				</div>

				<!-- CATEGORY -->
				<div class="form-group">
					<label class="col-md-2 control-label"><g:message code="modeling.form.edit.category"/></label>
					<div class="col-md-2" style="margin-right: 10px; margin-left: 12px;">
						<div class="form-group">
							<select id="main_category" class="form-control input-small input-200">
								<option>Camisa</option>
								<option>Blusa</option>
								<option>Calça</option>
							</select>
						</div>
					</div>

					<div class="col-md-1 display-none" style="width:40px;" id="category_separator">
						<i class="fa fa-chevron-right" style="padding-top:16px;padding-left:12px;"></i>
					</div>

					<div class="col-md-2 display-none" style="margin-left: 10px" id="sub_category">
						<div class="form-group">
							<select class="form-control input-small input-200">
								<option>Social</option>
								<option>Esporte</option>
								<option>Fitness</option>
							</select>
						</div>
					</div>

					<div class="col-md-1 display-none" style="width:40px;" id="sub_category_separator">
						<i class="fa fa-chevron-right" style="padding-top:16px;padding-left:12px;"></i>
					</div>

					<div class="col-md-2 display-none" style="margin-left: 10px" id="sub_category_a">
						<div class="form-group">
							<select class="form-control input-small input-200" >
								<option>Regata</option>
								<option>Manga Comprida</option>
								<option>Manga Curta</option>
							</select>
						</div>
					</div>
				</div>

				<!-- GENRE -->
				<div class="form-group">
					<label class="col-md-2 control-label"><g:message code="modeling.table.column.gender"/></label>
					<div class="col-md-6 radio-list">
						<label class="radio-inline">
						<input type="radio" name="optionsRadios" id="optionsRadios4" value="option1" checked tabindex="10"> <g:message code="report.form.edit.gender-male"/> </label>
						<label class="radio-inline">
						<input type="radio" name="optionsRadios" id="optionsRadios5" value="option2" tabindex="11"> <g:message code="report.form.edit.gender-female"/> </label>
						<label class="radio-inline">
						<input type="radio" name="optionsRadios" id="optionsRadios6" value="option3" tabindex="12"> <g:message code="report.form.edit.gender-unissex"/> </label>
					</div>
				</div>

				<!-- REFERENCE-->
				<div class="form-group">
					<label class="col-md-2 control-label"><g:message code="modeling.form.edit.code"/></label>
					<div class="col-md-2">
						<div class="input-icon right">
							<input type="text" class="form-control input-200">
						</div>
					</div>
				</div>	


				<!-- DESCRIPTION -->
				<div class="form-group">
					<label class="col-md-2 control-label"><g:message code="modeling.form.edit.description"/></label>
					<div class="col-md-3">
						<div class="input-icon right">
							<textarea class="form-control input-xlarge" rows="6" maxlength="600"></textarea>
						</div>
					</div>
				</div>

			</div>
			
		</form>
	</div>
</div>

<script>
	jQuery(document).ready(function() {   
		
        $("#style_tag").select2({
        	width: 300,
        	'defaultText':'nova tag...',
            tags: ["Loren Ipsum", "Loren Ipsum", "Loren Ipsum"]
        });

        Popovers.handlePopovers();

        $('#product_name').focus();

        $('#main_collection').on('change', function() {
			
			if ($(this).val() == 'Hering') {

				$("#sub_collection").removeClass("display-none");
				$("#sub_collection").addClass("display-show");

				$("#collection_separator").removeClass("display-none");
				$("#collection_separator").addClass("display-show");

			}else{

				$("#sub_collection").removeClass("display-show");
				$("#sub_collection").addClass("display-none");

				$("#collection_separator").removeClass("display-show");
				$("#collection_separator").addClass("display-none");
			}

		});

		$('#main_category').on('change', function() {
			
			if ($(this).val() == 'Blusa') {

				$("#sub_category").removeClass("display-none");
				$("#sub_category").addClass("display-show");

				$("#category_separator").removeClass("display-none");
				$("#category_separator").addClass("display-show");

				$("#sub_category_a").removeClass("display-none");
				$("#sub_category_a").addClass("display-show");

				$("#sub_category_separator").removeClass("display-none");
				$("#sub_category_separator").addClass("display-show");

			}else{

				$("#sub_category").removeClass("display-show");
				$("#sub_category").addClass("display-none");

				$("#category_separator").removeClass("display-show");
				$("#category_separator").addClass("display-none");

				$("#sub_category_a").removeClass("display-show");
				$("#sub_category_a").addClass("display-none");

				$("#sub_category_separator").removeClass("display-show");
				$("#sub_category_separator").addClass("display-none");
			}

		});

	});
</script>