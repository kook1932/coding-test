package algorithm.search;

public class BinarySearch {
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
 			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 12, 16, 18, 23, 28, 32, 35 };
		int target = 18;

		int result = binarySearch(arr, target);
		if (result != -1) {
			System.out.println("찾는 값 " + target + "은(는) 인덱스 " + result + "에 있습니다.");
		} else {
			System.out.println("찾는 값 " + target + "을(를) 찾을 수 없습니다.");
		}
	}
}
