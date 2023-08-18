package arrayprograms;

public class PrintArray {
	public void printArray(int arr[]) {
		System.out.println("Array contents are");
		for(int j:arr) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("print the array in reverse direction");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
		
	}

	

	}


