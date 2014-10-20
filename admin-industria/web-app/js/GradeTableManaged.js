var GradeTableManaged = function () {


    var createTable = function (table_name, table_id) {

        var table = $('#' + table_id);    

        table.dataTable({
            sDom: '<t>',
            // set the initial value
            "language": {
                "zeroRecords": "Nenhuma " + table_name + " encontrado(s)",
                "infoEmpty": "Nenhuma " + table_name + " encontrado(s)",
                "sInfo": "Exibindo _START_ de  _END_ de um total de _TOTAL_ registros",

            },
            "aaSorting":[],
            "bFilter": false,
            "bInfo": false,
            "bPaginate": false,
            "pagingType": "full_numbers",
            "bSortCellsTop": false,
            "aoColumnDefs": [
                { 'bSortable': false, 'aTargets': [ 0,1,2,3,4,5,6,7,8,9,10,11,12,13 ] }
            ],
            "aoColumn": [
                {   'bSortable': false, 
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false,
                    'bSortable': false
                }
            ]

        });

        //$('.dataTables_filter input').attr("placeholder", "Busque por um(a) " + table_name + "...");

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
        var select_options = "<select class='form-control input-small col-wd148 ' tabindex='4'><option>Comp. Peça</option><option>Cava</option>" + "<option>Ombro</option>" + "</select>";

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
            var newInput = "<input type='text' class='range' style='width:45px' />";

            jqTds[0].innerHTML = select_options;
            jqTds[1].innerHTML = newInput;
            jqTds[2].innerHTML = newInput;
            jqTds[3].innerHTML = newInput;    
            jqTds[4].innerHTML = newInput;
            jqTds[5].innerHTML = newInput;
            jqTds[6].innerHTML = newInput;
            jqTds[7].innerHTML = newInput;
            jqTds[8].innerHTML = newInput;
            jqTds[9].innerHTML = newInput;
            jqTds[10].innerHTML = newInput;
            jqTds[11].innerHTML = newInput;
            jqTds[12].innerHTML = newInput;
            jqTds[13].innerHTML = "<a class='save' href='javascript:void(0)'><i class='glyphicon glyphicon-ok'><span></span></i><a/><a class='delete' href='javascript:void(0)'><i class='glyphicon glyphicon-remove'><span></span></i></a>";
            oTable.parent().scrollTop(9999);
            oTable.fnDraw()

        }

        function saveRow(oTable, nRow) {
            var jqInputs = $('input', nRow);
            var jqSelect = $('select', nRow);
            console.log(jqInputs);

            oTable.fnUpdate(jqSelect[0].value, nRow, 0, false);
            
            oTable.fnUpdate(jqInputs[0].value, nRow, 1 , false);
            oTable.fnUpdate(jqInputs[1].value, nRow, 2, false);
            oTable.fnUpdate(jqInputs[2].value, nRow, 3, false);
            oTable.fnUpdate(jqInputs[3].value, nRow, 4, false);
            oTable.fnUpdate(jqInputs[4].value, nRow, 5, false);
            oTable.fnUpdate(jqInputs[5].value, nRow, 6, false);
            oTable.fnUpdate(jqInputs[6].value, nRow, 7, false);
            oTable.fnUpdate(jqInputs[7].value, nRow, 8, false);
            oTable.fnUpdate(jqInputs[8].value, nRow, 9, false);
            oTable.fnUpdate(jqInputs[9].value, nRow, 10, false);
            oTable.fnUpdate(jqInputs[10].value, nRow, 11, false);
            oTable.fnUpdate(jqInputs[11].value, nRow, 12, false);
            oTable.fnUpdate("<a class='delete' href='javascript:void(0)'><i class='glyphicon glyphicon-remove'><span></span></i></a>", nRow, 13, false);

            nNew = false;

            oTable.fnDraw();
            oTable.parent().scrollTop(9999);
        }


        function cancelEditRow(oTable, nRow) {
            var select_options = "<select class='form-control input-small col-wd148' tabindex='4'><option>Comp. Peça</option><option>Cava</option>" + "<option>Ombro</option>" + "</select>";

            oTable.fnUpdate(select_options, nRow, 0, false);
            oTable.fnUpdate("", nRow, 1 , false);
            oTable.fnUpdate("", nRow, 2, false);
            oTable.fnUpdate("", nRow, 3, false);
            oTable.fnUpdate("", nRow, 4, false);
            oTable.fnUpdate("", nRow, 5, false);
            oTable.fnUpdate("", nRow, 6, false);
            oTable.fnUpdate("", nRow, 7, false);
            oTable.fnUpdate("", nRow, 8, false);
            oTable.fnUpdate("", nRow, 9, false);
            oTable.fnUpdate("", nRow, 10, false);
            oTable.fnUpdate("", nRow, 11, false);
            oTable.fnUpdate("", nRow, 12, false);
            oTable.fnUpdate("", nRow, 13, false);

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

            if (nNew && nEditing) {
                alert("Salve o registro atual antes de inserir um novo.");
            }else{

                var aiNew = oTable.fnAddData(['', '', '', '', '', '','','','','','','','','']);
                var nRow = oTable.fnGetNodes(aiNew[0]);
                
                editRow(oTable, nRow);
                nEditing = nRow;    
                nNew = true;
            }
        });

        table.on('click', '.delete', function (e) {
            e.preventDefault();

            if (confirm("Deseja excluir esse registro ?") == false) {
                return;
            }

            var nRow = $(this).parents('tr')[0];
            oTable.fnDeleteRow(nRow);
            nNew = false
            oTable.parent().scrollTop(9999);
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

        table.on('click', '.save', function (e) {
            e.preventDefault();         
            var nRow = $(this).parents('tr')[0];
            saveRow(oTable, nEditing);
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
                alert("Atualizado! Obs.: Chamar algum script/ajax de backend para atualização do backend!");
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

function disableTitle(thlink){
    var editable = $(thlink);
    var not_editable = editable.siblings( "a");
    not_editable.html(editable.val());
    editable.siblings("span").hide();
    editable.hide();    
    not_editable.show();
}
    
    function addColumn(){
        var new_td = "<td> <input type='text' class='editable range' style='width:60px;'/><span class='not-editable' style='display:none' ></span></td>";

        //var last_td = "<td class='last-td'><a class='editLine' style='margin-right:15px' href='javascript:void(0)'><i class='glyphicon glyphicon-edit'><span></span></i></a><a class='removeLine' href='javascript:void(0)'><i class='glyphicon glyphicon-remove'><span></span></i></a></td>";
        var last_td = "<td class='last-td'><a class='editLine' style='margin-right:15px' href='javascript:void(0)'><span></span></a><a class='removeLine' href='javascript:void(0)'><i class='glyphicon glyphicon-remove'><span></span></i></a></td>";


        var new_th ="<th class='two-states' style='padding: 0px;' ><input class='two-state-input' style='display:none'  type='text' />  <a href=' javascript:'   class='two-states' >grade</a> <span class='removeColumn' style='padding-left:5px; display:none'><i class='glyphicon glyphicon-remove'></i></span></th>";

        var last_th = "<th class='last-th' style='padding: 0px; '><a id='new-column' href='javascript:' class='btn btn-circle btn-sm blue-madison' style='margin-left: 25px'><i class='fa fa-plus-circle'></i><g:message code='modeling.form.edit.models.newgrade'/> </a></th>"

        
            $(".last-td").remove();
        
            $("#grade_table").find("tbody tr").each(function() {
                var tr = $(this)
                tr.append(new_td).append(last_td);
               
                var num_type= $("#num_type").val();  
                var holder ;
                var mask;

                if(num_type == "0" || num_type == 0){
                    holder = "100";
                    mask = "999";
                }else{
                    mask = "999-999";
                    holder = "100-105";
                }

                $(".range").mask(mask,{placeholder:holder});

            });

            $(".last-th").remove();
            $("#grade_table").find("thead tr:first").append(new_th).append(last_th);
    }


    function addRow(){
        var table = $("#grade_table");
        
        var newInput = "<input type='text' class='range' style='width:60px' />";
        
        var select_options = "<select class='form-control input-small col-wd148 ' tabindex='4'><option>Comp. Peça</option><option>Cava</option>" + "<option>Ombro</option>" + "</select>";
        
        //var removeAndEditButtons = "<a class='editLine' style='margin-right:15px' href='javascript:void(0)'><i class='glyphicon glyphicon-edit'><span></span></i></a><a class='removeLine' href='javascript:void(0)'><i class='glyphicon glyphicon-remove'><span></span></i></a>";

        var removeAndEditButtons = "<a class='editLine' style='margin-right:15px' href='javascript:void(0)'><span></span></a><a class='removeLine' href='javascript:void(0)'><i class='glyphicon glyphicon-remove'><span></span></i></a>";

        var newColumn = table.find("tbody tr:first").clone(); 
        newColumn.children().each(function(){
            $(this).html(newInput);
        });
        newColumn.find("td:first").html(select_options);
        newColumn.find("td:last").html(removeAndEditButtons);
        table.find("tbody").append(newColumn);
       
        var num_type= $("#num_type").val();  
        var holder ;
        var mask;

        if(num_type == "0" || num_type == 0){
            holder = "100";
            mask = "999";
        }else{
            mask = "999-999";
            holder = "100-105";
        }

        $(".range").mask(mask,{placeholder:holder});

        //edit_icon = table.find(".last-td").find(".glyphicon-edit");
        //edit_icon.addClass("display-none");

    }

    function removeRow(button){
        if(confirm("Você tem certeza que deseja excluir essa medida?")){
            $(button).parents("tr").remove()
            if($("#grade_table").find("tbody tr").size() == 0)
                window.location.reload()            
        }
    }

    function removeColumn(button){
        if(confirm("Você tem certeza que deseja excluir essa grade?")){
            window.location.reload()            
        }
    }

    function editRow(button){
        $(button).parents("tr").children().each(function(){
            var editable = $(this).find("input.editable")
            editable.show()
            var not_editable = $(this).find(".not-editable")
            not_editable.hide()
            editable.val(not_editable.html())
            $(this).find("select.editable").removeAttr("disabled")
            $(".range").mask("999-999",{placeholder:"Ex:12"});

            $(this).find(".glyphicon-edit").addClass("display-none");

        });
    }
