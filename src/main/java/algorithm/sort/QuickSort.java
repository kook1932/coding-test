package algorithm.sort;

public class QuickSort {

	public static void quickSort(int[] arr) {
		quickSortHelper(arr, 0, arr.length - 1);
	}

	private static void quickSortHelper(int[] arr, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(arr, left, right);
			quickSortHelper(arr, left, pivotIndex - 1);
			quickSortHelper(arr, pivotIndex + 1, right);
		}
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left - 1;

		for (int j = left; j < right; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, right);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};

		System.out.println("정렬되기 전 배열: ");
		printArray(arr);

		quickSort(arr);

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
