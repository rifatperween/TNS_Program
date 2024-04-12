package secondDay;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=20;
      if(a>10) {
    	  System.out.println("A is greater");
      }
      else {
        System.out.println("A is smaller");
      }
      for(int i=0;i<=50;i+=2) {
    	
    	 System.out.println(i); 
      }
//    	  using function 
          int num=6;
    	  boolean isPrime = checkPrime(num);
    	  if (isPrime) {
              System.out.println(num + " is a prime number.");
          } else {
              System.out.println(num + " is not a prime number.");
          }
    	
//    	 without using function 
    	  int n=49;
    	  boolean Prime=true;
    	  for(int i=2;i<n;i++) {
    		  if(n%i==0) {
    			Prime =false;
    			break;
    		  }
    	  }
    		  System.out.println(Prime);
    	  }
      
	
      
      public static boolean checkPrime(int num) {
      if(num<=1) {
    	  return false;
      }
      for(int i=2;i<=Math.sqrt(num);i++) {
    	  if(num%i==0) {
    		  return false;
    	  }
      }
      return true;
	}
}

