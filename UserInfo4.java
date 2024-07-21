import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class UserInfo4 extends JFrame implements ActionListener {
    int width = 1000 , height = 650;

    ImageIcon iconResumeLogo;
    JLabel jLabelNavBar;
    JPanel jPanelNavBar;

    JLabel jLabelProject , project1 , project2 , project3;
    JTextField jTextFieldProj1 , jTextFieldProj2 , jTextFieldProj3;
    JTextArea jTextAreaProj1 , jTextAreaProj2 , jTextAreaProj3;

    JLabel jLabelInterest;
    JTextField jInterest_Hobby1 ,jInterest_Hobby2 , jInterest_Hobby3 , jInterest_Hobby4;

    JLabel jLabelPhoto , jLabelUpload;
    JTextArea jTextAreaPhoto;
    JButton jButtonUpload;
    JButton jButtonSaveData , jButtonGenerate;

    static String userProject1 , userProject2 , userProject3 ;
    static String userProjDescription1 , userProjDescription2 , userProjDescription3 ;
    static String userInterest1 , userInterest2 , userInterest3 , userInterest4;

    UserInfo4(){
        iconResumeLogo = new ImageIcon("resumeLogo.png");

        jLabelNavBar = new JLabel("User Information / Data");
        jLabelNavBar.setForeground(new Color(36 , 65,212));
        jLabelNavBar.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
        jLabelNavBar.setVerticalAlignment(JLabel.CENTER);
        jLabelNavBar.setHorizontalAlignment(JLabel.CENTER);

        jPanelNavBar = new JPanel();
        jPanelNavBar.setBounds(0 , 0 , width , 50);
        jPanelNavBar.setBackground(new Color(86, 145, 94));
        jPanelNavBar.setLayout(new BorderLayout());

// ------------------------------------Projects------------------------------------------------

        jLabelProject = new JLabel("PROJECTS:");
        jLabelProject.setBounds(50 , 80 , 160 , 30);
        jLabelProject.setFont(new Font("Broadway", Font.PLAIN, 25));
        jLabelProject.setForeground(Color.white);

//               ----------------- Project 1 ----------------

        project1 = new JLabel("Project 1:");
        project1.setBounds(50 , 120 , 100 , 30);
        project1.setFont(new Font("", Font.BOLD, 18));
        project1.setForeground(Color.yellow);

        jTextFieldProj1 = new JTextField("N/A");
        jTextFieldProj1.setBounds(50 , 150 , 200 , 30);
        jTextFieldProj1.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        jTextAreaProj1 = new JTextArea("Description (N/A)");
        jTextAreaProj1.setBounds(50 , 200 ,200 , 70);
        jTextAreaProj1.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//               ----------------- Project 2 ----------------
        project2 = new JLabel("Project 2:");
        project2.setBounds(300 , 120 , 100 , 30);
        project2.setFont(new Font("", Font.BOLD, 18));
        project2.setForeground(Color.yellow);

        jTextFieldProj2 = new JTextField("N/A");
        jTextFieldProj2.setBounds(300 , 150 , 200 , 30);
        jTextFieldProj2.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        jTextAreaProj2 = new JTextArea("Description (N/A)");
        jTextAreaProj2.setBounds(300 , 200 ,200 , 70);
        jTextAreaProj2.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//               ----------------- Project 3 ----------------
        project3 = new JLabel("Project 3:");
        project3.setBounds(550 , 120 , 100 , 30);
        project3.setFont(new Font("", Font.BOLD, 18));
        project3.setForeground(Color.yellow);

        jTextFieldProj3 = new JTextField("N/A");
        jTextFieldProj3.setBounds(550 , 150 , 200 , 30);
        jTextFieldProj3.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        jTextAreaProj3 = new JTextArea("Description (N/A)");
        jTextAreaProj3.setBounds(550 , 200 ,200 , 70);
        jTextAreaProj3.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//  ---------------------------------- Interest / Hobbies-----------------------------------------

        jLabelInterest = new JLabel("INTERESTS / HOBBIES:");
        jLabelInterest.setBounds(50 , 320 , 300 , 30);
        jLabelInterest.setFont(new Font("Broadway", Font.PLAIN, 25));
        jLabelInterest.setForeground(Color.white);

        jInterest_Hobby1 = new JTextField("N/A");
        jInterest_Hobby1.setBounds(50 , 380 , 200 , 30);
        jInterest_Hobby1.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        jInterest_Hobby2 = new JTextField("N/A");
        jInterest_Hobby2.setBounds(350 , 380 , 200 , 30);
        jInterest_Hobby2.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        jInterest_Hobby3 = new JTextField("N/A");
        jInterest_Hobby3.setBounds(50 , 440 , 200 , 30);
        jInterest_Hobby3.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        jInterest_Hobby4 = new JTextField("N/A");
        jInterest_Hobby4.setBounds(350 , 440 , 200 , 30);
        jInterest_Hobby4.setFont(new Font("Times New Roman", Font.PLAIN, 18));

//  ------------------------------------ upload photo---------------------------------------------

        jLabelUpload = new JLabel("Photo (Passport Size):");
        jLabelUpload.setBounds(650 , 320 , 300 , 30);
        jLabelUpload.setFont(new Font("Broadway", Font.PLAIN, 25));
        jLabelUpload.setForeground(Color.white);

        jTextAreaPhoto = new JTextArea();
        jTextAreaPhoto.setBounds(650 , 360 , 120 , 130);

        jButtonUpload = new JButton("Upload Image");
        jButtonUpload.setBounds(780 , 460 , 150 , 30);
        jButtonUpload.setFont(new Font("Times New Roman" ,Font.PLAIN , 15));
        jButtonUpload.setForeground(Color.gray);
        jButtonUpload.setBackground(Color.black);
        jButtonUpload.setFocusable(false);
        jButtonUpload.addActionListener(this);

        jLabelPhoto = new JLabel();
        jLabelPhoto.setBounds(650 , 360 , 120 , 130);
//  ----------------------------- save & generate------------------------------------------------

        jButtonSaveData = new JButton("Save Data");
        jButtonSaveData.setBounds(300 , 550 , 120 , 30);
        jButtonSaveData.setFont(new Font("", Font.BOLD , 16));
        jButtonSaveData.setBackground(Color.yellow);
        jButtonSaveData.setForeground(Color.darkGray);
        jButtonSaveData.setFocusable(false);

        jButtonGenerate = new JButton("Generate CV");
        jButtonGenerate.setBounds(460 , 550 , 130 , 30);
        jButtonGenerate.setFont(new Font("", Font.BOLD , 16));
        jButtonGenerate.setBackground(Color.yellow);
        jButtonGenerate.setForeground(Color.darkGray);
        jButtonGenerate.setFocusable(false);
        jButtonGenerate.addActionListener(this);

//  -----------------------------------frame-----------------------------------------------------------

        this.setSize(width , height);
        this.setTitle("User Data");
        this.setIconImage(iconResumeLogo.getImage());
        this.getContentPane().setBackground(Color.darkGray);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        jPanelNavBar.add(jLabelNavBar);
        this.add(jPanelNavBar);

        this.add(jLabelProject);
        this.add(project1);
        this.add(jTextFieldProj1);
        this.add(jTextAreaProj1);

        this.add(project2);
        this.add(jTextFieldProj2);
        this.add(jTextAreaProj2);

        this.add(project3);
        this.add(jTextFieldProj3);
        this.add(jTextAreaProj3);

        this.add(jLabelInterest);
        this.add(jInterest_Hobby1);
        this.add(jInterest_Hobby2);
        this.add(jInterest_Hobby3);
        this.add(jInterest_Hobby4);

        this.add(jLabelUpload);
        this.add(jLabelPhoto);
        this.add(jTextAreaPhoto);
        this.add(jButtonUpload);

        this.add(jButtonSaveData);
        this.add(jButtonGenerate);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public ImageIcon ResizeImg(String ImgPath){
        ImageIcon myImg = new ImageIcon(ImgPath);
        Image image = myImg.getImage();
        Image newImg = image.getScaledInstance(jLabelPhoto.getWidth() , jLabelPhoto.getHeight() , Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newImg);
        return  imageIcon;
    }

    public static void main(String[] args) {
        UserInfo4 obj = new UserInfo4();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButtonGenerate){
            CreatePdf obj = new CreatePdf();
        }

        if (e.getSource() == jButtonUpload){
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png");
            file.addChoosableFileFilter(filter);

            int result = file.showSaveDialog(null);

            if (result == JFileChooser.APPROVE_OPTION){
                File selectedFile = file.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                jLabelPhoto.setIcon(ResizeImg(path));
            }
            else if (result == JFileChooser.CANCEL_OPTION){
                System.out.println("No file selected");
            }

        }

        if (e.getSource() == jButtonSaveData){
            userProject1 = jTextFieldProj1.getText();
            userProject2 = jTextFieldProj2.getText();
            userProject3 = jTextFieldProj3.getText();

            userProjDescription1 = jTextAreaProj1.getText();
            userProjDescription2 = jTextAreaProj2.getText();
            userProjDescription3 = jTextAreaProj3.getText();

            userInterest1 = jInterest_Hobby1.getText();
            userInterest2 = jInterest_Hobby2.getText();
            userInterest3 = jInterest_Hobby3.getText();
            userInterest4 = jInterest_Hobby4.getText();
        }
    }
}
