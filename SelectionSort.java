/**
 * Created by yuelingzheng on 16/3/23.
 */
public class SelectionSort {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N;i++){
            int min = i ;
            for(int j = i + 1;j < N; j++)
                if (less(a[j],a[min]))
                    min = j;
            exch(a,i,min);
        }
    }
    private static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }
}
