package controle;
import java.util.ArrayList;

public class Produto {
	
	public ArrayList<String> productRankingList = new ArrayList<String>();
	
	public ArrayList<String> loadProductList(){
		productRankingList = new ArrayList<String>();
		for (int i = 0; i<=0; i++ ) {
		    productRankingList.add( " " + i);
		}
		return productRankingList;
	}
	
}
