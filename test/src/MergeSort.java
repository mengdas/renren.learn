import java.util.Arrays;

/**
 * Created by jiahua on 15-11-23.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1, 22, 31, 14, 54, 222, 613, 11, 34, 234, 52, 9};//12
        mergesort(a,0,11);
        System.out.println(Arrays.toString(a));
    }
    public static void mergesort(int[]a,int le,int ri){
        if(a==null||le>=ri){
            return;
        }else{
            int mid=(le+ri)/2;
            mergesort(a,le,mid);
            mergesort(a,mid+1,ri);
            merge(a,le,mid,ri);
//            System.out.println(Arrays.toString(a));
        }
    }
    public static void merge(int[]a,int le,int cen,int ri){
        int[]temp=new int[ri-le+1];
        int k=0,i=le,j=cen+1;
        while(i<=cen&&j<=ri){
            if(a[i]<a[j]){
                temp[k++]=a[i++];
            }else{
                temp[k++]=a[j++];
            }
        }
        while(i<=cen){
            temp[k++]=a[i++];
        }
        while(j<=ri){
            temp[k++]=a[j++];
        }
        for(i=0;i<ri-le+1;i++){
            a[i+le]=temp[i];
        }
    }
}
