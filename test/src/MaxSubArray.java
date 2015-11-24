/**
 * Created by jiahua on 15-11-19.
 * 最大子序的和
 */

public class MaxSubArray {
    public static int max=10000000;
    public static void main(String[] args) {
        int[]a={-2,11,-4,13,-5,2};
        System.out.println(findMaxSub(a, a.length));
        int[]b=new  int[max];
        long stime=System.currentTimeMillis();
        System.out.println(findMaxSub(b,max));
        long etime=System.currentTimeMillis();
        System.out.println(etime-stime);
        System.out.println(pow(2,10));
    }
    public static int findMaxSub(int[]a,int n){
        int max=0;
        int sub=0;
        for(int i=0;i<n;i++){
            sub=sub+a[i];
            if(sub<0){
                sub=0;
            }
            if(sub>max){
                max=sub;
            }
        }
        return max;

    }
    public static int pow(int x,int n){
        if(x==1){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n%2==0){
            return pow(x*x,n/2);
        }else{
            return pow(x*x,n/2)*x;
        }
    }
}
