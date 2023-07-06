import java.util.*;

public class Main{
    public static void main(String[] args) {
        // İki dizi oluşturma ve rastgele elemanlarla doldurma
        int[] array1 = generateRandomArray(10);
        int[] array2 = generateRandomArray(10);

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        // Ortak elemanları bulma
        List<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements: " + commonElements);

        // Array1'de olup Array2'de olmayan elemanları bulma
        List<Integer> uniqueToFirst = findUniqueElements(array1, array2);
        System.out.println("Unique elements in Array1: " + uniqueToFirst);

        // Array2'de olup Array1'de olmayan elemanları bulma
        List<Integer> uniqueToSecond = findUniqueElements(array2, array1);
        System.out.println("Unique elements in Array2: " + uniqueToSecond);
    }

    // Rastgele elemanlarla doldurulmuş bir dizi oluşturma
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // 0 ile 99 arasında rastgele sayılar
        }
        return array;
    }

    // İki dizideki ortak elemanları bulma
    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        List<Integer> commonElements = new ArrayList<>();
        for (int num : array1) {
            if (contains(array2, num) && !commonElements.contains(num)) {
                commonElements.add(num);
            }
        }
        return commonElements;
    }

    // İlk dizide bulunan, ikinci dizide olmayan elemanları bulma
    public static List<Integer> findUniqueElements(int[] array1, int[] array2) {
        List<Integer> uniqueElements = new ArrayList<>();
        for (int num : array1) {
            if (!contains(array2, num) && !uniqueElements.contains(num)) {
                uniqueElements.add(num);
            }
        }
        return uniqueElements;
    }

    // Bir dizinin belirli bir elemanı içerip içermediğini kontrol etme
    public static boolean contains(int[] array, int num) {
        for (int element : array) {
            if (element == num) {
                return true;
            }
        }
        return false;
    }
}
