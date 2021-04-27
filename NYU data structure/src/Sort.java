import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Sort {
	
  static int partition(int arr[], int low, int high, int pivot_index) {
    if (high == low) {
      return pivot_index;
    }
    int pivot = arr[pivot_index]; 
    swap(arr, pivot_index, high);

    int j = low; 
    for (int i = low; i < high; i++) {
      if (arr[i] < pivot) {
        swap(arr, i, j);
        j += 1;
      }
    }
    swap(arr, j, high);
    return j;
  }

  static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void quickSort(int[] arr, int low, int high) {

    /*
       (1) select a random pivot
       (2) partition across that pivot - [ (left arr), {pivot}, (right arr) ]
       (3) sort (left arr) and (right arr) - recursively
    */
    // base case
    if (low >= high)
      return;
    // (1)
    Random rand = new Random();
    int random_index = low + rand.nextInt(high - low + 1);
    // (2)
    int pivot_index = partition(arr, low, high, random_index);
    // (3)
    quickSort(arr, low, pivot_index - 1);
    quickSort(arr, pivot_index + 1, high);
  }

  static int quickSelect(int arr[], int low, int high, int k) {
    if (k <= 0)
      return Integer.MAX_VALUE;
  
    int size = high - low;
    if (k <= size + 1) {
      
      Random rand = new Random();
      int random_index = low + rand.nextInt(high - low + 1);
      int pivot_index = partition(arr, low, high, random_index);

      
      if (k - 1 == pivot_index - low)
        return arr[pivot_index];
      
      if (k - 1 < pivot_index - low)
        return quickSelect(arr, low, pivot_index - 1, k);

      return quickSelect(arr, pivot_index + 1, high,
                         k - (pivot_index - low + 1));
    }

    return Integer.MIN_VALUE;
  }

  public static void main(String[] args) {
	  int[] test = {7, 4, 8, 3, 9, 2, 10, 1};
      int pivot_index = 1; //so we pivot around value 4
      pivot_index = partition(test, 0, test.length - 1, pivot_index);
      System.out.println("Testing partition, pivot_index correctly placed at index: " + pivot_index);
      for(int num : test) {
          System.out.print(num + ",");
      }
      System.out.println("\n");

      // Make copy of array since we don't want QuickSelect to work on already sorted
      // test after QuickSort!
      int[] test2 = Arrays.copyOf(test, test.length);

      // Testing QuickSort
      quickSort(test, 0, test.length - 1);
      System.out.println("After QuickSort:");
      for(int num : test) {
          System.out.print(num + ",");
      }
      System.out.println("\n");

      // Testing QuickSelect
      int second_smallest = quickSelect(test2, 0, test2.length - 1, 2);
      System.out.println("Second Smallest Element: " + second_smallest + "\n");





      // Testing QuickSelect and QuickSort runtimes on large inputs
      int n = 10000001;
      int[] arr = new int[n];

      Random rand = new Random();
      rand.setSeed(System.currentTimeMillis());
      for (int i=0; i<n; i++) {
          arr[i] = rand.nextInt(n) + 1;
      }

      // Make copy of array since we don't want QuickSelect to work on already sorted
      // arr after QuickSort!
      int[] arr2 = Arrays.copyOf(arr, arr.length);

      // Naive way to get kth smallest number: sort array and get the kth index
      int k = arr.length / 2;
      long startTime = System.nanoTime();
      quickSort(arr, 0, arr.length - 1);
      // Arrays.sort(arr2); // uncomment this line if you  want to compare to Java's official sort
      int kth_smallest = arr[k-1];
      long endTime = System.nanoTime();
      double duration = (endTime - startTime) / 1000000000.0;  //divide by 1000000000 to get seconds.

      System.out.println(k + "th smallest number: " + kth_smallest);
      System.out.println("Running Time of QuickSort and Select: " + duration + "\n");


      // Select kth smallest number from arr using quick select
      startTime = System.nanoTime();
      kth_smallest = quickSelect(arr2, 0, arr2.length - 1, k);
      endTime = System.nanoTime();
      duration = (endTime - startTime) / 1000000000.0;

      System.out.println(k + "th smallest number: " + kth_smallest);
      System.out.println("Running Time of QuickSelect:     " + duration + "\n");

		  }
}