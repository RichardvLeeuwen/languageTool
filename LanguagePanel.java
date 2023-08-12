import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class LanguagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) { // taken from here:
                                                // https://stackoverflow.com/questions/14364291/jpanel-gradient-background
                                                // overrides the paint function, sets rendering high quality and then
                                                // uses gradient paint
                                                // Considering to switch to linearGradientPaint
                                                // https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/awt/LinearGradientPaint.html
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth(), h = getHeight();
        Color color1 = new Color(116, 52, 235);
        Color color2 = Color.WHITE;
        GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
}
