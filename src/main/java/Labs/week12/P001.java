package Labs.week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P001 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(studentRegistrationForm::new);
    }
}

class studentRegistrationForm{
    private final JTextField name;
    private final JTextField regNo;
    private final JTextField dob;
    private final JTextArea address;
    private final JTextField email;
    private final JTextField mobile;
    private final JRadioButton maleRadio;
    private final JRadioButton femaleRadio;
    private final JCheckBox tenthCheck;
    private final JCheckBox twelfthCheck;
    private final JCheckBox btechCheck;
    private final JCheckBox mtechCheck;
    private final JCheckBox phdCheck;

    public studentRegistrationForm(){
        JFrame frame = new JFrame("Student Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(0, 2 , 5, 2));

        frame.add(new JLabel("Name: "));
        name = new JTextField();
        frame.add(name);
        frame.add(new JLabel("Reg. No.: "));
        regNo = new JTextField();
        frame.add(regNo);
        frame.add(new JLabel("Date of Birth: "));
        dob = new JTextField();
        frame.add(dob);
        frame.add(new JLabel("Address: "));
        address = new JTextArea(3, 10);
        frame.add(address);
        frame.add(new JLabel("Email: "));
        email = new JTextField();
        frame.add(email);
        frame.add(new JLabel("Mobile: "));
        mobile = new JTextField();
        frame.add(mobile);

        frame.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        frame.add(genderPanel);

        frame.add(new JLabel("Qualifications:"));
        JPanel qualPanel = new JPanel(new GridLayout(0, 6));
        tenthCheck = new JCheckBox("10th");
        twelfthCheck = new JCheckBox("12th");
        btechCheck = new JCheckBox("B.Tech");
        mtechCheck = new JCheckBox("M.Tech");
        phdCheck = new JCheckBox("Ph.D");
        qualPanel.add(tenthCheck);
        qualPanel.add(twelfthCheck);
        qualPanel.add(btechCheck);
        qualPanel.add(mtechCheck);
        qualPanel.add(phdCheck);
        frame.add(qualPanel);

        JButton submit = new JButton("Submit");
        JButton reset = new JButton("Clear");
        frame.add(submit);
        frame.add(reset);

        submit.addActionListener(new submitButtonListener());
        reset.addActionListener(new resetButtonListener());
        frame.setVisible(true);
    }

    private class resetButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            name.setText("");
            regNo.setText("");
            dob.setText("");
            address.setText("");
            email.setText("");
            mobile.setText("");
            maleRadio.setSelected(false);
            femaleRadio.setSelected(false);
            tenthCheck.setSelected(false);
            twelfthCheck.setSelected(false);
            btechCheck.setSelected(false);
            mtechCheck.setSelected(false);
            phdCheck.setSelected(false);
        }
    }

    private class submitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nameVal = name.getText().trim();
            String regNoVal = regNo.getText().trim();
            String dobVal = dob.getText().trim();
            String addressVal = address.getText().trim();
            String emailVal = email.getText().trim();
            String mobileVal = mobile.getText();
            String genderVal = maleRadio.isSelected() ? "male" : (femaleRadio.isSelected() ? "female" : "other");

            StringBuilder qualifications = new StringBuilder();
            if (tenthCheck.isSelected()) qualifications.append("10th ");
            if (twelfthCheck.isSelected()) qualifications.append("12th ");
            if (btechCheck.isSelected()) qualifications.append("B.Tech ");
            if (mtechCheck.isSelected()) qualifications.append("M.Tech ");
            if (phdCheck.isSelected()) qualifications.append("Ph.D ");

            String message = String.format(
                    "Name: %s%nReg. No.: %s%nDOB: %s%nAddress: %s%nEmail ID: %s%nMobile: %s%nGender: %s%nQualifications: %s",
                    nameVal, regNoVal, dobVal, addressVal, emailVal, mobileVal, genderVal, qualifications.toString().trim());

            JOptionPane optionPane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION);
            JDialog dialog = optionPane.createDialog("Registration Successful");
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        }
    }
}