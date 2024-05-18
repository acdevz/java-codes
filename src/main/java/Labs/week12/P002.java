package Labs.week12;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.print.PrinterException;
import java.io.*;

public class P002 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleTextEditor::new);
    }
}

class SimpleTextEditor {
    private JFrame frame;
    private JTextArea textArea;
    private JFileChooser fileChooser;

    public SimpleTextEditor() {
        frame = new JFrame("Simple Text Editor");
        textArea = new JTextArea(20, 40);
        fileChooser = new JFileChooser();

        JScrollPane scrollPane = new JScrollPane(textArea);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem printMenuItem = new JMenuItem("Print");
        JMenuItem newMenuItem = new JMenuItem("New");

        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        JMenuItem closeMenuItem = new JMenuItem("Close");

        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(printMenuItem);
        fileMenu.add(newMenuItem);

        openMenuItem.addActionListener(e -> openFile());
        saveMenuItem.addActionListener(e -> saveFile());
        printMenuItem.addActionListener(e -> printText());
        newMenuItem.addActionListener(e -> newFile());

        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        editMenu.add(closeMenuItem);

        cutMenuItem.addActionListener(e -> textArea.cut());
        copyMenuItem.addActionListener(e -> textArea.copy());
        pasteMenuItem.addActionListener(e -> textArea.paste());
        closeMenuItem.addActionListener(e -> frame.dispose());

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        frame.setJMenuBar(menuBar);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void openFile() {
        fileChooser.setDialogTitle("Open File");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        fileChooser.setFileFilter(filter);

        int returnVal = fileChooser.showOpenDialog(frame);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                textArea.setText("");
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error opening file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveFile() {
        fileChooser.setDialogTitle("Save File");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showSaveDialog(frame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.getName().toLowerCase().endsWith(".txt")) {
                file = new File(file.getAbsolutePath() + ".txt");
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(textArea.getText());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error saving file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void printText() {
        try {
            textArea.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(frame, "Error printing text: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void newFile() {
        int confirm = JOptionPane.showConfirmDialog(frame, "Create a new file? Unsaved changes will be lost.", "New File", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            textArea.setText("");
        }
    }
}
