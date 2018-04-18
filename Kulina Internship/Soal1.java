import java.util.Scanner;
import java.util.ArrayList;

public class Soal1 {
	public static void main(String[] args) {
		boolean[] is_prime = new boolean[10005];
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 0; i < is_prime.length; i++) {
			is_prime[i] = true;
		}

		//
		// ** Sieve of Erastothenes **
		//
		is_prime[0] = false;
		is_prime[1] = false;
		for (int i = 2; i < is_prime.length; i++) {
			if (is_prime[i]) {
				primes.add(i);
			} else {
				continue;
			}
			for (int j = i*i; j < is_prime.length; j += i) {
				
				is_prime[j] = false;
			}
		}

		System.out.println("This program will print n-th prime number between 1 - 10000");
		System.out.print("n = ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n-1 < 0 || n-1 > primes.size()) {
			System.out.println("The prime number is outside 1 - 10000");
		} else {
			System.out.println("The " + n + "-th prime is " + primes.get(n-1));
		}
	}
}