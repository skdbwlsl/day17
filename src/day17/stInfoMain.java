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
		
		//st 형태만 넣겠다는 의미라 st가 아닌 다른건 오류
		StInfo st = new StInfo();
		arr.add(st);
		//arr.add(s); 오류난다
*/
		
		while(true){
		System.out.println("1.등록 2.확인");
		int num = input.nextInt();
		switch (num) {
		case 1 : 
			StInfo s = new StInfo(); //통째로 이곳에 저장
			System.out.println("이름 입력");
			name= input.next();
			System.out.println("나이 입력");
			age = input.nextInt();
			
			s.setAge(age); s.setName(name);
			
			arr.add(s);
			System.out.println("등록 되었습니다");
			break;
		case 2 : 
			for(int i =0; i<arr.size();i++) {
				StInfo ss = arr.get(i);
				System.out.println("이름 : " +ss.getName());
				System.out.println("나이 : " +ss.getAge() );
				System.out.println("----------------------");
			}
			break;
		
		}
	}

}
}