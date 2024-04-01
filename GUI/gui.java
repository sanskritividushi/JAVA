import java.awt.*;
import java.applet.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends Applet {
    
    Button b = new Button("new");
    Label l1 = new Label("Name");
    Label l2 = new Label("rollno");
    Label l = new Label();

    TextField t1 = new TextField("Name", 20);
    TextField t2 = new TextField("Roll number", 20);

    public void init() {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l);
        setSize(500, 500);
        Elistener E = new Elistener();
        b.addActionListener(E);
    }
    class Elistener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            l.setText("Ok pressed");
        }
    }
}
}


