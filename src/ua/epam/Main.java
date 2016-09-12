package ua.epam;

public class Main {

    public static void main(String[] args) {
        int n =10;
        SortAlg sort = new SortAlg();
        int[] array1 = sort.createArray(n);
        sort.printArray(array1);
        int[] sortarray = sort.SelectionSort(array1);
        sort.printArray(sortarray);
        sortarray = sort.ShellSort(array1);
        sort.printArray(sortarray);
        sortarray = sort.BubbleSort(array1);
        sort.printArray(sortarray);
        sortarray = sort.InsertSort(array1);
        sort.printArray(sortarray);
        sort.quickSort(array1, 0, array1.length-1);
        sort.printArray(array1);

        // write your code here
    }
}