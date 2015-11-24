/**
 * Created by jiahua on 15-11-17.
 */

public class MaxLongstr {
    static int minindex=0;
    static int maxindex=0;
    static int max=0;
    static int []dp=new int[11];
    static int []hash=new int[256];
    public static void main(String[] args) {
        char[] arr={'a','b','c','d','e','c','s','a','q','e'};
        fhash(arr,10);
        System.out.println();
        fdp(arr,10);
    }
    public static void fhash(char[]arr,int length){
        for(int i=0;i<length;i++){
            for(int k=0;k<256;k++){
                hash[k]=-1;
            }
            hash[arr[i]]=1;
            for (int j=i+1;j<length;j++){
                if(hash[arr[j]]==-1){
                    hash[arr[j]]=1;
                }else{
                    if(j-i>max){
                        max=j-i;
                        minindex=i;

                    }
                    break;
                }
            }
        }
        for(int i=minindex;i<minindex+max;i++){
            System.out.printf(arr[i]+" ");
        }
    }
    public static void fdp(char[]arr,int length){
        int last_start=0;
        //int current=0;
        for(int i=0;i<length;i++){
            hash[i]=-1;
        }
        hash[arr[0]]=0;
        dp[0]=1;
        for(int i=1;i<length;i++){
            if(hash[arr[i]]==-1){
                hash[arr[i]]=i;
                dp[i]=dp[i-1]+1;
            }else{
                if(last_start<=hash[arr[i]]){
                    dp[i]=i-hash[arr[i]];
                    last_start=hash[arr[i]]+1;
                    hash[arr[i]]=i;

                }else{
                    dp[i]=dp[i-1]+1;
                    hash[arr[i]]=i;
                }
            }
            if(dp[i]>max){
                max=dp[i];
                minindex=last_start;
            }
        }
        for (int i=minindex;i<max+minindex;i++){
            System.out.printf(arr[i]+" ");
        }
    }
}
