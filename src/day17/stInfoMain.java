package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class stInfoMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<StInfo> arr = new ArrayList<StInfo>();
		String name;
		int age;
		
		
		
		/*
	    ArrayList<String> str = new ArrayList<String>();
		String s = "Test";
		str.add(s);
		
		//st ���¸� �ְڴٴ� �ǹ̶� st�� �ƴ� �ٸ��� ����
		StInfo st = new StInfo();
		arr.add(st);
		//arr.add(s); ��������
*/
		
		while(true){
		System.out.println("1.��� 2.Ȯ��");
		int num = input.nextInt();
		switch (num) {
		case 1 : 
			StInfo s = new StInfo(); //��°�� �̰��� ����
			System.out.println("�̸� �Է�");
			name= input.next();
			System.out.println("���� �Է�");
			age = input.nextInt();
			
			s.setAge(age); s.setName(name);
			
			arr.add(s);
			System.out.println("��� �Ǿ����ϴ�");
			break;
		case 2 : 
			for(int i =0; i<arr.size();i++) {
				StInfo ss = arr.get(i);
				System.out.println("�̸� : " +ss.getName());
				System.out.println("���� : " +ss.getAge() );
				System.out.println("----------------------");
			}
			break;
		
		}
	}

}
}