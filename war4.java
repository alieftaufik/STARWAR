package starwar;
import java.util.Scanner;

public class war4 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("INPUT");
			int in = sc.nextInt();
			System.out.println("OUTPUT");
			String awal = "O";

			for (int i = 0; i < in; i++) {
				if (awal == "O") {
					System.out.print("X ");
					awal = "X";
				} else {
					System.out.print("O ");
					awal = "O";
				}
			}
	}
}
