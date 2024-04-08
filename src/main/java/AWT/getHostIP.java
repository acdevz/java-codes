package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class getHostIP extends Frame{
    TextField hostInput;
    Button submit;
    Label display;

    getHostIP(){
        setSize(300,300);
        setTitle("Event Frame");
        setLayout(null);
        setVisible(true);

        display = new Label("Enter Host & get IP:");
        hostInput = new TextField("acdevs.github.com");
        submit = new Button("Submit");
        display.setBounds(50, 100, 250, 20);
        hostInput.setBounds(50, 50, 150, 20);
        submit.setBounds(50,150,60,30);
        add(submit);
        add(display);
        add(hostInput);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String host = hostInput.getText();
                    String ip = java.net.InetAddress.getByName(host).getHostAddress();
                    display.setText("IP of "+host+" is: "+ip);
                }
                catch (Exception ex) {
                    display.setText("Host doesn't exist.");
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new getHostIP();
    }
}
