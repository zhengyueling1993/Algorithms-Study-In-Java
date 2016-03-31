/**
 * Created by yuelingzheng on 16/3/30.
 */
public class LSDSorting {
    public static void main(String[] a,int w){
        int N = a.length;
        int R = 256;
        String[] aux = new String[N];

        for(int d = w-1; d >= 0; d--){
            int[] count = new int[R + 1];
            for (int i = 0; i < N;i++)
                count[a[i].charAt(d) + 1]++;
            for (int r = 0; r < R; r++)     // Transform counts to indices.
                    count[r+1] += count[r];
            for (int i = 0; i < N; i++)     // Distribute.
                    aux[count[a[i].charAt(d)]++] = a[i];
            for (int i = 0; i < N; i++)     // Copy back.
                    a[i] = aux[i];
            }
        }

}
