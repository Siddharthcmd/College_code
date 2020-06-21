package program3b;

public class Multiple {
	public static void mul(int n) {
		if (n > 1) {
			mul(n - 1);
			System.out.println(n);
			mul(n - 1);
			System.out.println(n);
		}

	}

	public static void main(String[] args) {
		int n = 3;
		mul(n);
	}

}

public static void merge(int arr[], int low, int mid, int high) {

	int l = mid - low + 1;
	int r = high - mid;

	int LeftArray[] = new int[l];
	int RightArray[] = new int[r];

	for (int i = 0; i < l; ++i)
		LeftArray[i] = arr[low + i];

	for (int j = 0; j < r; ++j)
		RightArray[j] = arr[mid + 1 + j];

	int i = 0, j = 0;
	int k = low;
	while (i < l && j < r) {
		if (LeftArray[i] <= RightArray[j]) {
			arr[k] = LeftArray[i];
			i++;
		} else {
			arr[k] = RightArray[j];
			j++;
		}
		k++;
	}
	while (i < l) {
		arr[k] = LeftArray[i];
		i++;
		k++;
	}

	while (j < r) {
		arr[k] = RightArray[j];
		j++;
		k++;
	}
}
