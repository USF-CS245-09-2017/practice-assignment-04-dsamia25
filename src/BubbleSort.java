public class BubbleSort implements SortingAlgorithm {

    public void sort(int[] a) {
        bubbleSort(a);
    }

    public void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    public void swap(int[] a, int x, int y) {
        int temp = a[y];
        a[y] = a[x];
        a[x] = temp;
    }
}
