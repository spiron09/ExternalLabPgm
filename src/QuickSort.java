import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class QuickSort {

    static void swap(int []a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void QS(int[] a, int l, int h){
        if(l<h){
            int pivot = Partition(a,l,h);
            QS(a,l,pivot-1);
            QS(a,pivot+1,h);
        }
    }

    static int Partition(int[] a , int l, int h){
        int pivot = a[l];
        int i = l;
        int j = h;
        while(i<j){
            while(a[i] <= pivot) i++;
            while(a[j] > pivot) j--;
            if(i<j){
                swap(a,i,j);
            }
        }
        swap(a,j,l);
        return j;
    }


    public static void main(String[] args) {
        int [] a = {5,6,4,2,1};
        QS(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
