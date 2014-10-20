package rightsize.industry

class ConfigurationController {

    def LOREN_IPSUM = "Lorem ipsum"
    def languageList = [];

    def brandCount = new Integer(0);
    def collectionCount = new Integer(0);
    def productCount = new Integer(0);
    def variantCount = new Integer(0);
    def storageCount = new Integer(0);

    def viewCount = new Integer(0);
    def compareCount = new Integer(0);
    def indicationCount = new Integer(0);
    def userCount = new Integer(0);
    def trafficCount = new Integer(0);

	
    def index() { 
    	languageList = loadLanguages();

        brandCount = getRamdon();
        collectionCount = getRamdon();
        productCount = getRamdon();
        variantCount = getRamdon();
        storageCount = getRamdon();

        viewCount = getRamdon();
        compareCount = getRamdon();
        userCount = getRamdon();
        trafficCount = getRamdon();
        indicationCount = getRamdon();

    	[languageList: languageList,
         brandCount: brandCount,
         collectionCount: collectionCount,
         variantCount: variantCount,
         storageCount: storageCount,
         viewCount: viewCount,
         compareCount: compareCount,
         indicationCount: indicationCount,
         userCount: userCount,
         trafficCount: trafficCount,
         indicationCount: indicationCount,
         productCount: productCount ]
    	
    }

    def loadLanguages(){
        
        languageList = new ArrayList();
        for ( i in 0..3 ) {
            languageList.add(LOREN_IPSUM + " " + i);
        }
        return languageList
    }

    def getRamdon(){
        return Math.abs(new Random().nextInt() % 500 + 1)
    }


}
