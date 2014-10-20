var PermissionTableManaged = function () {


    var createTable = function (table_name, table_id) {

        var table = $('#' + table_id);    

        table.dataTable({
            "lengthMenu": [
                [5, 15, 20, -1],
                [5, 15, 20, "Todos"] // change per page values here
            ],
            sDom: '<t>',
            // set the initial value
            "pageLength": 10,
            "language": {
                "lengthMenu": " _MENU_ registros",
                "zeroRecords": "Nenhum " + table_name + " encontrado(s)",
                "infoEmpty": "Nenhum " + table_name + " encontrado(s)",
                "sInfo": "Exibindo _START_ de  _END_ de um total de _TOTAL_ registros"
            },

             "aaSorting":[],
             "aoColumns": [
                {'bSortable': false}, 
                {'bSortable': false},
                {'bSortable': false},
                {'bSortable': false},
                {'bSortable': false},
                {'bSortable': false}
            ],
            

            "bFilter": false,
            "bInfo": false,
            "bPaginate": false,
            "pagingType": "full_numbers",
            "bSortCellsTop": false
           

        });

        table.on('change', 'tbody tr .checkboxes', function () {
            var checked = $(this).is(':checked');

            //$(this).parents('tr').toggleClass("active");
            $(this).parents('tr').children('td').each(function(){
                check = $(this).children('div').contents().find("input");

                if (checked) {
                    $(check).attr("checked",false);
                    $(check).attr("value","1");
                    $(check).parents('span').addClass("checked");
                }else{
                    $(check).attr("checked",true);
                    $(check).attr("value","0");
                    $(check).parents('span').removeClass("checked");
                }
            });
            $(this).attr("checked",checked);

        });

        
    }


    return {
        init: function (table_name, table_id) {

            createTable(table_name, table_id);
        }
    };


}();



