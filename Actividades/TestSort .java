package sort;
public class TestSort {
    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,3,2,7,1};
        //bubbleSort(arr);
        //insertionSort(arr);
        //selectionSort(arr);
        //shellSort(arr);
        quickSort(arr,1,3);
        showArray(arr);
    }

}