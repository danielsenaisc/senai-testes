
var CustomDatePicker = function () {


	return {
		
		init: function (picker_id) {
		    
			$('#' + picker_id).datepicker({
	            rtl: false,
	            orientation: "left",
	            autoclose: true,
	            buttonImageOnly: true,
	            dateFormat: 'dd/mm/yy',
			    dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado'],
			    dayNamesMin: ['Dom','Seg','Ter','Qua','Qui','Sex','Sab','Dom'],
			    dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
			    monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
			    monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez'],
			    nextText: 'Próximo',
			    prevText: 'Anterior'
        	});



		}


	};

}();