import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class LanguageButton extends JButton implements ActionListener {

    private void turnBackgroundGreen() {
        this.setBackground(new Color(37, 245, 78));
    }

    private void turnForegroundWhite() {
        this.setForeground(Color.WHITE);
    }

    public LanguageButton(String name, String iconLocation) {
        super(name, new ImageIcon(iconLocation));
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setFont(new Font("Helvitca", Font.PLAIN, 40));
        this.setBackground(new Color(192, 192, 192));
        this.setForeground(new Color(25, 81, 144));
        this.addActionListener(this);

    }

    public LanguageButton(String name) {
        super(name);
        this.setFont(new Font("Helvitca", Font.PLAIN, 40));
        this.setBackground(new Color(192, 192, 192));
        this.setForeground(new Color(25, 81, 144));
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        turnBackgroundGreen();
        turnForegroundWhite();
    }
}
