package rightsize.industry

class UserController {

    def userList = new ArrayList();
    def languageList = new ArrayList();
    def permissionList = new ArrayList();
    
    def LOREN_IPSUM = "Lorem ipsum"
	
    def index() { 
    	userList = loadUsers();

        [userList: userList]
    }

    def edit() { 
    	languageList = loadLanguages();
        permissionList = loadPermissions();

        [languageList: languageList, permissionList: permissionList]

    }

    def profile() { 
        languageList = loadLanguages();
        permissionList = loadPermissions();

        [languageList: languageList, permissionList: permissionList]

    }

    def create() { 
    	redirect(controller:"user", action:"edit");
    }

    def loadUsers(){
    	
    	userList = new ArrayList();
    	for ( i in 0..15 ) {
		    userList.add(LOREN_IPSUM + " " + i);
		}
		return userList
    }

    def loadLanguages(){
    	
    	languageList = new ArrayList();
    	
		languageList.add("Português");
		languageList.add("Ingles");
		languageList.add("Espanhol");

		return languageList
    }

    def loadPermissions(){
        
        permissionList = new ArrayList();
        
        permissionList.add("Marcas");
        permissionList.add("Modelagens");
        permissionList.add("Coleções");
        permissionList.add("Produtos - Cadastro");
        permissionList.add("Produtos - Modelagem");
        permissionList.add("Produtos - Variantes");
        permissionList.add("Produtos - Atributos");
        permissionList.add("Equipe");
        permissionList.add("Relatórios");
        permissionList.add("Indústria - Dados da Indústria");
        permissionList.add("Indústria - Usuários");
        permissionList.add("Indústria - Configurações");

        return permissionList
    }
    
}
