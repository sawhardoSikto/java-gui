//P.M. TASRIFUL ISLAM
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Contribution extends JFrame
{
	private Container c;
	private ImageIcon icon, logo;
	private JLabel imgLabel;
    private Font f1;
    private JButton btn1;
    private Cursor cursor;
	
	Contribution() 
	{
		// Frame Layout
        this.setTitle("Boi-Pustok");
        this.setSize(540, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#ADD8E6"));
		
		// Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());
		
		// Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/Contribution.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(45, 20, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		
		// Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 25);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);
		
		// JButtons
        btn1 = new JButton("OK");
        btn1.setBounds(175, 580, 180, 50);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#90EE90"));
        c.add(btn1);
		
		// Action Listener for JButtons
        // OK Button
        btn1.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent ae) 
			{
                setVisible(false);
            }
        });
	}
}