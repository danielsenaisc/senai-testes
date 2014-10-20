package rightsize.industry

class TeamController {

    def teamList = new ArrayList();
    def channelList = new ArrayList();
    def ageList = 4..80
    

    def LOREN_IPSUM = "Lorem ipsum"
	
    def index() { 
    	teamList = loadTeam();

        [teamList: teamList]
    }

    def edit() { 
    	channelList = loadChannels();

        [channelList: channelList, ageList: ageList]
    }

    def create() { 
    	redirect(controller:"team", action:"edit");
    }

    private loadTeam(){
    	
    	teamList = new ArrayList();
    	for ( i in 0..15 ) {
		    teamList.add(LOREN_IPSUM + " " + i);
		}
		return teamList
    }

    private loadChannels(){
        
        channelList = new ArrayList();
        for ( i in 0..3 ) {
            channelList.add(LOREN_IPSUM + " " + i);
        }
        return channelList
    }
}
