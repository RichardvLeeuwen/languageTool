import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class GUI {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JPanel infoPanel = new JPanel();

    private String getLanguageInformationString() {
        String currentStreak = "Streak: 0\n";
        String dailyTasksCompleted = "Daily tasks: 0/3\n";
        String timeTillNextTasks = "Time remaining: 18:00\n";
        String infoCombined = new StringBuilder().append(currentStreak).append(dailyTasksCompleted)
                .append(timeTillNextTasks).toString(); // consider a loop for readability
        return infoCombined;
    }

    public GUI() {

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 2, 20, 20));
        panel.setBackground(new Color(116, 52, 235));

        LanguageButton duolingoButton = new LanguageButton("Duolingo", "duolingo_owl.png");
        LanguageButton ankiButton = new LanguageButton("Anki");
        LanguageButton audioLessonsButton = new LanguageButton("Audio lessons");

        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
        infoPanel.setBackground(new Color(255, 218, 185));

        JLabel languageInfoLabel = new JLabel("Language information");
        languageInfoLabel.setFont(new Font("Helvitca", Font.BOLD, 40));
        languageInfoLabel.setForeground(new Color(65, 105, 225));
        languageInfoLabel.setHorizontalAlignment(SwingConstants.LEFT);
        languageInfoLabel.setAlignmentX(JLabel.LEFT_ALIGNMENT);

        JTextArea languageInfo = new JTextArea(getLanguageInformationString(), 3, 0);
        languageInfo.setFont(new Font("Helvitca", Font.PLAIN, 25));
        languageInfo.setEditable(false);
        languageInfo.setAlignmentX(JTextArea.LEFT_ALIGNMENT);

        infoPanel.add(languageInfoLabel);
        infoPanel.add(languageInfo);

        panel.add(duolingoButton);
        panel.add(infoPanel);
        panel.add(ankiButton);
        panel.add(audioLessonsButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Language Tools Collection");
        frame.pack();
        frame.setVisible(true);
    }

}
