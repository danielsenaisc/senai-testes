package rightsize.industry

class DashboardController {

	def productRankingList = new ArrayList();
	def bestCollectionsList = new ArrayList();
    def alertList = new ArrayList();
	
	def brandCount = new Integer(0);
	def activeProductCount = new Integer(0);
	def inactiveProductCount = new Integer(0);
	def activeCollectionCount = new Integer(0);
	def inactiveCollectionCount = new Integer(0);
	def activeModelCount = new Integer(0);
	def inactiveModelCount = new Integer(0);	

    def LOREN_IPSUM = "Lorem ipsum"

    def index() { 

    	productRankingList = loadProductRanking();
    	bestCollectionsList = loadBestCollections();
        alertList = loadAlertList();

    	brandCount = getBrandCount();

    	activeProductCount = getActiveProductCount();
    	inactiveProductCount = getInactiveProductCount();

    	activeCollectionCount = getActiveCollectionCount();
    	inactiveCollectionCount = getInactiveCollectionCount();

    	activeModelCount = getActiveModelCount();
    	inactiveModelCount = getInactiveModelCount();

    	[productRankingList: productRankingList, 
    	 bestCollectionsList: bestCollectionsList,
         alertList: alertList,
    	 brandCount: brandCount,
    	 activeModelCount: activeModelCount,
    	 inactiveModelCount: inactiveModelCount,
    	 activeCollectionCount: activeCollectionCount,
    	 inactiveCollectionCount: inactiveCollectionCount,
    	 activeProductCount: activeProductCount,
    	 inactiveProductCount: inactiveProductCount
    	 ]

    }

    private

	
    def loadProductRanking(){
		    	
    	productRankingList = new ArrayList();
    	for ( i in 0..9 ) {
		    productRankingList.add(LOREN_IPSUM + " " + i);
		}
		return productRankingList
    }

    def loadBestCollections(){

    	bestCollectionsList = new ArrayList();
    	for ( i in 0..9 ) {
		    bestCollectionsList.add(LOREN_IPSUM + " " + i);
		}
		return bestCollectionsList
    }

    def loadAlertList(){

        alertList = new ArrayList();
        for ( i in 0..3 ) {
            alertList.add(LOREN_IPSUM + " " + i);
        }
        return alertList
    }

    def getBrandCount(){
    	return getRamdon();

    }

    def getActiveProductCount(){
    	return getRamdon();
    }

    def getInactiveProductCount(){
    	return getRamdon();
    }

    def getActiveCollectionCount(){
    	return getRamdon();
    }
    
    def getInactiveCollectionCount(){
    	return getRamdon();
    }

    def getActiveModelCount(){
    	return getRamdon();
    }
    
    def getInactiveModelCount(){
    	return getRamdon();
    }


    def getRamdon(){
    	return Math.abs(new Random().nextInt() % 500 + 1)
    }

}
