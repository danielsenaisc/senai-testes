package rightsize.industry

import controle.ModelagemController;
import entidades.Modelagem

class ModelingController {

	ModelagemController modelagemController = new ModelagemController();
    def modelList = new ArrayList();
    

    def LOREN_IPSUM = "Lorem ipsum"
	
    def index() { 
    	modelList = loadModels();

        [modelList: modelList]
    }

    def edit() { 
        [gradeList:[]]
    	
    }

    def create() { 
    	redirect(controller:"modeling", action:"edit");
    }

    def loadModels(){
    	
    	def defModelagens = new ArrayList();		
		ArrayList<Modelagem> modelagens = modelagemController.selectAll();
		
		for(i in 0..(modelagens.size()-1))
		{
			def m = modelagens.get(i);
			defModelagens.add(m);
		} 
		return defModelagens
    }
}
