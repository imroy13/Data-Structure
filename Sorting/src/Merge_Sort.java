import java.util.Scanner;
public class Merge_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Merge_Sort.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static void mergeSort(int[] arr,int[] tempArray,int lowerIndex,int upperIndex) {
		if(lowerIndex>=upperIndex)
			return;
		int middleIndex = (lowerIndex + upperIndex)/2;
		mergeSort(arr,tempArray,lowerIndex,middleIndex);
		mergeSort(arr,tempArray,middleIndex+1,upperIndex);
		
		int lowerStart = lowerIndex;
		int lowerStop = middleIndex;
		int upperStart = middleIndex+1;
		int upperStop = upperIndex;
		int count = lowerIndex;
		while(lowerStart <= lowerStop && upperStart <= upperStop) {
			if(arr[lowerStart] < arr[upperStart])
				tempArray[count++] = arr[lowerStart++];
			else
				tempArray[count++] = arr[lowerStart++];
			
		}
		while(lowerStart <= lowerStop)
			tempArray[count++] = arr[lowerStart++];
		while(upperStart <= upperStop)
			tempArray[count++] = arr[upperStart++];
		for(int i = lowerIndex;i <= upperIndex;i++)
			arr[i] = tempArray[i];
		
	}
	
	static void sort(int[] arr) {
		int[] tempArray = new int[arr.length];
		Merge_Sort.mergeSort(arr,tempArray,0,arr.length-1);
	}

}
