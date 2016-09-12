package ua.epam;

/**
 * Created by supervisor on 11.09.2016.
 */
public class SortAlg {


    public static int[] createArray(int n) {
        int[] arr;
        arr = new int[n];

        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int)(Math.random()*100+1);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println();
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] SelectionSort(int[] arr)
    {
        int k;
        int[] result = new int[arr.length];
        System.arraycopy( arr, 0, result, 0, arr.length );
        for (int i=0; i<result.length; i++)
        {
            k=i;
            for(int j=i+1; j<result.length; j++)
            {
                if (result[j]<result[k]) {k=j;}
            }
            Exchange(i,k,result);
        }
        return result;
    }

    public static int[] ShellSort(int[] arr)
    {
        int h, i, j;
        int[] result = new int[arr.length];
        System.arraycopy( arr, 0, result, 0, arr.length );
        for (h = result.length/2 ; h > 0 ; h = h/2)
        {
            for (i = 0; i < result.length - h; i++)
            {
                for (j = i; j >= 0; j = j - h)
                {
                    if (result[j] > result[j + h])
                    {
                        Exchange(j, j + h, result);
                    }
                    else
                    {
                        j = 0;
                    }
                }
            }
        }
        return result;
    }

    public static int[] BubbleSort(int[] arr)
    {
        int[] result = new int[arr.length];
        System.arraycopy( arr, 0, result, 0, arr.length );
        for (int i=0; i<result.length; i++)
        {
            for(int j=i+1; j<result.length; j++)
            {
                if(result[i]>result[j])
                {
                    Exchange(i,j,result);
                }
            }
        }
        return result;
    }

    public static int[] InsertSort(int[] arr)
    {
        int[] result = new int[arr.length];
        System.arraycopy( arr, 0, result, 0, arr.length);
        int k, j;
        for (int i=1; i<result.length; i++)
        {
            k = result[i];
            j = i-1;
            while ((j>=0) && (k<result[j]))
            {
                result[j+1] = result[j];
                j--;
            }
            result[j+1] = k;

        }
        return result;
    }


    public void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }

    private int partition(int arr[], int left, int right)
    {
        int i = left, j = right;
        int pivot = arr[(left + right) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                Exchange(i,j,arr);
                i++;
                j--;
            }
        }
        return i;
    }

    private static void Exchange(int i, int j, int[] x)
    {
        int tmp;
        tmp = x[i];
        x[i] = x[j];
        x[j] = tmp;
    }

}

