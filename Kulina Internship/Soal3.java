import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		System.out.println("This program will decompose a number for each of its hudredth, tenth, etc");
		System.out.print("Number = ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n < 0) {
			System.out.println("number is negative");
		} else if (n == 0) {
			System.out.println("0");
		} else {
			cetak(n, "");
		}
	}

	public static void cetak(int n, String zeroes) {
		if (n != 0) {
			cetak(n/10, zeroes + "0");
			System.out.println(n%10 + zeroes);
		}
	}
}