package rightsize.industry

class CollectionController {

    def LOREN_IPSUM = "Lorem ipsum";

    def collectionList = new ArrayList();
    def statusList = new ArrayList();
    def userList = new ArrayList();
    def attachmentsList = new ArrayList();
    def brandList = new ArrayList();
	
    def index() { 
    	collectionList = loadCollection();

        [collectionList: collectionList]
    }


    def edit() { 
        statusList = loadStatus();
        userList = loadUser();
        attachmentsList = loadAttachments();
        brandList = loadBrands();
    	
        [statusList: statusList, userList: userList, attachmentsList: attachmentsList, brandList: brandList]

    }

    def create() { 
    	redirect(controller:"collection", action:"edit");
    }

    private

    def loadCollection(){
    	
    	collectionList = new ArrayList();
    	for ( i in 0..15 ) {
		    collectionList.add(LOREN_IPSUM + " " + i);
		}
		return collectionList
    }

     def loadBrands(){
        
        brandList = new ArrayList();
        for ( i in 0..15 ) {
            brandList.add(LOREN_IPSUM + " " + i);
        }
        return brandList
    }

    def loadStatus(){
        
        statusList = new ArrayList();
        
        statusList.add("Pré-Lançamento");
        statusList.add("Ativa");
        statusList.add("Inativa");
        statusList.add("Expirada");
        
        return statusList
    }

    def loadUser(){
        
        userList = new ArrayList();
        userList.add("Janderson Araújo");
        userList.add("Juraci Riberio");
        userList.add("Claudinei da Silva");
        userList.add("Janderson Araújo");
        userList.add("Juraci Riberio");
        userList.add("Claudinei da Silva");
       
        return userList
    }

    def loadAttachments(){
        
        attachmentsList = new ArrayList();
        
        for ( i in 0..2 ) {
            attachmentsList.add(LOREN_IPSUM + " " + i);
        }
        return attachmentsList
        
    }
}
