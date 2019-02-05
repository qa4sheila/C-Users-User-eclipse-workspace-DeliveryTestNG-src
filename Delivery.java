
public class Delivery {
	  int priceforDistance(int d) {
	        if (d < 10) {
	            return 10;
	        }
	        else if (d>10 ) {
	            return 25;
	        }
	        return -1;
	    }
	    
	    int priceforDistanceAndStairs(int d) {
	        if (d < 10) { return 20;}
	        
	       if (d > 10){
	       return 35;    }
	       
	       else { return 0; }

	   }
	        
}
