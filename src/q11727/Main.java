package q11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int n;
	static int[] memo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		memo = new int[n + 1];

		memo[1] = 1;
		if (n >= 2)
			memo[2] = 3;

		for (int i = 3; i <= n; i++) {
			memo[i] = (memo[i - 1] + 2 * memo[i - 2]) % 10007;
		}

		System.out.println(memo[n]);
	}
}