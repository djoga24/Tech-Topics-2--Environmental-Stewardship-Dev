import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainGUI{

    private JFrame mainFrame;
    private JFrame EnviromentImpactsFrame, PositiveEnviromentImpactsFrame, NegativeEnviromentImpactsFrame;
    private JFrame HealthImpactsFrame, PositiveHealthImpactsFrame, NegativeHealthImpactsFrame;
    private JFrame InitiativesFrame, QuizFrame;
    private JButton EnviromentImpactsBu, PositiveEnviromentImpactsBU, NegativeEnviromentImpactsBU;
    private JButton HealthImpactsBu, PositiveHealthImpactsBu, NegativeHealthImpactsBu;
    private JButton InitiativesBu, QuizBu;
    private JButton backButton;

    public MainGUI() {

        mainFrame = new JFrame("Main Frame");
        mainFrame.setSize(500,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        EnviromentImpactsBu = new JButton("Impacts of Technology on the Enviroment");
        EnviromentImpactsBu.setFont(new Font("Arial", Font.PLAIN, 12)); 
        EnviromentImpactsBu.addActionListener(e -> ShowEnviromentFrame());


        HealthImpactsBu = new JButton("Impacts of Technology on Human Health");
        HealthImpactsBu.setFont(new Font("Arial", Font.PLAIN, 12));
        HealthImpactsBu.addActionListener(e -> showHumanHealthFrame());
        

        InitiativesBu = new JButton(" Initivates to explore further!");
        InitiativesBu.setFont(new Font("Arial", Font.PLAIN, 12));
        InitiativesBu.addActionListener( e -> showInitiativesFrame());
       

        QuizBu = new JButton("Here is a quiz to test your knowledge!");
        QuizBu.setFont(new Font("Arial", Font.PLAIN, 12));
        QuizBu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Quiz quiz = new Quiz(mainFrame); // Create an instance of the Quiz class
            }
        });


        JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 30));
        mainPanel.add(EnviromentImpactsBu);
        mainPanel.add(HealthImpactsBu);
        mainPanel.add(InitiativesBu);
        mainPanel.add(QuizBu);

        mainFrame.add(mainPanel);

    }

    public void showInitiativesFrame(){
        InitiativesFrame = new JFrame("Here are some initivates you can explore further!");
        InitiativesFrame.setSize(800,800);
        InitiativesFrame.setVisible(true);
        mainFrame.setVisible(false);

        JLabel headingLabel = new JLabel();
        headingLabel.setVerticalAlignment(JLabel.TOP);
        Font headingFont = new Font("Arial", Font.BOLD, 16);
        headingLabel.setFont(headingFont);
        headingLabel.setText("Initiatives in Canada");
        headingLabel.setHorizontalAlignment(JLabel.CENTER);
    
        JLabel infolabel = new JLabel();
        infolabel.setVerticalAlignment(JLabel.CENTER);
        infolabel.setText("<html><div style='font-size: 12px; line-height: 1.5em; text-align: justify; padding: 15px; max-height: 600px; overflow-y: auto;'>" +
"<p><strong>One initiative I like is the Sustainable Technologies Evaluation Program (STEP)</strong></p><br>" +
"<p>STEP is a program that promotes innovative environmental technologies in Canada. It explores technologies that have the potential to reduce environmental impacts, improve sustainability, and contribute to the economy.</p><br>" +
"<p>STEP also provides training and education programs across Canada to increase awareness and knowledge of these technologies for industry professionals and government agencies. These programs help to increase the knowledge of these sustainable technologies, leading to better sustainable practices in Canada.</p><br>" +
"<p><strong>Another initiative is the Digital Wellness Lab:</strong></p><br>" +
"<p>The Digital Wellness Lab is an organization in Toronto that focuses on promoting digital wellbeing. They offer workshops, programs, and resources that help people develop healthy habits when it comes to technology use. One such example is taking a break after 20 minutes of screen time. They also work with companies and organizations to promote digital wellbeing in the workplace. The lab's goal is to reduce the negative effects that excessive technology use can have on our physical and mental health.</p></div></html>");

        Font labelFont = new Font("Arial", Font.BOLD, 12);
    
        infolabel.setFont(labelFont);
        
        
        String imagePath = "C:\\Users\\Gamer\\Documents\\Picture5.jpeg";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        JLabel pictureLabel = new JLabel(scaledImageIcon);
            
        JLabel captionLabel = new JLabel("STEP is a really good program!");
        captionLabel.setHorizontalAlignment(JLabel.CENTER);
    
        JPanel picturePanel = new JPanel(new BorderLayout());
        picturePanel.add(pictureLabel, BorderLayout.SOUTH);
        picturePanel.add(captionLabel, BorderLayout.CENTER);
    
    
        InitiativesFrame.setLayout(new BorderLayout());
        InitiativesFrame.add(picturePanel, BorderLayout.SOUTH);
        InitiativesFrame.add(infolabel, BorderLayout.CENTER);
        InitiativesFrame.add(headingLabel, BorderLayout.NORTH);
    
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InitiativesFrame.setVisible(false);
                mainFrame.setVisible(true);
    
            }
        });
            
        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(picturePanel, BorderLayout.CENTER);
        bottomPanel.add(backButton, BorderLayout.EAST);
    
        InitiativesFrame.add(bottomPanel, BorderLayout.SOUTH);

    }

    public void showHumanHealthFrame(){
        HealthImpactsFrame = new JFrame("Human Health Impacts of Technology");
        HealthImpactsFrame.setSize(500,500);

        PositiveHealthImpactsBu = new JButton("Positive Health Impacts ");
        PositiveHealthImpactsBu.setFont(new Font("Arial", Font.PLAIN, 12));
        PositiveHealthImpactsBu.addActionListener(e -> ShowPositiveHealthImpactsFrame());


        NegativeHealthImpactsBu = new JButton("Negative Health Impacts");
        NegativeHealthImpactsBu.setFont(new Font("Arial", Font.PLAIN, 12));
        NegativeHealthImpactsBu.addActionListener(e -> ShowNegativeHealthImpactsFrame());



        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.PLAIN, 12));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HealthImpactsFrame.setVisible(false);
                mainFrame.setVisible(true);
            }
        });
        
        JPanel HealthImpactsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 50));
        HealthImpactsPanel.add(PositiveHealthImpactsBu);
        HealthImpactsPanel.add(NegativeHealthImpactsBu);
        HealthImpactsPanel.add(backButton);

        HealthImpactsFrame.add(HealthImpactsPanel);

        HealthImpactsFrame.setVisible(true);    
        mainFrame.setVisible(false);   
    }



    public void ShowPositiveHealthImpactsFrame(){

        
        PositiveHealthImpactsFrame = new JFrame("Positive Health Impacts of Technology");
        PositiveHealthImpactsFrame.setSize(700,700);
        PositiveHealthImpactsFrame.setVisible(true); 
        HealthImpactsFrame.setVisible(false);

        JLabel headingLabel = new JLabel();
        headingLabel.setVerticalAlignment(JLabel.TOP);
        Font headingFont = new Font("Arial", Font.BOLD, 17);
        headingLabel.setFont(headingFont);
        headingLabel.setText("Here are some Positive Health impacts of Technology");
        headingLabel.setHorizontalAlignment(JLabel.CENTER);
    
        JLabel infolabel = new JLabel();
        infolabel.setVerticalAlignment(JLabel.CENTER);
        
        infolabel.setText("<html><p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
        "Technology has several positive impacts on our health. It has enabled faster and more accurate diagnosis and treatment of illnesses, leading to improved healthcare. Medical professionals can now use technology such as AI to be able to treat their patients.</p>" +
        "<p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
        "Technology has also made healthcare more accessible and convenient for the general public. Telemedicine, for example, allows patients to receive healthcare remotely, eliminating the need for travel and reducing the burden on healthcare facilities. Technology has also made it easier for individuals to monitor and manage their health via the help of mobile apps</p>" +
        "<p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
        "Finally, technology has led to improved safety and reduced risks in healthcare. Electronic health records have made it easier for medical professionals to access the information they need, reducing the likelihood of errors and improving patient safety.</p></html>");
    
        Font labelFont = new Font("Arial", Font.BOLD, 14);
    
        infolabel.setFont(labelFont);
        
        String imagePath = "C:\\Users\\Gamer\\Documents\\Picture3.jpeg";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        JLabel pictureLabel = new JLabel(scaledImageIcon);
            
        JLabel captionLabel = new JLabel("Here's how Telemedicine can help patients remotely");
        captionLabel.setHorizontalAlignment(JLabel.CENTER);
    
        JPanel picturePanel = new JPanel(new BorderLayout());
        picturePanel.add(pictureLabel, BorderLayout.SOUTH);
        picturePanel.add(captionLabel, BorderLayout.CENTER);
    
    
        PositiveHealthImpactsFrame.setLayout(new BorderLayout());
        PositiveHealthImpactsFrame.add(picturePanel, BorderLayout.SOUTH);
        PositiveHealthImpactsFrame.add(infolabel, BorderLayout.CENTER);
        PositiveHealthImpactsFrame.add(headingLabel, BorderLayout.NORTH);
    
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PositiveHealthImpactsFrame.setVisible(false);
                HealthImpactsFrame.setVisible(true);
    
            }
        });
            
        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(picturePanel, BorderLayout.CENTER);
        bottomPanel.add(backButton, BorderLayout.EAST);
    
        PositiveHealthImpactsFrame.add(bottomPanel, BorderLayout.SOUTH);

    }
  
    public void ShowNegativeHealthImpactsFrame(){


        NegativeHealthImpactsFrame = new JFrame("Negative Health Impacts of Technology");
        NegativeHealthImpactsFrame.setSize(700,700);
        NegativeHealthImpactsFrame.setVisible(true); 
        HealthImpactsFrame.setVisible(false);

        JLabel headingLabel = new JLabel();
        headingLabel.setVerticalAlignment(JLabel.TOP);
        Font headingFont = new Font("Arial", Font.BOLD, 17);
        headingLabel.setFont(headingFont);
        headingLabel.setText("Here are some Negative Health impacts of Technology");
        headingLabel.setHorizontalAlignment(JLabel.CENTER);
    
        JLabel infolabel = new JLabel();
        infolabel.setVerticalAlignment(JLabel.CENTER);
        infolabel.setText("<html><p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
        "The use of technology has been associated with anxiety and depression. Studies have found that excessive screen time and social media use can contribute to increased levels of anxiety and depression in all types of people. This is primarily because people are constantly exposed to negative news and cyberbullying.</p>" +
        "<p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
        "Poor sleep quality is another effect of excessive technology use. The blue light emitted by screens can interfere with the body's production of melatonin, a hormone that helps regulate sleep. This makes it harder for people to fall asleep and stay asleep leading to difficulty concentrating during the day.</p>" +
        "<p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
        "The use of technology has also been associated with reduced physical activity, which can have negative health effects. Spending excessive amounts of time on screens can increase the risk of obesity and related health problems. People who spend more time on screens are less likely to engage in physical activities such as playing sports.</p>" +
        "<p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
        "To limit the negative impacts, people can start partaking in activities like reading, sports, and spending time with family. They can also encourage others to be outside and spend less time on screens.</p></html>");    
        Font labelFont = new Font("Arial", Font.BOLD, 14);
    
        infolabel.setFont(labelFont);
        
        String imagePath = "C:\\Users\\Gamer\\Documents\\Picture2.jpeg";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        JLabel pictureLabel = new JLabel(scaledImageIcon);
            
        JLabel captionLabel = new JLabel("Excessive screen use can at night can disturb your sleep cycle");
        captionLabel.setHorizontalAlignment(JLabel.CENTER);
    
        JPanel picturePanel = new JPanel(new BorderLayout());
        picturePanel.add(pictureLabel, BorderLayout.SOUTH);
        picturePanel.add(captionLabel, BorderLayout.CENTER);
    
    
        NegativeHealthImpactsFrame.setLayout(new BorderLayout());
        NegativeHealthImpactsFrame.add(picturePanel, BorderLayout.SOUTH);
        NegativeHealthImpactsFrame.add(infolabel, BorderLayout.CENTER);
        NegativeHealthImpactsFrame.add(headingLabel, BorderLayout.NORTH);
    
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NegativeHealthImpactsFrame.setVisible(false);
                HealthImpactsFrame.setVisible(true);
    
            }
        });
            
        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(picturePanel, BorderLayout.CENTER);
        bottomPanel.add(backButton, BorderLayout.EAST);
    
        NegativeHealthImpactsFrame.add(bottomPanel, BorderLayout.SOUTH);



    }


    public void ShowEnviromentFrame(){
        EnviromentImpactsFrame = new JFrame("Enviromental Impacts of Technology");
        EnviromentImpactsFrame.setSize(500,500);

        PositiveEnviromentImpactsBU = new JButton("Positive Enviromental Impacts");
        PositiveEnviromentImpactsBU.setFont(new Font("Arial", Font.PLAIN, 12));
        PositiveEnviromentImpactsBU.addActionListener(e -> ShowPositiveEnviromentalImpactsFrame());

        NegativeEnviromentImpactsBU = new JButton("Negative Enviromental Impacts");
        NegativeEnviromentImpactsBU.setFont(new Font("Arial", Font.PLAIN, 12));
        NegativeEnviromentImpactsBU.addActionListener(e -> ShowNegativeEnviromentalImpactsFrame());
        
        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.PLAIN, 12));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EnviromentImpactsFrame.setVisible(false);
                mainFrame.setVisible(true);
            }
        });

        JPanel EnviromentImpactsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 50));
        EnviromentImpactsPanel.add(PositiveEnviromentImpactsBU);
        EnviromentImpactsPanel.add(NegativeEnviromentImpactsBU);
        EnviromentImpactsPanel.add(backButton);

        EnviromentImpactsFrame.add(EnviromentImpactsPanel);

        EnviromentImpactsFrame.setVisible(true);    
        mainFrame.setVisible(false);   

    }


public void ShowPositiveEnviromentalImpactsFrame(){
    PositiveEnviromentImpactsFrame = new JFrame("Positive Enviromental Impacts of Technology");
    PositiveEnviromentImpactsFrame.setSize(700,700);
    PositiveEnviromentImpactsFrame.setVisible(true); 
    EnviromentImpactsFrame.setVisible(false);

    JLabel headingLabel = new JLabel();
    headingLabel.setVerticalAlignment(JLabel.TOP);
    Font headingFont = new Font("Arial", Font.BOLD, 17);
    headingLabel.setFont(headingFont);
    headingLabel.setText("Here are some Positive Enviromental impacts of Technology");
    headingLabel.setHorizontalAlignment(JLabel.CENTER);

    JLabel infolabel = new JLabel();
    infolabel.setVerticalAlignment(JLabel.CENTER);
    infolabel.setText("<html><p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
    "One area where technology has helped is renewable energy. Technology has facilitated the rise of solar, wind, and hydropower energy. This has allowed us to generate clean energy, reducing our dependence on fossil fuels and decreasing greenhouse gas emissions. Because of technology, renewable energy has become more efficient and affordable, making it a viable option for households, businesses, and governments around the world.</p>" +
    "<p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
    "Another way technology has helped the environment is through sustainable building practices. Advances in technology have enabled the use of energy-efficient HVAC(Heating, Ventilation, and Air Conditioning) systems, smart lighting, and sustainable materials. These practices help to reduce energy consumption, carbon emissions, and environmental impact in buildings.</p>" +
    "<p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
    "Sustainable transportation is yet another area where technology has played a crucial role. Electric vehicles, hybrid cars, and public transportation systems have become increasingly popular because of advancements in technology.</p></html>");    

    Font labelFont = new Font("Arial", Font.BOLD, 14);

    infolabel.setFont(labelFont);
    
    String imagePath = "C:\\Users\\Gamer\\Documents\\Picture1.jpeg";
    ImageIcon imageIcon = new ImageIcon(imagePath);
    Image image = imageIcon.getImage();
    Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
    JLabel pictureLabel = new JLabel(scaledImageIcon);
        
    JLabel captionLabel = new JLabel("Example of what renewable energy can look like");
    captionLabel.setHorizontalAlignment(JLabel.CENTER);

    JPanel picturePanel = new JPanel(new BorderLayout());
    picturePanel.add(pictureLabel, BorderLayout.SOUTH);
    picturePanel.add(captionLabel, BorderLayout.CENTER);


    PositiveEnviromentImpactsFrame.setLayout(new BorderLayout());
    PositiveEnviromentImpactsFrame.add(picturePanel, BorderLayout.SOUTH);
    PositiveEnviromentImpactsFrame.add(infolabel, BorderLayout.CENTER);
    PositiveEnviromentImpactsFrame.add(headingLabel, BorderLayout.NORTH);

    JButton backButton = new JButton("Back");
    backButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            PositiveEnviromentImpactsFrame.setVisible(false);
            EnviromentImpactsFrame.setVisible(true);

        }
    });
        
    JPanel bottomPanel = new JPanel(new FlowLayout());
    bottomPanel.add(picturePanel, BorderLayout.CENTER);
    bottomPanel.add(backButton, BorderLayout.EAST);

    PositiveEnviromentImpactsFrame.add(bottomPanel, BorderLayout.SOUTH);
}
    


public void ShowNegativeEnviromentalImpactsFrame(){
    NegativeEnviromentImpactsFrame = new JFrame("Negative impacts of Technology on the Enviroment");
    NegativeEnviromentImpactsFrame.setSize(700,700);
    NegativeEnviromentImpactsFrame.setVisible(true);    
    EnviromentImpactsFrame.setVisible(false);

    JLabel headingLabel = new JLabel();
    headingLabel.setVerticalAlignment(JLabel.TOP);
    Font headingFont = new Font("Arial", Font.BOLD, 17);
    headingLabel.setFont(headingFont);
    headingLabel.setText("Here are some Negative Enviromental impacts of Technology");
    headingLabel.setHorizontalAlignment(JLabel.CENTER);

    JLabel infolabel = new JLabel();
    infolabel.setVerticalAlignment(JLabel.CENTER);
    infolabel.setText("<html><p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
"Technology has resulted in a significant amount of e-waste, which poses a threat to the environment and human health. The disposal of electronic devices contributes to soil and water pollution. Proper disposal of e-waste and sustainable technology production is crucial to mitigating these negative impacts.</p><br>" +
"<p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
"The production and use of technology requires large amounts of energy, resulting in increased greenhouse gas emissions and carbon footprint. Manufacturing and transportation of technology also contribute to carbon emissions. Sustainable and renewable energy sources, responsible technology production, and eco-friendly practices can help to reduce these negative impacts.</p><br>" +
"<p style='text-align:justify; padding-left:10px; padding-right:10px; margin-bottom:20px'>" +
"The mining of minerals and metals required for technology production can lead to habitat destruction, loss of biodiversity, and depletion of natural resources. The use of technology poses threats to ecosystems and the climate. To mitigate these negative impacts, there is a need for responsible sourcing of raw materials, sustainable and eco-friendly practices in technology production, and adoption of practices that prioritize the environment over profits.</p></html>");

    Font labelFont = new Font("Arial", Font.BOLD, 14);

    infolabel.setFont(labelFont);
    
    String imagePath = "C:\\Users\\Gamer\\Documents\\Picture4.jpeg";
    ImageIcon imageIcon = new ImageIcon(imagePath);
    Image image = imageIcon.getImage();
    Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
    JLabel pictureLabel = new JLabel(scaledImageIcon);
        
    JLabel captionLabel = new JLabel("A look at how e-waste poses a threat to the enviroment");
    captionLabel.setHorizontalAlignment(JLabel.CENTER);

    JPanel picturePanel = new JPanel(new BorderLayout());
    picturePanel.add(pictureLabel, BorderLayout.SOUTH);
    picturePanel.add(captionLabel, BorderLayout.CENTER);


    NegativeEnviromentImpactsFrame.setLayout(new BorderLayout());
    NegativeEnviromentImpactsFrame.add(picturePanel, BorderLayout.SOUTH);
    NegativeEnviromentImpactsFrame.add(infolabel, BorderLayout.CENTER);
    NegativeEnviromentImpactsFrame.add(headingLabel, BorderLayout.NORTH);

    JButton backButton = new JButton("Back");
    backButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            NegativeEnviromentImpactsFrame.setVisible(false);
            EnviromentImpactsFrame.setVisible(true);

        }
    });
        
    JPanel bottomPanel = new JPanel(new FlowLayout());
    bottomPanel.add(picturePanel, BorderLayout.CENTER);
    bottomPanel.add(backButton, BorderLayout.EAST);

    NegativeEnviromentImpactsFrame.add(bottomPanel, BorderLayout.SOUTH);

}

public static void main(String[] args) {
    MainGUI main = new MainGUI();
    main.mainFrame.setVisible(true);
}
}
