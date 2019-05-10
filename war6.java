package starwar;
import java.util.Scanner;

public class war6 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("INPUT");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("OUTPUT");
			String awal = "O";

			for (int i = 0; i < b; i++) {
				if (awal == "O") {
					System.out.print("X ");
					awal = "X";
				} else {
					System.out.println("O ");
					awal = "O";
				}
			}
			for (int i = 0; i < b; i++) {
				if (awal == "X") {
					System.out.print("O ");
					awal = "O";
				} else {
					System.out.print("X ");
					awal = "X";
				}
			}
	}
}
