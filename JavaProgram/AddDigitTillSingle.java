import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int x = scan.nextInt();
	  int sum=0;
	  while(x>0 || sum>9)
	  {
	      if(x==0)
	      {
	         x=sum;
	         sum=0;
	      }
	    sum = sum+x%10;
	    x=x/10;
	  }
	  System.out.println(sum);
	}
}