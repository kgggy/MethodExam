package co.kgggy.prj;

import java.util.Arrays;

import co.kgggy.exam1.IntMethod;
import co.kgggy.exam1.MethodTest;

public class TestMain {

	public static void main(String[] args) {
//		IntMethod intMethod = new IntMethod();
//		intMethod.sum();
//		
//		int n = intMethod.sub();
//		System.out.println(n);
//		
//		
//		MethodTest methodTest = new MethodTest();
//		String str = methodTest.strTest2();
//		System.out.println(str);
//		
//		System.out.println(methodTest.strTest2());
//		
//		
//		Calculator calculator = new Calculator();
//		int c = calculator.sum(10, 20);
//		System.out.println(c);
//		
//		calculator.sub(10.0f, 20); //작은타입이 큰타입에 포함됨(float>int)
		
		int[] arr2 = { 5, 2, 4, 1, 3 };
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectSort();
		System.out.println("====================");
		Arrays.sort(arr2);
		for(int n : arr2) {
			System.out.print(n + " : ");
		}
		
	}

}
