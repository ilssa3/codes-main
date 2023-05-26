package meowww;

import java.util.Scanner;

public class arr2dmethods {
	
	public static void minmax(int [][]arr) {
		Scanner sc = new Scanner(System.in);
	
		int min; int max;int sum = 0;
		
		max = arr[0][0];min = arr[0][0];
	
			for(int i = 0; i < arr.length; i++) { 
				for(int j = 0; j<arr.length;j++) {
					
				
					if(arr[i][j] > max) max = arr[i][j];
						if(arr[i][j] < min) min = arr[i][j];
					}	
			}
	System.out.println("Max value = " + max);
	System.out.println("Min value = " + min);
	System.out.println("Sum of min and max values = "+(min+max));
}


	
	//''''
	
	public static void averagepositivevalues(int [][]arr) {
		Scanner sc = new Scanner (System.in);		
		
		double av = 0;int count = 0;
		for (int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j<arr.length;j++) {
			
				if (arr[i][j]>0) {av=av+arr[i][j];count ++;};
			
			}
		}double average = av/count;System.out.println("Average - (+)values : "+average);
	}
	
	//'''
	
	public static void output(int [][]arr) {
		Scanner sc = new Scanner (System.in);		
		
		System.out.println("Array values in order: ");
				System.out.println();
		for (int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j<arr.length;j++) {
			
			System.out.println("arr["+i+"]["+j+"] = "+arr[i][j]);
			}
		}
	}
	
	//''
	
	public static void input(int [][]arr) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter array values in order: ");
				System.out.println();
		for (int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j<arr.length;j++) {
			
			System.out.print("arr["+i+"]["+j+"] = ");
			arr[i][j] = sc.nextInt();
			
			}
		}
	}
	
	//'

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter array length n*n =");
		int n = sc.nextInt();
		
		int [][]arr = new int[n][n];		
		System.out.println("---");
			input(arr);
		System.out.println("---");
			output(arr);
		System.out.println("---");
			averagepositivevalues (arr);
		System.out.println("---");
			minmax(arr);
	}

}
