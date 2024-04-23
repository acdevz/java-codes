package Labs.week09;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class P001 {
    public static void main(String[] args) {
        new Adder();
    }
}

class Adder extends Frame{
    TextField t1, t2, result;
    Button adder;

    Adder(){
        setSize(300,300);
        setTitle("Adder");
        setLayout(null);
        // now frame will be visible, by default it is not visible
        setVisible(true);

        Label l1 = new Label("First Number :");
        t1 = new TextField();
        Label l2 = new Label("Second Number :");
        t2 = new TextField();
        adder = new Button("Add");
        Label r = new Label("Result :");
        result = new TextField();

        l1.setBounds(20, 100, 100, 20);
        t1.setBounds(120, 100, 100, 20);
        l2.setBounds(20, 130, 100, 20);
        t2.setBounds(120, 130, 100, 20);
        adder.setBounds(20, 160, 80, 30);
        r.setBounds(20, 200, 100, 20);
        result.setBounds(120, 200, 100, 20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(adder);
        add(r);
        add(result);

        adder.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText(String.valueOf(a + b));
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}
