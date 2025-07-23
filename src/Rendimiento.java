import static searching.Searching.*;
import static sorting.Sorting.*;

public class Rendimiento {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};
        int[] limits = {1000, 10000, 100000};

        System.out.println("===== COMPARACIÓN DE RENDIMIENTO =====\n");

        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            int limit = limits[i];

            System.out.println("Prueba " + (i+1) + "\n");

            // Generar array aleatorios
            int[] original = GenerateData.randomArray(size, limit);

            // --- BÚSQUEDA SECUENCIAL ---
            int[] copySequential = original.clone();
            int target = copySequential[copySequential.length / 2]; // valor seguro
            long start = System.nanoTime();
            int indexSequential = sequentialSearch(copySequential, target);
            long end = System.nanoTime();
            System.out.println("Búsqueda Secuencial: " + (end - start) + " ns");
            System.out.println("Índice encontrado: " + indexSequential + "\n");

            // --- BÚSQUEDA BINARIA ---
            int[] copyBinary = original.clone();
            bubbleSort(copyBinary);
            start = System.nanoTime();
            int indexBinary = binarySearch(copyBinary, target);
            end = System.nanoTime();
            System.out.println("Búsqueda Binaria: " + (end - start) + " ns");
            System.out.println("Índice encontrado: " + indexBinary + "\n");

            // --- BUBBLE SEARCH ---
            int[] copyBubble = original.clone();
            start = System.nanoTime();
            bubbleSort(copyBubble);
            end = System.nanoTime();
            System.out.println("Ordenamiento Burbuja: " + (end - start) + " ns");

            // --- SELECTION SORT ---
            int[] copySelection = original.clone();
            start = System.nanoTime();
            selectionSort(copySelection);
            end = System.nanoTime();
            System.out.println("Ordenamiento Selección: " + (end - start) + " ns");

            // --- INSERTION SORT ---
            int[] copyInsertion = original.clone();
            start = System.nanoTime();
            insertionSort(copyInsertion);
            end = System.nanoTime();
            System.out.println("Ordenamiento Inserción: " + (end - start) + " ns");

            System.out.println();
        }
    }
}
