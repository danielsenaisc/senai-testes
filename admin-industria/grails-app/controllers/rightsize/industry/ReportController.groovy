package rightsize.industry

class ReportController {

    def typeList = new ArrayList();
    def periodList = new ArrayList();
    def reportList = new ArrayList();
    def accessList = new ArrayList();
    def reportType = new String();

    def brandList = new ArrayList();
    def collectionList = new ArrayList();
    def productList = new ArrayList();
    def categoryList = new ArrayList();
    def subCategoryList = new ArrayList();

    def report_type = "Número de Comparações";
    def report_period = "Personalizado";
    def report_filter = "Nacional";
    def report_location = "Marca A, Marca B, Marca C...";
    def report_owner = "Janderson Araújo";
    def report_category = "Livre";
    def report_share = "Toda a Empresa";

    def LOREN_IPSUM = "Lorem ipsum"
	
    def index() { 
    	reportList = loadReportList();

        [reportList: reportList]
    }

    def edit() { 
    	typeList = loadTypeList();
    	periodList = loadPeriodList();
    	accessList = loadAccessList();
        productList = loadProductList();
        brandList = loadBrandList();
        collectionList = loadCollectionList();
        categoryList = loadCategoryList();
        subCategoryList = loadSubCategoryList();

        reportType = "Tipo do Relatório";

        [typeList: typeList, periodList: periodList, 
        accessList: accessList, reportType: reportType,
        productList: productList,
        brandList: brandList,
        collectionList: collectionList,
        categoryList: categoryList,
        subCategoryList: subCategoryList]
    }

    def view() { 

        [report_type: report_type,
         report_period: report_period,
         report_filter: report_filter,
         report_location: report_location,
         report_owner: report_owner,
         report_share: report_share,
         report_category: report_category]

    	
    }

    def loadTypeList(){
    	
    	typeList = new ArrayList();
		typeList.add("Número de Comparações");
        typeList.add("Número de Indicações Geral");
        typeList.add("Ranking marcas mais populares");
        typeList.add("Visualizações Gerais");

        return typeList
    }

    def loadPeriodList(){
    	
    	periodList = new ArrayList();
		periodList.add("Mês Atual");
        periodList.add("Mês Anterior");
        periodList.add("Todo o tempo");
        periodList.add("Personalizado");

        return periodList

    }

    def loadReportList(){
    	
    	reportList = new ArrayList();
    	for ( i in 0..15 ) {
		    reportList.add(LOREN_IPSUM + " " + i);
		}
		return reportList
    }

    def loadAccessList(){
    	
    	accessList = new ArrayList();
		accessList.add("Privado");
        accessList.add("Compartilhado");
		
		return accessList
    }
     def loadProductList(){
        
        productList = new ArrayList();
        productList.add("Calça Jeans");
        productList.add("Jaqueta de Couro");
        productList.add("Camiseta Regata");
        productList.add("Pólo Masculina");
        return productList
    }

    def loadBrandList(){
        
        brandList = new ArrayList();
        brandList.add("Levis");
        brandList.add("Hering");
        brandList.add("Ralph Lauren");
        brandList.add("Aleatory");
        return brandList
    }

    def loadCollectionList(){
        
        collectionList = new ArrayList();
        collectionList.add("Outono Inverno");
        collectionList.add("Verão");
        collectionList.add("Moda Praia");
        return collectionList
    }

     def loadCategoryList(){
        
        categoryList = new ArrayList();
        categoryList.add("Categoria A");
        categoryList.add("Categoria B");
        categoryList.add("Categoria C");

        return categoryList
    }

    def loadSubCategoryList(){
        
        subCategoryList = new ArrayList();
        for ( i in 0..4 ) {
            subCategoryList.add(LOREN_IPSUM + " " + i);
        }
        return subCategoryList
    }
}
