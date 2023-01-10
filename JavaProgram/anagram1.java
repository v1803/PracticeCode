import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String x="Binary";
	    String y="bRaiNY";
	    x = x.replace(" ","");
	    y = y.replace(" ","");
	    x = x.toLowerCase();
	    y = y.toLowerCase();
	    System.out.println(x);
	    char[] a = x.toCharArray();
	    char[] b = y.toCharArray();
	    Arrays.sort(a);
	    Arrays.sort(b);
	    Boolean result = Arrays.equals(a,b);
	    if(result == true)
	    {
	       System.out.println("Anagram"); 
	    }
	    else{
	        System.out.println("Not Anagram");
	    }
	}
}
