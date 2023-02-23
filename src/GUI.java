import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI{

    WindowManager windowManager = new WindowManager();
    TabbedPaneManager tabbedPaneManager = new TabbedPaneManager(windowManager);

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() { //constructor for all the GUI, calls sub creation methods for components
        windowManager.createWindow();
        tabbedPaneManager.createTab();

    }

}
