var UsersTableManaged = function () {


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
                "lengthMenu": " _MENU_ registros",
                "zeroRecords": "Nenhum " + table_name + " encontrado(s)",
                "infoEmpty": "Nenhum " + table_name + " encontrado(s)",
                "sInfo": "Exibindo _START_ de  _END_ de um total de _TOTAL_ registros",
                "oPaginate": {
                               "sFirst":    "&laquo;",
                               "sPrevious": "&lsaquo;",
                               "sNext":     "&rsaquo;",
                               "sLast":     "&raquo;"
                            },
                "sSearch": '<i class="fa fa-search" style="font-size: 18px;"></i>'

            },

            "columnDefs": [{  // set default column settings
                    'orderable': true,
                    'targets': [0]
                    }, {
                        "searchable": false,
                        "targets": [0]
                    }],
                    "order": [
                    [1, "desc"]
            ], // set first column as a default sort by asc

             "aoColumnDefs": [
                { 'bSortable': false, 'aTargets': [ 0,5 ] }
            ],

            "bFilter": true,
            "bInfo": true,
            "bPaginate": true,
            "pagingType": "full_numbers",
            "bSortCellsTop": true
           

        });

        $('.dataTables_filter input').attr("placeholder", "Busque por um " + table_name + "...");

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



