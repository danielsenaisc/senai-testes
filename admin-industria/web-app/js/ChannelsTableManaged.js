var ChannelsTableManaged = function () {


    var createTable = function (table_name, table_id) {

        var table = $('#' + table_id);    

        table.dataTable({
            sDom: '<t>',
            // set the initial value
            "language": {
                "zeroRecords": "Nenhum " + table_name + " encontrado(s)",
                "infoEmpty": "Nenhum " + table_name + " encontrado(s)",
                "sInfo": "Exibindo _START_ de  _END_ de um total de _TOTAL_ registros",

            },

            "bFilter": false,
            "bInfo": false,
            "bPaginate": false,
            "pagingType": "full_numbers",
            "bSortCellsTop": false,
            "scrollY": "200px",
            "scrollCollapse": true,
            "aaSorting":[],
             "aoColumns": [
                {'bSortable': false}, 
                {'bSortable': false},
                {'bSortable': false},
                {'bSortable': false},
                {'bSortable': false}
                ]

        });

        $('.dataTables_filter input').attr("placeholder", "Busque por um(a) " + table_name + "...");

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

    var handleTable = function (table_name, table_id) {

        var select_type_input = '<select class="form-control input-small"><option>Facebook</option><option>SAC</option><option>Site</option></select>';

        var select_location_input = '<select class="form-control iinput-small"><option>ALL</option><option>Brasil</option><option>EUA</option></select>';

        var text_input = '<input type="text" class="form-control input-medium" style="margin-left:40px;" placeHolder="Novo Canal..." value="">';

        var checkbox_input = '<input type="checkbox" class="checkboxes" value="1"/>';

        var delete_input = '<a class="delete" href="javascript:;"><i class="glyphicon glyphicon-remove"><span></span></i></a>';

        var save_input = '<a class="edit" href="">Salvar</a>';

        function restoreRow(oTable, nRow) {
            var aData = oTable.fnGetData(nRow);
            var jqTds = $('>td', nRow);

            for (var i = 0, iLen = jqTds.length; i < iLen; i++) {
                oTable.fnUpdate(aData[i], nRow, i, false);
            }

            oTable.fnDraw();
        }

        function editRow(oTable, nRow) {
            var aData = oTable.fnGetData(nRow);
            var jqTds = $('>td', nRow);
           
            jqTds[0].innerHTML = select_type_input;
            jqTds[1].innerHTML = text_input;
            jqTds[2].innerHTML = select_location_input;
            jqTds[3].innerHTML = text_input;
            jqTds[4].innerHTML = delete_input;

        }

        function saveRow(oTable, nRow) {
            
            var jqInputs = $('input', nRow);
            var jqSelects = $('select', nRow);

            oTable.fnUpdate(select_type_input, nRow, 0, false);
            oTable.fnUpdate(select_location_input, nRow, 2, false);

            html_input = text_input.replace("...", jqInputs[0].value);
            oTable.fnUpdate(html_input, nRow, 1 , false);

            html_input = text_input.replace("...", jqInputs[1].value);
            oTable.fnUpdate(html_input, nRow, 3, false);

            oTable.fnUpdate('', nRow, 4, false);
            oTable.fnUpdate(delete_input, nRow, 5, false);

            oTable.fnDraw();
        }


        function cancelEditRow(oTable, nRow) {
            var jqSelects = $('select', nRow);
            oTable.fnUpdate(jqSelects[0].value, nRow, 0, false);
            oTable.fnUpdate(jqSelects[1].value, nRow, 1, false);

            var jqInputs = $('input', nRow);
            oTable.fnUpdate(jqInputs[0].value, nRow, 0 , false);
            oTable.fnUpdate(jqInputs[1].value, nRow, 1, false);
            oTable.fnUpdate(jqInputs[2].value, nRow, 2, false);

            oTable.fnDraw();
        }

        var table = $('#' + table_id);
        oTable = table.dataTable();
  

        var tableWrapper = $("#" + table_id + "_wrapper");

        tableWrapper.find(".dataTables_length select").select2({
            showSearchInput: false //hide search box with special css class
        }); // initialize select2 dropdown

        var nEditing = null;
        var nNew = false;

        $('#' + table_id + '_new').click(function (e) {
            e.preventDefault();

            /*
            if (nNew && nEditing) {
                if (confirm("Registro ainda não foi salvo. Deseja salvar a alteração ?")) {
                    saveRow(oTable, nEditing); // save
                    $(nEditing).find("td:first").html("Untitled");
                    nEditing = null;
                    nNew = false;

                } else {
                    oTable.fnDeleteRow(nEditing); // cancel
                    nEditing = null;
                    nNew = false;
                    
                    return;
                }
            }*/

            var aiNew = oTable.fnAddData(['', '', '', '', '', '']);
            var nRow = oTable.fnGetNodes(aiNew[0]);
            editRow(oTable, nRow);
            nEditing = nRow;    
            nNew = true;
        });

        table.on('click', '.delete', function (e) {
            e.preventDefault();

            if (confirm("Deseja excluir esse registro ?") == false) {
                return;
            }

            var nRow = $(this).parents('tr')[0];
            oTable.fnDeleteRow(nRow);
        });

        table.on('click', '.cancel', function (e) {
            e.preventDefault();

            if (nNew) {
                oTable.fnDeleteRow(nEditing);
                nNew = false;
            } else {
                restoreRow(oTable, nEditing);
                nEditing = null;
            }
        });

        table.on('click', '.edit', function (e) {
            e.preventDefault();

            /* Get the row as a parent of the link that was clicked on */
            var nRow = $(this).parents('tr')[0];

            if (nEditing !== null && nEditing != nRow) {
                /* Currently editing - but not this row - restore the old before continuing to edit mode */
                restoreRow(oTable, nEditing);
                editRow(oTable, nRow);
                nEditing = nRow;
            } else if (nEditing == nRow && this.innerHTML == "Salvar") {
                /* Editing this row and want to save it */
                saveRow(oTable, nEditing);
                nEditing = null;
            } else {
                /* No edit in progress - let's start one */
                editRow(oTable, nRow);
                nEditing = nRow;
            }
        });
    }


    return {
        init: function (table_name, table_id) {

            createTable(table_name, table_id);
            handleTable(table_name, table_id);

        }
    };


}();