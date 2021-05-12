package Sorting;

/**
 * This selection sort run in O(n^2)
 * @author quangvu
 *
 */
public class SelectionSort extends Sort {
	public static void main(String args[]) {
		testSorting test = new testSorting();
		test.testing(new SelectionSort());
	}
	
	public void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			array[index] = array[i];
			array[i] = min;
		}
	}
}
