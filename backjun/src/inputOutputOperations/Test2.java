package inputOutputOperations;

import java.util.Scanner;

public class Test2 {
	 public static void main(String[] args) {
//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		 ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//		 ù° �ٿ� A+B�� ����Ѵ�.
		 Scanner sc = new Scanner(System.in);
		 int a = 0;
		 int b = 0;
		 
		 System.out.print("���� A : ");
		 a = sc.nextInt();
		 
		 System.out.print("���� B : ");
		 b = sc.nextInt();
		 
		 System.out.println(a + " + " + b + " = " + (a + b));
		 
		 sc.close();
	 }
}
