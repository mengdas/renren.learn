/**
 * Created by jiahua on 15-11-16.
 */
public class PrintMatrix {
    public static void main(String[] args) {
        int[][]a={{1,2,8,9,10},{2,4,9,12,14},{4,7,10,13,17},{6,8,11,15,19}};
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //print(a,4,4);
        System.out.println();
        //fprint(a,4,4);
        bfprint(a,4,5);
    }
    public static void print(int[][]a,int m,int n){

        int[]t=new int[n];
        int minindex=-1;
        int min=1000;
        for(int k=0;k<n*m;k++){
            min=1000;
            for(int i=0;i<n;i++){
                if(t[i]<m&&a[i][t[i]]<min){
                    min=a[i][t[i]];
                    minindex=i;
                }

            }
            t[minindex]++;
            System.out.print(min+" ");
        }

    }
    public static void fprint(int [][]a,int m,int n){
        for(int k=0;k<2*n-1;k++){
            int sum=k;
            for(int j=0;j<m;j++){
                int i=sum-j;
                if(isvalue(i,m)&&isvalue(j,n)){
                    System.out.print(a[i][j]+" ");
                }else{

                   // break;
                }
            }System.out.println();
        }

    }
    public static void bfprint(int[][]a,int m,int n){
        for(int k=0;k<2*n;k++){
            int diff=k-n+1;
            for(int i=0;i<m;i++){
                int j=i-diff;
                if(isvalue(i,n)&&isvalue(j,n)){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static boolean isvalue(int i,int n){
        if(i>=0&&i<n){
            return true;
        }
        return false;
    }
}
