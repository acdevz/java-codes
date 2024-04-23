package Labs.week09;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.Expression;
import java.util.Stack;

public class P003 {
    public static void main(String[] args) {
        new CalcExp();
    }
}

class CalcExp extends Frame{
    TextField display;
    Button add, sub, mul, div, mod, eq;
    Button _1, _2, _3, _4, _5, _6, _7, _8, _9, _0;

    StringBuilder expStr = new StringBuilder();
    Stack<Character> exp = new Stack<>();

    CalcExp() {
        setSize(300, 300);
        setTitle("Calculator");
        setLayout(null);
        setVisible(true);

        display = new TextField();
        display.setBounds(20, 40, 260, 40);
        add(display);

        _1 = new Button("1");
        _1.setBounds(20, 100, 40, 40);
        add(_1);
        _2 = new Button("2");
        _2.setBounds(70, 100, 40, 40);
        add(_2);
        _3 = new Button("3");
        _3.setBounds(120, 100, 40, 40);
        add(_3);
        _4 = new Button("4");
        _4.setBounds(20, 150, 40, 40);
        add(_4);
        _5 = new Button("5");
        _5.setBounds(70, 150, 40, 40);
        add(_5);
        _6 = new Button("6");
        _6.setBounds(120, 150, 40, 40);
        add(_6);
        _7 = new Button("7");
        _7.setBounds(20, 200, 40, 40);
        add(_7);
        _8 = new Button("8");
        _8.setBounds(70, 200, 40, 40);
        add(_8);
        _9 = new Button("9");
        _9.setBounds(120, 200, 40, 40);
        add(_9);
        _0 = new Button("0");
        _0.setBounds(70, 250, 40, 40);
        add(_0);

        add = new Button("+");
        add.setBounds(170, 100, 40, 40);
        add(add);
        sub = new Button("-");
        sub.setBounds(220, 100, 40, 40);
        add(sub);
        mul = new Button("*");
        mul.setBounds(170, 150, 40, 40);
        add(mul);
        div = new Button("/");
        div.setBounds(220, 150, 40, 40);
        add(div);
        mod = new Button("%");
        mod.setBounds(170, 200, 40, 40);
        add(mod);
        eq = new Button("=");
        eq.setBounds(220, 200, 40, 40);
        add(eq);

//        on click listeners
        _1.addActionListener(e -> {
            expStr.append("1");
            display.setText(expStr.toString());
            exp.push('1');
        });
        _2.addActionListener(e -> {
            expStr.append("2");
            display.setText(expStr.toString());
            exp.push('2');
        });
        _3.addActionListener(e -> {
            expStr.append("3");
            display.setText(expStr.toString());
            exp.push('3');
        });
        _4.addActionListener(e -> {
            expStr.append("4");
            display.setText(expStr.toString());
            exp.push('4');
        });
        _5.addActionListener(e -> {
            expStr.append("5");
            display.setText(expStr.toString());
            exp.push('5');
        });
        _6.addActionListener(e -> {
            expStr.append("6");
            display.setText(expStr.toString());
            exp.push('6');
        });
        _7.addActionListener(e -> {
            expStr.append("7");
            display.setText(expStr.toString());
            exp.push('7');
        });
        _8.addActionListener(e -> {
            expStr.append("8");
            display.setText(expStr.toString());
            exp.push('8');
        });
        _9.addActionListener(e -> {
            expStr.append("9");
            display.setText(expStr.toString());
            exp.push('9');
        });
        _0.addActionListener(e -> {
            expStr.append("0");
            display.setText(expStr.toString());
            exp.push('0');
        });

        add.addActionListener(e -> {
            expStr.append("+");
            display.setText(expStr.toString());
            exp.push('+');
        });
        sub.addActionListener(e -> {
            expStr.append("-");
            display.setText(expStr.toString());
            exp.push('-');
        });
        mul.addActionListener(e -> {
            expStr.append("*");
            display.setText(expStr.toString());
            exp.push('*');
        });
        div.addActionListener(e -> {
            expStr.append("/");
            display.setText(expStr.toString());
            exp.push('/');
        });
        mod.addActionListener(e -> {
            expStr.append("%");
            display.setText(expStr.toString());
            exp.push('%');
        });

        eq.addActionListener(e -> {
            try {
                double result = 0;
                int op1, op2;
                op2 = Integer.parseInt(String.valueOf(exp.pop()));
                char c = exp.pop();
                if(c == '+'){
                    op1 = Integer.parseInt(String.valueOf(exp.pop()));
                    result = op1 + op2;
                } else if(c == '-'){
                    op1 = Integer.parseInt(String.valueOf(exp.pop()));
                    result = op1 - op2;
                } else if(c == '*'){
                    op1 = Integer.parseInt(String.valueOf(exp.pop()));
                    result = op1 * op2;
                } else if(c == '/'){
                    op1 = Integer.parseInt(String.valueOf(exp.pop()));
                    result = op1 / (double) op2;
                } else if(c == '%'){
                    op1 = Integer.parseInt(String.valueOf(exp.pop()));
                    result = op1 % op2;
                }
                display.setText(String.valueOf(result));
            } catch (Exception ex) {
                display.setText("Invalid Expression");
            } finally {
                exp.clear();
                expStr = new StringBuilder();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}
