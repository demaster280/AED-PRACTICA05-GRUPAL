package genericsort;
public class TestSortGenerico {
        public static <T> void showArray(T[] arr){
        for(T t : arr){
            System.out.print(t + " ");
        }
        System.out.println();
    }    
    public static void main(String[] args) {
        // Ejemplo de ordenamiento de un arreglo de enteros
        Integer[] arr1 = {3, 7, 1, 9, 2};
        System.out.println("Arreglo original: ");
        showArray(arr1);
        GenericSort.bubbleSort(arr1);
        System.out.println("Arreglo ordenado con BubbleSort: ");
        showArray(arr1);
        
        // Ejemplo de ordenamiento de un arreglo de Strings
        String[] arr2 = {"c", "d", "a", "f", "e", "b"};
        System.out.println("Arreglo original: ");
        showArray(arr2);
        GenericSort.insertionSort(arr2);
        System.out.println("Arreglo ordenado con InsertionSort: ");
        showArray(arr2);
        
    }
}