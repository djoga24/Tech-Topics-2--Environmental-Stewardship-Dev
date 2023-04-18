import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz {
    private JFrame quizFrame;
    private JLabel questionLabel;
    private JTextField answerTextField;
    private JButton submitButton, backButton;


    private String[] questions = {
            "What does STEP stand for?",
            "True or False: STEP Provides training and education programs to the general public?",
            "What is the example given by the Digital Wellness Lab for people to develop healthy tech habits?",
            "What does Telemedicine allow for patients?",
            "What are people constantly exposed to on social media?",
            "What is melatonin?",
            "Name a renewable energy source that is found in the text",
            "What does HVAC stand for?",
            "Technology has resulted in a significant amount of ....",           
            "What does the manufacturing and transportation of technology lead to"
    };

    private String[][] answers = {
            {"Sustainable Technologies Evaluation Program"},
            {"False", "F"},
            {"Taking a break after 20 minutes of screen time", "Taking a break after 20 minutes"},
            {"Allows people to receive healthcare remotely","Remote healthcare"},
            {"Negative News", "Cyberbullying", "Cyber bullying"},
            {"Hormone that regulates sleep", "Sleep hormone"},
            {"Solar", "Wind", "Hydro"},
            {"Heating, Ventilation, and Air Conditioning"},
            {"E-waste"},
            {"Carbon Emissons", "Carbon Waste", "Carbon"}
    };

    private int currentQuestionIndex = 0;
    private int score = 0;

    private JFrame mainFrame;

    public Quiz(JFrame mFrame) {
        mainFrame = mFrame;

        quizFrame = new JFrame("Quiz");
        quizFrame.setSize(600, 350);
        quizFrame.setLayout(new BorderLayout());

        questionLabel = new JLabel(questions[currentQuestionIndex]);
        questionLabel.setHorizontalAlignment(JLabel.CENTER);
        questionLabel.setVerticalAlignment(JLabel.CENTER);
        quizFrame.add(questionLabel, BorderLayout.NORTH);

        answerTextField = new JTextField(10);
        JPanel answerPanel = new JPanel(new BorderLayout());
        answerPanel.add(new JLabel("Answer:"), BorderLayout.WEST);
        answerPanel.add(answerTextField, BorderLayout.CENTER);
        quizFrame.add(answerPanel, BorderLayout.CENTER);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> checkAnswer(answerTextField.getText()));
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(submitButton);

        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizFrame.dispose();
                mainFrame.setVisible(true);
            }
        });
        buttonPanel.add(backButton);

        quizFrame.add(buttonPanel, BorderLayout.SOUTH);
        quizFrame.setVisible(true);
        quizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void checkAnswer(String userAnswer) {
        String[] possibleAnswers = answers[currentQuestionIndex];
        boolean isCorrect = false;
        for (String possibleAnswer : possibleAnswers) {
            if (userAnswer.equalsIgnoreCase(possibleAnswer.trim())) {
                isCorrect = true;
                break;
            }
        }

        if (isCorrect) {
            score++;
            JOptionPane.showMessageDialog(quizFrame, "Correct!");
        } else {
            JOptionPane.showMessageDialog(quizFrame, "Incorrect! The correct answer(s) is/are: " + String.join(", ", possibleAnswers));
        }
        currentQuestionIndex++;
        if (currentQuestionIndex < questions.length) {
            questionLabel.setText(questions[currentQuestionIndex]);
            answerTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(quizFrame, "Quiz complete! Final score: " + score);
            quizFrame.dispose();
            mainFrame.setVisible(true);
        }
    }
}


