public class Main
{
	public static void main(String[] args) {
	    int[] x={1,2,3,4,5};
	    int[] y={4,5,3,2};
	   
	    for(int i = 0; i<x.length; i++){
	        for(int j =0; j<y.length; j++ ){
	 
	            if(x[i] == y[j]){
	              System.out.println(y[j]);
	            }
	        }
	    }
	   
	}
}