//package _projects_;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Main extends JFrame {
//    private JTextField inputField;
//    private JComboBox<String> dropdownMenu;
//    private JTextArea outputArea;
//
//    public Main() {
//        // Set up the frame
//        setTitle("GUI Example");
//        setSize(400, 300);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Create components
//        inputField = new JTextField(20);
//        String[] options = {"Option 1", "Option 2", "Option 3"};
//        dropdownMenu = new JComboBox<>(options);
//        outputArea = new JTextArea(10, 30);
//        outputArea.setEditable(false);
//
//        // Create a button
//        JButton printButton = new JButton("Print");
//        printButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String inputText = inputField.getText();
//                String selectedOption = (String) dropdownMenu.getSelectedItem();
//                outputArea.append("Input: " + inputText + "\n");
//                outputArea.append("Selected Option: " + selectedOption + "\n");
//            }
//        });
//
//        // Create a panel and add components to it
//        JPanel panel = new JPanel();
//        panel.add(new JLabel("Input:"));
//        panel.add(inputField);
//        panel.add(new JLabel("Dropdown:"));
//        panel.add(dropdownMenu);
//        panel.add(printButton);
//
//        // Add the panel and output area to the frame
//        getContentPane().setLayout(new BorderLayout());
//        getContentPane().add(panel, BorderLayout.NORTH);
//        getContentPane().add(new JScrollPane(outputArea), BorderLayout.CENTER);
//    }
//
//    public static void main(String[] args) {
//        // Create and display the GUI
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new GUIExample().setVisible(true);
//            }
//        });
//    }
//}
