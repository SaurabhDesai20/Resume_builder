import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInfo3 extends JFrame implements ActionListener {
    int width = 1000 , height = 600;
    ImageIcon iconLogo ;

    JLabel jLabelNav;
    JPanel jPanelNav;
    JLabel jLabelTechSkills , jLabelSkill1 , jLabelSkill2 , jLabelSkill3 , jLabelSkill4 , jLabelSkill5 , jLabelSkill6;
    JTextField jFieldSkill1 , jFieldSkill2 , jFieldSkill3 , jFieldSkill4 , jFieldSkill5 , jFieldSkill6;
    JLabel jLabelWorkExp , jLabelCmpy1 , jLabelCmpy2;
    JRadioButton jRadioButtonFresher , jRadioButtonExpr;
    ButtonGroup buttonGroup;
    JTextField jTextFieldCmpy1 , jTextFieldCmpy2;
    JButton jButtonSave , jButtonNext;

    static String userSkill1 , userSkill2 , userSkill3 , userSkill4 , userSkill5 , userSkill6;
    static String userLevel , userCompany1 , userCompany2;

    UserInfo3(){
        iconLogo = new ImageIcon("resumeLogo.png");

        jLabelNav = new JLabel("User Information / Data");
        jLabelNav.setForeground(new Color(36 , 65,212));
        jLabelNav.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
        jLabelNav.setVerticalAlignment(JLabel.CENTER);
        jLabelNav.setHorizontalAlignment(JLabel.CENTER);

        jPanelNav = new JPanel();
        jPanelNav.setBounds(0 , 0 , width , 50);
        jPanelNav.setBackground(new Color(86, 145, 94));
        jPanelNav.setLayout(new BorderLayout());
//        --------------------------------------------------------------------

        jLabelTechSkills = new JLabel("TECHNICAL SKILLS:");
        jLabelTechSkills.setBounds(50 , 80 , 280 , 30);
        jLabelTechSkills.setFont(new Font("Broadway", Font.PLAIN, 25));
        jLabelTechSkills.setForeground(Color.white);
//        ------------------------------------skill 1 -------------------------------------------------

        jLabelSkill1 = new JLabel("Skill 1:");
        jLabelSkill1.setBounds(50 , 120 , 70 , 30);
        jLabelSkill1.setFont(new Font("", Font.BOLD, 18));
        jLabelSkill1.setForeground(Color.yellow);

        jFieldSkill1 = new JTextField("N/A");
        jFieldSkill1.setBounds(50 , 150 , 200 , 30);
        jFieldSkill1.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//        ---------------------------------------skill 2----------------------------------------------
        jLabelSkill2 = new JLabel("Skill 2:");
        jLabelSkill2.setBounds(300 , 120 , 70 , 30);
        jLabelSkill2.setFont(new Font("", Font.BOLD, 18));
        jLabelSkill2.setForeground(Color.yellow);

        jFieldSkill2 = new JTextField("N/A");
        jFieldSkill2.setBounds(300 , 150 , 200 , 30);
        jFieldSkill2.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//        ------------------------------------------skill 3-------------------------------------------

        jLabelSkill3 = new JLabel("Skill 3:");
        jLabelSkill3.setBounds(550 , 120 , 70 , 30);
        jLabelSkill3.setFont(new Font("", Font.BOLD, 18));
        jLabelSkill3.setForeground(Color.yellow);

        jFieldSkill3 = new JTextField("N/A");
        jFieldSkill3.setBounds(550 , 150 , 200 , 30);
        jFieldSkill3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
//        ------------------------------------------skill 4-------------------------------------------

        jLabelSkill4 = new JLabel("Skill 4:");
        jLabelSkill4.setBounds(50 , 200 , 70 , 30);
        jLabelSkill4.setFont(new Font("", Font.BOLD, 18));
        jLabelSkill4.setForeground(Color.yellow);

        jFieldSkill4 = new JTextField("N/A");
        jFieldSkill4.setBounds(50 , 230 , 200 , 30);
        jFieldSkill4.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//        ------------------------------------------skill 5-------------------------------------------

        jLabelSkill5 = new JLabel("Skill 5:");
        jLabelSkill5.setBounds(300 , 200 , 70 , 30);
        jLabelSkill5.setFont(new Font("", Font.BOLD, 18));
        jLabelSkill5.setForeground(Color.yellow);

        jFieldSkill5 = new JTextField("N/A");
        jFieldSkill5.setBounds(300 , 230 , 200 , 30);
        jFieldSkill5.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//        ------------------------------------------skill 6-------------------------------------------
        jLabelSkill6 = new JLabel("Skill 6:");
        jLabelSkill6.setBounds(550 , 200 , 70 , 30);
        jLabelSkill6.setFont(new Font("", Font.BOLD, 18));
        jLabelSkill6.setForeground(Color.yellow);

        jFieldSkill6 = new JTextField("N/A");
        jFieldSkill6.setBounds(550 , 230 , 200 , 30);
        jFieldSkill6.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//        ----------------------------------Work experience-------------------------------------
        jLabelWorkExp = new JLabel("WORK EXPERIENCE:");
        jLabelWorkExp.setBounds(50 , 300 , 280 , 30);
        jLabelWorkExp.setFont(new Font("Broadway", Font.PLAIN, 25));
        jLabelWorkExp.setForeground(Color.white);

        jRadioButtonFresher = new JRadioButton("Fresher (No Experience)");
        jRadioButtonFresher.setBounds(50 , 340 , 280 , 30);
        jRadioButtonFresher.setFont(new Font("", Font.BOLD, 20));
        jRadioButtonFresher.setForeground(new Color(159, 205, 227));
        jRadioButtonFresher.setFocusable(false);
        jRadioButtonFresher.setBackground(null);
        jRadioButtonFresher.addActionListener(this);

        jRadioButtonExpr = new JRadioButton("Experienced (1-4 years)");
        jRadioButtonExpr.setBounds(350 , 340 , 250 , 30);
        jRadioButtonExpr.setFont(new Font("", Font.BOLD, 20));
        jRadioButtonExpr.setForeground(new Color(159, 205, 227));
        jRadioButtonExpr.setFocusable(false);
        jRadioButtonExpr.setBackground(null);
        jRadioButtonExpr.addActionListener(this);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButtonFresher);
        buttonGroup.add(jRadioButtonExpr);

        jLabelCmpy1 = new JLabel("Company 1:");
        jLabelCmpy1.setBounds(50 , 400 , 110 , 30);
        jLabelCmpy1.setFont(new Font("", Font.BOLD, 18));
        jLabelCmpy1.setForeground(Color.yellow);

        jTextFieldCmpy1 = new JTextField("N/A");
        jTextFieldCmpy1.setBounds(170 , 400 , 250 , 30);
        jTextFieldCmpy1.setFont(new Font("Times New Roman",Font.PLAIN,18));

        jLabelCmpy2 = new JLabel("Company 2:");
        jLabelCmpy2.setBounds(50 , 470 , 110 , 30);
        jLabelCmpy2.setFont(new Font("", Font.BOLD, 18));
        jLabelCmpy2.setForeground(Color.yellow);

        jTextFieldCmpy2 = new JTextField("N/A");
        jTextFieldCmpy2.setBounds(170 , 470 , 250 , 30);
        jTextFieldCmpy2.setFont(new Font("Times New Roman",Font.PLAIN,18));

        jButtonSave = new JButton("Save Data");
        jButtonSave.setBounds(700 , 500 , 120 , 30);
        jButtonSave.setFont(new Font("", Font.BOLD , 16));
        jButtonSave.setBackground(Color.yellow);
        jButtonSave.setForeground(Color.darkGray);
        jButtonSave.setFocusable(false);

        jButtonNext = new JButton("Next->");
        jButtonNext.setBounds(830 , 500 , 100 , 30);
        jButtonNext.setFont(new Font("", Font.BOLD , 16));
        jButtonNext.setBackground(Color.yellow);
        jButtonNext.setForeground(Color.darkGray);
        jButtonNext.setFocusable(false);
        jButtonNext.addActionListener(this);

//        -----------------------------------------frame----------------------------------------------------

        this.setSize(width , height);
        this.setTitle("User Data");
        this.setIconImage(iconLogo.getImage());
        this.getContentPane().setBackground(Color.darkGray);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        jPanelNav.add(jLabelNav);
        this.add(jPanelNav);

        this.add(jLabelTechSkills);
        this.add(jLabelSkill1);
        this.add(jFieldSkill1);

        this.add(jLabelSkill2);
        this.add(jFieldSkill2);

        this.add(jLabelSkill3);
        this.add(jFieldSkill3);

        this.add(jLabelSkill4);
        this.add(jFieldSkill4);

        this.add(jLabelSkill5);
        this.add(jFieldSkill5);

        this.add(jLabelSkill6);
        this.add(jFieldSkill6);

        this.add(jLabelWorkExp);
        this.add(jRadioButtonFresher);
        this.add(jRadioButtonExpr);

        this.add(jLabelCmpy1);
        this.add(jLabelCmpy2);

        this.add(jTextFieldCmpy1);
        this.add(jTextFieldCmpy2);

        this.add(jButtonSave);
        this.add(jButtonNext);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        UserInfo3 obj = new UserInfo3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jRadioButtonFresher){
            jTextFieldCmpy1.setEditable(false);
            jTextFieldCmpy2.setEditable(false);
            userLevel = jRadioButtonFresher.getText();
        }

        if (e.getSource() == jRadioButtonExpr){
            userLevel = jRadioButtonExpr.getText();
            userCompany1 = jTextFieldCmpy1.getText();
            userCompany2 = jTextFieldCmpy2.getText();
        }

        if (e.getSource() == jButtonNext){
            userSkill1 = jFieldSkill1.getText();
            userSkill2 = jFieldSkill2.getText();
            userSkill3 = jFieldSkill3.getText();
            userSkill4 = jFieldSkill4.getText();
            userSkill5 = jFieldSkill5.getText();
            userSkill6 = jFieldSkill6.getText();

            System.out.println(userLevel);

            UserInfo4 obj = new UserInfo4();
        }
    }
}
