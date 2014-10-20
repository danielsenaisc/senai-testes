var ComponentsPickers = function () {

    var handleColorPicker = function () {
        if (!jQuery().colorpicker) {
            return;
        }

        $('.color-1').colorpicker({
            format: 'hex'
        }).on('changeColor', function(ev){
            //$('.color-1').colorpicker('hide')
            $("#color-holder1").css("background-color", ev.color.toHex()); 
         });
        
        $('.color-2').colorpicker({
            format: 'hex'
        }).on('changeColor', function(ev){
            // $('.color-2').colorpicker('hide')
            $("#color-holder2").css("background-color", ev.color.toHex()); 
         });
    }
   

    return {
        init: function () {
            handleColorPicker();
        }
    };

}();