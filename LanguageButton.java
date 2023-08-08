import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class LanguageButton extends JButton {

    private void turnBackgroundGreen() {
        this.setBackground(new Color(37, 245, 78));
    }

    public LanguageButton(String name, String iconLocation) {
        super(name, new ImageIcon(iconLocation));
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setFont(new Font("Helvitca", Font.PLAIN, 40));
        this.setBackground(Color.lightGray);
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                turnBackgroundGreen();
            }
        });

    }

    public LanguageButton(String name) {
        super(name);
        this.setFont(new Font("Helvitca", Font.PLAIN, 40));
        this.setBackground(Color.lightGray);
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                turnBackgroundGreen();
            }
        });
    }

}
