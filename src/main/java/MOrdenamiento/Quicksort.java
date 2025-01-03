package MOrdenamiento;

public class Quicksort {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Encuentra el índice de partición
            int pi = partition(arr, low, high);

            // Ordena recursivamente los elementos antes y después de la partición
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // Selecciona el último elemento como pivote
        int pivot = arr[high];

        // Índice del elemento más pequeño
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor que el pivote
            if (arr[j] < pivot) {
                i++;

                // Intercambia arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambia arr[i+1] y arr[high] (el pivote)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Método auxiliar para imprimir el array
    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Método principal para probar el algoritmo
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original:");

        Quicksort qs = new Quicksort();
        qs.printArray(arr);

        qs.quickSort(arr, 0, arr.length - 1);

        System.out.println("Array ordenado:");
        qs.printArray(arr);
    }
}
