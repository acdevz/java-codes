package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basicFrame{
    public static void main(String[] args) {
//        simpleFrame simpleframe = new simpleFrame();
//        new eventFrame();
        new anonymousEventFrame();
    }
}

class simpleFrame extends Frame{
    simpleFrame(){
        setSize(300,300);
        setTitle("Simple Frame");
        // no layout manager
        setLayout(null);
        // now frame will be visible, by default it is not visible
        setVisible(true);

        /* adding components in frame */
        Label l = new Label("Your good name:");
        TextField t = new TextField("Name");
        Button b = new Button("Submit");

        // setting position of above components in the frame
        l.setBounds(20, 100, 100, 20);
        t.setBounds(120, 100, 100, 20);
        b.setBounds(20, 150, 80, 30);

        // adding components into frame
        add(b);
        add(l);
        add(t);
    }
}

class eventFrame extends Frame implements ActionListener{
    TextField t;
    eventFrame(){
        Label l = new Label("Click :");
        t = new TextField("");
        Button b = new Button("Click Me");
        l.setBounds(20, 100, 100, 20);
        t.setBounds(120, 100, 100, 20);
        b.setBounds(20, 150, 80, 30);
        add(b);
        add(l);
        add(t);
        setSize(300,300);
        setTitle("Event Frame");
        setLayout(null);
        setVisible(true);

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t.setText("Clicked");
    }
}

class anonymousEventFrame extends Frame{
    Button b;
    anonymousEventFrame(){
        b = new Button("Click Me");
        b.setBounds(20, 150, 80, 30);
        add(b);
        setSize(300,300);
        setTitle("Event Frame");
        setLayout(null);
        setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.setLabel("Clicked!");
            }
        });
    }
}
