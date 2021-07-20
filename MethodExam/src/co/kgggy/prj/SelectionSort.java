package co.kgggy.prj;

public class SelectionSort {
//선택정렬.
	private int[] arr = { 5, 2, 4, 1, 3 };

	public void selectSort() { //전통적 선택소트.
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // asc sort 작은수에서 큰수로. //asc < desc
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int n : arr) {
			System.out.print(n + " : ");
		}
	}

	public void selectSort2() {  //진화된 선택소트.
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		} // sort end
		for (int n : arr) {
			System.out.print(n + " : ");
		}
	} // method end
}

// <알고리즘 공부> scratch
// buble, quick sort
//factorial => 재귀함수 --- 구현하기 쉽지만 수가 크면 stack을 많이 써서 처리과정이 길어짐.(가장 느림)
// 반복함수(for문) 
// 순차함수 --- 처리속도 빠르지만 다 적어줘야함.

//자료구조 --- FIFO 구조, stack구조(put, pop)