import java.util.Arrays;

/**
 * Created by jiahua on 15-11-19.
 */
public class Shell {
    public static int max=10000000;
    public static void main(String[] args) {
        int[] a = {1, 22, 31, 14, 54, 222, 613, 11, 34, 234, 52, 9};//12
        shellSort(a,12);
        System.out.println(Arrays.toString(a));
        int[]b=new int[max];
        for(int i=0;i<max;i++){
            b[i]=max-i-1;
        }
        long startTime=System.currentTimeMillis();
        shellSort(b, max);

        //
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

    public static void shellSort(int[] a, int n) {
        int d = n / 2;
        while (d >= 1) {
            for(int i=d;i<n;i++){
                int temp=a[i];
                int j;
                for( j=i;j>=d;j-=d){
                    if(temp<a[j-d]){
                        a[j]=a[j-d];
                    }else{
                        break;
                    }
                }
                a[j]=temp;

            }
            d = d / 2;
        }
    }
}
