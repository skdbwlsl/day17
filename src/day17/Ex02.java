package day17;
//���׸� : �ڷ����� ���������� �ο��ϴ� ��

class Print02<T>{//<T>�� �ڷ����� �ǹ��Ѵ�.���ϴ� �ڷ����� �ο�
	public void test(T n1, T n2) {//�̷��ԵŸ� �ؿ��� <Interger>���� �̰ž��ٰ� �޾���
		System.out.println(n1 +","+n2);
		System.out.println(n1.getClass());//n1������ ���¸� �˾ƺ��°�
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Print02<Double> dou = new Print02<Double>();
		dou.test(1.11, 2.222);
		Print02<String> str = new Print02<String>(); //<String>���� ���ڴ� Ŭ�����̱� ������ �빮�ڷ� ����
		str.test("aa","bb");
		Print02<Integer> in = new Print02<Integer>(); //<Ŭ���� �ڷ���>�� ���� �׷��� ����.�׷��� int(�Ϲ��ڷ���)�� Ŭ����Ÿ������ �ٲ���Ѵ�
		in.test(10,20);
	}

}
