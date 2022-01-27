package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		
	int[] array = {1,2,3,4,6,8,7};
	Arrays.sort(array);
	for (int j = 0; j < array.length; j++) {
		System.out.println(array[j]);
	}
	System.out.println();
	for (int i = array[0]; i < array.length; i++) {
		if(i != array[i - 1]) {
			System.out.println("Missing element in the array is " + i);
			break;
		}
	}
	}
}

