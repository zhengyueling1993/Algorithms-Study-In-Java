/**
 * Created by yuelingzheng on 16/3/23.
 */
public class ShellSort {
    private static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static boolean less(Comparable v,Comparable w) {
        return v.compareTo(w) < 0;
    }
    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while(h < N/3)
            h = 3*h + 1;
        while(h >= 1){
            for (int i = h; i < N;i++){
                for (int j = i;j >= h && less(a[j], a[j-h]); j -= h)
                    exch(a, j, j-h);
            }
            h = h/3;
        }
    }
}
