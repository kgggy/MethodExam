package co.kgggy.prj;

public class Calculator {
	public int sum(int a, int b) {
		return a + b;
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void sub(float f, int b) { // 함수 오버로딩.(동일한 함수명으로 전달인자/전달인자 갯수/리턴타입만 바꿔 사용)
		System.out.println(f - b);
	}

	public long sub(long l, long m) {
		return l - m;
	}
}
