import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResumeBuilder extends JFrame implements ActionListener {
    JLabel jLabelHeader , jLabelImg , jLabelInfo1 , jLabelInfo2 , jLabelInfo3 , jLabelInfo4;
    JPanel jPanelHeader , jPanelImage ;
    ImageIcon resumeLogo  , resumeImg;
    JButton jButtonCreate;

    ResumeBuilder(){
        resumeImg = new ImageIcon("resumeImg.png");
        resumeLogo = new ImageIcon("resumeLogo.png");

        jLabelImg = new JLabel(resumeImg);

        jLabelHeader = new JLabel("Create Your Resume To Get Hired");
        jLabelHeader.setFont(new Font("Algerian", Font.BOLD, 25));
        jLabelHeader.setForeground(new Color(36 , 65,212));
        jLabelHeader.setHorizontalAlignment(JLabel.CENTER);
        jLabelHeader.setVerticalAlignment(JLabel.CENTER);

        jPanelHeader = new JPanel();
        jPanelHeader.setBounds(0 ,0 , 700 , 100);
        jPanelHeader.setBackground(new Color(86, 145, 94));
        jPanelHeader.setLayout(new BorderLayout());

        jPanelImage = new JPanel();
        jPanelImage.setBounds(20 , 150 , 108 , 112);
        jPanelImage.setBackground(Color.yellow);
        jPanelImage.setLayout(new BorderLayout());

        jLabelInfo1 = new JLabel();
        jLabelInfo1.setText("A resume is a document that highlights your qualifications,");
        jLabelInfo1.setBounds(150 , 150 , 550 , 40);
        jLabelInfo1.setFont(new Font("Eras Demi ITC", Font.ITALIC , 18));

        jLabelInfo2 = new JLabel("skills, and work experience for potential employers. It serves");
        jLabelInfo2.setBounds(150 , 180 , 550 , 40);
        jLabelInfo2.setFont(new Font("Eras Demi ITC", Font.ITALIC , 18));

        jLabelInfo3 = new JLabel("as a key tool in the job application process to demonstrate");
        jLabelInfo3.setBounds(150 , 210 , 550 , 40);
        jLabelInfo3.setFont(new Font("Eras Demi ITC", Font.ITALIC , 18));;

        jLabelInfo4 = new JLabel("your suitability for a position.");
        jLabelInfo4.setBounds(150 , 240 , 550 , 40);
        jLabelInfo4.setFont(new Font("Eras Demi ITC", Font.ITALIC , 18));

        jButtonCreate = new JButton("Create Now->");
        jButtonCreate.setBounds(200 , 350 , 200 , 40);
        jButtonCreate.setBackground(Color.BLACK);
        jButtonCreate.setForeground(Color.WHITE);
        jButtonCreate.setFocusable(false);
        jButtonCreate.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 15));
        jButtonCreate.addActionListener(this);

        this.setSize(700 , 500);
        this.setTitle("Resume Builder");
        this.setIconImage(resumeLogo.getImage());
        this.getContentPane().setBackground(new Color(194, 202, 209));
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        jPanelHeader.add(jLabelHeader);
        this.add(jPanelHeader);

        jPanelImage.add(jLabelImg);
        this.add(jPanelImage);

        this.add(jLabelInfo1);
        this.add(jLabelInfo2);
        this.add(jLabelInfo3);
        this.add(jLabelInfo4);

        this.add(jButtonCreate);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        ResumeBuilder obj = new ResumeBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButtonCreate){
            jButtonCreate.setBackground(Color.WHITE);
            jButtonCreate.setForeground(Color.BLACK);
            UserInfo1 obj = new UserInfo1();
        }
    }
}
