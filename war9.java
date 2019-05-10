package starwar;
import java.util.Scanner;
public class war9 {
	
		public static void main(String[] args) {
				Scanner Al = new Scanner (System. in);
				System.out.println("INPUT");
				int input = Al.nextInt( );
				System.out.println("OUTPUT");
				for(int i=0;i <input ; i ++) {
					for (int j=1; j <input -i; j++) {
							System.out.print(" ");
					}
					for(int  j=0; j <1+i ; j ++) {
							System.out.print("X");
					}
					System.out.println( );
				}
		}
}
