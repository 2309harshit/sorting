package sorting;
import java.util.*;

public class newsort {
	
	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                   
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	

	public static void main(String[] args) {
         
		BubbleSort b = new BubbleSort();
        int arr[]= {10,20,35,2,5,9,6};
        b.bubbleSort(arr);
        System.out.println("Sorted array");
        b.printArray(arr);

	}

}
