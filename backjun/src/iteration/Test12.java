package iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test12 {
	public static void main(String[] args) throws IOException{
//		����
//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//		���
//		�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = "";
		
		while(true) {
			data = br.readLine();
			if(data == null || data.equals("")) {
				break;
			}
			String[] datas = data.split(" ");
			System.out.println(Integer.parseInt(datas[0]) + Integer.parseInt(datas[1]));
		}
		br.close();
	}
}
