/*
* Visual Chart: 1 - PieChart
*
*/
var PieChart = function () {

    var data = [];
    
    return {

        insertData: function (label, value) {
            data[data.length] = [label,value];
        },

        createPieChart: function (chart_id) {

            var plot1 = jQuery.jqplot (chart_id, [data], 
                { 
                    seriesColors: [ "#578ebe", "#18aa8c", "#e35b5a", "#e87e04", "#ffb848", "#8e44ad", "#e5e5e5"],

                    seriesDefaults: {
                        // Make this a pie chart.
                        renderer: jQuery.jqplot.PieRenderer, 
                        rendererOptions: {
                          // Put data labels on the pie slices.
                          // By default, labels show the percentage of the slice.
                          showDataLabels: true
                    },

                  }, 

                  legend: { 
                        show:true, 
                        location: 'ne' 
                    }
                }
              );
            
        }

    };

}();