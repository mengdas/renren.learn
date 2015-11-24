/**
 * Created by jiahua on 15-11-17.
 */
public class ThreeSixAdd {
    static String str ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    protected int s=0;
    public static StringBuffer result=new StringBuffer("");
    public static void main(String[] args) {
        System.out.println(tenToThirtySix(36*17*36).reverse());
        System.out.println(thirtySixToTen("H00"));
        ThreeSixAdd a=new ThreeSixAdd();
        int k=a.s;
        System.out.println(thirtySixAdd("A00","B00"));

    }
    public static StringBuffer tenToThirtySix(int n){
        int flag=n/36;
        if(flag<1){
            flag=n%36;
            result.append(str.charAt(flag));

        }else{
            result.append(str.charAt(n%36));
            tenToThirtySix(n / 36);

        }
        return result;
    }
    public static int thirtySixToTen(String strs){
        int sum=0;
        for(int i=0;i<strs.length();i++) {
            sum = sum * 36 + str.indexOf(strs.charAt(i));
        }
        return sum;
    }
    public static String thirtySixAdd(String a,String b){
        result=new StringBuffer("");
        int sum=thirtySixToTen(a)+thirtySixToTen(b);
        return tenToThirtySix(sum).reverse().toString();
    }
}
