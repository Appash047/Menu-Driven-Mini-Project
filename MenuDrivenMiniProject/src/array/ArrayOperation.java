package array;

public class ArrayOperation {
	public int[] insert(int a[], int new_el, int pos) {
		if (pos <= 0 || pos > a.length + 1) {
			System.out.println("Insertion not posible");
			return a;
		} else {
			int res[] = new int[a.length + 1];
			for (int i = 0, j = 0; i < res.length; i++) {
				if (i == pos - 1) {
					res[i] = new_el;
				} else {
					res[i] = a[j++];
				}
			}
			return res;
		}
	}

	public int[] delete(int a[], int d) {
		int ind = search(a, d);
		if (ind == -1) {
			System.out.println("Deletion not posible");
			return a;
		} else {
			int res[] = new int[a.length - 1];
			for (int i = 1, j = 0; i < a.length; i++) {
				if (i != ind) {
					res[j++] = a[i];
				}
			}
			return res;
		}
	}

	public void update(int a[], int ele, int re) {
		if (search(a, re) == -1) {
			System.out.println("Updation not possible");
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == re) {
					a[i] = ele;
				}
			}
		}
	}

	public void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length - i; j++) {
				if (a[j - 1] < a[j]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public int search(int a[], int e) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == e) {
				return i;

			}
		}
		return -1;
	}

	public int min(int a[]) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public int max(int a[]) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public void display(int a[]) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public int[] reverse(int a[]) {
		int rev[] = new int[a.length];
		for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			rev[i] = a[j];
		}
		return rev;
	}

	public boolean isEmpty(int a[]) {
		return a.length == 0;
	}
}
