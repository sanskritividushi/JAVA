import java.awt.*;
import java.applet.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui2 extends Applet {
    Label l1=new Label("hello!"); //print text
    Button b1=new Button("choice 1");
     Button b2=new Button("choice 2");//click
      Button b3=new Button("choice 3");
      Label l2=new Label("hello!");
      Label l=new Label("enter your message");
      TextField t=new TextField("default msg", 30);//enter text
      public void init(){
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        add(l2);
        add(t);
        add(l);
        Elistener E=new Elistener();
        b1.addActionListener(E);
      }
      class Elistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b1){
                l.setText("button choice 1 selected");
            }
            if(e.getSource()==b2){
                l.setText("button choice 2 selected");
            }
            if(e.getSource()==b3){
                l.setText("button choice 3 selected");
            }
        }
      }
}
