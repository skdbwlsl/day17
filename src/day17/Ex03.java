package day17;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();//String�� �ްڴ�
		ArrayList arr01 = new ArrayList();
		/*
		 �������. �̷��� �����Ͱ� 10000���� ��� ��ó���� ����������
		arr.add("test");
		arr.add(1111);
		arr.add(1.222);
		arr.add('a');
		*/
		
		//�ڷ����� �ο����������� add.������ ��� ������Ʈ�� ������ ������ �ο��Ѵ�.
		arr.add("aaa");
		//arr.add(111);�̷��� �������� String�� �ƴ϶�
		arr.add("111");
		String s = arr.get(0) + "���ڿ� �����Դϴ�";
	
		
		/*
		�������� �����̱� ������ ���ܳ���
		double s = arr.get(3) + 1.111; //������ �߻��Ѵ�
		*/
		
	}

}
