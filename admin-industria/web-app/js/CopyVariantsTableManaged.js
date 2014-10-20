var CopyVariantsTableManaged = function () {


    var createTable = function (table_name, table_id) {

        var table = $('#' + table_id);

        table.dataTable({
            "lengthMenu": [
                [5, 15, 20, -1],
                [5, 15, 20, "Todos"] // change per page values here
            ],
            sDom: '<hearder_box" <"search_box"f><t>i<"pagination_box"p> >',
            // set the initial value
            "pageLength": 10,
            "language": {
                "sSearch": ''

            },

            
            "aaSorting":[],
             "aoColumnDefs": [
                { 'bSortable': false, 'aTargets': [ 0,1,2,3,4] }
            ],
            "scrollY": "180px",
            "scrollCollapse": true,
            "aaSorting":[],
            "bFilter": true,
            "bInfo": false,
            "bPaginate": false,
            "pagingType": "full_numbers",
            "bSortCellsTop": true
           

        });

        $('.dataTables_filter input').attr("placeholder", "Busque por uma " + table_name + "...");

        table.find('.group-checkable').change(function () {
            var set = jQuery(this).attr("data-set");
            var checked = jQuery(this).is(":checked");

            $('#' + table_id).find('input[type="checkbox"]').each(function () {
                if (checked) {
                    $(this).attr("checked", true);
                    $(this).parents('tr').addClass("active");
                } else {
                    $(this).attr("checked", false);
                    $(this).parents('tr').removeClass("active");
                }
            });
            
            jQuery.uniform.update(set);
        });

        table.on('change', 'tbody tr .checkboxes', function () {
            $(this).parents('tr').toggleClass("active");
        });


    }


    return {
        init: function (table_name, table_id) {
            createTable(table_name, table_id);
        }
    };


}();



