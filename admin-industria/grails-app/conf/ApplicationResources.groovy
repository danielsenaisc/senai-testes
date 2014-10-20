modules = {

	/********** PLUGINS AND SCRIPTS MODULES **********/
    application {
        resource url:'js/application.js'
        resource url:'js/CustomLogin.js'
        resource url: 'js/Popovers.js'
        resource url: 'js/CustomDatePicker.js'
        resource url: 'js/MenuBar.js'
        resource url: 'css/global/scripts/metronic.js'
        resource url: 'css/admin/layout/scripts/layout.js'
    }

    core_plugins {
    	resource url:'css/global/plugins/jquery-1.11.0.min.js'
    	resource url:'css/global/plugins/jquery-migrate-1.2.1.min.js'
    	resource url:'css/global/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js'
    	resource url:'css/global/plugins/bootstrap/js/bootstrap.min.js'
    	resource url:'css/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js'
    	resource url:'css/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js'
    	resource url:'css/global/plugins/jquery.blockui.min.js'
    	resource url:'css/global/plugins/jquery.cokie.min.js'
    	resource url:'css/global/plugins/uniform/jquery.uniform.min.js'
    	resource url:'css/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js'
    }

    page_level_plugins{
    	dependsOn 'core_plugins'
    	resource url:'css/global/plugins/jquery-validation/js/jquery.validate.min.js'
    	resource url:'css/global/plugins/backstretch/jquery.backstretch.min.js'
    	resource url:'css/global/plugins/select2/select2.min.js'
    }

    page_level_scripts{
    	dependsOn 'core_plugins'
    	resource url:'css/global/scripts/metronic.js'
		resource url:'css/admin/layout/scripts/layout.js'
		resource url:'css/admin/layout/scripts/quick-sidebar.js' 
		resource url: 'css/admin/pages/scripts/login-soft.js'
        resource url: 'js/jquery.hoverGrid.js'
    }

    dashboard_level_plugins{
    	dependsOn 'core_plugins'
    	resource url:'css/global/plugins/jqvmap/jqvmap/jquery.vmap.js'
		resource url:'css/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.russia.js'
		resource url:'css/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.world.js'
		resource url:'css/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.europe.js'
		resource url:'css/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.germany.js'
		resource url:'css/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.usa.js'
		resource url:'css/global/plugins/jqvmap/jqvmap/data/jquery.vmap.sampledata.js'
		resource url:'css/global/plugins/flot/jquery.flot.min.js'
		resource url:'css/global/plugins/flot/jquery.flot.resize.min.js'
		resource url:'css/global/plugins/flot/jquery.flot.categories.min.js'
		resource url:'css/global/plugins/jquery.pulsate.min.js'
		resource url:'css/global/plugins/bootstrap-daterangepicker/moment.min.js'
		resource url:'css/global/plugins/bootstrap-daterangepicker/daterangepicker.js'
		resource url:'css/global/plugins/fullcalendar/fullcalendar/fullcalendar.min.js'
		//resource url:'css/global/plugins/jquery-easypiechart/jquery.easypiechart.min.js'
		resource url:'css/global/plugins/jquery.sparkline.min.js'
		resource url:'css/global/plugins/gritter/js/jquery.gritter.js'
    }


    dashboard_level_scripts{
    	dependsOn 'core_plugins'
		resource url:'css/admin/pages/scripts/tasks.js'
    }

    dashboard_chart_plugin{
    	dependsOn 'core_plugins'
    	resource url:'js/Chart.js'
		resource url:'js/Chart.min.js'
		resource url:'js/CustomBarChart.js'
        resource url:'js/CustomPieChart.js'
        resource url:'js/jquery.jqplot.js'
        resource url:'js/jquery.jqplot.min.js'
        resource url:'js/jqplot.pieRenderer.js'
        resource url:'js/jqplot.pieRenderer.min.js'

    }

     table_managed_plugins{
        dependsOn 'core_plugins'
        resource url: 'css/global/plugins/select2/select2.min.js'
        resource url: 'css/global/plugins/datatables/media/js/jquery.dataTables.min.js'
        resource url: 'css/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.js'
        resource url: 'js/BrandsTableManaged.js'
        resource url: 'js/ChannelsTableManaged.js'
        resource url: 'js/ModalTableManaged.js'
        resource url: 'js/GradeTableManaged.js'
        resource url: 'js/AttachmentTableManaged.js'
        resource url: 'js/TeamTableManaged.js'
        resource url: 'js/CollectionsTableManaged.js'
        resource url: 'js/CollectionTeamTableManaged.js'
        resource url: 'js/UsersTableManaged.js'
        resource url: 'js/PermissionTableManaged.js'
        resource url: 'js/ReportTableManaged.js'
        resource url: 'js/ModelsTableManaged.js'
        resource url: 'js/ProductsTableManaged.js'
        resource url: 'js/CopyModelsTableManaged.js'
        resource url: 'js/ImportTableManaged.js'
        resource url: 'js/CopyVariantsTableManaged.js'
        resource url: 'js/CopyAttributesTableManaged.js'
    }

    form_level_scripts{
        dependsOn 'core_plugins'
        resource url: 'css/admin/pages/scripts/components-pickers.js' 
        resource url: 'css/global/plugins/bootstrap-fileinput/bootstrap-fileinput.js' 
        resource url: 'css/global/plugins/jquery-tags-input/jquery.tagsinput.min.js'
        resource url: 'js/jquery.mask.js'
        resource url: 'js/jquery.mask.min.js'
    }

    file_upload_scripts{
        dependsOn 'core_plugins'
        resource url: 'css/global/plugins/jquery-file-upload/js/vendor/jquery.ui.widget.js'
        resource url: 'css/global/plugins/jquery-file-upload/js/vendor/tmpl.min.js' 
        resource url: 'css/global/plugins/jquery-file-upload/js/vendor/load-image.min.js' 
        resource url: 'css/global/plugins/jquery-file-upload/js/vendor/canvas-to-blob.min.js' 
        resource url: 'css/global/plugins/jquery-file-upload/blueimp-gallery/jquery.blueimp-gallery.min.js' 
        resource url: 'css/global/plugins/jquery-file-upload/js/jquery.iframe-transport.js' 
        resource url: 'css/global/plugins/jquery-file-upload/js/jquery.fileupload.js' 
        resource url: 'css/global/plugins/jquery-file-upload/js/jquery.fileupload-process.js' 
        resource url: 'css/global/plugins/jquery-file-upload/js/jquery.fileupload-image.js'
        resource url: 'css/global/plugins/jquery-file-upload/js/jquery.fileupload-audio.js'
        resource url: 'css/global/plugins/jquery-file-upload/js/jquery.fileupload-video.js'
        resource url: 'css/global/plugins/jquery-file-upload/js/jquery.fileupload-validate.js'
        resource url: 'css/global/plugins/jquery-file-upload/js/jquery.fileupload-ui.js' 
        resource url: 'css/admin/pages/scripts/form-fileupload.js'
    } 

	/********** STYLES MODULES **********/
    global_level_css {
        resource "css/global/plugins/bootstrap/css/bootstrap.min.css"
        resource "css/global/plugins/bootstrap-datepicker/css/datepicker3.css"
        resource "css/global/plugins/font-awesome/css/font-awesome.min.css"
        resource "css/global/plugins/simple-line-icons/simple-line-icons.min.css"
        resource "css/global/plugins/uniform/css/uniform.default.css"
        resource "css/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"
        resource "css/global/plugins/bootstrap/css/bootstrap.min.css"


    }

    page_level_css {
    	dependsOn "global_level_css"
    	resource "css/global/plugins/select2/select2.css"
    	resource "css/admin/pages/css/login.css"
        resource "css/jquery.hoverGrid.css"
    }


    theme_level_css{
    	dependsOn "global_level_css"
    	resource "css/global/css/components.css"
    	resource "css/global/css/plugins.css"
    	resource "css/admin/layout/css/layout.css"
    	resource "css/admin/layout/css/themes/light.css"
    	resource "css/admin/layout/css/custom.css"
        resource "css/global/plugins/jquery-tags-input/jquery.tagsinput.css"
  
	}
    
    table_managed_css{
        dependsOn "global_level_css"
        resource "css/global/plugins/datatables/media/css/jquery.dataTables.css"

    }

    form_level_css{
        resource "css/global/plugins/bootstrap/css/bootstrap.min.css"
        resource "css/global/plugins/bootstrap-fileinput/bootstrap-fileinput.css"
        resource "css/global/plugins/fullcalendar/demos/cupertino/jquery-ui.min.css"
    }

    file_upload_css{
        resource "css/global/plugins/jquery-file-upload/css/jquery.fileupload.css"
        resource "css/global/plugins/jquery-file-upload/css/jquery.fileupload-ui.css"
        resource "css/global/plugins/bootstrap-fileinput/bootstrap-fileinput.css"
        resource "css/global/plugins/fullcalendar/demos/cupertino/jquery-ui.min.css" 
    }

    dashboard_level_css{
        resource "css/jquery.jqplot.css" 
    }


    custom_css{
        resource "css/custom.css"
    }
    

}


