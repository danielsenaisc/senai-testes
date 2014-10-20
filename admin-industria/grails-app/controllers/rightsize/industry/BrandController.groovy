package rightsize.industry

import controle.CanalController
import controle.MarcaController
import domain.Marca
import entidades.Canal
//import entidades.Marca


class BrandController {

	CanalController canalController = new CanalController();
	MarcaController marcaController = new MarcaController();
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
	
    def loadBrand(){
		Marca marca = new Marca();
		
		def defMarcas = new ArrayList();
				
		ArrayList<Marca> marcas = marca.list();
		
		for(i in 0..(marcas.size()-1))
		{
			def m = marcas.get(i);
			def c = 
			defMarcas.add(m);
		} 
		return defMarcas
    }

     def loadChannels(){
        
        def defCanais = new ArrayList();
		ArrayList<Canal> canais = canalController.selectAll();
		
        for ( i in 0..(canais.size()-1))
		 {
			def c = canais.get(i);
            defCanais.add(c);
        }
        return defCanais
    }
}
