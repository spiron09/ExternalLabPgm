import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    static void MS (int[] a, int l, int r){
        if(l<r) {
            int mid = (l + r)/2;
            MS(a,l,mid);
            MS(a,mid+1,r);
            Merge(a,l,r,mid);
        }
    }

    static void Merge(int[]a, int l, int r, int mid){
        int[] b = new int[a.length];
        int i = l;
        int j = mid+1;
        int k = l;
        while (i<=mid && j<= r){
            if(a[i] < a[j]){
                b[k] = a[i];
                i++;
            }
            else {
                b[k] = a[j];
                j++;
            }
            k++;
        }

        if(i>mid){
            while (j<=r){
                b[k] = a[j];
                k++;
                j++;
            }
        }
        else {
            while (i<=mid){
                b[k] = a[i];
                k++;
                i++;
            }

        }
        for (k = l; k<=r; k++) {
            a[k] = b[k];
        }
    }

    public static void main(String[] args) {
        int [] a = {5,6,4,2,1};
        MS(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
