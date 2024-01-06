import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin extends JFrame {

    private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    Admin() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Admin Panel");
        this.setSize(900, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#ADD8E6"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/ap.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(70, 85, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Tahoma", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Admin Panel");
        label1.setBounds(420, 50, 500, 90);
        label1.setFont(f1);
        c.add(label1);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons

        btn2 = new JButton("Back");
        btn2.setBounds(50, 15, 100, 40);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#C00000"));
        c.add(btn2);

        btn4 = new JButton("User Data");
        btn4.setBounds(430, 165, 215, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#90EE90"));
        c.add(btn4);

        btn3 = new JButton("Exit");
        btn3.setBounds(430, 250, 215, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00000"));
        c.add(btn3);


        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // User Data
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                UserData frame = new UserData();
                frame.setVisible(true);


            }
        });

        // Exit Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });

    }

}
