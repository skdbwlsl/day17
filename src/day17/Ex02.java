package day17;
//제네릭 : 자료형을 가변적으로 부여하는 것

class Print02<T>{//<T>가 자료형을 의미한다.원하는 자료형을 부여
	public void test(T n1, T n2) {//이렇게돼면 밑에서 <Interger>쓰면 이거쓴다고 받아줌
		System.out.println(n1 +","+n2);
		System.out.println(n1.getClass());//n1에대한 형태를 알아보는것
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Print02<Double> dou = new Print02<Double>();
		dou.test(1.11, 2.222);
		Print02<String> str = new Print02<String>(); //<String>으로 쓰겠다 클래스이기 때문에 대문자로 들어간다
		str.test("aa","bb");
		Print02<Integer> in = new Print02<Integer>(); //<클래스 자료형>만 들어간다 그래서 오류.그래서 int(일반자료형)를 클래스타입으로 바꿔야한다
		in.test(10,20);
	}

}
