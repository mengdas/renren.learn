import java.io.*;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by jiahua on 15-11-13.
 */
public class QuickSort {
    public static int max = 10000000;

    public static void main(String[] args) throws Exception {
//        int[] a={2,3,5,7,1,43,44,6,211};
//        quickSort(a,0,8);
//        System.out.println(Arrays.toString(a));
//        int[]b=new int[max];
        Random random = new Random();
//        for (int i=0;i<max;i++){
//            b[i]=random.nextInt() ;
//        }
//        long starttime=System.currentTimeMillis();
//        quickSort(b,0,max-1);
//        long endtime=System.currentTimeMillis();
//        System.out.println(endtime-starttime);
        File file = new File("java.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file.getName());
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < max; i++) {
            bufferedWriter.write(Integer.toString(random.nextInt(100000)) + "\n");
//            bufferedWriter.write(random.nextInt());
        }
        bufferedWriter.close();

        System.out.println("done");
//        FileReader fileReader=new FileReader(file.getName());
//        BufferedReader bufferedReader=new BufferedReader(fileReader);

        Reader reader = null;
        reader = new InputStreamReader(new FileInputStream(file));
        LineNumberReader lineNumberReader=new LineNumberReader(reader);
        int[] k = new int[max+1];
        String temp;
        int s=0;
        long starttime=System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            if((temp=lineNumberReader.readLine())!=null){
                s=(int)Integer.valueOf(temp);
                k[i]=s;
            }

            //System.out.print(k[i] + " ");
        }


        long endtime=System.currentTimeMillis();
        System.out.println(endtime-starttime);
    }

    public static void quickSort(int[] a, int l, int r) {
        if (a == null || l > r) {
            return;
        }
        int begin = l;
        int end = r;
        int temp = a[begin];
        while (begin < end) {
            while (begin < end && temp < a[end]) {
                end--;
            }
            a[begin] = a[end];
            while (begin < end && temp > a[begin]) {
                begin++;
            }

            a[end] = a[begin];
        }
        a[begin] = temp;
        quickSort(a, l, begin - 1);
        quickSort(a, begin + 1, r);
    }
}
