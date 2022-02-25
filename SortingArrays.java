package assignments;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		int value = 1;
		
		
		
		for (int i = 0; i <= arr.length-1; i++) {
			
		
		if (arr[i] != i+value) {
			
			System.out.println(i+value);
			value ++;
			
			
		}	
		}
		
		

	}

}
