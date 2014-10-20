var AttachmentTableManaged = function () {


    var createTable = function (table_name, table_id) {

        var table = $('#' + table_id);   

        table.dataTable({
           
            sDom: '<t>',
            "language": {
                "lengthMenu": " _MENU_ registros",
                "zeroRecords": "Nenhum " + table_name + " encontrado(s)",
                "infoEmpty": "Nenhum " + table_name + " encontrado(s)",
                "sInfo": "Exibindo _START_ de  _END_ de um total de _TOTAL_ registros",
            },

            "bFilter": false,
            "bInfo": false,
            "bPaginate": false,
            "pagingType": "full_numbers",
            "bSortCellsTop": false,
             "aaSorting":[],
             "aoColumns": [
                {'bSortable': false}, 
                {'bSortable': false},
                {'bSortable': false},
                {'bSortable': false},
                {'bSortable': false},
                {'bSortable': false}
            ]
            
           

        });

        $('.dataTables_filter input').attr("placeholder", "Busque por um(a) " + table_name + "...");


        table.on('click', '.delete', function (e) {
            e.preventDefault();

            if (confirm("Deseja excluir esse registro ?") == false) {
                return;
            }

            var nRow = $(this).parents('tr')[0];
            oTable = table.dataTable();
            oTable.fnDeleteRow(nRow);
            
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



