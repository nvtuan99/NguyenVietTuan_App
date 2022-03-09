import java.util.Scanner;

public class Bai2 {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Kiểm tra chẵn lẻ");
			System.out.print("Nhập n =  ");
			int n = input.nextInt();
			if (n % 2 == 0) {
				System.out.println("N = " + n + " Là số chẵn");
			} else {
				System.out.println("N = " + n + " Là số lẻ");
			}
		}
	}
}
