package Sorting;

import java.util.Random;

/**
 * This class contains methods used for checking 
 * sorting algorithm
 * @author quangvu
 *
 */
public class testSorting {
	
	public void testing(Sort method) {
		int length = 0;
		long start = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			int[] arr = generate();
			length += arr.length;
			method.sort(arr);
			if (!check(arr)) {
				System.out.println("Has error!");
				for (int element: arr)
					System.out.print( element + " ");
				System.out.println();
				return;
			}
			
		}
		long end = System.nanoTime();
		long elapsedTime = end - start;
		System.out.println("average time " + elapsedTime/length);
	}
	
	/**
	 * Genrate random array for checking
	 * @return 
	 */
	public int[] generate() {
		Random rand = new Random();
		int[] newArray = new int[20];
		for (int i = 0; i < 20; i++) {
			newArray[i] = rand.nextInt(10000);
		}
		return newArray;
	}
	
	/**
	 * Check if an array is sorted or not
	 * @param array
	 * @return
	 */
	public boolean check(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i+1]) {
				return false;
			} 
		}
		return true;
	}
}
