import java.util.*;
class Prime {
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Starting range : ");
	    int low = scan.nextInt();
	    System.out.println("Enter End value : ");
	    int high = scan.nextInt();
	     
	    for(int n = low; n <= high; n++)
	    {
	       int count1 = 0;
	        for(int div = 2; div * div <= n; div++)
	        {
	            if(n % div == 0)
	            {
	                count1 ++;
	                break;
	            }
	        }
	         if(count1 == 0)
	    {
	        System.out.println(n);
	    }
	    }
	   
		
	}
}