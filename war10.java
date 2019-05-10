package starwar;
import java.util.Scanner;

public class war10 {
		    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	         System.out.println("INPUT");
	         int in =sc.nextInt();
	         System.out.println("OUTPUT");
	            for(int i=0; i<in; i++) 
	            {
	                for(int j=1; j<=i; j++)
	                {
	                    System.out.print("  ");
	                }
	            {
	                for(int j =0; j<in - i; j++){
	                    System.out.print("X ");
	                }
	                System.out.println( );
	                }       
	         }     
	    }                            	             
}



