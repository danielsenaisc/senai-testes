package rightsize.industry

class ImportController {

    def productList = [];
	def summaryList = [];
	def LOREN_IPSUM = "Lorem ipsum"

    def index() { }

    def edit() { 


    	def paramDate = "30/08/2014 as 14:46h";
    	def paramFileSize = getRamdon();
    	def paramCode = getRamdon();
    	summaryList = loadSummaryList();
        productList = loadProductList();


    	[paramDate: paramDate,
    	 paramFileSize: paramFileSize,
    	 paramCode: paramCode,
    	 summaryList: summaryList,
         productList: productList
    	]

    }

    private loadProductList(){
        
        productList = new ArrayList();
        for ( i in 0..4 ) {
            productList.add(LOREN_IPSUM);
        }
        return productList
    }

    private loadSummaryList(){
    	
    	summaryList = new ArrayList();
    	for ( i in 0..4 ) {
		    summaryList.add(LOREN_IPSUM);
		}
		return summaryList
    }

    private getRamdon(){
        return Math.abs(new Random().nextInt() % 500 + 1)
    }
}
