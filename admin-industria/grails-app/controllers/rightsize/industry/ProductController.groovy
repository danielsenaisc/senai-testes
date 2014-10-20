package rightsize.industry

class ProductController {

	def productList = new ArrayList();
    def gradeList = new ArrayList();
    def variantList = new ArrayList();
    def attrlist = new ArrayList();

    def LOREN_IPSUM = "Lorem ipsum"
	
    def index() { 
    	productList = loadProduct();

        [productList: productList]
    }

    def edit() { 
        gradeList = loadGrade();
        variantList = loadVariant();
        productList = loadProduct();
        attrlist = loadAttribs();

        [gradeList: gradeList, variantList: variantList, 
        productList: productList, 
        attachmentList:[ "/css/global/plugins/jcrop/demos/demo_files/image1.jpg",
                        "/css/global/plugins/jcrop/demos/demo_files/image1.jpg"],
        attrlist: attrlist]
    }

     def create() { 
       redirect(controller:"product", action:"edit");
    }

    private loadProduct(){
    	
    	productList = new ArrayList();
    	for ( i in 0..15 ) {
		    productList.add(LOREN_IPSUM);
		}
		return productList
    }

    private loadGrade(){
        
        gradeList = new ArrayList();
        for ( i in 0..5 ) {
            gradeList.add(getRamdon());
        }
        return gradeList
    }

    private loadVariant(){

        variantList = new ArrayList();
        for ( i in 0..9 ) {
            variantList.add(getRamdon());
        }
        return variantList

    }

     private loadAttribs(){

        attrlist = new ArrayList();
        attrlist.add("Tipo de Lavagem");
        attrlist.add("Trama");
        attrlist.add("Pedrarias");
        attrlist.add("Bordado");
        attrlist.add("Tecnologias");
        attrlist.add("Nano Partículas");
        attrlist.add("Alergria");

        return attrlist

    }

    private getRamdon(){
        return Math.abs(new Random().nextInt() % 500 + 1)
    }
}
