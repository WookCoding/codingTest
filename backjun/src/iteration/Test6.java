package iteration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test6 {
	public static void main(String[] args) throws IOException{
//		����
//		���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.
//
//		Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
//
//		���� �Է°� ��� ��Ʈ���� �����̹Ƿ�, �׽�Ʈ���̽��� ���� �Է¹޾Ƽ� ������ �� ���� ����� �ʿ�� ����. �׽�Ʈ���̽��� �ϳ� ���� �� �ϳ� ����ص� �ȴ�.
//
//		�ڼ��� ���� �� �ٸ� ����� ���� �� �ۿ� ����Ǿ� �ִ�.
//
//		�� ��α� �ۿ��� BOJ�� ��Ÿ ���� ���� ���� �� �� �ִ�.
//
//		�Է�
//		ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�. ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. A�� B�� 1 �̻�, 1,000 �����̴�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < count; i++) {
			String[] datas = br.readLine().split(" ");
			bw.write(Integer.parseInt(datas[0]) + Integer.parseInt(datas[1]) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}
