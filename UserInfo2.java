import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInfo2 extends JFrame implements ActionListener {
    int width = 1000;
    int height = 600;

    JLabel jLabelNavigation;
    JPanel jPanelNavigation;
    ImageIcon logoImg;

    JLabel jLabelDescription , jLabelDescriptionOwn;
    JTextArea jTextAreaDescription ;
    JLabel jLabelPositionOpted  , jLabelApplyingPosition ;
    JTextField jTextFieldOptedPosition;
    JLabel jLabelEducation , jLabelSSC , jLabelHSC , jLabelGraduation;
    JTextField jSSCInstitute , jHSCInstitute , jGraduateInstitute;
    JComboBox passingSSCYear , passingHSCYear , passingGraduateYear ;
    JLabel jLabelSSCPercent , jLabelHSCPercent , jLabelCGPA;
    JTextField jTextFieldSSC , jTextFieldHSC , jTextFieldCGPA;
    JButton saveButton , nextButton;

    static String userDescription , userAppliedPosition , userSSCInstitute , userHSCInstitute , userGraduateInstitute ;
    static int userSSCYear , userHSCYear , userGraduateYear ;
    static String userSSCPercent , userHSCPercent , userGraduateCGPA;

    UserInfo2(){
        logoImg = new ImageIcon("resumeLogo.png");

        jLabelNavigation = new JLabel("User Information / Data");
        jLabelNavigation.setForeground(new Color(36 , 65,212));
        jLabelNavigation.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
        jLabelNavigation.setVerticalAlignment(JLabel.CENTER);
        jLabelNavigation.setHorizontalAlignment(JLabel.CENTER);

        jPanelNavigation = new JPanel();
        jPanelNavigation.setBounds(0 , 0 , width , 50);
        jPanelNavigation.setBackground(new Color(86, 145, 94));
        jPanelNavigation.setLayout(new BorderLayout());

        jLabelDescription = new JLabel("DESCRIPTION:");
        jLabelDescription.setBounds(50 , 80 , 200 , 30);
        jLabelDescription.setFont(new Font("Broadway", Font.PLAIN, 25));
        jLabelDescription.setForeground(Color.white);

        jLabelDescriptionOwn = new JLabel("Own Description:");
        jLabelDescriptionOwn.setBounds(50 , 120 , 180 , 30);
        jLabelDescriptionOwn.setFont(new Font("", Font.BOLD, 18));
        jLabelDescriptionOwn.setForeground(Color.yellow);

        jTextAreaDescription = new JTextArea("N/A");
        jTextAreaDescription.setBounds(50 , 150 , 350 , 80);
        jTextAreaDescription.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        jLabelPositionOpted = new JLabel("POSITION OPTED:");
        jLabelPositionOpted.setBounds(500 , 80 , 250, 30);
        jLabelPositionOpted.setFont(new Font("Broadway", Font.PLAIN, 25));
        jLabelPositionOpted.setForeground(Color.white);

        jLabelApplyingPosition = new JLabel("Apply For Position:");
        jLabelApplyingPosition.setBounds(500, 120 , 180 , 30);
        jLabelApplyingPosition.setFont(new Font("",Font.BOLD,18));
        jLabelApplyingPosition.setForeground(Color.yellow);

        jTextFieldOptedPosition = new JTextField("N/A");
        jTextFieldOptedPosition.setBounds(500,150 , 250 , 30);
        jTextFieldOptedPosition.setFont(new Font("Times New Roman" , Font.PLAIN , 18));
//  -----------------------------------------------------------------------------------------------

        jLabelEducation = new JLabel("EDUCATION:");
        jLabelEducation.setBounds(50 , 280 , 200 , 30);
        jLabelEducation.setFont(new Font("Broadway", Font.PLAIN, 25));
        jLabelEducation.setForeground(Color.white);

//        --------------------------------------------------------------------------

        jLabelSSC = new JLabel("SSC:");
        jLabelSSC.setBounds(50, 330 , 50 , 30);
        jLabelSSC.setFont(new Font("",Font.BOLD,18));
        jLabelSSC.setForeground(Color.yellow);

        jSSCInstitute = new JTextField("Institute Name (N/A)");
        jSSCInstitute.setBounds(200 , 330 , 200 , 30);
        jSSCInstitute.setFont(new Font("Times New Roman",Font.PLAIN,18));

        Integer [] yearSSC = {null , 2016 , 2017 , 2018 , 2019 , 2020 , 2021};
        passingSSCYear = new JComboBox<>(yearSSC);
        passingSSCYear.setBounds(430 , 330 , 80 , 30);

        jLabelSSCPercent = new JLabel("SSC %");
        jLabelSSCPercent.setBounds(530 ,330 , 70 , 30);
        jLabelSSCPercent.setFont(new Font("",Font.BOLD,18));
        jLabelSSCPercent.setForeground(Color.yellow);

        jTextFieldSSC = new JTextField("N/A");
        jTextFieldSSC.setBounds(620 , 330 , 100 , 30);
        jTextFieldSSC.setFont(new Font("Times New Roman",Font.PLAIN , 18));

//        --------------------------------------------------------------------------

        jLabelHSC = new JLabel("HSC:");
        jLabelHSC.setBounds(50, 390 , 50 , 30);
        jLabelHSC.setFont(new Font("",Font.BOLD,18));
        jLabelHSC.setForeground(Color.yellow);

        jHSCInstitute = new JTextField("Institute Name (N/A)");
        jHSCInstitute.setBounds(200 , 390 , 200 , 30);
        jHSCInstitute.setFont(new Font("Times New Roman",Font.PLAIN,18));

        Integer [] yearHSC = {null, 2018 , 2019 , 2020 , 2021 , 2022 , 2023};
        passingHSCYear = new JComboBox<>(yearHSC);
        passingHSCYear.setBounds(430 , 390 , 80 , 30);

        jLabelHSCPercent = new JLabel("HSC %");
        jLabelHSCPercent.setBounds(530 , 390 , 70 , 30);
        jLabelHSCPercent.setFont(new Font("",Font.BOLD,18));
        jLabelHSCPercent.setForeground(Color.yellow);

        jTextFieldHSC = new JTextField("N/A");
        jTextFieldHSC.setBounds(620 , 390 , 100 , 30);
        jTextFieldHSC.setFont(new Font("Times New Roman",Font.PLAIN , 18));


//        --------------------------------------------------------------------------

        jLabelGraduation = new JLabel("Graduation:");
        jLabelGraduation.setBounds(50, 450 , 130 , 30);
        jLabelGraduation.setFont(new Font("",Font.BOLD,18));
        jLabelGraduation.setForeground(Color.yellow);

        jGraduateInstitute = new JTextField("Institute Name (N/A)");
        jGraduateInstitute.setBounds(200 , 450 , 200 , 30);
        jGraduateInstitute.setFont(new Font("Times New Roman",Font.PLAIN,18));

        Integer [] yearGraduate = {null, 2020 ,2021 , 2022 , 2023 , 2024 , 2025};
        passingGraduateYear = new JComboBox<>(yearGraduate);
        passingGraduateYear.setBounds(430 , 450 , 80 , 30);

        jLabelCGPA = new JLabel("CGPA");
        jLabelCGPA.setBounds(530 , 450 , 70 , 30);
        jLabelCGPA.setFont(new Font("",Font.BOLD,18));
        jLabelCGPA.setForeground(Color.yellow);

        jTextFieldCGPA = new JTextField("N/A");
        jTextFieldCGPA.setBounds(620 , 450 , 100 , 30);
        jTextFieldCGPA.setFont(new Font("Times New Roman",Font.PLAIN , 18));

        saveButton = new JButton("Save Data");
        saveButton.setBounds(700 , 500 , 120 , 30);
        saveButton.setFont(new Font("", Font.BOLD , 16));
        saveButton.setBackground(Color.yellow);
        saveButton.setForeground(Color.darkGray);
        saveButton.setFocusable(false);

        nextButton = new JButton("Next->");
        nextButton.setBounds(830 , 500 , 100 , 30);
        nextButton.setFont(new Font("", Font.BOLD , 16));
        nextButton.setBackground(Color.yellow);
        nextButton.setForeground(Color.darkGray);
        nextButton.setFocusable(false);
        nextButton.addActionListener(this);

        this.setSize(width , height);
        this.setIconImage(logoImg.getImage());
        this.setTitle("User Data");
        this.getContentPane().setBackground(Color.darkGray);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        jPanelNavigation.add(jLabelNavigation);
        this.add(jPanelNavigation);

        this.add(jLabelDescription);
        this.add(jLabelDescriptionOwn);
        this.add(jTextAreaDescription);

        this.add(jLabelPositionOpted);
        this.add(jLabelApplyingPosition);
        this.add(jTextFieldOptedPosition);

        this.add(jLabelEducation);
        this.add(jLabelSSC);
        this.add(jSSCInstitute);
        this.add(passingSSCYear);
        this.add(jLabelSSCPercent);
        this.add(jTextFieldSSC);

        this.add(jLabelHSC);
        this.add(jHSCInstitute);
        this.add(passingHSCYear);
        this.add(jLabelHSCPercent);
        this.add(jTextFieldHSC);

        this.add(jLabelGraduation);
        this.add(jGraduateInstitute);
        this.add(passingGraduateYear);
        this.add(jLabelCGPA);
        this.add(jTextFieldCGPA);

        this.add(saveButton);
        this.add(nextButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        UserInfo2 obj = new UserInfo2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton){
            userDescription = jTextAreaDescription.getText();
            userAppliedPosition = jTextFieldOptedPosition.getText();
            userSSCInstitute = jSSCInstitute.getText();
            userHSCInstitute = jHSCInstitute.getText();
            userGraduateInstitute = jGraduateInstitute.getText();
            userSSCYear = (int) passingSSCYear.getSelectedItem();
            userHSCYear = (int) passingHSCYear.getSelectedItem();
            userGraduateYear = (int) passingGraduateYear.getSelectedItem();
            userSSCPercent = jTextFieldSSC.getText();
            userHSCPercent = jTextFieldHSC.getText();
            userGraduateCGPA = jTextFieldCGPA.getText();

            UserInfo3 obj = new UserInfo3();
        }
    }
}
