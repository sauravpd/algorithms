package sampleCode.sorting.quicksort;

/**
 * QuickSortExample
 * @author saurav
 *
 */
public class QuickSortExample 
{
	public static void main(String[] args) 
	{
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		quickSort(intArray, 0, intArray.length);
		System.out.println("Array After Sorting : ");
		for (int i = 0; i < intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}
	}

	/**
	 * quickSort
	 * @param input
	 * @param start
	 * @param end
	 */
	public static void quickSort(int[] input, int start, int end) 
	{
		if (end - start < 2) 
		{
			return;
		}
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		for (int i = 0; i < input.length; i++) 
		{
			System.out.println(input[i]);
		}
		quickSort(input, pivotIndex + 1, end);
	}

	/**
	 * partition
	 * @param input
	 * @param start
	 * @param end
	 * @return
	 */
	public static int partition(int[] input, int start, int end) 
	{
		// This is using the first element as the pivot
		int pivot = input[start];
		int i = start;
		int j = end;
		while (i < j) 
		{
			// NOTE: empty loop body
			while (i < j && input[--j] >= pivot);
			if (i < j) {
				input[i] = input[j];
			}
			// NOTE: empty loop body
			while (i < j && input[++i] <= pivot);
			if (i < j) {
				input[j] = input[i];
			}
		}
		input[j] = pivot;
		return j;
	}
}
