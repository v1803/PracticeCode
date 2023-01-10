public class Main
{
    public static void main(String[] args){
        String someString = "vvvvvvshsahgdjhgsjhad";
        char someChar = 'v';
        int count = 0;
 
        for (int i = 0; i < someString.length(); i++) 
           {
             if (someString.charAt(i) == someChar) 
                {
                count++;
                }
       }
        System.out.println("count is :"+ count);

    }
}