import java.util.*;
class Stairs {

	public static void countStairs(int n, int[] ways, int index) {
		if(n < 0)
			return;
		else if(n == 0) {
			printWays(ways, index);
			return;
		}
		else {
			if(n >= 1) {
				ways[index++] = 1;
				countStairs((n-1), ways, index);
				--index;
				if(n >= 2) {
					ways[index++] = 2;
					countStairs((n-2), ways, index);
				}
			}
		}
	}

	public static void printWays(int[] ways, int index) {
		System.out.print("[");
		for(int i = 0; i < index; i++) {
			if(i == 0)
				System.out.print(ways[i]);
			else
				System.out.print("," + ways[i]);
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] ways = new int[5];
		//size of rray should be equal to 'n' i.e. top os stairs
		//because max storage we need when we jump only 1 step 
		countStairs(5, ways, 0);
	}
}