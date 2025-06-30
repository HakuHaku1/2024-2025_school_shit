import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HCI extends JFrame {

   // Declare components
   private JTextField firstNameField, lastNameField, middleNameField, mobileNumberField, emailField;
   private JButton submitButton, clearButton;
   private JFrame outputFrame;

   public HCI() {
       // Set up input frame
       setTitle("INPUT");
       setSize(400, 300);
       setLayout(new GridLayout(6, 2));

       // Initialize components
       JLabel firstNameLabel = new JLabel("First Name:");
       JLabel lastNameLabel = new JLabel("Last Name:");
       JLabel middleNameLabel = new JLabel("Middle Name:");
       JLabel mobileNumberLabel = new JLabel("Mobile Number:");
       JLabel emailLabel = new JLabel("E-mail Address:");

       firstNameField = new JTextField();
       lastNameField = new JTextField();
       middleNameField = new JTextField();
       mobileNumberField = new JTextField();
       emailField = new JTextField();

       submitButton = new JButton("Submit");
       clearButton = new JButton("Clear All");

       add(firstNameLabel);
       add(firstNameField);
       add(lastNameLabel);
       add(lastNameField);
       add(middleNameLabel);
       add(middleNameField);
       add(mobileNumberLabel);
       add(mobileNumberField);
       add(emailLabel);
       add(emailField);
       add(submitButton);
       add(clearButton);

       submitButton.addActionListener(new btnSubmit());
       clearButton.addActionListener(new btnClearAll());


       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
   }

   class btnSubmit implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           submitButton.setEnabled(false); 


           outputFrame = new JFrame("OUTPUT");
           outputFrame.setSize(300, 200);
           outputFrame.setLayout(new GridLayout(6, 1));

           outputFrame.add(new JLabel("First Name: " + firstNameField.getText()));
           outputFrame.add(new JLabel("Last Name: " + lastNameField.getText()));
           outputFrame.add(new JLabel("Middle Name: " + middleNameField.getText()));
           outputFrame.add(new JLabel("Mobile Number: " + mobileNumberField.getText()));
           outputFrame.add(new JLabel("E-mail Address: " + emailField.getText()));

           JButton okayButton = new JButton("Okay");
           outputFrame.add(okayButton);
           okayButton.addActionListener(new btnOkay());

           outputFrame.setVisible(true);
       }
   }

   class btnClearAll implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           firstNameField.setText("");
           lastNameField.setText("");
           middleNameField.setText("");
           mobileNumberField.setText("");
           emailField.setText("");
           submitButton.setEnabled(true);
           if (outputFrame != null) {
               outputFrame.dispose();
           }
       }
   }

   class btnOkay implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           outputFrame.dispose(); 
           clearInputFields();  
           submitButton.setEnabled(true);  
       }

       private void clearInputFields() {
           firstNameField.setText("");
           lastNameField.setText("");
           middleNameField.setText("");
           mobileNumberField.setText("");
           emailField.setText("");
       }
   }

   public static void main(String[] args) {
       new HCI(); 
   }
}