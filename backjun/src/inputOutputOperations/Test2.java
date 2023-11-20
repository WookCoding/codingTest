package inputOutputOperations;

import java.util.Scanner;

public class Test2 {
	 public static void main(String[] args) {
//		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//		 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//		 첫째 줄에 A+B를 출력한다.
		 Scanner sc = new Scanner(System.in);
		 int a = 0;
		 int b = 0;
		 
		 System.out.print("정수 A : ");
		 a = sc.nextInt();
		 
		 System.out.print("정수 B : ");
		 b = sc.nextInt();
		 
		 System.out.println(a + " + " + b + " = " + (a + b));
		 
		 sc.close();
	 }
}
