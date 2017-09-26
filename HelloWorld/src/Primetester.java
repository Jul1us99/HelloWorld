
public class Primetester {
	 
	public static void main(String[] args) {
	
		
    System.out.println(isPrime(4));

	}
	
	
private static boolean isPrime(int n){
	
	boolean prime = true;
	int i = 2;
	

	  if (n == 1) {
	    prime = false;
	  }
	  else{
	    while (i <= n-1 && prime == true) {
	      if (n%i==0) {
	        prime = false;
	      }
	     
	      i = i+1;
	    }
	 
	  }
	  
	  return prime;
	  
	}
  }