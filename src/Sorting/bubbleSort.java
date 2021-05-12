package Sorting;

/**
 * This bubbleSort has runtime: O(n^2)
 * @author quangvu
 *
 */
public class bubbleSort extends Sort{
	public static void main(String[] args) {
		testSorting test = new testSorting();
		test.testing(new bubbleSort());
	}
	
	/**
	 * This is where the array is sorted
	 * @param array
	 */
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j+1] < array[j]) {
					int temp = array[j];
					array[j] = array[j+ 1];
					array[j+1] = temp;
				}
			}
		}
	}
	
}
