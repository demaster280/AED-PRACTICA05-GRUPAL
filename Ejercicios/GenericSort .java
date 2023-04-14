
package genericsort;
public class GenericSort {      
    // Método de ordenamiento Bubble Sort genérico
    public static <T extends Comparable<T>> void bubbleSort (T a[]) {
        boolean fl=true;
        int pass = 0;
        int n = a.length;
        for (pass = 0; pass < n-1 && fl; pass++){
            fl = false;
            for (int j=0; j < n-pass-1; j++){
                if (a[j].compareTo(a[j+1]) > 0){
                    fl = true;
                    T aux = a[j];
                    a[j] = a[j+1];
                    a[j+1]=aux;
                    
                }
            }            
        }                      
    }

    // Método de ordenamiento Insertion Sort genérico
    public static <T extends Comparable<T>> void insertionSort (T a[]) {
        int i, j; 
        T aux;
        for (i = 1; i <a.length; i++){
            j=i;
            aux= a[i];
            while (j > 0 && aux.compareTo(a[j-1]) < 0){
                a[j] = a[j-1];
                j--;
            }
            a[j] = aux;        
        }             
    }
    
    // Método de ordenamiento Insertion Sort genérico
    public static <T extends Comparable<T>> void selectionSort(T a[]) {
        int min;
        for(int i=0; i<a.length-1; i++){
            min = i;
            for (int j = i+1; j<a.length; j++){
                if(a[j].compareTo(a[min]) < 0){
                    min = j;
                }
            }
            T aux = a[min];
            a[min] = a[i];
            a[i] = aux;
        }
    }
    
    // Método de ordenamiento Insertion Sort genérico
    public static <T extends Comparable<T>> void shellSort(T a[]) {        
        int interval=a.length/2;
        int i, j; 
        T aux;        
        while (interval > 0){
            for (i=interval; i<a.length;i++){
                j=i;
                aux = a[i];
                while ((j>=interval)&&(a[j-interval].compareTo(aux) > 0)){
                    a[j]=a[j-interval];
                    j = j - interval;                    
                }
                a[j] = aux;
            }
            interval = interval/2;
        }    
    }
    
    // Método de ordenamiento Quick Sort genérico
    public static <T extends Comparable<T>> void quickSort(T a[], int l, int r) {
        int i=l;
        int j = r;            
        T pivot = a[(l+r)/2];
        do{
            while (a[i].compareTo(pivot) < 0) i++;
            while (pivot.compareTo(a[j]) < 0) j--;
            if(i<=j){
                if (i != j){
                    T aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
                i++;
                j--;
            }
        }while(i<=j);
        if (l<j){
            quickSort(a,l,j);      
        }
        if (i < r){
            quickSort(a, i, r);
        }       
    }
    // Método de ordenamiento Merge Sort genérico
    public static <T extends Comparable<T>> void mergeSort(T a[], int l, int r) {
    if (l < r) {
        int m = (l + r) / 2;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);
        merge(a, l, m, r);
      }
    }
    private static <T extends Comparable<T>> void merge(T a[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        T[] L = (T[]) new Comparable[n1];
        T[] R = (T[]) new Comparable[n2];
        for (int i = 0; i < n1; i++)
            L[i] = a[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = a[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }
    public static <T extends Comparable<T>> void brickSort(T[] a) {
        int n = a.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < n - 1; i += 2) {
                if (a[i].compareTo(a[i+1]) > 0) {
                    T temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swapped = true;
                }
            }
            for (int i = 0; i < n - 1; i += 2) {
                if (a[i].compareTo(a[i+1]) > 0) {
                    T temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}

