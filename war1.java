import java.util.Scanner;

public class war1 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("INPUT");
		int batas = a.nextInt();
		for (int i = 0; i < batas+2; i++) {
			
				int sisa = (i) % 2;
				if (sisa == 0) {
					System.out.print("OUTPUT");
					System.out.print(i+" ");
				}
			}
	}
}
