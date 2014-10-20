var ModalTableManaged = function () {


    var createTable = function (table_name, table_id) {

        var table = $('#' + table_id);    

        table.dataTable({
            "lengthMenu": [
                [5, 15, 20, -1],
                [5, 15, 20, "Todos"] // change per page values here
            ],
            sDom: '<t>',
            // set the initial value
            "pageLength": 5,
            "language": {
                "lengthMenu": " _MENU_ registros",
                "zeroRecords": "Nenhum " + table_name + " encontrado(s)",
                "infoEmpty": "Nenhum " + table_name + " encontrado(s)",
                "sInfo": "Exibindo _START_ de  _END_ de um total de _TOTAL_ registros"

            },

            "bFilter": false,
            "bInfo": false,
            "bPaginate": false,
            "pagingType": "full_numbers",
            "bSortCellsTop": false,
            "scrollY": "200px",
            "scrollCollapse": true,
            "aoColumnDefs": [
                { 'bSortable': false, 'aTargets': [ 0,1,2,3 ] }
            ],
             "aoColumn": [
                {   'bSortable': false, 
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false}
                ]
           

        });

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