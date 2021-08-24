package day17;

import java.util.ArrayList;
import java.util.HashMap;

class Test{
		private String test;
		private int aaa;//���ο� Ÿ�� �ְ������ set,get�ҷ�����
		
		public int getAaa() {
			return aaa;
		}
		public void setAaa(int aaa) {
			this.aaa = aaa;
		}
		public void setTest(String test) {
			this.test = test;
		}
		public String getTest() {
			return test;
		}
		public void display() {
			System.out.println(test+aaa+"test 기능 입니다");
		}
	}
public class Ex04 {

	public static void main(String[] args) {
		ArrayList<Test> tArr = new ArrayList<Test>();//Test���¸� ������ �ȴ�.��, test��ü�� ���� ���⿡ �ִ� �����鸸 ������ �ִ°�
		Test t = new Test();//test��ü�� �������Ѵ�
		t.setTest("���ڿ�");
		t.setAaa(124456);
	//	tArr.add("���ڿ�");test�� �ȵ��� ����
		
		tArr.add(t);//0��°�� ������ �Ǵ°� 
		
		Test a = tArr.get(0);//�ٷ� ���ڵ尡 ����
		a.display();
		
		
		
		
		HashMap<String, Test>map = new HashMap<String, Test>();
		map.put("111", t);
		t = new Test();
		t.setTest("�ȳ��ϼ���");
		map.put("hello", t); //hello�� t�� ���°�
		//Test tt = map.get("111");
		//tt.display();
		map.get("111").display();//�� 2���� ���ٷ� ��Ÿ����
		System.out.println(map.get("111").getTest());
		System.out.println(map.get("hello").getTest());
//���������Ҷ� �й��� Ű("111"���⿡ ���°�
	}

}
