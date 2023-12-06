package level2;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingTest2 {
	public static void main(String[] args) {

		int []A = {1, 2};
		int []B = {3, 4};
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int answer = 0;
		for (int i = 0; i < A.length; i++) {
			System.out.println("A : "  + A[i]);
			System.out.println("B : " + B[A.length -i - 1]);
			
			answer += A[i] * B[A.length - i - 1];
		}

		
		System.out.println(answer);
	}
}
