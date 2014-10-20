
var Popovers = function () {

	// last popep popover
	var lastPopedPopover;

	return {
		
		handlePopovers: function () {
		    $('.popovers').popover();

		    // close last displayed popover

		    $(document).on('click.bs.popover.data-api', function (e) {
		        if (lastPopedPopover) {
		            lastPopedPopover.popover('hide');
		        }
		    });
		}


	};

}();