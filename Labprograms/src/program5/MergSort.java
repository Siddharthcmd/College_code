package program5;

public class MergSort {
	public static void merge(int arr[], int low, int mid, int high) {
		int i = low, j = mid + 1, k = low;
		int c[] = new int[high];
		while (i <= mid && j <= high) {
			if (arr[i] < arr[j]) {
				c[k] = arr[i];
				i++;
				k++;
			} else {
				j++;
				k++;
			}
		}
		while (i <= mid) {
			c[k] = arr[i];
			i++;
			k++;
		}
		while (j <= high) {
			c[k] = arr[j];
			j++;
			k++;
		}
		for (i = low; i <= high; i++)
			arr[i] = c[i];
	}

	public static void msort(int arr[], int low, int high) {
		if (low == high) {
			return;
		}else {
			int mid = (low + high) / 2;
			msort(arr, low, mid);
			msort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 55, 2, 3, 9, 8, 6, 67, 1 };
		int high = arr.length;
		// System.out.println(arr.length);
		int low = 0;
		msort(arr, 1, high);

		for (int i = 0; i < high; i++) {
			System.out.println(arr[i]);
		}

	}

}
