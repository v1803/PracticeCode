public class Main
{
	public static void main(String[] args) {
	    String s ="07:05:45PM";
    // Write your code here
    String a[] = s.split(":");
    if(a[2].contains("PM")){
        if(!a[0].equals("12")){
            a[0]=""+(Integer.parseInt(a[0])+12);
        }
    }else{
        if(a[0].equals("12")){
            a[0]="00";
        }
    }
    System.out.println( a[0]+":"+a[1]+":"+a[2].substring(0,2));
    
	}
}