import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUI {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();

    public GUI() {

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 2, 20, 20));
        panel.setBackground(Color.cyan);

        ImageIcon duolingoIcon = new ImageIcon("duolingo_owl.png");

        JButton duolingoButton = new JButton("Duolingo", duolingoIcon);
        duolingoButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        duolingoButton.setHorizontalTextPosition(SwingConstants.CENTER);
        duolingoButton.setFont(new Font("Helvitca", Font.PLAIN, 40));
        // duolingoButton.setBorder(BorderFactory.createEmptyBorder());

        duolingoButton.setContentAreaFilled(false);

        JLabel label = new JLabel("Test language information");
        label.setFont(new Font("Helvitca", Font.PLAIN, 40));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JButton ankiButton = new JButton("Anki");
        ankiButton.setFont(new Font("Helvitca", Font.PLAIN, 40));
        JButton audioLessonsButton = new JButton("Audio lessons");
        audioLessonsButton.setFont(new Font("Helvitca", Font.PLAIN, 40));

        panel.add(duolingoButton);
        panel.add(label);
        panel.add(ankiButton);
        panel.add(audioLessonsButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Language Tools Collection");
        frame.pack();
        frame.setVisible(true);
    }

}
