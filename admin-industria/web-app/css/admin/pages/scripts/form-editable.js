var FormEditable = function () {

    var initEditables = function () {


        //editables element samples 
        $('#prop1').editable({
            validate: function (value) {
                if ($.trim(value) == '') return 'This field is required';
            }
        });
    }

    return {
        //main function to initiate the module
        init: function () {

            // inii ajax simulation
           // initAjaxMock();

            // init editable elements
            initEditables();

        }

    };

}();