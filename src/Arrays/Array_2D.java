package Arrays;

public class Array_2D {

	public static void main(String[] args) {
		int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9}
                      };
		System.out.println("Sum of all elemnts in an Array: "+ArraySum(arr));
		System.out.println("-------------------------------");
		RowSum(arr);
		System.out.println("-------------------------------");
		Colomn(arr);
		System.out.println("-------------------------------");
		System.out.println("Min Val in Array is: "+MinElentinArray(arr));
		System.out.println("-------------------------------"); 
		System.out.println("Max Val in Array is: "+MaxElentinArray(arr));

	}

	 public  static int MaxElentinArray(int[][] arr) {
		 int maxElement = arr[0][0];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(maxElement < arr[i][j]) {
						maxElement = arr[i][j];
					}
				}
			}
			
		
		return maxElement;
	}

	 public static int MinElentinArray(int[][] arr) {
		int minElement = arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(minElement > arr[i][j]) {
					minElement = arr[i][j];
				}
			}
		}
		return minElement;
	}

	 public static void Colomn(int[][] arr) {
		int sum=0;
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr[j].length;i++) {
				sum +=arr[i][j];
			}
			System.out.println("Sum of elements in a Colomn "+(j+1)+": "+sum);
		}
		
	}

	 public  static void RowSum(int[][] arr) {
		 int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum +=arr[i][j];
			}
			System.out.println("Sum of elemnts in a Row "+(i+1)+": "+sum);
		}
		
	}

	 static int ArraySum(int[][] arr) {
		int sum=0;
		for(int i=0;i < arr.length; i++) {
			
			for(int j=0;j<arr[i].length; j++) {
				sum +=arr[i][j];
			}
		   
		}
	 return sum;
	}

}
