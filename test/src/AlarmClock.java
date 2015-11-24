import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by jiahua on 15-11-13.
 */
public class AlarmClock {
    private int delay;
    private boolean flag;
    public AlarmClock(int delay,boolean flag){
        this.delay=delay;
        this.flag=flag;

    }

    public static void main(String[] args) {
        AlarmClock clock=new AlarmClock(1000,true);
        clock.start();
        JOptionPane.showMessageDialog(null,"是否退出？");
        System.exit(0);

    }
    public void start(){
        class Printer implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat format=new SimpleDateFormat("k:m:s");
                String result=format.format(new Date());
                System.out.println("当前时间是："+result);
                if (flag){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        new Timer(delay,new Printer()).start();
    }
}
