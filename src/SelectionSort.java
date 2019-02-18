public class SelectionSort implements SortingAlgorithm {

    public static void main(String[] args){
        SelectionSort s = new SelectionSort();
        int[] test = {1,5,2,3,4};
        s.sort(test);
        System.out.println(test[0]);
        System.out.println(test[1]);
        System.out.println(test[2]);
        System.out.println(test[3]);
        System.out.println(test[4]);


    }

    public void sort(int[] a) {
        selectionSort(a);
    }

    public void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int smallest = i;
            for (int j = i; j < a.length; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            swap(a, smallest, i);
        }
    }

    public void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
