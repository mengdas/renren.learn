/**
 * Created by jiahua on 15-11-13.
 */
public class HanoiTower {
    public static void main(String[] args) {
        moveDish(3,'A','C','B');
        HanoiTower.ss();
    }
    public static void moveDish(int level,char from,char to,char inter){
        if(level==0){
            return;
        }else{
            moveDish(level-1,from,inter,to);
            System.out.println("从"+from+"移动盘子"+level+"到"+to);
            moveDish(level - 1, inter, to, from);
        }

    }
    public static void ss(){
        System.out.println("ssss");
    }
}
