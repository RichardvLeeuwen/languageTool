import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class LanguageButton extends JButton implements ActionListener {

    private ImageIcon icon = null;
    private Image image = null;

    private void turnBackgroundGreen() {
        this.setBackground(new Color(37, 245, 78));
    }

    private void turnForegroundWhite() {
        this.setForeground(Color.WHITE);
    }

    public LanguageButton(String name, String iconLocation) { // TODO: clean up constructors with new paintcomponent
        super(name, new ImageIcon(iconLocation));
        icon = new ImageIcon(iconLocation);
        image = icon.getImage();
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

    @Override // TODO: clean up paint component as god this is ugly
    protected void paintComponent(Graphics g) { // https://harryjoy.me/2011/08/21/different-button-shapes-in-swing/
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth(), h = getHeight();
        Color color1 = getBackground();
        Color color2 = Color.WHITE;
        GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
        g2d.setPaint(gp);
        g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
        Font f = getFont();
        g2d.setFont(f);
        g2d.setColor(getForeground());
        FontMetrics fm = getFontMetrics(f); // https://stackoverflow.com/questions/27706197/how-can-i-center-graphics-drawstring-in-java
                                            // coordinates code for centering
        int x = (w - fm.stringWidth(getText())) / 2;
        if (icon == null) { // there has to be a smarter way of putting the text below the icon
            int y = ((h - fm.getHeight()) / 2) + fm.getAscent();
            g2d.drawString(getText(), x, y);
        } else {
            g2d.drawImage(image, x, 10, null);
            int y = ((h - fm.getHeight()) / 2) + fm.getAscent();
            g2d.drawString(getText(), x, y + 35);
        }

        ;
    }

    @Override
    protected void paintBorder(Graphics g) { //// https://harryjoy.me/2011/08/21/different-button-shapes-in-swing/
        super.paintBorder(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getForeground());
        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
    }
}
