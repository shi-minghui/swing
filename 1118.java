package pac;

import javax.swing.*;

public class App {
    private JPanel myPanel;
    void go(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,1080,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
