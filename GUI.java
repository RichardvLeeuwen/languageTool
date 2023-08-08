import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
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
        panel.setBackground(new Color(116, 52, 235));

        LanguageButton duolingoButton = new LanguageButton("Duolingo", "duolingo_owl.png");
        LanguageButton ankiButton = new LanguageButton("Anki");
        LanguageButton audioLessonsButton = new LanguageButton("Audio lessons");

        JLabel label = new JLabel("Test language information");
        label.setFont(new Font("Helvitca", Font.PLAIN, 40));
        label.setHorizontalAlignment(SwingConstants.CENTER);

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
