import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        HeapSort hs = new HeapSort();

        int array[] = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] =1 + r.nextInt(100);
            System.out.println("Desordenado: "+array[i]);
        }

        hs.heapSort(array);

        for (int i = 0; i < 100; i++) {
            System.out.println("Ordenado: "+array[i]);
        }
    }
}
