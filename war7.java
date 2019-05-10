package starwar;
import java.util.Scanner;

public class war7 {
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
		System.out.println("INPUT");
		int a = sc.nextInt();
		System.out.println("OUTPUT");
		for (int i = 0; i < a; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

}
