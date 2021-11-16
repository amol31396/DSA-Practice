import java.util.Arrays;
class SortingAlgo{
	
	void bubbleSort(int[] arr){
		boolean isSwapped; 
		for(int i=0;i<arr.length-1;i++){
			isSwapped=false;
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
				System.out.println(Arrays.toString(arr));
			}
			
			if(isSwapped==false)
				break;
		}
		System.out.println();
	}
	
	void insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
		System.out.println();
	}
	
	void selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		SortingAlgo obj=new SortingAlgo();
		int[] arr={3,1,5,2,6,4};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr)+"\n");
		
		/* Bubble Sort */
		System.out.print("After Sorting");
		obj.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		/* Insertion Sort */
		// System.out.print("After Sorting");
		// obj.insertionSort(arr);
		// System.out.println(Arrays.toString(arr));
		
		/* Selection Sort */
		// System.out.print("After Sorting");
		// obj.selectionSort(arr);
		// System.out.println(Arrays.toString(arr));
		
	}
}