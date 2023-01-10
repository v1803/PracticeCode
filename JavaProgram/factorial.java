import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int i,fact=1;
	     for(i=1;i<=a;i++){    
            fact=fact*i;    
        }    
	    System.out.println(fact);
	}
	 
}