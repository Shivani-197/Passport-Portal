import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PassportPortal {
    private JPanel Main;
    private JButton loginButton;
    private JButton newUserButton;
    private JCheckBox aadharCardCheckBox;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JCheckBox voterIDCheckBox;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JCheckBox panCardCheckBox;
    private JCheckBox drivingLicenseCheckBox;
    private JTextField textField13;
    private JTextField textField14;
    private JCheckBox maleCheckBox;
    private JCheckBox femaleCheckBox;
    private JCheckBox otherCheckBox;
    private JButton Submit;
    private JTextField textField15;


    public static void main(String[] args) {
        JFrame frame = new JFrame("PassportPortal");
        frame.setContentPane(new PassportPortal().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public PassportPortal() {
        aadharCardCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long n1;

                n1=Long.parseLong(textField3.getText());
                int k=Integer.parseInt(String.valueOf(textField3.getSize()));
                if(k>12){
                    textField3.setText("Invalid Aadhar Number");
                }


            }
        });
        voterIDCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Long n2;
                n2= Long.parseLong(textField3.getText());
                int j=Integer.parseInt(String.valueOf(textField3.getSize()));
                if(j>10){
                    textField3.setText("Invalid Voter ID");
                }



            }
        });
        panCardCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long n3;
                n3=Long.parseLong(textField3.getText());
                int k= Integer.parseInt(String.valueOf(textField3.getSize()));
                if(k>10){
                    textField3.setText("Invalid PAN Card");
                }


            }
        });
        drivingLicenseCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long n3;
                n3=Long.parseLong(textField3.getText());
                int k= Integer.parseInt(String.valueOf(textField6.getSize()));
                if(k>10){
                    textField3.setText("Invalid Voter Id");
                }


            }
        });
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField15.setText("Your Form has been submitted Successfully!");


            }
        });
    }
}
