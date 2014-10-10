package rightsize.industry

class BrandController {

    def brandList = new ArrayList();
    def channelList = new ArrayList();
    def ageList = 4..80
    

    def LOREN_IPSUM = "Lorem ipsum"
	
    def index() { 
    	brandList = loadBrand();

        [brandList: brandList]
    }

    def edit() { 
    	channelList = loadChannels();

        [channelList: channelList, ageList: ageList]
    }

    def create() { 
    	redirect(controller:"brand", action:"edit");
    }

    private

    def loadBrand(){
    	
    	brandList = new ArrayList();
    	for ( i in 0..15 ) {
		    brandList.add(LOREN_IPSUM + " " + i);
		}
		return brandList
    }

     def loadChannels(){
        
        channelList = new ArrayList();
        for ( i in 0..3 ) {
            channelList.add(LOREN_IPSUM + " " + i);
        }
        return channelList
    }
}
