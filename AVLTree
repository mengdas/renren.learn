import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by jiahua on 15-11-20.
 * 平衡二叉树
 */
public class AVLTree {
    public static void main(String[] args)throws Exception{
        AVLTree n=new AVLTree(1);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            //int temp=Integer.valueOf(bufferedReader.readLine()).intValue();
            //n=n.insert(temp,n);
            n=n.insert(i+2,n);
        }
        n.display();
    }
    public int value;
    private AVLTree left;
    private AVLTree right;
    public int height;
    AVLTree(int value){
        this.value=value;
        left=null;
        right=null;
        height=0;
    }
    AVLTree(){
        value=0;
        left=right=null;
        height=-1;
    }
    public void display(){
        System.out.println(value);
        if(this.left!=null){
            System.out.print(value+":le");
            this.left.display();
        }
        if(this.right!=null) {
            System.out.print(value+":ri");
            this.right.display();
        }
    }
    private int max(AVLTree a,AVLTree b){
        if(a==null&&b==null){
            return -1;
        }
        if(a==null){
            return b.height;
        }
        if(b==null){
            return a.height;
        }
        return a.height>b.height?a.height:b.height;
    }
    public int getHeight(AVLTree t){
        if(t==null){
            return -1;
        }
        return t.height;
    }
    public int getValue(){
        return value;
    }
    private AVLTree singleRotateWithLeft(AVLTree k){//左单旋
        AVLTree t=k.left;
        k.left=t.right;
        t.right=k;
        k.height=max(k.left,k.right)+1;
        t.height=max(t.left,t.right)+1;
        return t;
    }
    private AVLTree singleRotateWithRight(AVLTree k){//右单旋
        AVLTree t=k.right;
        t=k.right;
        k.right=t.left;
        t.left=k;
        k.height=max(k.left,k.right)+1;
        t.height=max(t.left,t.right)+1;
        return t;
    }
    private AVLTree doubleRotateWithleft(AVLTree k){//左右双旋
        k.left=singleRotateWithRight(k.left);

        return singleRotateWithLeft(k);
    }
    private AVLTree doubleRotateWithRight(AVLTree k){//右左双旋
        k.right=singleRotateWithLeft(k.right);

        return singleRotateWithRight(k);
    }
    public AVLTree insert(int value,AVLTree t){
        if(t==null){
            t=new AVLTree(value);
            return t;
        }else{
            if(value<t.value){

                t.left=t.insert(value,t.left);
                if(t.getHeight(t.left)-t.getHeight(t.right)==2){
                    if(value<t.left.getValue()){
                        t=singleRotateWithLeft(t);
                    }else{
                        t=doubleRotateWithleft(t);
                    }
                }
            }else if(value>t.value){
                t.right=t.insert(value,t.right);
                if(t.getHeight(t.right)-t.getHeight(t.left)==2){
                    if(value>t.right.getValue()){
                        t=singleRotateWithRight(t);
                    }else{
                        t=doubleRotateWithRight(t);
                    }
                }
            }
        }
        t.height=max(t.left,t.right)+1;
        return t;
    }
}
