package ui;

public class MainMenu{
    public static void launchMenu(){
        JFrame MainFrame = new JFrame();
        MainFrame.setSize(900,600);

        JButton MainButton = new JButton("Main Menu");
        MainButton.setBounds(300,0, 300, 50);
        MainFrame.add(MainButton);

        JButton OverviewButton = new JButton("Overview");
        OverviewButton.setBounds(0,0, 300, 50);
        MainFrame.add(OverviewButton);

        JButton SettingsButton = new JButton("Settings");
        SettingsButton.setBounds(600,0, 300, 50);
        MainFrame.add(SettingsButton);

        MainFrame.setLayout(null);
        MainFrame.setVisible(true);
    }
}