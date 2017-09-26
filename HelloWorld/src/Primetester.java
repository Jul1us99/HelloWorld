
public class Primetester {
	 
	public static void main(String[] args) {
	
	
	int n= 7;
	boolean prim = true;
	int i = 2;
	

	  if (n == 1) {
	    prim = false;
	  }
	  else{
	    while (i <= n-1 && prim == true) {
	      if (n%i==0) {
	        prim = false;
	      }
	     
	      i = i+1;
	    }
	  }
	  System.out.println(prim);

   }
}