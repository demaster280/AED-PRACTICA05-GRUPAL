    public static <T extends Comparable<T>> void shakerSort(T[] a) {
        int n = a.length;
        int left = 0;
        int right = n - 1;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            // Mover el mayor elemento de a[1..j] a a[j]
            for (int i = left; i < right; i++) {
                if (a[i].compareTo(a[i+1]) > 0) {
                    swap(a, i, i+1);
                    swapped = true;
                }
            }
            right--;
            // Mover el menor elemento de a[i..n] a a[i]
            for (int i = right; i > left; i--) {
                if (a[i].compareTo(a[i-1]) < 0) {
                    swap(a, i, i-1);
                    swapped = true;
                }
            }
            left++;
        }
    }
    private static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
} 
  