import java.util.Arrays;

/**
 * Created by jiahua on 15-11-19.
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] a={5,4,2,1,55,6,22,77,44,63,3};//11
        heapSort(a,11);
        System.out.println(Arrays.toString(a));
    }
    public static void heapAdjust(int[]a,int size,int i){
        int leftChild=2*i+1;
        int rightChild=2*i+2;
        int max=i;
        if(i<=size/2){
            if(leftChild<size&&a[leftChild]>a[max]){
                max=leftChild;
            }
            if(rightChild<size&&a[rightChild]>a[max]){
                max=rightChild;
            }
            if(max!=i){
                a[i]=a[max]^a[i];
                a[max]=a[i]^a[max];
                a[i]=a[i]^a[max];
                heapAdjust(a,size,max);
            }
        }
    }
    public static void builHeap(int[]a,int size){
        if(a==null||size<1){
            return;
        }
        for(int i=size/2;i>=0;i--){
            heapAdjust(a,size,i);
        }
    }
    public static void heapSort(int[]a,int size){
        if(a==null||size<1){
            return;
        }
        builHeap(a,size);
        for(int i=size-1;i>0;i--){
            a[0]=a[0]^a[i];
            a[i]=a[0]^a[i];
            a[0]=a[0]^a[i];
            heapAdjust(a,i-1,0);
        }
    }
}
