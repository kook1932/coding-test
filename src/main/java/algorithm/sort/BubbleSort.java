package algorithm.sort;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped){
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("정렬되기 전 배열: ");
		printArray(arr);

		bubbleSort(arr);

		System.out.println("\n정렬된 배열: ");
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}


}
