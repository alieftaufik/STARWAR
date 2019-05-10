package starwar;
import java.util.Scanner;

public class war5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("OUTPUT");
		for (int i = 0; i <a;i++){
		for(int j=0;j<b;j++){
			System.out.print("X ");
		}
		System.out.println("");
		}	
	}
}
