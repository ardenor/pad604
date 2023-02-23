import javax.swing.*;

public class WindowManager {

    GUI gui;
    JFrame window;

    public void createWindow(){
        window = new JFrame("pad604");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);



        System.out.println("Window Created!");
    }
}
