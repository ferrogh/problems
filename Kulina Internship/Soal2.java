import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		int[] fib = new int[1000005];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}

		System.out.println("This program will print the n-th number in Fibonacci sequence in range 1 - 1000000");
		System.out.print("n = ");
		Scanner input = new Scanner(System.in);
		int n =  input.nextInt();
		if (n < 0 || n > fib.length) {
			System.out.println("The index is out of range");
		} else {
			System.out.println("The " + n + "-th fibonacci is " + fib[n]);
		}
	}
}