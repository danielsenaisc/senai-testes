
/*!
 * CustomChart.js
 * 
 * Gera os elementos visuais do Dashboard da Aplicação.
 *
 * Visual Chart: 1 - BarChart
 *
 */

var BarChart = function () {


    var FILL_COLOR_COLUMN_01 = "rgba(220,220,220,0.5)";
    var STROKE_COLOR_COLUMN_01 = "rgba(220,220,220,0.8)";
    var HIGH_LIGHT_FILL_COLUMN_01 = "rgba(220,220,220,0.75)";
    var HIGH_LIGHT_STROKE_COLUMN_01 = "rgba(220,220,220,1)";

    var FILL_COLOR_COLUMN_02 = "rgba(151,187,205,0.5)";
    var STROKE_COLOR_COLUMN_02 = "rgba(151,187,205,0.8)";
    var HIGH_LIGHT_FILL_COLUMN_02 = "rgba(151,187,205,0.75)";
    var HIGH_LIGHT_STROKE_COLUMN_02 = "rgba(151,187,205,1)";

    var labels = new Array();
    var datasets = [
                {
                    label: "Bar1",
                    fillColor: FILL_COLOR_COLUMN_01,
                    strokeColor: STROKE_COLOR_COLUMN_01,
                    highlightFill: HIGH_LIGHT_FILL_COLUMN_01,
                    highlightStroke: HIGH_LIGHT_STROKE_COLUMN_01,
                    data: []
                },
                {
                    label: "Bar2",
                    fillColor: FILL_COLOR_COLUMN_02,
                    strokeColor: STROKE_COLOR_COLUMN_02,
                    highlightFill: HIGH_LIGHT_FILL_COLUMN_02,
                    highlightStroke: HIGH_LIGHT_STROKE_COLUMN_02,
                    data: []
                }
                    
    ]; 

    return {

        insertData: function (period, value1, value2) {
           
            datasets[0].data[datasets[0].data.length] = value1;
            datasets[1].data[datasets[1].data.length] = value2;

            labels.push(period);
            
        },

        createBarChart: function () {

            var data = {
                labels: labels,
                datasets: datasets
            };

            var ctx = $("#bar_chart").get(0).getContext("2d");
            var myBarChart = new Chart(ctx).Bar(data);
            
        }
    };

}();



