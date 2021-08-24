package day17;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();//String만 받겠다
		ArrayList arr01 = new ArrayList();
		/*
		 기존방식. 이러면 데이터가 10000개일 경우 일처리가 복잡해진다
		arr.add("test");
		arr.add(1111);
		arr.add(1.222);
		arr.add('a');
		*/
		
		//자료형을 부여하지않으면 add.했을때 모든 오브젝트가 나오기 때문에 부여한다.
		arr.add("aaa");
		//arr.add(111);이러면 오류난다 String이 아니라서
		arr.add("111");
		String s = arr.get(0) + "문자열 연산입니다";
	
		
		/*
		오류지만 에시이기 때문에 남겨놓음
		double s = arr.get(3) + 1.111; //오류가 발생한다
		*/
		
	}

}
