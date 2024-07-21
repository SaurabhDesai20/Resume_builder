import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInfo1 extends JFrame implements ActionListener {
    int width = 1000;
    int height = 600;

    public JLabel jLabelHead;
    public JPanel jPanelHead;
    public ImageIcon logoIcon;
    public JLabel jLabelName, firstName, middleName, lastName;
    static JTextField firstNameField , middleNameField , lastNameField;

    public JLabel jLabelContact , jLabelAddress , jLabelContactNum, jLabelCity ;
    public JLabel jLabelGmail , jLabelGitHub, jLabelLinkedin;
    public JTextArea jTextAreaAddress;
    public JTextField jTextFieldContactNum , jTextFieldCity ;
    public JTextField jTextFieldGmail , jTextFieldLinkedin , jTextFieldGitHub;
    JButton jButtonNext , jButtonSave;

    static String userFirstName , userMiddleName , userLastName;
    static String userAddress , userCity , userContactNum , userLinkedin , userGitHub , userGmail;


    UserInfo1(){
        logoIcon = new ImageIcon("resumeLogo.png");

        jLabelHead = new JLabel("User Information / Data");
        jLabelHead.setForeground(new Color(36 , 65,212));
        jLabelHead.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
        jLabelHead.setVerticalAlignment(JLabel.CENTER);
        jLabelHead.setHorizontalAlignment(JLabel.CENTER);

        jPanelHead = new JPanel();
        jPanelHead.setBounds(0 ,0 , width , 50);
        jPanelHead.setBackground(new Color(86, 145, 94));
        jPanelHead.setLayout(new BorderLayout());

        jLabelName = new JLabel("NAME: ");
        jLabelName.setBounds(50 , 80 , 100 , 30);
        jLabelName.setFont(new Font("Broadway", Font.PLAIN, 25));
        jLabelName.setForeground(Color.white);

        firstName = new JLabel("First Name:");
        firstName.setBounds(50 , 120 , 120 , 30);
        firstName.setFont(new Font("", Font.BOLD, 18));
        firstName.setForeground(Color.yellow);

        firstNameField = new JTextField();
        firstNameField.setBounds(50 , 150 , 200 , 30);
        firstNameField.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        middleName = new JLabel("Middle Name:");
        middleName.setBounds(280 , 120 , 120 , 30);
        middleName.setFont(new Font("", Font.BOLD, 18));
        middleName.setForeground(Color.yellow);

        middleNameField = new JTextField();
        middleNameField.setBounds(280 , 150 , 200 , 30);
        middleNameField.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        lastName = new JLabel("Last Name:");
        lastName.setBounds(510 , 120 , 120 , 30);
        lastName.setFont(new Font("", Font.BOLD, 18));
        lastName.setForeground(Color.yellow);

        lastNameField = new JTextField();
        lastNameField.setBounds(510  , 150 , 200, 30);
        lastNameField.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//  ------------------------------------contact information-------------------------------------------------------

        jLabelContact = new JLabel("CONTACT INFORMATION :");
        jLabelContact.setBounds(50 , 230 , 400, 30);
        jLabelContact.setFont(new Font("Broadway", Font.PLAIN, 25));
        jLabelContact.setForeground(Color.white);

//-------------------------------------------- address-----------------------------------------

        jLabelAddress = new JLabel("Address:");
        jLabelAddress.setBounds(50, 280 , 100 , 30);
        jLabelAddress.setFont(new Font("",Font.BOLD,18));
        jLabelAddress.setForeground(Color.yellow);

        jTextAreaAddress = new JTextArea();
        jTextAreaAddress.setBounds(50 ,310 , 200 , 50);
        jTextAreaAddress.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//-------------------------------------------- city-----------------------------------------

        jLabelCity = new JLabel("City:");
        jLabelCity.setBounds(280 , 280 , 50 , 30);
        jLabelCity.setFont(new Font("",Font.BOLD,18));
        jLabelCity.setForeground(Color.yellow);

        jTextFieldCity = new JTextField();
        jTextFieldCity.setBounds(280 , 310 , 200 , 30);

//-------------------------------------------- contact number-----------------------------------------

        jLabelContactNum = new JLabel("Contact Number:");
        jLabelContactNum.setBounds(510 , 280 , 220 , 30);
        jLabelContactNum.setFont(new Font("", Font.BOLD,18));
        jLabelContactNum.setForeground(Color.yellow);

        jTextFieldContactNum = new JTextField();
        jTextFieldContactNum.setBounds(510 , 310 , 200 , 30);
        jTextFieldContactNum.setFont(new Font("Times New Roman" , Font.PLAIN , 18));

//-------------------------------------------- g mail-----------------------------------------

        jLabelGmail = new JLabel("G-mail:");
        jLabelGmail.setBounds(50 , 400 , 70 , 30);
        jLabelGmail.setFont(new Font("", Font.BOLD,18));
        jLabelGmail.setForeground(Color.yellow);

        jTextFieldGmail = new JTextField();
        jTextFieldGmail.setBounds(50 , 430 , 200 , 30);
        jTextFieldGmail.setFont(new Font("Times New Roman" , Font.PLAIN , 18));

//-------------------------------------------- git hub-----------------------------------------

        jLabelGitHub = new JLabel("Git-Hub:");
        jLabelGitHub.setBounds(280 , 400 , 100 , 30);
        jLabelGitHub.setFont(new Font("", Font.BOLD,18));
        jLabelGitHub.setForeground(Color.yellow);

        jTextFieldGitHub = new JTextField();
        jTextFieldGitHub.setBounds(280 , 430 , 200 , 30);
        jTextFieldGitHub.setFont(new Font("Times New Roman" , Font.PLAIN , 18));

//-------------------------------------------- Linkedin-----------------------------------------

        jLabelLinkedin = new JLabel("Linkedin:");
        jLabelLinkedin.setBounds(510 , 400 , 100 , 30);
        jLabelLinkedin.setFont(new Font("", Font.BOLD,18));
        jLabelLinkedin.setForeground(Color.yellow);

        jTextFieldLinkedin = new JTextField();
        jTextFieldLinkedin.setBounds(510 , 430 , 200 , 30);
        jTextFieldLinkedin.setFont(new Font("Times New Roman" , Font.PLAIN , 18));
//-------------------------------------------- save & next button-----------------------------------------
        jButtonSave = new JButton("Save Data");
        jButtonSave.setBounds(700 , 480 , 120 , 30);
        jButtonSave.setFont(new Font("", Font.BOLD , 16));
        jButtonSave.setBackground(Color.yellow);
        jButtonSave.setForeground(Color.darkGray);
        jButtonSave.setFocusable(false);

        jButtonNext = new JButton("Next->");
        jButtonNext.setBounds(830 , 480 , 120 , 30);
        jButtonNext.setFont(new Font("", Font.BOLD , 16));
        jButtonNext.setBackground(Color.yellow);
        jButtonNext.setForeground(Color.darkGray);
        jButtonNext.setFocusable(false);
        jButtonNext.addActionListener(this);

        this.setSize(width, height);
        this.setTitle("User Data");
        this.setIconImage(logoIcon.getImage());
        this.getContentPane().setBackground(Color.darkGray);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        jPanelHead.add(jLabelHead);
        this.add(jPanelHead);

        this.add(firstName);
        this.add(firstNameField);

        this.add(middleName);
        this.add(middleNameField);

        this.add(lastName);
        this.add(lastNameField);

        this.add(jLabelName);

        this.add(jLabelContact);

        this.add(jLabelAddress);
        this.add(jTextAreaAddress);

        this.add(jLabelCity);
        this.add(jTextFieldCity);

//        this.add(jLabelCountry);
//        this.add(jTextFieldCountry);

        this.add(jLabelContactNum);
        this.add(jTextFieldContactNum);

        this.add(jLabelGmail);
        this.add(jTextFieldGmail);

        this.add(jLabelGitHub);
        this.add(jTextFieldGitHub);

        this.add(jLabelLinkedin);
        this.add(jTextFieldLinkedin);

        this.add(jButtonSave);
        this.add(jButtonNext);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        UserInfo1 obj = new UserInfo1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButtonNext){
            userFirstName = firstNameField.getText();
            userMiddleName = middleNameField.getText();
            userLastName = lastNameField.getText();

            userAddress = jTextAreaAddress.getText();
            userCity = jTextFieldCity.getText();
            userContactNum = jTextFieldContactNum.getText();
            userLinkedin = jTextFieldLinkedin.getText();
            userGmail = jLabelGmail.getText();
            userGitHub = jTextFieldGitHub.getText();

            UserInfo2 obj = new UserInfo2();
        }
    }
}
