import java.util.*;
class Triplets {

	public static void findTriplets(int[] arr, LinkedList<int []> ans) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length-2;) {
			if(arr[i+1] == arr[i]+1) {
				if(arr[i+2] == arr[i]+2) {
					int[] temp = {arr[i], arr[i+1], arr[i+2]}; 
					ans.add(temp);
					i++;
				}
				else
					i += 2;
			}
			else
				i++;
		}
	}

	public static void main(String[] args) {

		//demo test cases
		//int[] arr = {1,2,3,4,12,34,32,21,0,34,6,56,7,34,23,99,66,77,44,33,66,77,98,97};
		//int[] arr = {1,2,3,4,5,6,7,8,9};

		LinkedList<int[]> ans = new LinkedList<int[]>();		
		findTriplets(arr, ans);

		for(int[] str : ans) {
			System.out.println(Arrays.toString(str));
		}
	}
}