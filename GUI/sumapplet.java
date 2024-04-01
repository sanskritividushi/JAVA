//take 2 numbers and find sum
import java.awt.*;
import java.applet.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sumapplet extends Applet{
    TextField num1=new TextField("number 1");
    TextField num2=new TextField("number 2");
    Label l=new Label();
    public void init(){
        add(num1);
        add(num2);
        String s1, s2;
        int x=0,y=0;
        try{
            s1=num1.getText();
            x=Integer.parseInt(s1);
            s2=num2.getText();
            y=Integer.parseInt(s2);
        }
        catch(Exception e){}
        int z=x+y;
        String s=String.valueOf(z);
        l.setText(s);
    }
}
