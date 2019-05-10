package starwar;
import java.util.Scanner;

public class war2 {
	
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

			System.out.println("INPUT");
			System.out.print("Panjang : ");
			double p = input.nextDouble();
			System.out.print("Lebar : ");
			double l = input.nextDouble();

			double  luas = p * l;
			double keliling = 2*(p + l);
			
			System.out.println("OUTPUT");
			System.out.println(" Luas : " + luas);
			System.out.println(" Keliling : " + keliling);

		}
}

