import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class GUI {
    private JFrame frame = new JFrame();
    private JPanel mainPanel = new LanguagePanel();
    private JPanel infoPanel = new JPanel();
    private Integer totalTasks = 4;

    private String getLanguageInformationString() {
        String currentStreak = "Streak: 0\n";
        String dailyTasksCompleted = "Daily tasks: 0/" + String.valueOf(totalTasks) + "\n";
        String timeTillNextTasks = "Time remaining: 18:00\n";
        String infoCombined = new StringBuilder().append(currentStreak).append(dailyTasksCompleted)
                .append(timeTillNextTasks).toString(); // consider a loop for readability
        return infoCombined;
    }

    private void setInfoPannel() {
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

        JButton addLessonsButton = new JButton("Add lesson");
        JButton removeLessonsButton = new JButton("Remove lesson");

        infoPanel.add(languageInfoLabel);

        infoPanel.add(languageInfo);
        infoPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        infoPanel.add(addLessonsButton);
        infoPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        infoPanel.add(removeLessonsButton);

    }

    public GUI() {

        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        mainPanel.setLayout(new GridLayout(0, 3, 20, 20));
        // mainPanel.setBackground(new Color(116, 52, 235));

        LanguageButton duolingoButton = new LanguageButton("Duolingo", "duolingo_owl.png");
        LanguageButton ankiButton = new LanguageButton("Anki");
        LanguageButton audioLessonsButton = new LanguageButton("Audio lessons");
        LanguageButton bookLessonsButton = new LanguageButton("Book lessons", "stack_books.png");

        setInfoPannel();

        mainPanel.add(duolingoButton);

        mainPanel.add(ankiButton);
        mainPanel.add(infoPanel);
        mainPanel.add(audioLessonsButton);
        mainPanel.add(bookLessonsButton);

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Language Tools Collection");
        frame.pack();
        frame.setVisible(true);
    }

}
